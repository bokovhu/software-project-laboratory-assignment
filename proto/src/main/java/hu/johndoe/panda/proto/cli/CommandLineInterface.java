package hu.johndoe.panda.proto.cli;

import hu.johndoe.panda.proto.model.Animal;
import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Level;
import hu.johndoe.panda.proto.pl.PandaLanguageBaseListener;
import hu.johndoe.panda.proto.pl.PandaLanguageLexer;
import hu.johndoe.panda.proto.pl.PandaLanguageParser;
import hu.johndoe.panda.proto.pl.cmd.args.*;
import hu.johndoe.panda.proto.pl.cmd.handler.*;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ConsoleErrorListener;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

/**
 * This class is responsible for controlling the command line interface of the application.
 * <p>
 * Using the command line interface, the user can interact with the system using text commands. The language that is
 * recognized by the command line interface is specified in the previous documentation. This specific application uses
 * a grammar-based approach for command recognition. The grammar definition can be found in the
 * src/main/antlr/PandaLanguage.g4 file. The command line interface follows the following principle during operation:
 * <p>
 * 1. Read a line of input from the user
 * 2. Instantiate the lexer and the parser for the PandaLanguage grammar, and try to parse the input
 * 3. The output AST (Abstract Syntax Tree) is then walked, using this very class as a visitor. The CLI is able to react
 * to commands, because it implements the PandaLanguageListener interface.
 * <p>
 * NOTE: This application uses ANTLR4, a code generator that takes the grammar definition as the input, and produces
 * the lexer and parser required to parse the grammar. Certain java source files in the project are generated sources,
 * hence the "funny" method names.
 */
public class CommandLineInterface extends PandaLanguageBaseListener {

    /**
     * List of the previously entered commands, excluding /save commands
     */
    private List<String> commandBuffer = new ArrayList<> ();

    /**
     * The stack used by PUSH and POP commands
     */
    private PandaStack pandaStack = new PandaStack ();

    /**
     * The stack used for providing transaction-like error safety
     * <p>
     * Before execution of any command, the entire state of the application is pushed to this stack. If any errors occur
     * during the execution of a command, the previous state is restored.
     */
    private PandaStack transactionalPandaStack = new PandaStack ();

    /**
     * Determines whether code execution is inside a BEGIN; END; block
     */
    private boolean didBegin = false;

    /**
     * Used for correct relative path handling when a /load command is included in a loaded file
     */
    private Deque<String> loadFilenameStack = new ArrayDeque<> ();

    // Command handlers //

    private ShellPrintCommandHandler shellPrintCommandHandler = new ShellPrintCommandHandler ();
    private AddTileCommandHandler addTileCommandHandler = new AddTileCommandHandler ();
    private AddPandaCommandHandler addPandaCommandHandler = new AddPandaCommandHandler ();
    private AddItemCommandHandler addItemCommandHandler = new AddItemCommandHandler ();
    private AddOrangutanCommandHandler addOrangutanCommandHandler = new AddOrangutanCommandHandler ();
    private ConnectTilesCommandHandler connectTilesCommandHandler = new ConnectTilesCommandHandler ();
    private ConnectWardrobesCommandHandler connectWardrobesCommandHandler = new ConnectWardrobesCommandHandler ();
    private WorkCommandHandler workCommandHandler = new WorkCommandHandler ();
    private MoveCommandHandler moveCommandHandler = new MoveCommandHandler ();
    private UseCommandHandler useCommandHandler = new UseCommandHandler ();
    private ReleaseCommandHandler releaseCommandHandler = new ReleaseCommandHandler ();

    /**
     * Tries to execute a single line of commands
     *
     * @param commandLine the user input
     */
    private void execute (String commandLine) {

        // Save user input to command buffer
        commandBuffer.add (commandLine);

        // Instantiate lexer and parser
        PandaLanguageLexer lexer = new PandaLanguageLexer (CharStreams.fromString (commandLine));
        lexer.removeErrorListener (ConsoleErrorListener.INSTANCE);
        PandaLanguageParser parser = new PandaLanguageParser (new CommonTokenStream (lexer));
        parser.removeErrorListener (ConsoleErrorListener.INSTANCE);


        try {

            // Parse the input
            ParseTree tree = parser.parse ();

            // Walk the AST using this object as a visitor
            ParseTreeWalker walker = new ParseTreeWalker ();
            walker.walk (
                    this,
                    tree
            );

        } catch (Throwable th) {
            System.err.println ("Invalid command line!");
            throw new IllegalArgumentException (th);
        }

    }

