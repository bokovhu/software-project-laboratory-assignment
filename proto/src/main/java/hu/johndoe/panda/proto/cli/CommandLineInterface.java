package hu.johndoe.panda.proto.cli;

import hu.johndoe.panda.proto.model.Animal;
import hu.johndoe.panda.proto.model.Game;
import hu.johndoe.panda.proto.model.Level;
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
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CommandLineInterface implements PandaLanguageListener {

    private List<String> commandBuffer = new ArrayList<> ();
    private PandaStack pandaStack = new PandaStack ();
    private PandaStack transactionalPandaStack = new PandaStack ();
    private boolean didBegin = false;

    // Command handlers //

    private ShellPrintCommandHandler shellPrintCommandHandler = new ShellPrintCommandHandler ();
    private AddTileCommandHandler addTileCommandHandler = new AddTileCommandHandler ();
    private AddPandaCommandHandler addPandaCommandHandler = new AddPandaCommandHandler ();
    private ConnectTilesCommandHandler connectTilesCommandHandler = new ConnectTilesCommandHandler ();
    private AddItemCommandHandler addItemCommandHandler = new AddItemCommandHandler ();
    private ConnectWardrobesCommandHandler connectWardrobesCommandHandler = new ConnectWardrobesCommandHandler ();
    private WorkCommandHandler workCommandHandler = new WorkCommandHandler ();

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
    public void enterParse (PandaLanguageParser.ParseContext ctx) {

    }

    @Override
    public void exitParse (PandaLanguageParser.ParseContext ctx) {

    }

    @Override
    public void enterError (PandaLanguageParser.ErrorContext ctx) {

    }

    @Override
    public void exitError (PandaLanguageParser.ErrorContext ctx) {

    }

    @Override
    public void enterExpression (PandaLanguageParser.ExpressionContext ctx) {

    }

    @Override
    public void exitExpression (PandaLanguageParser.ExpressionContext ctx) {

    }

    @Override
    public void enterPandalang_command (PandaLanguageParser.Pandalang_commandContext ctx) {

    }

    @Override
    public void exitPandalang_command (PandaLanguageParser.Pandalang_commandContext ctx) {

    }

    @Override
    public void enterShell_command (PandaLanguageParser.Shell_commandContext ctx) {

    }

    @Override
    public void exitShell_command (PandaLanguageParser.Shell_commandContext ctx) {

    }

    @Override
    public void enterPl_cmd_add (PandaLanguageParser.Pl_cmd_addContext ctx) {

        if (didBegin) {
            throw new IllegalStateException ("Cannot execute ADD, already begun!");
        }

    }

    @Override
    public void exitPl_cmd_add (PandaLanguageParser.Pl_cmd_addContext ctx) {

    }

    @Override
    public void enterPl_cmd_work (PandaLanguageParser.Pl_cmd_workContext ctx) {

        if (!didBegin) {
            throw new IllegalStateException ("Cannot execute WORK, did not begin yet!");
        }

    }

    @Override
    public void exitPl_cmd_work (PandaLanguageParser.Pl_cmd_workContext ctx) {

    }

    @Override
    public void enterPl_cmd_work_specific (PandaLanguageParser.Pl_cmd_work_specificContext ctx) {

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
    public void enterPl_cmd_work_all (PandaLanguageParser.Pl_cmd_work_allContext ctx) {

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
    public void exitPl_cmd_connect (PandaLanguageParser.Pl_cmd_connectContext ctx) {

    }

    @Override
    public void enterPl_cmd_move (PandaLanguageParser.Pl_cmd_moveContext ctx) {

        if (!didBegin) {
            throw new IllegalStateException ("Cannot execute MOVE, did not begin yet!");
        }

    }

    @Override
    public void exitPl_cmd_move (PandaLanguageParser.Pl_cmd_moveContext ctx) {

    }

    @Override
    public void enterPl_cmd_use (PandaLanguageParser.Pl_cmd_useContext ctx) {

        if (!didBegin) {
            throw new IllegalStateException ("Cannot execute USE, did not begin yet!");
        }

    }

    @Override
    public void exitPl_cmd_use (PandaLanguageParser.Pl_cmd_useContext ctx) {

    }

    @Override
    public void enterPl_cmd_push (PandaLanguageParser.Pl_cmd_pushContext ctx) {

    }

    @Override
    public void exitPl_cmd_push (PandaLanguageParser.Pl_cmd_pushContext ctx) {

        pandaStack.push ();

    }

    @Override
    public void enterPl_cmd_pop (PandaLanguageParser.Pl_cmd_popContext ctx) {

    }

    @Override
    public void exitPl_cmd_pop (PandaLanguageParser.Pl_cmd_popContext ctx) {

        Game.getInstance ().level = pandaStack.pop ();

    }

    @Override
    public void enterPl_cmd_begin (PandaLanguageParser.Pl_cmd_beginContext ctx) {

    }

    @Override
    public void exitPl_cmd_begin (PandaLanguageParser.Pl_cmd_beginContext ctx) {

        if (didBegin) {
            System.err.println ("Already begun!");
        }
        didBegin = true;

    }

    @Override
    public void enterPl_cmd_end (PandaLanguageParser.Pl_cmd_endContext ctx) {

    }

    @Override
    public void exitPl_cmd_end (PandaLanguageParser.Pl_cmd_endContext ctx) {

        if (!didBegin) {
            System.err.println ("Not yet begun!");
        }
        didBegin = false;

    }

    @Override
    public void enterPl_cmd_set (PandaLanguageParser.Pl_cmd_setContext ctx) {

    }

    @Override
    public void exitPl_cmd_set (PandaLanguageParser.Pl_cmd_setContext ctx) {

    }

    @Override
    public void enterPl_cmd_release (PandaLanguageParser.Pl_cmd_releaseContext ctx) {

        if (!didBegin) {
            throw new IllegalStateException ("Cannot execute RELEASE, did not begin yet!");
        }

    }

    @Override
    public void exitPl_cmd_release (PandaLanguageParser.Pl_cmd_releaseContext ctx) {

    }

    @Override
    public void enterPl_cmd_add_tile (PandaLanguageParser.Pl_cmd_add_tileContext ctx) {

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
    public void enterPl_cmd_add_panda (PandaLanguageParser.Pl_cmd_add_pandaContext ctx) {

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
    public void enterPl_cmd_add_vendingmachine (PandaLanguageParser.Pl_cmd_add_vendingmachineContext ctx) {

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
    public void enterPl_cmd_add_gamemachine (PandaLanguageParser.Pl_cmd_add_gamemachineContext ctx) {

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
    public void enterPl_cmd_add_couch (PandaLanguageParser.Pl_cmd_add_couchContext ctx) {

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
    public void enterPl_cmd_add_wardrobe (PandaLanguageParser.Pl_cmd_add_wardrobeContext ctx) {

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
    public void enterPl_cmd_connect_tile (PandaLanguageParser.Pl_cmd_connect_tileContext ctx) {

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
    public void enterPl_cmd_connect_wardrobe (PandaLanguageParser.Pl_cmd_connect_wardrobeContext ctx) {

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
    public void enterTile_flag (PandaLanguageParser.Tile_flagContext ctx) {

    }

    @Override
    public void exitTile_flag (PandaLanguageParser.Tile_flagContext ctx) {

    }

    @Override
    public void enterPanda_flag (PandaLanguageParser.Panda_flagContext ctx) {

    }

    @Override
    public void exitPanda_flag (PandaLanguageParser.Panda_flagContext ctx) {

    }

    @Override
    public void enterSh_cmd_print (PandaLanguageParser.Sh_cmd_printContext ctx) {

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

        File inputFile = new File (filename);

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
        }

    }

    @Override
    public void enterSh_cmd_clear (PandaLanguageParser.Sh_cmd_clearContext ctx) {

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
    public void visitTerminal (TerminalNode node) {

    }

    @Override
    public void visitErrorNode (ErrorNode node) {

    }

    @Override
    public void enterEveryRule (ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule (ParserRuleContext ctx) {

    }

}
