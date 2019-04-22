// Generated from PandaLanguage.g4 by ANTLR 4.7.2
package hu.johndoe.panda.proto.pl;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PandaLanguageParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, FILENAME=5, KW_ADD=6, KW_CONNECT=7, KW_BEGIN=8, 
		KW_END=9, KW_MOVE=10, KW_USE=11, KW_WORK=12, KW_PUSH=13, KW_POP=14, KW_SET=15, 
		KW_RELEASE=16, KW_TILE=17, KW_PANDA=18, KW_ORANGUTAN=19, KW_VENDINGMACHINE=20, 
		KW_WARDROBE=21, KW_GAMEMACHINE=22, KW_COUCH=23, KW_FRAGILE=24, KW_EXIT=25, 
		KW_START=26, KW_COWARD=27, KW_SLEEPY=28, KW_JUMPY=29, KW_CURRENTANIMAL=30, 
		KW_CURRENTITEM=31, KW_PLACEDON=32, KW_STANDINGON=33, KW_SLEEPINGIN=34, 
		KW_LEADERANIMAL=35, KW_GUIDEDANIMAL=36, KW_THEFTTIMER=37, KW_NULL=38, 
		KW_WITH=39, KW_ID=40, KW_ONTO=41, KW_CONNECTED=42, KW_BY=43, IDENTIFIER=44, 
		WHITESPACE=45, NEWLINE=46, COMMENT=47, SEMICOLON=48, LEFTPAR=49, RIGHTPAR=50, 
		EQUALS=51, SLASH=52, WORD=53, UNEXPECTED_CHAR=54;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_expression = 2, RULE_pandalang_command = 3, 
		RULE_shell_command = 4, RULE_pl_cmd_add = 5, RULE_pl_cmd_work = 6, RULE_pl_cmd_connect = 7, 
		RULE_pl_cmd_move = 8, RULE_pl_cmd_use = 9, RULE_pl_cmd_push = 10, RULE_pl_cmd_pop = 11, 
		RULE_pl_cmd_begin = 12, RULE_pl_cmd_end = 13, RULE_pl_cmd_set = 14, RULE_pl_cmd_release = 15, 
		RULE_pl_cmd_add_tile = 16, RULE_pl_cmd_add_panda = 17, RULE_pl_cmd_add_vendingmachine = 18, 
		RULE_pl_cmd_add_gamemachine = 19, RULE_pl_cmd_add_couch = 20, RULE_pl_cmd_add_wardrobe = 21, 
		RULE_pl_cmd_connect_tile = 22, RULE_pl_cmd_connect_wardrobe = 23, RULE_tile_flag = 24, 
		RULE_panda_flag = 25, RULE_sh_cmd_print = 26, RULE_sh_cmd_save = 27, RULE_sh_cmd_load = 28, 
		RULE_sh_cmd_clear = 29;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "expression", "pandalang_command", "shell_command", 
			"pl_cmd_add", "pl_cmd_work", "pl_cmd_connect", "pl_cmd_move", "pl_cmd_use", 
			"pl_cmd_push", "pl_cmd_pop", "pl_cmd_begin", "pl_cmd_end", "pl_cmd_set", 
			"pl_cmd_release", "pl_cmd_add_tile", "pl_cmd_add_panda", "pl_cmd_add_vendingmachine", 
			"pl_cmd_add_gamemachine", "pl_cmd_add_couch", "pl_cmd_add_wardrobe", 
			"pl_cmd_connect_tile", "pl_cmd_connect_wardrobe", "tile_flag", "panda_flag", 
			"sh_cmd_print", "sh_cmd_save", "sh_cmd_load", "sh_cmd_clear"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'save'", "'load'", "'clear'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, "';'", "'('", "')'", "'='", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "FILENAME", "KW_ADD", "KW_CONNECT", "KW_BEGIN", 
			"KW_END", "KW_MOVE", "KW_USE", "KW_WORK", "KW_PUSH", "KW_POP", "KW_SET", 
			"KW_RELEASE", "KW_TILE", "KW_PANDA", "KW_ORANGUTAN", "KW_VENDINGMACHINE", 
			"KW_WARDROBE", "KW_GAMEMACHINE", "KW_COUCH", "KW_FRAGILE", "KW_EXIT", 
			"KW_START", "KW_COWARD", "KW_SLEEPY", "KW_JUMPY", "KW_CURRENTANIMAL", 
			"KW_CURRENTITEM", "KW_PLACEDON", "KW_STANDINGON", "KW_SLEEPINGIN", "KW_LEADERANIMAL", 
			"KW_GUIDEDANIMAL", "KW_THEFTTIMER", "KW_NULL", "KW_WITH", "KW_ID", "KW_ONTO", 
			"KW_CONNECTED", "KW_BY", "IDENTIFIER", "WHITESPACE", "NEWLINE", "COMMENT", 
			"SEMICOLON", "LEFTPAR", "RIGHTPAR", "EQUALS", "SLASH", "WORD", "UNEXPECTED_CHAR"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "PandaLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public PandaLanguageParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class ParseContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(PandaLanguageParser.EOF, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PandaLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PandaLanguageParser.SEMICOLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PandaLanguageParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PandaLanguageParser.NEWLINE, i);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(62);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case KW_ADD:
					case KW_CONNECT:
					case KW_BEGIN:
					case KW_END:
					case KW_MOVE:
					case KW_USE:
					case KW_WORK:
					case KW_PUSH:
					case KW_POP:
					case KW_SET:
					case KW_RELEASE:
					case NEWLINE:
					case SEMICOLON:
					case SLASH:
						{
						setState(60);
						expression();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(61);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(66);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(70);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==SEMICOLON) {
				{
				{
				setState(67);
				_la = _input.LA(1);
				if ( !(_la==NEWLINE || _la==SEMICOLON) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				}
				setState(72);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(73);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public Token UNEXPECTED_CHAR;
		public TerminalNode UNEXPECTED_CHAR() { return getToken(PandaLanguageParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitError(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			((ErrorContext)_localctx).UNEXPECTED_CHAR = match(UNEXPECTED_CHAR);
			 
						throw new RuntimeException("UNEXPECTED_CHAR=" + (((ErrorContext)_localctx).UNEXPECTED_CHAR!=null?((ErrorContext)_localctx).UNEXPECTED_CHAR.getText():null)); 
					
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Pandalang_commandContext pandalang_command() {
			return getRuleContext(Pandalang_commandContext.class,0);
		}
		public Shell_commandContext shell_command() {
			return getRuleContext(Shell_commandContext.class,0);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PandaLanguageParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PandaLanguageParser.NEWLINE, i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitExpression(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_expression);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(80);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ADD:
			case KW_CONNECT:
			case KW_BEGIN:
			case KW_END:
			case KW_MOVE:
			case KW_USE:
			case KW_WORK:
			case KW_PUSH:
			case KW_POP:
			case KW_SET:
			case KW_RELEASE:
			case NEWLINE:
			case SEMICOLON:
				{
				setState(78);
				pandalang_command();
				}
				break;
			case SLASH:
				{
				setState(79);
				shell_command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(85);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(82);
					match(NEWLINE);
					}
					} 
				}
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pandalang_commandContext extends ParserRuleContext {
		public Pl_cmd_addContext pl_cmd_add() {
			return getRuleContext(Pl_cmd_addContext.class,0);
		}
		public Pl_cmd_workContext pl_cmd_work() {
			return getRuleContext(Pl_cmd_workContext.class,0);
		}
		public Pl_cmd_connectContext pl_cmd_connect() {
			return getRuleContext(Pl_cmd_connectContext.class,0);
		}
		public Pl_cmd_moveContext pl_cmd_move() {
			return getRuleContext(Pl_cmd_moveContext.class,0);
		}
		public Pl_cmd_useContext pl_cmd_use() {
			return getRuleContext(Pl_cmd_useContext.class,0);
		}
		public Pl_cmd_pushContext pl_cmd_push() {
			return getRuleContext(Pl_cmd_pushContext.class,0);
		}
		public Pl_cmd_popContext pl_cmd_pop() {
			return getRuleContext(Pl_cmd_popContext.class,0);
		}
		public Pl_cmd_beginContext pl_cmd_begin() {
			return getRuleContext(Pl_cmd_beginContext.class,0);
		}
		public Pl_cmd_endContext pl_cmd_end() {
			return getRuleContext(Pl_cmd_endContext.class,0);
		}
		public Pl_cmd_setContext pl_cmd_set() {
			return getRuleContext(Pl_cmd_setContext.class,0);
		}
		public Pl_cmd_releaseContext pl_cmd_release() {
			return getRuleContext(Pl_cmd_releaseContext.class,0);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(PandaLanguageParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(PandaLanguageParser.SEMICOLON, i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(PandaLanguageParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(PandaLanguageParser.NEWLINE, i);
		}
		public Pandalang_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pandalang_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPandalang_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPandalang_command(this);
		}
	}

	public final Pandalang_commandContext pandalang_command() throws RecognitionException {
		Pandalang_commandContext _localctx = new Pandalang_commandContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_pandalang_command);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==SEMICOLON) {
				{
				{
				setState(88);
				match(SEMICOLON);
				}
				}
				setState(93);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(97);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE) {
				{
				{
				setState(94);
				match(NEWLINE);
				}
				}
				setState(99);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(111);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ADD:
				{
				setState(100);
				pl_cmd_add();
				}
				break;
			case KW_WORK:
				{
				setState(101);
				pl_cmd_work();
				}
				break;
			case KW_CONNECT:
				{
				setState(102);
				pl_cmd_connect();
				}
				break;
			case KW_MOVE:
				{
				setState(103);
				pl_cmd_move();
				}
				break;
			case KW_USE:
				{
				setState(104);
				pl_cmd_use();
				}
				break;
			case KW_PUSH:
				{
				setState(105);
				pl_cmd_push();
				}
				break;
			case KW_POP:
				{
				setState(106);
				pl_cmd_pop();
				}
				break;
			case KW_BEGIN:
				{
				setState(107);
				pl_cmd_begin();
				}
				break;
			case KW_END:
				{
				setState(108);
				pl_cmd_end();
				}
				break;
			case KW_SET:
				{
				setState(109);
				pl_cmd_set();
				}
				break;
			case KW_RELEASE:
				{
				setState(110);
				pl_cmd_release();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(114); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(113);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(116); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!= ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Shell_commandContext extends ParserRuleContext {
		public TerminalNode SLASH() { return getToken(PandaLanguageParser.SLASH, 0); }
		public Sh_cmd_printContext sh_cmd_print() {
			return getRuleContext(Sh_cmd_printContext.class,0);
		}
		public Sh_cmd_saveContext sh_cmd_save() {
			return getRuleContext(Sh_cmd_saveContext.class,0);
		}
		public Sh_cmd_loadContext sh_cmd_load() {
			return getRuleContext(Sh_cmd_loadContext.class,0);
		}
		public Sh_cmd_clearContext sh_cmd_clear() {
			return getRuleContext(Sh_cmd_clearContext.class,0);
		}
		public Shell_commandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shell_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterShell_command(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitShell_command(this);
		}
	}

	public final Shell_commandContext shell_command() throws RecognitionException {
		Shell_commandContext _localctx = new Shell_commandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_shell_command);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(SLASH);
			setState(123);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(119);
				sh_cmd_print();
				}
				break;
			case T__1:
				{
				setState(120);
				sh_cmd_save();
				}
				break;
			case T__2:
				{
				setState(121);
				sh_cmd_load();
				}
				break;
			case T__3:
				{
				setState(122);
				sh_cmd_clear();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_addContext extends ParserRuleContext {
		public Pl_cmd_add_tileContext pl_cmd_add_tile() {
			return getRuleContext(Pl_cmd_add_tileContext.class,0);
		}
		public Pl_cmd_add_pandaContext pl_cmd_add_panda() {
			return getRuleContext(Pl_cmd_add_pandaContext.class,0);
		}
		public Pl_cmd_add_vendingmachineContext pl_cmd_add_vendingmachine() {
			return getRuleContext(Pl_cmd_add_vendingmachineContext.class,0);
		}
		public Pl_cmd_add_gamemachineContext pl_cmd_add_gamemachine() {
			return getRuleContext(Pl_cmd_add_gamemachineContext.class,0);
		}
		public Pl_cmd_add_couchContext pl_cmd_add_couch() {
			return getRuleContext(Pl_cmd_add_couchContext.class,0);
		}
		public Pl_cmd_add_wardrobeContext pl_cmd_add_wardrobe() {
			return getRuleContext(Pl_cmd_add_wardrobeContext.class,0);
		}
		public Pl_cmd_addContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_add; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_add(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_add(this);
		}
	}

	public final Pl_cmd_addContext pl_cmd_add() throws RecognitionException {
		Pl_cmd_addContext _localctx = new Pl_cmd_addContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_pl_cmd_add);
		try {
			setState(131);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(125);
				pl_cmd_add_tile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(126);
				pl_cmd_add_panda();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(127);
				pl_cmd_add_vendingmachine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				pl_cmd_add_gamemachine();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(129);
				pl_cmd_add_couch();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(130);
				pl_cmd_add_wardrobe();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_workContext extends ParserRuleContext {
		public TerminalNode KW_WORK() { return getToken(PandaLanguageParser.KW_WORK, 0); }
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_ID() { return getToken(PandaLanguageParser.KW_ID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PandaLanguageParser.IDENTIFIER, 0); }
		public TerminalNode KW_GAMEMACHINE() { return getToken(PandaLanguageParser.KW_GAMEMACHINE, 0); }
		public TerminalNode KW_VENDINGMACHINE() { return getToken(PandaLanguageParser.KW_VENDINGMACHINE, 0); }
		public TerminalNode KW_COUCH() { return getToken(PandaLanguageParser.KW_COUCH, 0); }
		public TerminalNode KW_WARDROBE() { return getToken(PandaLanguageParser.KW_WARDROBE, 0); }
		public TerminalNode KW_PANDA() { return getToken(PandaLanguageParser.KW_PANDA, 0); }
		public TerminalNode KW_ORANGUTAN() { return getToken(PandaLanguageParser.KW_ORANGUTAN, 0); }
		public Pl_cmd_workContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_work; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_work(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_work(this);
		}
	}

	public final Pl_cmd_workContext pl_cmd_work() throws RecognitionException {
		Pl_cmd_workContext _localctx = new Pl_cmd_workContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_pl_cmd_work);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(KW_WORK);
			setState(134);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PANDA) | (1L << KW_ORANGUTAN) | (1L << KW_VENDINGMACHINE) | (1L << KW_WARDROBE) | (1L << KW_GAMEMACHINE) | (1L << KW_COUCH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(135);
			match(KW_WITH);
			setState(136);
			match(KW_ID);
			setState(137);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_connectContext extends ParserRuleContext {
		public Pl_cmd_connect_tileContext pl_cmd_connect_tile() {
			return getRuleContext(Pl_cmd_connect_tileContext.class,0);
		}
		public Pl_cmd_connect_wardrobeContext pl_cmd_connect_wardrobe() {
			return getRuleContext(Pl_cmd_connect_wardrobeContext.class,0);
		}
		public Pl_cmd_connectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_connect; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_connect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_connect(this);
		}
	}

	public final Pl_cmd_connectContext pl_cmd_connect() throws RecognitionException {
		Pl_cmd_connectContext _localctx = new Pl_cmd_connectContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pl_cmd_connect);
		try {
			setState(141);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(139);
				pl_cmd_connect_tile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(140);
				pl_cmd_connect_wardrobe();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_moveContext extends ParserRuleContext {
		public TerminalNode KW_MOVE() { return getToken(PandaLanguageParser.KW_MOVE, 0); }
		public TerminalNode KW_ORANGUTAN() { return getToken(PandaLanguageParser.KW_ORANGUTAN, 0); }
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_ID() { return getToken(PandaLanguageParser.KW_ID, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PandaLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PandaLanguageParser.IDENTIFIER, i);
		}
		public TerminalNode KW_ONTO() { return getToken(PandaLanguageParser.KW_ONTO, 0); }
		public TerminalNode KW_TILE() { return getToken(PandaLanguageParser.KW_TILE, 0); }
		public Pl_cmd_moveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_move(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_move(this);
		}
	}

	public final Pl_cmd_moveContext pl_cmd_move() throws RecognitionException {
		Pl_cmd_moveContext _localctx = new Pl_cmd_moveContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pl_cmd_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143);
			match(KW_MOVE);
			setState(144);
			match(KW_ORANGUTAN);
			setState(145);
			match(KW_WITH);
			setState(146);
			match(KW_ID);
			setState(147);
			match(IDENTIFIER);
			setState(148);
			match(KW_ONTO);
			setState(149);
			match(KW_TILE);
			setState(150);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_useContext extends ParserRuleContext {
		public TerminalNode KW_USE() { return getToken(PandaLanguageParser.KW_USE, 0); }
		public List<TerminalNode> KW_WITH() { return getTokens(PandaLanguageParser.KW_WITH); }
		public TerminalNode KW_WITH(int i) {
			return getToken(PandaLanguageParser.KW_WITH, i);
		}
		public List<TerminalNode> KW_ID() { return getTokens(PandaLanguageParser.KW_ID); }
		public TerminalNode KW_ID(int i) {
			return getToken(PandaLanguageParser.KW_ID, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PandaLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PandaLanguageParser.IDENTIFIER, i);
		}
		public TerminalNode KW_BY() { return getToken(PandaLanguageParser.KW_BY, 0); }
		public TerminalNode KW_GAMEMACHINE() { return getToken(PandaLanguageParser.KW_GAMEMACHINE, 0); }
		public TerminalNode KW_VENDINGMACHINE() { return getToken(PandaLanguageParser.KW_VENDINGMACHINE, 0); }
		public TerminalNode KW_COUCH() { return getToken(PandaLanguageParser.KW_COUCH, 0); }
		public TerminalNode KW_WARDROBE() { return getToken(PandaLanguageParser.KW_WARDROBE, 0); }
		public TerminalNode KW_ORANGUTAN() { return getToken(PandaLanguageParser.KW_ORANGUTAN, 0); }
		public TerminalNode KW_PANDA() { return getToken(PandaLanguageParser.KW_PANDA, 0); }
		public Pl_cmd_useContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_use; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_use(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_use(this);
		}
	}

	public final Pl_cmd_useContext pl_cmd_use() throws RecognitionException {
		Pl_cmd_useContext _localctx = new Pl_cmd_useContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_pl_cmd_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(KW_USE);
			setState(153);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_VENDINGMACHINE) | (1L << KW_WARDROBE) | (1L << KW_GAMEMACHINE) | (1L << KW_COUCH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(154);
			match(KW_WITH);
			setState(155);
			match(KW_ID);
			setState(156);
			match(IDENTIFIER);
			setState(157);
			match(KW_BY);
			setState(158);
			_la = _input.LA(1);
			if ( !(_la==KW_PANDA || _la==KW_ORANGUTAN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(159);
			match(KW_WITH);
			setState(160);
			match(KW_ID);
			setState(161);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_pushContext extends ParserRuleContext {
		public TerminalNode KW_PUSH() { return getToken(PandaLanguageParser.KW_PUSH, 0); }
		public Pl_cmd_pushContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_push; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_push(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_push(this);
		}
	}

	public final Pl_cmd_pushContext pl_cmd_push() throws RecognitionException {
		Pl_cmd_pushContext _localctx = new Pl_cmd_pushContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_pl_cmd_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(163);
			match(KW_PUSH);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_popContext extends ParserRuleContext {
		public TerminalNode KW_POP() { return getToken(PandaLanguageParser.KW_POP, 0); }
		public Pl_cmd_popContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_pop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_pop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_pop(this);
		}
	}

	public final Pl_cmd_popContext pl_cmd_pop() throws RecognitionException {
		Pl_cmd_popContext _localctx = new Pl_cmd_popContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_pl_cmd_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(165);
			match(KW_POP);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_beginContext extends ParserRuleContext {
		public TerminalNode KW_BEGIN() { return getToken(PandaLanguageParser.KW_BEGIN, 0); }
		public Pl_cmd_beginContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_begin; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_begin(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_begin(this);
		}
	}

	public final Pl_cmd_beginContext pl_cmd_begin() throws RecognitionException {
		Pl_cmd_beginContext _localctx = new Pl_cmd_beginContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_pl_cmd_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(167);
			match(KW_BEGIN);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_endContext extends ParserRuleContext {
		public TerminalNode KW_END() { return getToken(PandaLanguageParser.KW_END, 0); }
		public Pl_cmd_endContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_end; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_end(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_end(this);
		}
	}

	public final Pl_cmd_endContext pl_cmd_end() throws RecognitionException {
		Pl_cmd_endContext _localctx = new Pl_cmd_endContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_pl_cmd_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(169);
			match(KW_END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_setContext extends ParserRuleContext {
		public TerminalNode KW_SET() { return getToken(PandaLanguageParser.KW_SET, 0); }
		public List<TerminalNode> WORD() { return getTokens(PandaLanguageParser.WORD); }
		public TerminalNode WORD(int i) {
			return getToken(PandaLanguageParser.WORD, i);
		}
		public List<TerminalNode> WHITESPACE() { return getTokens(PandaLanguageParser.WHITESPACE); }
		public TerminalNode WHITESPACE(int i) {
			return getToken(PandaLanguageParser.WHITESPACE, i);
		}
		public Pl_cmd_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_set(this);
		}
	}

	public final Pl_cmd_setContext pl_cmd_set() throws RecognitionException {
		Pl_cmd_setContext _localctx = new Pl_cmd_setContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_pl_cmd_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171);
			match(KW_SET);
			setState(172);
			match(WORD);
			setState(177); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(173);
				match(WORD);
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(174);
					match(WHITESPACE);
					}
				}

				}
				}
				setState(179); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WORD );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_releaseContext extends ParserRuleContext {
		public TerminalNode KW_RELEASE() { return getToken(PandaLanguageParser.KW_RELEASE, 0); }
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_ID() { return getToken(PandaLanguageParser.KW_ID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PandaLanguageParser.IDENTIFIER, 0); }
		public TerminalNode KW_PANDA() { return getToken(PandaLanguageParser.KW_PANDA, 0); }
		public TerminalNode KW_ORANGUTAN() { return getToken(PandaLanguageParser.KW_ORANGUTAN, 0); }
		public Pl_cmd_releaseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_release; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_release(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_release(this);
		}
	}

	public final Pl_cmd_releaseContext pl_cmd_release() throws RecognitionException {
		Pl_cmd_releaseContext _localctx = new Pl_cmd_releaseContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_pl_cmd_release);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(KW_RELEASE);
			setState(182);
			_la = _input.LA(1);
			if ( !(_la==KW_PANDA || _la==KW_ORANGUTAN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(183);
			match(KW_WITH);
			setState(184);
			match(KW_ID);
			setState(185);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_add_tileContext extends ParserRuleContext {
		public TerminalNode KW_ADD() { return getToken(PandaLanguageParser.KW_ADD, 0); }
		public TerminalNode KW_TILE() { return getToken(PandaLanguageParser.KW_TILE, 0); }
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_ID() { return getToken(PandaLanguageParser.KW_ID, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PandaLanguageParser.IDENTIFIER, 0); }
		public List<Tile_flagContext> tile_flag() {
			return getRuleContexts(Tile_flagContext.class);
		}
		public Tile_flagContext tile_flag(int i) {
			return getRuleContext(Tile_flagContext.class,i);
		}
		public Pl_cmd_add_tileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_add_tile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_add_tile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_add_tile(this);
		}
	}

	public final Pl_cmd_add_tileContext pl_cmd_add_tile() throws RecognitionException {
		Pl_cmd_add_tileContext _localctx = new Pl_cmd_add_tileContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_pl_cmd_add_tile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(187);
			match(KW_ADD);
			setState(191);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_FRAGILE) | (1L << KW_EXIT) | (1L << KW_START))) != 0)) {
				{
				{
				setState(188);
				tile_flag();
				}
				}
				setState(193);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(194);
			match(KW_TILE);
			setState(195);
			match(KW_WITH);
			setState(196);
			match(KW_ID);
			setState(197);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_add_pandaContext extends ParserRuleContext {
		public TerminalNode KW_ADD() { return getToken(PandaLanguageParser.KW_ADD, 0); }
		public Panda_flagContext panda_flag() {
			return getRuleContext(Panda_flagContext.class,0);
		}
		public TerminalNode KW_PANDA() { return getToken(PandaLanguageParser.KW_PANDA, 0); }
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_ID() { return getToken(PandaLanguageParser.KW_ID, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PandaLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PandaLanguageParser.IDENTIFIER, i);
		}
		public TerminalNode KW_ONTO() { return getToken(PandaLanguageParser.KW_ONTO, 0); }
		public TerminalNode KW_TILE() { return getToken(PandaLanguageParser.KW_TILE, 0); }
		public Pl_cmd_add_pandaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_add_panda; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_add_panda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_add_panda(this);
		}
	}

	public final Pl_cmd_add_pandaContext pl_cmd_add_panda() throws RecognitionException {
		Pl_cmd_add_pandaContext _localctx = new Pl_cmd_add_pandaContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_pl_cmd_add_panda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(199);
			match(KW_ADD);
			setState(200);
			panda_flag();
			setState(201);
			match(KW_PANDA);
			setState(202);
			match(KW_WITH);
			setState(203);
			match(KW_ID);
			setState(204);
			match(IDENTIFIER);
			setState(205);
			match(KW_ONTO);
			setState(206);
			match(KW_TILE);
			setState(207);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_add_vendingmachineContext extends ParserRuleContext {
		public TerminalNode KW_ADD() { return getToken(PandaLanguageParser.KW_ADD, 0); }
		public TerminalNode KW_VENDINGMACHINE() { return getToken(PandaLanguageParser.KW_VENDINGMACHINE, 0); }
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_ID() { return getToken(PandaLanguageParser.KW_ID, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PandaLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PandaLanguageParser.IDENTIFIER, i);
		}
		public TerminalNode KW_ONTO() { return getToken(PandaLanguageParser.KW_ONTO, 0); }
		public TerminalNode KW_TILE() { return getToken(PandaLanguageParser.KW_TILE, 0); }
		public Pl_cmd_add_vendingmachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_add_vendingmachine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_add_vendingmachine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_add_vendingmachine(this);
		}
	}

	public final Pl_cmd_add_vendingmachineContext pl_cmd_add_vendingmachine() throws RecognitionException {
		Pl_cmd_add_vendingmachineContext _localctx = new Pl_cmd_add_vendingmachineContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_pl_cmd_add_vendingmachine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(209);
			match(KW_ADD);
			setState(210);
			match(KW_VENDINGMACHINE);
			setState(211);
			match(KW_WITH);
			setState(212);
			match(KW_ID);
			setState(213);
			match(IDENTIFIER);
			setState(214);
			match(KW_ONTO);
			setState(215);
			match(KW_TILE);
			setState(216);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_add_gamemachineContext extends ParserRuleContext {
		public TerminalNode KW_ADD() { return getToken(PandaLanguageParser.KW_ADD, 0); }
		public TerminalNode KW_GAMEMACHINE() { return getToken(PandaLanguageParser.KW_GAMEMACHINE, 0); }
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_ID() { return getToken(PandaLanguageParser.KW_ID, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PandaLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PandaLanguageParser.IDENTIFIER, i);
		}
		public TerminalNode KW_ONTO() { return getToken(PandaLanguageParser.KW_ONTO, 0); }
		public TerminalNode KW_TILE() { return getToken(PandaLanguageParser.KW_TILE, 0); }
		public Pl_cmd_add_gamemachineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_add_gamemachine; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_add_gamemachine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_add_gamemachine(this);
		}
	}

	public final Pl_cmd_add_gamemachineContext pl_cmd_add_gamemachine() throws RecognitionException {
		Pl_cmd_add_gamemachineContext _localctx = new Pl_cmd_add_gamemachineContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_pl_cmd_add_gamemachine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(218);
			match(KW_ADD);
			setState(219);
			match(KW_GAMEMACHINE);
			setState(220);
			match(KW_WITH);
			setState(221);
			match(KW_ID);
			setState(222);
			match(IDENTIFIER);
			setState(223);
			match(KW_ONTO);
			setState(224);
			match(KW_TILE);
			setState(225);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_add_couchContext extends ParserRuleContext {
		public TerminalNode KW_ADD() { return getToken(PandaLanguageParser.KW_ADD, 0); }
		public TerminalNode KW_COUCH() { return getToken(PandaLanguageParser.KW_COUCH, 0); }
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_ID() { return getToken(PandaLanguageParser.KW_ID, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PandaLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PandaLanguageParser.IDENTIFIER, i);
		}
		public TerminalNode KW_ONTO() { return getToken(PandaLanguageParser.KW_ONTO, 0); }
		public TerminalNode KW_TILE() { return getToken(PandaLanguageParser.KW_TILE, 0); }
		public Pl_cmd_add_couchContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_add_couch; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_add_couch(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_add_couch(this);
		}
	}

	public final Pl_cmd_add_couchContext pl_cmd_add_couch() throws RecognitionException {
		Pl_cmd_add_couchContext _localctx = new Pl_cmd_add_couchContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_pl_cmd_add_couch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(227);
			match(KW_ADD);
			setState(228);
			match(KW_COUCH);
			setState(229);
			match(KW_WITH);
			setState(230);
			match(KW_ID);
			setState(231);
			match(IDENTIFIER);
			setState(232);
			match(KW_ONTO);
			setState(233);
			match(KW_TILE);
			setState(234);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_add_wardrobeContext extends ParserRuleContext {
		public TerminalNode KW_ADD() { return getToken(PandaLanguageParser.KW_ADD, 0); }
		public TerminalNode KW_WARDROBE() { return getToken(PandaLanguageParser.KW_WARDROBE, 0); }
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_ID() { return getToken(PandaLanguageParser.KW_ID, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PandaLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PandaLanguageParser.IDENTIFIER, i);
		}
		public TerminalNode KW_ONTO() { return getToken(PandaLanguageParser.KW_ONTO, 0); }
		public TerminalNode KW_TILE() { return getToken(PandaLanguageParser.KW_TILE, 0); }
		public Pl_cmd_add_wardrobeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_add_wardrobe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_add_wardrobe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_add_wardrobe(this);
		}
	}

	public final Pl_cmd_add_wardrobeContext pl_cmd_add_wardrobe() throws RecognitionException {
		Pl_cmd_add_wardrobeContext _localctx = new Pl_cmd_add_wardrobeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_pl_cmd_add_wardrobe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(236);
			match(KW_ADD);
			setState(237);
			match(KW_WARDROBE);
			setState(238);
			match(KW_WITH);
			setState(239);
			match(KW_ID);
			setState(240);
			match(IDENTIFIER);
			setState(241);
			match(KW_ONTO);
			setState(242);
			match(KW_TILE);
			setState(243);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_connect_tileContext extends ParserRuleContext {
		public TerminalNode KW_CONNECT() { return getToken(PandaLanguageParser.KW_CONNECT, 0); }
		public List<TerminalNode> KW_TILE() { return getTokens(PandaLanguageParser.KW_TILE); }
		public TerminalNode KW_TILE(int i) {
			return getToken(PandaLanguageParser.KW_TILE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PandaLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PandaLanguageParser.IDENTIFIER, i);
		}
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public Pl_cmd_connect_tileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_connect_tile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_connect_tile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_connect_tile(this);
		}
	}

	public final Pl_cmd_connect_tileContext pl_cmd_connect_tile() throws RecognitionException {
		Pl_cmd_connect_tileContext _localctx = new Pl_cmd_connect_tileContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pl_cmd_connect_tile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(245);
			match(KW_CONNECT);
			setState(246);
			match(KW_TILE);
			setState(247);
			match(IDENTIFIER);
			setState(248);
			match(KW_WITH);
			setState(249);
			match(KW_TILE);
			setState(250);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pl_cmd_connect_wardrobeContext extends ParserRuleContext {
		public TerminalNode KW_CONNECT() { return getToken(PandaLanguageParser.KW_CONNECT, 0); }
		public List<TerminalNode> KW_WARDROBE() { return getTokens(PandaLanguageParser.KW_WARDROBE); }
		public TerminalNode KW_WARDROBE(int i) {
			return getToken(PandaLanguageParser.KW_WARDROBE, i);
		}
		public List<TerminalNode> IDENTIFIER() { return getTokens(PandaLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PandaLanguageParser.IDENTIFIER, i);
		}
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public Pl_cmd_connect_wardrobeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_connect_wardrobe; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_connect_wardrobe(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_connect_wardrobe(this);
		}
	}

	public final Pl_cmd_connect_wardrobeContext pl_cmd_connect_wardrobe() throws RecognitionException {
		Pl_cmd_connect_wardrobeContext _localctx = new Pl_cmd_connect_wardrobeContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pl_cmd_connect_wardrobe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(252);
			match(KW_CONNECT);
			setState(253);
			match(KW_WARDROBE);
			setState(254);
			match(IDENTIFIER);
			setState(255);
			match(KW_WITH);
			setState(256);
			match(KW_WARDROBE);
			setState(257);
			match(IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Tile_flagContext extends ParserRuleContext {
		public TerminalNode KW_FRAGILE() { return getToken(PandaLanguageParser.KW_FRAGILE, 0); }
		public TerminalNode KW_EXIT() { return getToken(PandaLanguageParser.KW_EXIT, 0); }
		public TerminalNode KW_START() { return getToken(PandaLanguageParser.KW_START, 0); }
		public Tile_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tile_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterTile_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitTile_flag(this);
		}
	}

	public final Tile_flagContext tile_flag() throws RecognitionException {
		Tile_flagContext _localctx = new Tile_flagContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_tile_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_FRAGILE) | (1L << KW_EXIT) | (1L << KW_START))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Panda_flagContext extends ParserRuleContext {
		public TerminalNode KW_COWARD() { return getToken(PandaLanguageParser.KW_COWARD, 0); }
		public TerminalNode KW_SLEEPY() { return getToken(PandaLanguageParser.KW_SLEEPY, 0); }
		public TerminalNode KW_JUMPY() { return getToken(PandaLanguageParser.KW_JUMPY, 0); }
		public Panda_flagContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_panda_flag; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPanda_flag(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPanda_flag(this);
		}
	}

	public final Panda_flagContext panda_flag() throws RecognitionException {
		Panda_flagContext _localctx = new Panda_flagContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_panda_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(261);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_COWARD) | (1L << KW_SLEEPY) | (1L << KW_JUMPY))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sh_cmd_printContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(PandaLanguageParser.FILENAME, 0); }
		public Sh_cmd_printContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sh_cmd_print; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterSh_cmd_print(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitSh_cmd_print(this);
		}
	}

	public final Sh_cmd_printContext sh_cmd_print() throws RecognitionException {
		Sh_cmd_printContext _localctx = new Sh_cmd_printContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_sh_cmd_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(263);
			match(T__0);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILENAME) {
				{
				setState(264);
				match(FILENAME);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sh_cmd_saveContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(PandaLanguageParser.FILENAME, 0); }
		public Sh_cmd_saveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sh_cmd_save; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterSh_cmd_save(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitSh_cmd_save(this);
		}
	}

	public final Sh_cmd_saveContext sh_cmd_save() throws RecognitionException {
		Sh_cmd_saveContext _localctx = new Sh_cmd_saveContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_sh_cmd_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(267);
			match(T__1);
			setState(268);
			match(FILENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sh_cmd_loadContext extends ParserRuleContext {
		public TerminalNode FILENAME() { return getToken(PandaLanguageParser.FILENAME, 0); }
		public Sh_cmd_loadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sh_cmd_load; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterSh_cmd_load(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitSh_cmd_load(this);
		}
	}

	public final Sh_cmd_loadContext sh_cmd_load() throws RecognitionException {
		Sh_cmd_loadContext _localctx = new Sh_cmd_loadContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_sh_cmd_load);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(T__2);
			setState(271);
			match(FILENAME);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sh_cmd_clearContext extends ParserRuleContext {
		public Sh_cmd_clearContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sh_cmd_clear; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterSh_cmd_clear(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitSh_cmd_clear(this);
		}
	}

	public final Sh_cmd_clearContext sh_cmd_clear() throws RecognitionException {
		Sh_cmd_clearContext _localctx = new Sh_cmd_clearContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_sh_cmd_clear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\38\u0116\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\3\2\7"+
		"\2A\n\2\f\2\16\2D\13\2\3\2\7\2G\n\2\f\2\16\2J\13\2\3\2\3\2\3\3\3\3\3\3"+
		"\3\4\3\4\5\4S\n\4\3\4\7\4V\n\4\f\4\16\4Y\13\4\3\5\7\5\\\n\5\f\5\16\5_"+
		"\13\5\3\5\7\5b\n\5\f\5\16\5e\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\5\5r\n\5\3\5\6\5u\n\5\r\5\16\5v\3\6\3\6\3\6\3\6\3\6\5\6~\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0086\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t"+
		"\5\t\u0090\n\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17"+
		"\3\20\3\20\3\20\3\20\5\20\u00b2\n\20\6\20\u00b4\n\20\r\20\16\20\u00b5"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\7\22\u00c0\n\22\f\22\16\22\u00c3"+
		"\13\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30"+
		"\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\33\3\33"+
		"\3\34\3\34\5\34\u010c\n\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3\37"+
		"\2\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:<\2"+
		"\b\4\2\60\60\62\62\3\2\24\31\3\2\26\31\3\2\24\25\3\2\32\34\3\2\35\37\2"+
		"\u0116\2B\3\2\2\2\4M\3\2\2\2\6R\3\2\2\2\b]\3\2\2\2\nx\3\2\2\2\f\u0085"+
		"\3\2\2\2\16\u0087\3\2\2\2\20\u008f\3\2\2\2\22\u0091\3\2\2\2\24\u009a\3"+
		"\2\2\2\26\u00a5\3\2\2\2\30\u00a7\3\2\2\2\32\u00a9\3\2\2\2\34\u00ab\3\2"+
		"\2\2\36\u00ad\3\2\2\2 \u00b7\3\2\2\2\"\u00bd\3\2\2\2$\u00c9\3\2\2\2&\u00d3"+
		"\3\2\2\2(\u00dc\3\2\2\2*\u00e5\3\2\2\2,\u00ee\3\2\2\2.\u00f7\3\2\2\2\60"+
		"\u00fe\3\2\2\2\62\u0105\3\2\2\2\64\u0107\3\2\2\2\66\u0109\3\2\2\28\u010d"+
		"\3\2\2\2:\u0110\3\2\2\2<\u0113\3\2\2\2>A\5\6\4\2?A\5\4\3\2@>\3\2\2\2@"+
		"?\3\2\2\2AD\3\2\2\2B@\3\2\2\2BC\3\2\2\2CH\3\2\2\2DB\3\2\2\2EG\t\2\2\2"+
		"FE\3\2\2\2GJ\3\2\2\2HF\3\2\2\2HI\3\2\2\2IK\3\2\2\2JH\3\2\2\2KL\7\2\2\3"+
		"L\3\3\2\2\2MN\78\2\2NO\b\3\1\2O\5\3\2\2\2PS\5\b\5\2QS\5\n\6\2RP\3\2\2"+
		"\2RQ\3\2\2\2SW\3\2\2\2TV\7\60\2\2UT\3\2\2\2VY\3\2\2\2WU\3\2\2\2WX\3\2"+
		"\2\2X\7\3\2\2\2YW\3\2\2\2Z\\\7\62\2\2[Z\3\2\2\2\\_\3\2\2\2][\3\2\2\2]"+
		"^\3\2\2\2^c\3\2\2\2_]\3\2\2\2`b\7\60\2\2a`\3\2\2\2be\3\2\2\2ca\3\2\2\2"+
		"cd\3\2\2\2dq\3\2\2\2ec\3\2\2\2fr\5\f\7\2gr\5\16\b\2hr\5\20\t\2ir\5\22"+
		"\n\2jr\5\24\13\2kr\5\26\f\2lr\5\30\r\2mr\5\32\16\2nr\5\34\17\2or\5\36"+
		"\20\2pr\5 \21\2qf\3\2\2\2qg\3\2\2\2qh\3\2\2\2qi\3\2\2\2qj\3\2\2\2qk\3"+
		"\2\2\2ql\3\2\2\2qm\3\2\2\2qn\3\2\2\2qo\3\2\2\2qp\3\2\2\2rt\3\2\2\2su\7"+
		"\62\2\2ts\3\2\2\2uv\3\2\2\2vt\3\2\2\2vw\3\2\2\2w\t\3\2\2\2x}\7\66\2\2"+
		"y~\5\66\34\2z~\58\35\2{~\5:\36\2|~\5<\37\2}y\3\2\2\2}z\3\2\2\2}{\3\2\2"+
		"\2}|\3\2\2\2~\13\3\2\2\2\177\u0086\5\"\22\2\u0080\u0086\5$\23\2\u0081"+
		"\u0086\5&\24\2\u0082\u0086\5(\25\2\u0083\u0086\5*\26\2\u0084\u0086\5,"+
		"\27\2\u0085\177\3\2\2\2\u0085\u0080\3\2\2\2\u0085\u0081\3\2\2\2\u0085"+
		"\u0082\3\2\2\2\u0085\u0083\3\2\2\2\u0085\u0084\3\2\2\2\u0086\r\3\2\2\2"+
		"\u0087\u0088\7\16\2\2\u0088\u0089\t\3\2\2\u0089\u008a\7)\2\2\u008a\u008b"+
		"\7*\2\2\u008b\u008c\7.\2\2\u008c\17\3\2\2\2\u008d\u0090\5.\30\2\u008e"+
		"\u0090\5\60\31\2\u008f\u008d\3\2\2\2\u008f\u008e\3\2\2\2\u0090\21\3\2"+
		"\2\2\u0091\u0092\7\f\2\2\u0092\u0093\7\25\2\2\u0093\u0094\7)\2\2\u0094"+
		"\u0095\7*\2\2\u0095\u0096\7.\2\2\u0096\u0097\7+\2\2\u0097\u0098\7\23\2"+
		"\2\u0098\u0099\7.\2\2\u0099\23\3\2\2\2\u009a\u009b\7\r\2\2\u009b\u009c"+
		"\t\4\2\2\u009c\u009d\7)\2\2\u009d\u009e\7*\2\2\u009e\u009f\7.\2\2\u009f"+
		"\u00a0\7-\2\2\u00a0\u00a1\t\5\2\2\u00a1\u00a2\7)\2\2\u00a2\u00a3\7*\2"+
		"\2\u00a3\u00a4\7.\2\2\u00a4\25\3\2\2\2\u00a5\u00a6\7\17\2\2\u00a6\27\3"+
		"\2\2\2\u00a7\u00a8\7\20\2\2\u00a8\31\3\2\2\2\u00a9\u00aa\7\n\2\2\u00aa"+
		"\33\3\2\2\2\u00ab\u00ac\7\13\2\2\u00ac\35\3\2\2\2\u00ad\u00ae\7\21\2\2"+
		"\u00ae\u00b3\7\67\2\2\u00af\u00b1\7\67\2\2\u00b0\u00b2\7/\2\2\u00b1\u00b0"+
		"\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b4\3\2\2\2\u00b3\u00af\3\2\2\2\u00b4"+
		"\u00b5\3\2\2\2\u00b5\u00b3\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\37\3\2\2"+
		"\2\u00b7\u00b8\7\22\2\2\u00b8\u00b9\t\5\2\2\u00b9\u00ba\7)\2\2\u00ba\u00bb"+
		"\7*\2\2\u00bb\u00bc\7.\2\2\u00bc!\3\2\2\2\u00bd\u00c1\7\b\2\2\u00be\u00c0"+
		"\5\62\32\2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1\u00bf\3\2\2\2"+
		"\u00c1\u00c2\3\2\2\2\u00c2\u00c4\3\2\2\2\u00c3\u00c1\3\2\2\2\u00c4\u00c5"+
		"\7\23\2\2\u00c5\u00c6\7)\2\2\u00c6\u00c7\7*\2\2\u00c7\u00c8\7.\2\2\u00c8"+
		"#\3\2\2\2\u00c9\u00ca\7\b\2\2\u00ca\u00cb\5\64\33\2\u00cb\u00cc\7\24\2"+
		"\2\u00cc\u00cd\7)\2\2\u00cd\u00ce\7*\2\2\u00ce\u00cf\7.\2\2\u00cf\u00d0"+
		"\7+\2\2\u00d0\u00d1\7\23\2\2\u00d1\u00d2\7.\2\2\u00d2%\3\2\2\2\u00d3\u00d4"+
		"\7\b\2\2\u00d4\u00d5\7\26\2\2\u00d5\u00d6\7)\2\2\u00d6\u00d7\7*\2\2\u00d7"+
		"\u00d8\7.\2\2\u00d8\u00d9\7+\2\2\u00d9\u00da\7\23\2\2\u00da\u00db\7.\2"+
		"\2\u00db\'\3\2\2\2\u00dc\u00dd\7\b\2\2\u00dd\u00de\7\30\2\2\u00de\u00df"+
		"\7)\2\2\u00df\u00e0\7*\2\2\u00e0\u00e1\7.\2\2\u00e1\u00e2\7+\2\2\u00e2"+
		"\u00e3\7\23\2\2\u00e3\u00e4\7.\2\2\u00e4)\3\2\2\2\u00e5\u00e6\7\b\2\2"+
		"\u00e6\u00e7\7\31\2\2\u00e7\u00e8\7)\2\2\u00e8\u00e9\7*\2\2\u00e9\u00ea"+
		"\7.\2\2\u00ea\u00eb\7+\2\2\u00eb\u00ec\7\23\2\2\u00ec\u00ed\7.\2\2\u00ed"+
		"+\3\2\2\2\u00ee\u00ef\7\b\2\2\u00ef\u00f0\7\27\2\2\u00f0\u00f1\7)\2\2"+
		"\u00f1\u00f2\7*\2\2\u00f2\u00f3\7.\2\2\u00f3\u00f4\7+\2\2\u00f4\u00f5"+
		"\7\23\2\2\u00f5\u00f6\7.\2\2\u00f6-\3\2\2\2\u00f7\u00f8\7\t\2\2\u00f8"+
		"\u00f9\7\23\2\2\u00f9\u00fa\7.\2\2\u00fa\u00fb\7)\2\2\u00fb\u00fc\7\23"+
		"\2\2\u00fc\u00fd\7.\2\2\u00fd/\3\2\2\2\u00fe\u00ff\7\t\2\2\u00ff\u0100"+
		"\7\27\2\2\u0100\u0101\7.\2\2\u0101\u0102\7)\2\2\u0102\u0103\7\27\2\2\u0103"+
		"\u0104\7.\2\2\u0104\61\3\2\2\2\u0105\u0106\t\6\2\2\u0106\63\3\2\2\2\u0107"+
		"\u0108\t\7\2\2\u0108\65\3\2\2\2\u0109\u010b\7\3\2\2\u010a\u010c\7\7\2"+
		"\2\u010b\u010a\3\2\2\2\u010b\u010c\3\2\2\2\u010c\67\3\2\2\2\u010d\u010e"+
		"\7\4\2\2\u010e\u010f\7\7\2\2\u010f9\3\2\2\2\u0110\u0111\7\5\2\2\u0111"+
		"\u0112\7\7\2\2\u0112;\3\2\2\2\u0113\u0114\7\6\2\2\u0114=\3\2\2\2\22@B"+
		"HRW]cqv}\u0085\u008f\u00b1\u00b5\u00c1\u010b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}