    /**
     * The main loop for the CLI
     */
    public void loop () {

        // Used for reading user input line-by-line
        Scanner stdinScanner = new Scanner (System.in);

        while (true) {

            // Shell prompt
            System.out.print ("PandaLang > ");

            // Read input
            String commandLine = stdinScanner.nextLine ();

            try {

                // Save the current state
                transactionalPandaStack.push ();

                // Try to execute the user's command
                execute (commandLine);

                // Execution successful, pop the stack without applying the previous state
                transactionalPandaStack.pop ();

            } catch (Exception e) {

                // Error during command execution

                System.err.println ("Could not execute command '" + commandLine + "', reverting to previous state ...");
                e.printStackTrace ();

                // Restore the state before the command was tried to be executed
                Game.getInstance ().level = transactionalPandaStack.pop ();
            }

        }

    }

    @Override
    public void enterPl_cmd_add (PandaLanguageParser.Pl_cmd_addContext ctx) {

        if (didBegin) {
            throw new IllegalStateException ("Cannot execute ADD, already begun!");
        }

    }

    @Override
    public void enterPl_cmd_work (PandaLanguageParser.Pl_cmd_workContext ctx) {

        if (!didBegin) {
            throw new IllegalStateException ("Cannot execute WORK, did not begin yet!");
        }

    }

    @Override
    public void exitPl_cmd_work_specific (PandaLanguageParser.Pl_cmd_work_specificContext ctx) {

        workCommandHandler.handleCommand (
                new WorkArgs (
                        ctx.KW_PANDA () != null || ctx.KW_ORANGUTAN () != null,
                        ctx.KW_GAMEMACHINE () != null || ctx.KW_VENDINGMACHINE () != null || ctx.KW_COUCH () != null || ctx
                                .KW_WARDROBE () != null,
                        Integer.parseInt (ctx.IDENTIFIER ().getText ())
                )
        );

    }

    @Override
    public void exitPl_cmd_work_all (PandaLanguageParser.Pl_cmd_work_allContext ctx) {

        Game.getInstance ().level.getAnimals ().forEach (Animal::update);
        Game.getInstance ().level.getTiles ()
                .stream ().filter (t -> t.getPlacedItem () != null)
                .forEach (t -> t.getPlacedItem ().update ());

    }

    @Override
    public void enterPl_cmd_connect (PandaLanguageParser.Pl_cmd_connectContext ctx) {

        if (didBegin) {
            throw new IllegalStateException ("Cannot execute CONNECT, already begun!");
        }

    }

    @Override
    public void enterPl_cmd_move (PandaLanguageParser.Pl_cmd_moveContext ctx) {

        if (!didBegin) {
            throw new IllegalStateException ("Cannot execute MOVE, did not begin yet!");
        }

    }

    @Override
    public void exitPl_cmd_move (PandaLanguageParser.Pl_cmd_moveContext ctx) {

        moveCommandHandler.handleCommand (
                new MoveArgs (
                        Integer.parseInt (ctx.IDENTIFIER (0).getText ()),
                        Integer.parseInt (ctx.IDENTIFIER (1).getText ())
                )
        );

    }

    @Override
    public void enterPl_cmd_use (PandaLanguageParser.Pl_cmd_useContext ctx) {

        if (!didBegin) {
            throw new IllegalStateException ("Cannot execute USE, did not begin yet!");
        }

    }

    @Override
    public void exitPl_cmd_use (PandaLanguageParser.Pl_cmd_useContext ctx) {

        useCommandHandler.handleCommand (
                new UseArgs (
                        Integer.parseInt (ctx.IDENTIFIER (1).getText ()),
                        Integer.parseInt (ctx.IDENTIFIER (0).getText ())
                )
        );

    }

    @Override
    public void exitPl_cmd_push (PandaLanguageParser.Pl_cmd_pushContext ctx) {

        pandaStack.push ();

    }

    @Override
    public void exitPl_cmd_pop (PandaLanguageParser.Pl_cmd_popContext ctx) {

        Game.getInstance ().level = pandaStack.pop ();

    }

