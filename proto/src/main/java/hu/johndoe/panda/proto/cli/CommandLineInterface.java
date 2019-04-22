package hu.johndoe.panda.proto.cli;

import hu.johndoe.panda.proto.pl.PandaLanguageBaseListener;
import hu.johndoe.panda.proto.pl.PandaLanguageLexer;
import hu.johndoe.panda.proto.pl.PandaLanguageListener;
import hu.johndoe.panda.proto.pl.PandaLanguageParser;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Scanner;

public class CommandLineInterface implements PandaLanguageListener {

    public void loop () {

        Scanner stdinScanner = new Scanner (System.in);

        while (true) {

            String commandLine = stdinScanner.nextLine ();
            PandaLanguageLexer lexer = new PandaLanguageLexer (CharStreams.fromString (commandLine));
            PandaLanguageParser parser = new PandaLanguageParser (new CommonTokenStream (lexer));
            ParseTree tree = parser.parse ();
            ParseTreeWalker walker = new ParseTreeWalker ();
            walker.walk (
                    this,
                    tree
            );

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

    }

    @Override
    public void exitPl_cmd_add (PandaLanguageParser.Pl_cmd_addContext ctx) {

    }

    @Override
    public void enterPl_cmd_work (PandaLanguageParser.Pl_cmd_workContext ctx) {

    }

    @Override
    public void exitPl_cmd_work (PandaLanguageParser.Pl_cmd_workContext ctx) {

    }

    @Override
    public void enterPl_cmd_connect (PandaLanguageParser.Pl_cmd_connectContext ctx) {

    }

    @Override
    public void exitPl_cmd_connect (PandaLanguageParser.Pl_cmd_connectContext ctx) {

    }

    @Override
    public void enterPl_cmd_move (PandaLanguageParser.Pl_cmd_moveContext ctx) {

    }

    @Override
    public void exitPl_cmd_move (PandaLanguageParser.Pl_cmd_moveContext ctx) {

    }

    @Override
    public void enterPl_cmd_use (PandaLanguageParser.Pl_cmd_useContext ctx) {

    }

    @Override
    public void exitPl_cmd_use (PandaLanguageParser.Pl_cmd_useContext ctx) {

    }

    @Override
    public void enterPl_cmd_push (PandaLanguageParser.Pl_cmd_pushContext ctx) {

    }

    @Override
    public void exitPl_cmd_push (PandaLanguageParser.Pl_cmd_pushContext ctx) {

    }

    @Override
    public void enterPl_cmd_pop (PandaLanguageParser.Pl_cmd_popContext ctx) {

    }

    @Override
    public void exitPl_cmd_pop (PandaLanguageParser.Pl_cmd_popContext ctx) {

    }

    @Override
    public void enterPl_cmd_begin (PandaLanguageParser.Pl_cmd_beginContext ctx) {

    }

    @Override
    public void exitPl_cmd_begin (PandaLanguageParser.Pl_cmd_beginContext ctx) {

    }

    @Override
    public void enterPl_cmd_end (PandaLanguageParser.Pl_cmd_endContext ctx) {

    }

    @Override
    public void exitPl_cmd_end (PandaLanguageParser.Pl_cmd_endContext ctx) {

    }

    @Override
    public void enterPl_cmd_set (PandaLanguageParser.Pl_cmd_setContext ctx) {

    }

    @Override
    public void exitPl_cmd_set (PandaLanguageParser.Pl_cmd_setContext ctx) {

    }

    @Override
    public void enterPl_cmd_release (PandaLanguageParser.Pl_cmd_releaseContext ctx) {

    }

    @Override
    public void exitPl_cmd_release (PandaLanguageParser.Pl_cmd_releaseContext ctx) {

    }

    @Override
    public void enterPl_cmd_add_tile (PandaLanguageParser.Pl_cmd_add_tileContext ctx) {

    }

    @Override
    public void exitPl_cmd_add_tile (PandaLanguageParser.Pl_cmd_add_tileContext ctx) {

    }

    @Override
    public void enterPl_cmd_add_panda (PandaLanguageParser.Pl_cmd_add_pandaContext ctx) {

    }

    @Override
    public void exitPl_cmd_add_panda (PandaLanguageParser.Pl_cmd_add_pandaContext ctx) {

    }

    @Override
    public void enterPl_cmd_add_vendingmachine (PandaLanguageParser.Pl_cmd_add_vendingmachineContext ctx) {

    }

    @Override
    public void exitPl_cmd_add_vendingmachine (PandaLanguageParser.Pl_cmd_add_vendingmachineContext ctx) {

    }

    @Override
    public void enterPl_cmd_add_gamemachine (PandaLanguageParser.Pl_cmd_add_gamemachineContext ctx) {

    }

    @Override
    public void exitPl_cmd_add_gamemachine (PandaLanguageParser.Pl_cmd_add_gamemachineContext ctx) {

    }

    @Override
    public void enterPl_cmd_add_couch (PandaLanguageParser.Pl_cmd_add_couchContext ctx) {

    }

    @Override
    public void exitPl_cmd_add_couch (PandaLanguageParser.Pl_cmd_add_couchContext ctx) {

    }

    @Override
    public void enterPl_cmd_add_wardrobe (PandaLanguageParser.Pl_cmd_add_wardrobeContext ctx) {

    }

    @Override
    public void exitPl_cmd_add_wardrobe (PandaLanguageParser.Pl_cmd_add_wardrobeContext ctx) {

    }

    @Override
    public void enterPl_cmd_connect_tile (PandaLanguageParser.Pl_cmd_connect_tileContext ctx) {

    }

    @Override
    public void exitPl_cmd_connect_tile (PandaLanguageParser.Pl_cmd_connect_tileContext ctx) {

    }

    @Override
    public void enterPl_cmd_connect_wardrobe (PandaLanguageParser.Pl_cmd_connect_wardrobeContext ctx) {

    }

    @Override
    public void exitPl_cmd_connect_wardrobe (PandaLanguageParser.Pl_cmd_connect_wardrobeContext ctx) {

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

    }

    @Override
    public void enterSh_cmd_save (PandaLanguageParser.Sh_cmd_saveContext ctx) {

    }

    @Override
    public void exitSh_cmd_save (PandaLanguageParser.Sh_cmd_saveContext ctx) {

    }

    @Override
    public void enterSh_cmd_load (PandaLanguageParser.Sh_cmd_loadContext ctx) {

    }

    @Override
    public void exitSh_cmd_load (PandaLanguageParser.Sh_cmd_loadContext ctx) {

    }

    @Override
    public void enterSh_cmd_clear (PandaLanguageParser.Sh_cmd_clearContext ctx) {

    }

    @Override
    public void exitSh_cmd_clear (PandaLanguageParser.Sh_cmd_clearContext ctx) {

    }

    @Override
    public void enterFilename (PandaLanguageParser.FilenameContext ctx) {

    }

    @Override
    public void exitFilename (PandaLanguageParser.FilenameContext ctx) {

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
