// Generated from PandaLanguage.g4 by ANTLR 4.7.2
package hu.johndoe.panda.proto.pl;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PandaLanguageParser}.
 */
public interface PandaLanguageListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse (PandaLanguageParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse (PandaLanguageParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#error}.
	 * @param ctx the parse tree
	 */
	void enterError (PandaLanguageParser.ErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#error}.
	 * @param ctx the parse tree
	 */
	void exitError (PandaLanguageParser.ErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression (PandaLanguageParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression (PandaLanguageParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pandalang_command}.
	 * @param ctx the parse tree
	 */
	void enterPandalang_command (PandaLanguageParser.Pandalang_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pandalang_command}.
	 * @param ctx the parse tree
	 */
	void exitPandalang_command (PandaLanguageParser.Pandalang_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#shell_command}.
	 * @param ctx the parse tree
	 */
	void enterShell_command (PandaLanguageParser.Shell_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#shell_command}.
	 * @param ctx the parse tree
	 */
	void exitShell_command (PandaLanguageParser.Shell_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_add}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_add (PandaLanguageParser.Pl_cmd_addContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_add}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_add (PandaLanguageParser.Pl_cmd_addContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_work}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_work (PandaLanguageParser.Pl_cmd_workContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_work}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_work (PandaLanguageParser.Pl_cmd_workContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_work_specific}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_work_specific (PandaLanguageParser.Pl_cmd_work_specificContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_work_specific}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_work_specific (PandaLanguageParser.Pl_cmd_work_specificContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_work_all}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_work_all (PandaLanguageParser.Pl_cmd_work_allContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_work_all}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_work_all (PandaLanguageParser.Pl_cmd_work_allContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_connect}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_connect (PandaLanguageParser.Pl_cmd_connectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_connect}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_connect (PandaLanguageParser.Pl_cmd_connectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_move}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_move (PandaLanguageParser.Pl_cmd_moveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_move}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_move (PandaLanguageParser.Pl_cmd_moveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_use}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_use (PandaLanguageParser.Pl_cmd_useContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_use}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_use (PandaLanguageParser.Pl_cmd_useContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_push}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_push (PandaLanguageParser.Pl_cmd_pushContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_push}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_push (PandaLanguageParser.Pl_cmd_pushContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_pop}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_pop (PandaLanguageParser.Pl_cmd_popContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_pop}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_pop (PandaLanguageParser.Pl_cmd_popContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_begin}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_begin (PandaLanguageParser.Pl_cmd_beginContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_begin}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_begin (PandaLanguageParser.Pl_cmd_beginContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_end}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_end (PandaLanguageParser.Pl_cmd_endContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_end}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_end (PandaLanguageParser.Pl_cmd_endContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_set}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_set (PandaLanguageParser.Pl_cmd_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_set}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_set (PandaLanguageParser.Pl_cmd_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_release}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_release (PandaLanguageParser.Pl_cmd_releaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_release}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_release (PandaLanguageParser.Pl_cmd_releaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_tile}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_add_tile (PandaLanguageParser.Pl_cmd_add_tileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_tile}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_add_tile (PandaLanguageParser.Pl_cmd_add_tileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_panda}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_add_panda (PandaLanguageParser.Pl_cmd_add_pandaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_panda}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_add_panda (PandaLanguageParser.Pl_cmd_add_pandaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_vendingmachine}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_add_vendingmachine (PandaLanguageParser.Pl_cmd_add_vendingmachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_vendingmachine}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_add_vendingmachine (PandaLanguageParser.Pl_cmd_add_vendingmachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_gamemachine}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_add_gamemachine (PandaLanguageParser.Pl_cmd_add_gamemachineContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_gamemachine}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_add_gamemachine (PandaLanguageParser.Pl_cmd_add_gamemachineContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_couch}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_add_couch (PandaLanguageParser.Pl_cmd_add_couchContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_couch}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_add_couch (PandaLanguageParser.Pl_cmd_add_couchContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_wardrobe}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_add_wardrobe (PandaLanguageParser.Pl_cmd_add_wardrobeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_add_wardrobe}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_add_wardrobe (PandaLanguageParser.Pl_cmd_add_wardrobeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_connect_tile}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_connect_tile (PandaLanguageParser.Pl_cmd_connect_tileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_connect_tile}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_connect_tile (PandaLanguageParser.Pl_cmd_connect_tileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#pl_cmd_connect_wardrobe}.
	 * @param ctx the parse tree
	 */
	void enterPl_cmd_connect_wardrobe (PandaLanguageParser.Pl_cmd_connect_wardrobeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#pl_cmd_connect_wardrobe}.
	 * @param ctx the parse tree
	 */
	void exitPl_cmd_connect_wardrobe (PandaLanguageParser.Pl_cmd_connect_wardrobeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#tile_flag}.
	 * @param ctx the parse tree
	 */
	void enterTile_flag (PandaLanguageParser.Tile_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#tile_flag}.
	 * @param ctx the parse tree
	 */
	void exitTile_flag (PandaLanguageParser.Tile_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#panda_flag}.
	 * @param ctx the parse tree
	 */
	void enterPanda_flag (PandaLanguageParser.Panda_flagContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#panda_flag}.
	 * @param ctx the parse tree
	 */
	void exitPanda_flag (PandaLanguageParser.Panda_flagContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#sh_cmd_print}.
	 * @param ctx the parse tree
	 */
	void enterSh_cmd_print (PandaLanguageParser.Sh_cmd_printContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#sh_cmd_print}.
	 * @param ctx the parse tree
	 */
	void exitSh_cmd_print (PandaLanguageParser.Sh_cmd_printContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#sh_cmd_save}.
	 * @param ctx the parse tree
	 */
	void enterSh_cmd_save (PandaLanguageParser.Sh_cmd_saveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#sh_cmd_save}.
	 * @param ctx the parse tree
	 */
	void exitSh_cmd_save (PandaLanguageParser.Sh_cmd_saveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#sh_cmd_load}.
	 * @param ctx the parse tree
	 */
	void enterSh_cmd_load (PandaLanguageParser.Sh_cmd_loadContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#sh_cmd_load}.
	 * @param ctx the parse tree
	 */
	void exitSh_cmd_load (PandaLanguageParser.Sh_cmd_loadContext ctx);
	/**
	 * Enter a parse tree produced by {@link PandaLanguageParser#sh_cmd_clear}.
	 * @param ctx the parse tree
	 */
	void enterSh_cmd_clear (PandaLanguageParser.Sh_cmd_clearContext ctx);
	/**
	 * Exit a parse tree produced by {@link PandaLanguageParser#sh_cmd_clear}.
	 * @param ctx the parse tree
	 */
	void exitSh_cmd_clear (PandaLanguageParser.Sh_cmd_clearContext ctx);
}