    @Override
    public void exitPl_cmd_begin (PandaLanguageParser.Pl_cmd_beginContext ctx) {

        if (didBegin) {
            System.err.println ("Already begun!");
        }
        didBegin = true;

    }

    @Override
    public void exitPl_cmd_end (PandaLanguageParser.Pl_cmd_endContext ctx) {

        if (!didBegin) {
            System.err.println ("Not yet begun!");
        }
        didBegin = false;

    }

    @Override
    public void exitPl_cmd_set (PandaLanguageParser.Pl_cmd_setContext ctx) {

        String prop = ctx.WORD (0).getText ();
        String val = ctx.WORD (1).getText ();
        System.setProperty ("hu.johndoe.panda.proto." + prop, val);

    }

    @Override
    public void enterPl_cmd_release (PandaLanguageParser.Pl_cmd_releaseContext ctx) {

        if (!didBegin) {
            throw new IllegalStateException ("Cannot execute RELEASE, did not begin yet!");
        }

    }

    @Override
    public void exitPl_cmd_release (PandaLanguageParser.Pl_cmd_releaseContext ctx) {

        releaseCommandHandler.handleCommand (
                new ReleaseArgs (
                        Integer.parseInt (ctx.IDENTIFIER ().getText ())
                )
        );

    }

    @Override
    public void exitPl_cmd_add_tile (PandaLanguageParser.Pl_cmd_add_tileContext ctx) {

        addTileCommandHandler.handleCommand (
                new AddTileArgs (
                        ctx.tile_flag ().stream ().map (RuleContext::getText).collect (Collectors.toList ()),
                        Integer.parseInt (ctx.IDENTIFIER ().getText ()),
                        ctx.with_life () != null
                                ? Integer.parseInt (ctx.with_life ().IDENTIFIER ().getText ())
                                : 20
                )
        );

    }

    @Override
    public void exitPl_cmd_add_panda (PandaLanguageParser.Pl_cmd_add_pandaContext ctx) {

        addPandaCommandHandler.handleCommand (
                new AddPandaArgs (
                        ctx.panda_flag ().KW_COWARD () != null,
                        ctx.panda_flag ().KW_SLEEPY () != null,
                        ctx.panda_flag ().KW_JUMPY () != null,
                        Integer.parseInt (ctx.IDENTIFIER (0).getText ()),
                        Integer.parseInt (ctx.IDENTIFIER (1).getText ())
                )
        );

    }

    @Override
    public void exitPl_cmd_add_vendingmachine (PandaLanguageParser.Pl_cmd_add_vendingmachineContext ctx) {

        addItemCommandHandler.handleCommand (
                new AddItemArgs (
                        true, false, false, false,
                        Integer.parseInt (ctx.IDENTIFIER (0).getText ()),
                        Integer.parseInt (ctx.IDENTIFIER (1).getText ())
                )
        );

    }

    @Override
    public void exitPl_cmd_add_gamemachine (PandaLanguageParser.Pl_cmd_add_gamemachineContext ctx) {

        addItemCommandHandler.handleCommand (
                new AddItemArgs (
                        false, true, false, false,
                        Integer.parseInt (ctx.IDENTIFIER (0).getText ()),
                        Integer.parseInt (ctx.IDENTIFIER (1).getText ())
                )
        );

    }

    @Override
    public void exitPl_cmd_add_couch (PandaLanguageParser.Pl_cmd_add_couchContext ctx) {

        addItemCommandHandler.handleCommand (
                new AddItemArgs (
                        false, false, false, true,
                        Integer.parseInt (ctx.IDENTIFIER (0).getText ()),
                        Integer.parseInt (ctx.IDENTIFIER (1).getText ())
                )
        );

    }

    @Override
    public void exitPl_cmd_add_wardrobe (PandaLanguageParser.Pl_cmd_add_wardrobeContext ctx) {

        addItemCommandHandler.handleCommand (
                new AddItemArgs (
                        false, false, true, false,
                        Integer.parseInt (ctx.IDENTIFIER (0).getText ()),
                        Integer.parseInt (ctx.IDENTIFIER (1).getText ())
                )
        );

    }

