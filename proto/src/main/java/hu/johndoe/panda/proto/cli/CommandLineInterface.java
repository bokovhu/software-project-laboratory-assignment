package hu.johndoe.panda.proto.cli;

import hu.johndoe.panda.proto.model.Animal;
import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Level;
import hu.johndoe.panda.proto.pl.PandaLanguageBaseListener;
import hu.johndoe.panda.proto.pl.PandaLanguageLexer;
import hu.johndoe.panda.proto.pl.PandaLanguageListener;
import hu.johndoe.panda.proto.pl.PandaLanguageParser;
import hu.johndoe.panda.proto.pl.cmd.args.*;
import hu.johndoe.panda.proto.pl.cmd.handler.*;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.io.*;
import java.nio.file.FileSystems;
import java.util.*;
import java.util.stream.Collectors;

public class CommandLineInterface extends PandaLanguageBaseListener {

    private List<String> commandBuffer = new ArrayList<> ();
    private PandaStack pandaStack = new PandaStack ();
    private PandaStack transactionalPandaStack = new PandaStack ();
    private boolean didBegin = false;
    private Deque <String> loadFilenameStack = new ArrayDeque<> ();

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

    private void execute (String commandLine) {

        commandBuffer.add (commandLine);

        PandaLanguageLexer lexer = new PandaLanguageLexer (CharStreams.fromString (commandLine));
        lexer.removeErrorListener (ConsoleErrorListener.INSTANCE);
        PandaLanguageParser parser = new PandaLanguageParser (new CommonTokenStream (lexer));
        parser.removeErrorListener (ConsoleErrorListener.INSTANCE);
        try {
            ParseTree tree = parser.parse ();
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

    public void loop () {

        Scanner stdinScanner = new Scanner (System.in);

        while (true) {

            System.out.print ("PandaLang > ");
            String commandLine = stdinScanner.nextLine ();

            try {
                transactionalPandaStack.push ();
                execute (commandLine);
                transactionalPandaStack.pop ();
            } catch (Exception e) {
                System.err.println ("Could not execute command '" + commandLine + "', reverting to previous state ...");
                e.printStackTrace ();
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
                        ctx.KW_GAMEMACHINE () != null || ctx.KW_VENDINGMACHINE () != null || ctx.KW_COUCH () != null || ctx.KW_WARDROBE () != null,
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
                        Integer.parseInt (ctx.IDENTIFIER ().getText ())
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

        File dir = new File (System.getProperty ("user.dir"));

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
