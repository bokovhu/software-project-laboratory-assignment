// Generated from PandaLanguage.g4 by ANTLR 4.7.2
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
		KW_WITH=39, KW_ID=40, KW_ONTO=41, KW_CONNECTED=42, KW_BY=43, KW_LIFE=44, 
		IDENTIFIER=45, WHITESPACE=46, NEWLINE=47, COMMENT=48, SEMICOLON=49, LEFTPAR=50, 
		RIGHTPAR=51, EQUALS=52, SLASH=53, WORD=54, ASTERISK=55, UNEXPECTED_CHAR=56;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_expression = 2, RULE_pandalang_command = 3, 
		RULE_shell_command = 4, RULE_pl_cmd_add = 5, RULE_pl_cmd_work = 6, RULE_pl_cmd_work_specific = 7, 
		RULE_pl_cmd_work_all = 8, RULE_pl_cmd_connect = 9, RULE_pl_cmd_move = 10, 
		RULE_pl_cmd_use = 11, RULE_pl_cmd_push = 12, RULE_pl_cmd_pop = 13, RULE_pl_cmd_begin = 14, 
		RULE_pl_cmd_end = 15, RULE_pl_cmd_set = 16, RULE_pl_cmd_release = 17, 
		RULE_pl_cmd_add_tile = 18, RULE_pl_cmd_add_panda = 19, RULE_pl_cmd_add_vendingmachine = 20, 
		RULE_pl_cmd_add_gamemachine = 21, RULE_pl_cmd_add_couch = 22, RULE_pl_cmd_add_wardrobe = 23, 
		RULE_pl_cmd_add_orangutan = 24, RULE_pl_cmd_connect_tile = 25, RULE_pl_cmd_connect_wardrobe = 26, 
		RULE_tile_flag = 27, RULE_panda_flag = 28, RULE_with_life = 29, RULE_sh_cmd_print = 30, 
		RULE_sh_cmd_save = 31, RULE_sh_cmd_load = 32, RULE_sh_cmd_clear = 33;
	private static String[] makeRuleNames() {
		return new String[] {
			"parse", "error", "expression", "pandalang_command", "shell_command", 
			"pl_cmd_add", "pl_cmd_work", "pl_cmd_work_specific", "pl_cmd_work_all", 
			"pl_cmd_connect", "pl_cmd_move", "pl_cmd_use", "pl_cmd_push", "pl_cmd_pop", 
			"pl_cmd_begin", "pl_cmd_end", "pl_cmd_set", "pl_cmd_release", "pl_cmd_add_tile", 
			"pl_cmd_add_panda", "pl_cmd_add_vendingmachine", "pl_cmd_add_gamemachine", 
			"pl_cmd_add_couch", "pl_cmd_add_wardrobe", "pl_cmd_add_orangutan", "pl_cmd_connect_tile", 
			"pl_cmd_connect_wardrobe", "tile_flag", "panda_flag", "with_life", "sh_cmd_print", 
			"sh_cmd_save", "sh_cmd_load", "sh_cmd_clear"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'save'", "'load'", "'clear'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, "';'", "'('", "')'", "'='", "'/'", null, "'*'"
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
			"KW_CONNECTED", "KW_BY", "KW_LIFE", "IDENTIFIER", "WHITESPACE", "NEWLINE", 
			"COMMENT", "SEMICOLON", "LEFTPAR", "RIGHTPAR", "EQUALS", "SLASH", "WORD", 
			"ASTERISK", "UNEXPECTED_CHAR"
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
			setState(72);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(70);
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
						setState(68);
						expression();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(69);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(74);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(78);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==SEMICOLON) {
				{
				{
				setState(75);
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
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(81);
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
			setState(83);
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
			setState(88);
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
				setState(86);
				pandalang_command();
				}
				break;
			case SLASH:
				{
				setState(87);
				shell_command();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(93);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(90);
					match(NEWLINE);
					}
					} 
				}
				setState(95);
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
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==NEWLINE || _la==SEMICOLON) {
				{
				{
				setState(96);
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
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(113);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case KW_ADD:
				{
				setState(102);
				pl_cmd_add();
				}
				break;
			case KW_WORK:
				{
				setState(103);
				pl_cmd_work();
				}
				break;
			case KW_CONNECT:
				{
				setState(104);
				pl_cmd_connect();
				}
				break;
			case KW_MOVE:
				{
				setState(105);
				pl_cmd_move();
				}
				break;
			case KW_USE:
				{
				setState(106);
				pl_cmd_use();
				}
				break;
			case KW_PUSH:
				{
				setState(107);
				pl_cmd_push();
				}
				break;
			case KW_POP:
				{
				setState(108);
				pl_cmd_pop();
				}
				break;
			case KW_BEGIN:
				{
				setState(109);
				pl_cmd_begin();
				}
				break;
			case KW_END:
				{
				setState(110);
				pl_cmd_end();
				}
				break;
			case KW_SET:
				{
				setState(111);
				pl_cmd_set();
				}
				break;
			case KW_RELEASE:
				{
				setState(112);
				pl_cmd_release();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(116); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(115);
					match(SEMICOLON);
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(118); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
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
			setState(120);
			match(SLASH);
			setState(125);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
				{
				setState(121);
				sh_cmd_print();
				}
				break;
			case T__1:
				{
				setState(122);
				sh_cmd_save();
				}
				break;
			case T__2:
				{
				setState(123);
				sh_cmd_load();
				}
				break;
			case T__3:
				{
				setState(124);
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
		public Pl_cmd_add_orangutanContext pl_cmd_add_orangutan() {
			return getRuleContext(Pl_cmd_add_orangutanContext.class,0);
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
			setState(134);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,9,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(127);
				pl_cmd_add_tile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128);
				pl_cmd_add_panda();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(129);
				pl_cmd_add_vendingmachine();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(130);
				pl_cmd_add_gamemachine();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(131);
				pl_cmd_add_couch();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(132);
				pl_cmd_add_wardrobe();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(133);
				pl_cmd_add_orangutan();
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
		public Pl_cmd_work_specificContext pl_cmd_work_specific() {
			return getRuleContext(Pl_cmd_work_specificContext.class,0);
		}
		public Pl_cmd_work_allContext pl_cmd_work_all() {
			return getRuleContext(Pl_cmd_work_allContext.class,0);
		}
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
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				setState(136);
				pl_cmd_work_specific();
				}
				break;
			case 2:
				{
				setState(137);
				pl_cmd_work_all();
				}
				break;
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

	public static class Pl_cmd_work_specificContext extends ParserRuleContext {
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
		public Pl_cmd_work_specificContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_work_specific; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_work_specific(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_work_specific(this);
		}
	}

	public final Pl_cmd_work_specificContext pl_cmd_work_specific() throws RecognitionException {
		Pl_cmd_work_specificContext _localctx = new Pl_cmd_work_specificContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_pl_cmd_work_specific);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(KW_WORK);
			setState(141);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_PANDA) | (1L << KW_ORANGUTAN) | (1L << KW_VENDINGMACHINE) | (1L << KW_WARDROBE) | (1L << KW_GAMEMACHINE) | (1L << KW_COUCH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(142);
			match(KW_WITH);
			setState(143);
			match(KW_ID);
			setState(144);
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

	public static class Pl_cmd_work_allContext extends ParserRuleContext {
		public TerminalNode KW_WORK() { return getToken(PandaLanguageParser.KW_WORK, 0); }
		public TerminalNode ASTERISK() { return getToken(PandaLanguageParser.ASTERISK, 0); }
		public Pl_cmd_work_allContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_work_all; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_work_all(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_work_all(this);
		}
	}

	public final Pl_cmd_work_allContext pl_cmd_work_all() throws RecognitionException {
		Pl_cmd_work_allContext _localctx = new Pl_cmd_work_allContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_pl_cmd_work_all);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(KW_WORK);
			setState(147);
			match(ASTERISK);
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
		enterRule(_localctx, 18, RULE_pl_cmd_connect);
		try {
			setState(151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(149);
				pl_cmd_connect_tile();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(150);
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
		enterRule(_localctx, 20, RULE_pl_cmd_move);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(153);
			match(KW_MOVE);
			setState(154);
			match(KW_ORANGUTAN);
			setState(155);
			match(KW_WITH);
			setState(156);
			match(KW_ID);
			setState(157);
			match(IDENTIFIER);
			setState(158);
			match(KW_ONTO);
			setState(159);
			match(KW_TILE);
			setState(160);
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
		enterRule(_localctx, 22, RULE_pl_cmd_use);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162);
			match(KW_USE);
			setState(163);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_VENDINGMACHINE) | (1L << KW_WARDROBE) | (1L << KW_GAMEMACHINE) | (1L << KW_COUCH))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(164);
			match(KW_WITH);
			setState(165);
			match(KW_ID);
			setState(166);
			match(IDENTIFIER);
			setState(167);
			match(KW_BY);
			setState(168);
			_la = _input.LA(1);
			if ( !(_la==KW_PANDA || _la==KW_ORANGUTAN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(169);
			match(KW_WITH);
			setState(170);
			match(KW_ID);
			setState(171);
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
		enterRule(_localctx, 24, RULE_pl_cmd_push);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
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
		enterRule(_localctx, 26, RULE_pl_cmd_pop);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(175);
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
		enterRule(_localctx, 28, RULE_pl_cmd_begin);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(177);
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
		enterRule(_localctx, 30, RULE_pl_cmd_end);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
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
		enterRule(_localctx, 32, RULE_pl_cmd_set);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(181);
			match(KW_SET);
			setState(182);
			match(WORD);
			setState(187); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(183);
				match(WORD);
				setState(185);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WHITESPACE) {
					{
					setState(184);
					match(WHITESPACE);
					}
				}

				}
				}
				setState(189); 
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
		enterRule(_localctx, 34, RULE_pl_cmd_release);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191);
			match(KW_RELEASE);
			setState(192);
			_la = _input.LA(1);
			if ( !(_la==KW_PANDA || _la==KW_ORANGUTAN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(193);
			match(KW_WITH);
			setState(194);
			match(KW_ID);
			setState(195);
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
		public With_lifeContext with_life() {
			return getRuleContext(With_lifeContext.class,0);
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
		enterRule(_localctx, 36, RULE_pl_cmd_add_tile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(197);
			match(KW_ADD);
			setState(201);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << KW_FRAGILE) | (1L << KW_EXIT) | (1L << KW_START))) != 0)) {
				{
				{
				setState(198);
				tile_flag();
				}
				}
				setState(203);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(204);
			match(KW_TILE);
			setState(205);
			match(KW_WITH);
			setState(206);
			match(KW_ID);
			setState(207);
			match(IDENTIFIER);
			setState(209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==KW_WITH) {
				{
				setState(208);
				with_life();
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
		enterRule(_localctx, 38, RULE_pl_cmd_add_panda);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			match(KW_ADD);
			setState(212);
			panda_flag();
			setState(213);
			match(KW_PANDA);
			setState(214);
			match(KW_WITH);
			setState(215);
			match(KW_ID);
			setState(216);
			match(IDENTIFIER);
			setState(217);
			match(KW_ONTO);
			setState(218);
			match(KW_TILE);
			setState(219);
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
		enterRule(_localctx, 40, RULE_pl_cmd_add_vendingmachine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			match(KW_ADD);
			setState(222);
			match(KW_VENDINGMACHINE);
			setState(223);
			match(KW_WITH);
			setState(224);
			match(KW_ID);
			setState(225);
			match(IDENTIFIER);
			setState(226);
			match(KW_ONTO);
			setState(227);
			match(KW_TILE);
			setState(228);
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
		enterRule(_localctx, 42, RULE_pl_cmd_add_gamemachine);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(230);
			match(KW_ADD);
			setState(231);
			match(KW_GAMEMACHINE);
			setState(232);
			match(KW_WITH);
			setState(233);
			match(KW_ID);
			setState(234);
			match(IDENTIFIER);
			setState(235);
			match(KW_ONTO);
			setState(236);
			match(KW_TILE);
			setState(237);
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
		enterRule(_localctx, 44, RULE_pl_cmd_add_couch);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(239);
			match(KW_ADD);
			setState(240);
			match(KW_COUCH);
			setState(241);
			match(KW_WITH);
			setState(242);
			match(KW_ID);
			setState(243);
			match(IDENTIFIER);
			setState(244);
			match(KW_ONTO);
			setState(245);
			match(KW_TILE);
			setState(246);
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
		enterRule(_localctx, 46, RULE_pl_cmd_add_wardrobe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(248);
			match(KW_ADD);
			setState(249);
			match(KW_WARDROBE);
			setState(250);
			match(KW_WITH);
			setState(251);
			match(KW_ID);
			setState(252);
			match(IDENTIFIER);
			setState(253);
			match(KW_ONTO);
			setState(254);
			match(KW_TILE);
			setState(255);
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

	public static class Pl_cmd_add_orangutanContext extends ParserRuleContext {
		public TerminalNode KW_ADD() { return getToken(PandaLanguageParser.KW_ADD, 0); }
		public TerminalNode KW_ORANGUTAN() { return getToken(PandaLanguageParser.KW_ORANGUTAN, 0); }
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_ID() { return getToken(PandaLanguageParser.KW_ID, 0); }
		public List<TerminalNode> IDENTIFIER() { return getTokens(PandaLanguageParser.IDENTIFIER); }
		public TerminalNode IDENTIFIER(int i) {
			return getToken(PandaLanguageParser.IDENTIFIER, i);
		}
		public TerminalNode KW_ONTO() { return getToken(PandaLanguageParser.KW_ONTO, 0); }
		public TerminalNode KW_TILE() { return getToken(PandaLanguageParser.KW_TILE, 0); }
		public Pl_cmd_add_orangutanContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pl_cmd_add_orangutan; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterPl_cmd_add_orangutan(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitPl_cmd_add_orangutan(this);
		}
	}

	public final Pl_cmd_add_orangutanContext pl_cmd_add_orangutan() throws RecognitionException {
		Pl_cmd_add_orangutanContext _localctx = new Pl_cmd_add_orangutanContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_pl_cmd_add_orangutan);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(257);
			match(KW_ADD);
			setState(258);
			match(KW_ORANGUTAN);
			setState(259);
			match(KW_WITH);
			setState(260);
			match(KW_ID);
			setState(261);
			match(IDENTIFIER);
			setState(262);
			match(KW_ONTO);
			setState(263);
			match(KW_TILE);
			setState(264);
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
		enterRule(_localctx, 50, RULE_pl_cmd_connect_tile);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(266);
			match(KW_CONNECT);
			setState(267);
			match(KW_TILE);
			setState(268);
			match(IDENTIFIER);
			setState(269);
			match(KW_WITH);
			setState(270);
			match(KW_TILE);
			setState(271);
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
		enterRule(_localctx, 52, RULE_pl_cmd_connect_wardrobe);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(273);
			match(KW_CONNECT);
			setState(274);
			match(KW_WARDROBE);
			setState(275);
			match(IDENTIFIER);
			setState(276);
			match(KW_WITH);
			setState(277);
			match(KW_WARDROBE);
			setState(278);
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
		enterRule(_localctx, 54, RULE_tile_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(280);
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
		enterRule(_localctx, 56, RULE_panda_flag);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(282);
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

	public static class With_lifeContext extends ParserRuleContext {
		public TerminalNode KW_WITH() { return getToken(PandaLanguageParser.KW_WITH, 0); }
		public TerminalNode KW_LIFE() { return getToken(PandaLanguageParser.KW_LIFE, 0); }
		public TerminalNode IDENTIFIER() { return getToken(PandaLanguageParser.IDENTIFIER, 0); }
		public With_lifeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with_life; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).enterWith_life(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PandaLanguageListener ) ((PandaLanguageListener)listener).exitWith_life(this);
		}
	}

	public final With_lifeContext with_life() throws RecognitionException {
		With_lifeContext _localctx = new With_lifeContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_with_life);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(284);
			match(KW_WITH);
			setState(285);
			match(KW_LIFE);
			setState(286);
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
		enterRule(_localctx, 60, RULE_sh_cmd_print);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(288);
			match(T__0);
			setState(290);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FILENAME) {
				{
				setState(289);
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
		enterRule(_localctx, 62, RULE_sh_cmd_save);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(T__1);
			setState(293);
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
		enterRule(_localctx, 64, RULE_sh_cmd_load);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(295);
			match(T__2);
			setState(296);
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
		enterRule(_localctx, 66, RULE_sh_cmd_clear);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(298);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3:\u012f\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\7\2I\n\2\f\2\16\2L\13\2\3\2\7\2O\n\2\f\2\16"+
		"\2R\13\2\3\2\3\2\3\3\3\3\3\3\3\4\3\4\5\4[\n\4\3\4\7\4^\n\4\f\4\16\4a\13"+
		"\4\3\5\7\5d\n\5\f\5\16\5g\13\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\5\5\5t\n\5\3\5\6\5w\n\5\r\5\16\5x\3\6\3\6\3\6\3\6\3\6\5\6\u0080\n\6"+
		"\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\u0089\n\7\3\b\3\b\5\b\u008d\n\b\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13\u009a\n\13\3\f\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\22\3\22\5\22\u00bc\n\22"+
		"\6\22\u00be\n\22\r\22\16\22\u00bf\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3"+
		"\24\7\24\u00ca\n\24\f\24\16\24\u00cd\13\24\3\24\3\24\3\24\3\24\3\24\5"+
		"\24\u00d4\n\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\26"+
		"\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32"+
		"\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34"+
		"\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3 \3 \5 \u0125\n \3"+
		"!\3!\3!\3\"\3\"\3\"\3#\3#\3#\2\2$\2\4\6\b\n\f\16\20\22\24\26\30\32\34"+
		"\36 \"$&(*,.\60\62\64\668:<>@BD\2\b\4\2\61\61\63\63\3\2\24\31\3\2\26\31"+
		"\3\2\24\25\3\2\32\34\3\2\35\37\2\u012d\2J\3\2\2\2\4U\3\2\2\2\6Z\3\2\2"+
		"\2\be\3\2\2\2\nz\3\2\2\2\f\u0088\3\2\2\2\16\u008c\3\2\2\2\20\u008e\3\2"+
		"\2\2\22\u0094\3\2\2\2\24\u0099\3\2\2\2\26\u009b\3\2\2\2\30\u00a4\3\2\2"+
		"\2\32\u00af\3\2\2\2\34\u00b1\3\2\2\2\36\u00b3\3\2\2\2 \u00b5\3\2\2\2\""+
		"\u00b7\3\2\2\2$\u00c1\3\2\2\2&\u00c7\3\2\2\2(\u00d5\3\2\2\2*\u00df\3\2"+
		"\2\2,\u00e8\3\2\2\2.\u00f1\3\2\2\2\60\u00fa\3\2\2\2\62\u0103\3\2\2\2\64"+
		"\u010c\3\2\2\2\66\u0113\3\2\2\28\u011a\3\2\2\2:\u011c\3\2\2\2<\u011e\3"+
		"\2\2\2>\u0122\3\2\2\2@\u0126\3\2\2\2B\u0129\3\2\2\2D\u012c\3\2\2\2FI\5"+
		"\6\4\2GI\5\4\3\2HF\3\2\2\2HG\3\2\2\2IL\3\2\2\2JH\3\2\2\2JK\3\2\2\2KP\3"+
		"\2\2\2LJ\3\2\2\2MO\t\2\2\2NM\3\2\2\2OR\3\2\2\2PN\3\2\2\2PQ\3\2\2\2QS\3"+
		"\2\2\2RP\3\2\2\2ST\7\2\2\3T\3\3\2\2\2UV\7:\2\2VW\b\3\1\2W\5\3\2\2\2X["+
		"\5\b\5\2Y[\5\n\6\2ZX\3\2\2\2ZY\3\2\2\2[_\3\2\2\2\\^\7\61\2\2]\\\3\2\2"+
		"\2^a\3\2\2\2_]\3\2\2\2_`\3\2\2\2`\7\3\2\2\2a_\3\2\2\2bd\t\2\2\2cb\3\2"+
		"\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fs\3\2\2\2ge\3\2\2\2ht\5\f\7\2it\5\16"+
		"\b\2jt\5\24\13\2kt\5\26\f\2lt\5\30\r\2mt\5\32\16\2nt\5\34\17\2ot\5\36"+
		"\20\2pt\5 \21\2qt\5\"\22\2rt\5$\23\2sh\3\2\2\2si\3\2\2\2sj\3\2\2\2sk\3"+
		"\2\2\2sl\3\2\2\2sm\3\2\2\2sn\3\2\2\2so\3\2\2\2sp\3\2\2\2sq\3\2\2\2sr\3"+
		"\2\2\2tv\3\2\2\2uw\7\63\2\2vu\3\2\2\2wx\3\2\2\2xv\3\2\2\2xy\3\2\2\2y\t"+
		"\3\2\2\2z\177\7\67\2\2{\u0080\5> \2|\u0080\5@!\2}\u0080\5B\"\2~\u0080"+
		"\5D#\2\177{\3\2\2\2\177|\3\2\2\2\177}\3\2\2\2\177~\3\2\2\2\u0080\13\3"+
		"\2\2\2\u0081\u0089\5&\24\2\u0082\u0089\5(\25\2\u0083\u0089\5*\26\2\u0084"+
		"\u0089\5,\27\2\u0085\u0089\5.\30\2\u0086\u0089\5\60\31\2\u0087\u0089\5"+
		"\62\32\2\u0088\u0081\3\2\2\2\u0088\u0082\3\2\2\2\u0088\u0083\3\2\2\2\u0088"+
		"\u0084\3\2\2\2\u0088\u0085\3\2\2\2\u0088\u0086\3\2\2\2\u0088\u0087\3\2"+
		"\2\2\u0089\r\3\2\2\2\u008a\u008d\5\20\t\2\u008b\u008d\5\22\n\2\u008c\u008a"+
		"\3\2\2\2\u008c\u008b\3\2\2\2\u008d\17\3\2\2\2\u008e\u008f\7\16\2\2\u008f"+
		"\u0090\t\3\2\2\u0090\u0091\7)\2\2\u0091\u0092\7*\2\2\u0092\u0093\7/\2"+
		"\2\u0093\21\3\2\2\2\u0094\u0095\7\16\2\2\u0095\u0096\79\2\2\u0096\23\3"+
		"\2\2\2\u0097\u009a\5\64\33\2\u0098\u009a\5\66\34\2\u0099\u0097\3\2\2\2"+
		"\u0099\u0098\3\2\2\2\u009a\25\3\2\2\2\u009b\u009c\7\f\2\2\u009c\u009d"+
		"\7\25\2\2\u009d\u009e\7)\2\2\u009e\u009f\7*\2\2\u009f\u00a0\7/\2\2\u00a0"+
		"\u00a1\7+\2\2\u00a1\u00a2\7\23\2\2\u00a2\u00a3\7/\2\2\u00a3\27\3\2\2\2"+
		"\u00a4\u00a5\7\r\2\2\u00a5\u00a6\t\4\2\2\u00a6\u00a7\7)\2\2\u00a7\u00a8"+
		"\7*\2\2\u00a8\u00a9\7/\2\2\u00a9\u00aa\7-\2\2\u00aa\u00ab\t\5\2\2\u00ab"+
		"\u00ac\7)\2\2\u00ac\u00ad\7*\2\2\u00ad\u00ae\7/\2\2\u00ae\31\3\2\2\2\u00af"+
		"\u00b0\7\17\2\2\u00b0\33\3\2\2\2\u00b1\u00b2\7\20\2\2\u00b2\35\3\2\2\2"+
		"\u00b3\u00b4\7\n\2\2\u00b4\37\3\2\2\2\u00b5\u00b6\7\13\2\2\u00b6!\3\2"+
		"\2\2\u00b7\u00b8\7\21\2\2\u00b8\u00bd\78\2\2\u00b9\u00bb\78\2\2\u00ba"+
		"\u00bc\7\60\2\2\u00bb\u00ba\3\2\2\2\u00bb\u00bc\3\2\2\2\u00bc\u00be\3"+
		"\2\2\2\u00bd\u00b9\3\2\2\2\u00be\u00bf\3\2\2\2\u00bf\u00bd\3\2\2\2\u00bf"+
		"\u00c0\3\2\2\2\u00c0#\3\2\2\2\u00c1\u00c2\7\22\2\2\u00c2\u00c3\t\5\2\2"+
		"\u00c3\u00c4\7)\2\2\u00c4\u00c5\7*\2\2\u00c5\u00c6\7/\2\2\u00c6%\3\2\2"+
		"\2\u00c7\u00cb\7\b\2\2\u00c8\u00ca\58\35\2\u00c9\u00c8\3\2\2\2\u00ca\u00cd"+
		"\3\2\2\2\u00cb\u00c9\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00ce\3\2\2\2\u00cd"+
		"\u00cb\3\2\2\2\u00ce\u00cf\7\23\2\2\u00cf\u00d0\7)\2\2\u00d0\u00d1\7*"+
		"\2\2\u00d1\u00d3\7/\2\2\u00d2\u00d4\5<\37\2\u00d3\u00d2\3\2\2\2\u00d3"+
		"\u00d4\3\2\2\2\u00d4\'\3\2\2\2\u00d5\u00d6\7\b\2\2\u00d6\u00d7\5:\36\2"+
		"\u00d7\u00d8\7\24\2\2\u00d8\u00d9\7)\2\2\u00d9\u00da\7*\2\2\u00da\u00db"+
		"\7/\2\2\u00db\u00dc\7+\2\2\u00dc\u00dd\7\23\2\2\u00dd\u00de\7/\2\2\u00de"+
		")\3\2\2\2\u00df\u00e0\7\b\2\2\u00e0\u00e1\7\26\2\2\u00e1\u00e2\7)\2\2"+
		"\u00e2\u00e3\7*\2\2\u00e3\u00e4\7/\2\2\u00e4\u00e5\7+\2\2\u00e5\u00e6"+
		"\7\23\2\2\u00e6\u00e7\7/\2\2\u00e7+\3\2\2\2\u00e8\u00e9\7\b\2\2\u00e9"+
		"\u00ea\7\30\2\2\u00ea\u00eb\7)\2\2\u00eb\u00ec\7*\2\2\u00ec\u00ed\7/\2"+
		"\2\u00ed\u00ee\7+\2\2\u00ee\u00ef\7\23\2\2\u00ef\u00f0\7/\2\2\u00f0-\3"+
		"\2\2\2\u00f1\u00f2\7\b\2\2\u00f2\u00f3\7\31\2\2\u00f3\u00f4\7)\2\2\u00f4"+
		"\u00f5\7*\2\2\u00f5\u00f6\7/\2\2\u00f6\u00f7\7+\2\2\u00f7\u00f8\7\23\2"+
		"\2\u00f8\u00f9\7/\2\2\u00f9/\3\2\2\2\u00fa\u00fb\7\b\2\2\u00fb\u00fc\7"+
		"\27\2\2\u00fc\u00fd\7)\2\2\u00fd\u00fe\7*\2\2\u00fe\u00ff\7/\2\2\u00ff"+
		"\u0100\7+\2\2\u0100\u0101\7\23\2\2\u0101\u0102\7/\2\2\u0102\61\3\2\2\2"+
		"\u0103\u0104\7\b\2\2\u0104\u0105\7\25\2\2\u0105\u0106\7)\2\2\u0106\u0107"+
		"\7*\2\2\u0107\u0108\7/\2\2\u0108\u0109\7+\2\2\u0109\u010a\7\23\2\2\u010a"+
		"\u010b\7/\2\2\u010b\63\3\2\2\2\u010c\u010d\7\t\2\2\u010d\u010e\7\23\2"+
		"\2\u010e\u010f\7/\2\2\u010f\u0110\7)\2\2\u0110\u0111\7\23\2\2\u0111\u0112"+
		"\7/\2\2\u0112\65\3\2\2\2\u0113\u0114\7\t\2\2\u0114\u0115\7\27\2\2\u0115"+
		"\u0116\7/\2\2\u0116\u0117\7)\2\2\u0117\u0118\7\27\2\2\u0118\u0119\7/\2"+
		"\2\u0119\67\3\2\2\2\u011a\u011b\t\6\2\2\u011b9\3\2\2\2\u011c\u011d\t\7"+
		"\2\2\u011d;\3\2\2\2\u011e\u011f\7)\2\2\u011f\u0120\7.\2\2\u0120\u0121"+
		"\7/\2\2\u0121=\3\2\2\2\u0122\u0124\7\3\2\2\u0123\u0125\7\7\2\2\u0124\u0123"+
		"\3\2\2\2\u0124\u0125\3\2\2\2\u0125?\3\2\2\2\u0126\u0127\7\4\2\2\u0127"+
		"\u0128\7\7\2\2\u0128A\3\2\2\2\u0129\u012a\7\5\2\2\u012a\u012b\7\7\2\2"+
		"\u012bC\3\2\2\2\u012c\u012d\7\6\2\2\u012dE\3\2\2\2\23HJPZ_esx\177\u0088"+
		"\u008c\u0099\u00bb\u00bf\u00cb\u00d3\u0124";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}