    @Override
    public void exitPl_cmd_connect_tile (PandaLanguageParser.Pl_cmd_connect_tileContext ctx) {

        connectTilesCommandHandler.handleCommand (
                new ConnectTilesArgs (
                        Integer.parseInt (ctx.IDENTIFIER (0).getText ()),
                        Integer.parseInt (ctx.IDENTIFIER (1).getText ())
                )
        );

    }

    @Override
    public void exitPl_cmd_connect_wardrobe (PandaLanguageParser.Pl_cmd_connect_wardrobeContext ctx) {

        connectWardrobesCommandHandler.handleCommand (
                new ConnectWardrobesArgs (
                        Integer.parseInt (ctx.IDENTIFIER (0).getText ()),
                        Integer.parseInt (ctx.IDENTIFIER (1).getText ())
                )
        );

    }

    @Override
    public void exitSh_cmd_print (PandaLanguageParser.Sh_cmd_printContext ctx) {

        shellPrintCommandHandler.handleCommand (
                new ShellPrintArgs (
                        ctx.FILENAME () == null ? null : ctx.FILENAME ().getText ()
                )
        );

    }

    @Override
    public void enterSh_cmd_save (PandaLanguageParser.Sh_cmd_saveContext ctx) {

        // Remove last commandBuffer entry, that is this /save command
        commandBuffer.remove (commandBuffer.size () - 1);

    }

    @Override
    public void exitSh_cmd_save (PandaLanguageParser.Sh_cmd_saveContext ctx) {

        String filename = ctx.FILENAME ().getText ();

        if (filename.startsWith ("\"") && filename.endsWith ("\"")) {
            filename = filename.substring (1, filename.length () - 1);
        } else {
            throw new IllegalArgumentException ("Filenames should start and end with '\"' character!");
        }

        File outputFile = new File (filename);

        try (PrintStream ps = new PrintStream (outputFile)) {

            commandBuffer.forEach (ps::println);

        } catch (FileNotFoundException e) {
            e.printStackTrace ();
        }

    }

    @Override
    public void enterSh_cmd_load (PandaLanguageParser.Sh_cmd_loadContext ctx) {

        transactionalPandaStack.push ();

    }

    @Override
    public void exitSh_cmd_load (PandaLanguageParser.Sh_cmd_loadContext ctx) {

        String filename = ctx.FILENAME ().getText ();

        if (filename.startsWith ("\"") && filename.endsWith ("\"")) {
            filename = filename.substring (1, filename.length () - 1);
        } else {
            throw new IllegalArgumentException ("Filenames should start and end with '\"' character!");
        }

        // Default directory for loaded files is the current directory
        File dir = new File (System.getProperty ("user.dir"));

        // We are inside another load command, use the last directory as the root for relative paths
        if (!loadFilenameStack.isEmpty ()) {

            dir = new File (loadFilenameStack.getLast ());

        }

        File inputFile = new File (dir, filename);
        loadFilenameStack.addLast (inputFile.getParentFile ().getAbsolutePath ());

        try (
                FileReader fr = new FileReader (inputFile);
                BufferedReader br = new BufferedReader (fr)
        ) {

            String line = null;
            while ((line = br.readLine ()) != null) {
                execute (line.trim ());
            }

            // Pop without setting the state
            // Should only happen in case of fully successful file loading
            transactionalPandaStack.pop ();

        } catch (IOException e) {
            System.err.println ("Error during execution of loaded code, reverting ...");
            Game.getInstance ().level = transactionalPandaStack.pop ();
        } finally {
            loadFilenameStack.removeLast ();
        }

    }

    @Override
    public void exitSh_cmd_clear (PandaLanguageParser.Sh_cmd_clearContext ctx) {

        commandBuffer.clear ();
        Game.getInstance ().level = new Level (
                new ArrayList<> (),
                new ArrayList<> (),
                null, null
        );
        transactionalPandaStack.clear ();

    }

    @Override
    public void exitPl_cmd_add_orangutan (PandaLanguageParser.Pl_cmd_add_orangutanContext ctx) {

        addOrangutanCommandHandler.handleCommand (
                new AddOrangutanArgs (
                        Integer.parseInt (ctx.IDENTIFIER (0).getText ()),
                        Integer.parseInt (ctx.IDENTIFIER (1).getText ())
                )
        );

    }

}
