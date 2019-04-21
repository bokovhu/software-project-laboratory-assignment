// Generated from PandaLanguage.g4 by ANTLR 4.7.2
package hu.johndoe.panda.proto.pl;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PandaLanguageLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, KW_ADD=5, KW_CONNECT=6, KW_BEGIN=7, KW_END=8, 
		KW_MOVE=9, KW_USE=10, KW_WORK=11, KW_PUSH=12, KW_POP=13, KW_SET=14, KW_TILE=15, 
		KW_PANDA=16, KW_ORANGUTAN=17, KW_VENDINGMACHINE=18, KW_WARDROBE=19, KW_GAMEMACHINE=20, 
		KW_COUCH=21, KW_FRAGILE=22, KW_EXIT=23, KW_START=24, KW_COWARD=25, KW_SLEEPY=26, 
		KW_JUMPY=27, KW_CURRENTANIMAL=28, KW_CURRENTITEM=29, KW_PLACEDON=30, KW_STANDINGON=31, 
		KW_SLEEPINGIN=32, KW_LEADERANIMAL=33, KW_GUIDEDANIMAL=34, KW_THEFTTIMER=35, 
		KW_NULL=36, KW_WITH=37, KW_ID=38, KW_ONTO=39, KW_CONNECTED=40, KW_BY=41, 
		IDENTIFIER=42, WHITESPACE=43, NEWLINE=44, COMMENT=45, SEMICOLON=46, LEFTPAR=47, 
		RIGHTPAR=48, EQUALS=49, SLASH=50, WORD=51, UNEXPECTED_CHAR=52;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "KW_ADD", "KW_CONNECT", "KW_BEGIN", "KW_END", 
			"KW_MOVE", "KW_USE", "KW_WORK", "KW_PUSH", "KW_POP", "KW_SET", "KW_TILE", 
			"KW_PANDA", "KW_ORANGUTAN", "KW_VENDINGMACHINE", "KW_WARDROBE", "KW_GAMEMACHINE", 
			"KW_COUCH", "KW_FRAGILE", "KW_EXIT", "KW_START", "KW_COWARD", "KW_SLEEPY", 
			"KW_JUMPY", "KW_CURRENTANIMAL", "KW_CURRENTITEM", "KW_PLACEDON", "KW_STANDINGON", 
			"KW_SLEEPINGIN", "KW_LEADERANIMAL", "KW_GUIDEDANIMAL", "KW_THEFTTIMER", 
			"KW_NULL", "KW_WITH", "KW_ID", "KW_ONTO", "KW_CONNECTED", "KW_BY", "IDENTIFIER", 
			"WHITESPACE", "NEWLINE", "COMMENT", "SEMICOLON", "LEFTPAR", "RIGHTPAR", 
			"EQUALS", "SLASH", "WORD", "UNEXPECTED_CHAR", "DIGIT", "LETTER", "A", 
			"B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", 
			"P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'print'", "'save'", "'load'", "'clear'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, "';'", "'('", "')'", "'='", "'/'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, "KW_ADD", "KW_CONNECT", "KW_BEGIN", "KW_END", 
			"KW_MOVE", "KW_USE", "KW_WORK", "KW_PUSH", "KW_POP", "KW_SET", "KW_TILE", 
			"KW_PANDA", "KW_ORANGUTAN", "KW_VENDINGMACHINE", "KW_WARDROBE", "KW_GAMEMACHINE", 
			"KW_COUCH", "KW_FRAGILE", "KW_EXIT", "KW_START", "KW_COWARD", "KW_SLEEPY", 
			"KW_JUMPY", "KW_CURRENTANIMAL", "KW_CURRENTITEM", "KW_PLACEDON", "KW_STANDINGON", 
			"KW_SLEEPINGIN", "KW_LEADERANIMAL", "KW_GUIDEDANIMAL", "KW_THEFTTIMER", 
			"KW_NULL", "KW_WITH", "KW_ID", "KW_ONTO", "KW_CONNECTED", "KW_BY", "IDENTIFIER", 
			"WHITESPACE", "NEWLINE", "COMMENT", "SEMICOLON", "LEFTPAR", "RIGHTPAR", 
			"EQUALS", "SLASH", "WORD", "UNEXPECTED_CHAR"
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


	public PandaLanguageLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "PandaLanguage.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\66\u0231\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t"+
		" \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t"+
		"+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64"+
		"\t\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t"+
		"=\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4"+
		"I\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\3\2\3\2\3\2\3\2\3"+
		"\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3\5"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3"+
		"\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3"+
		"\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\30\3\30\3\30\3\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3"+
		"\34\3\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3"+
		"\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3"+
		" \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3"+
		"\'\3\'\3(\3(\3(\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3*\3*\3*\3+\6+\u01cf"+
		"\n+\r+\16+\u01d0\3,\6,\u01d4\n,\r,\16,\u01d5\3,\3,\3-\5-\u01db\n-\3-\3"+
		"-\3.\3.\7.\u01e1\n.\f.\16.\u01e4\13.\3.\3.\3/\3/\3\60\3\60\3\61\3\61\3"+
		"\62\3\62\3\63\3\63\3\64\3\64\6\64\u01f4\n\64\r\64\16\64\u01f5\3\65\3\65"+
		"\3\66\3\66\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>\3?\3?\3"+
		"@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J\3J\3K\3"+
		"K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\2\2R\3\3\5\4\7\5\t\6\13\7\r\b\17"+
		"\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+"+
		"\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K\'M(O)Q*S+"+
		"U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\2m\2o\2q\2s\2u\2w\2y\2{\2}\2\177"+
		"\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b\2\u008d\2\u008f\2\u0091"+
		"\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d\2\u009f\2\u00a1\2\3\2"+
		" \4\2\13\13\"\"\4\2\f\f\17\17\3\2\62;\4\2C\\c|\4\2CCcc\4\2DDdd\4\2EEe"+
		"e\4\2FFff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2"+
		"NNnn\4\2OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4"+
		"\2WWww\4\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u021a\2\3\3\2\2\2\2"+
		"\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2"+
		"\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2"+
		"\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2"+
		"\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2"+
		"\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2"+
		"\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2"+
		"K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3"+
		"\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2"+
		"\2\2e\3\2\2\2\2g\3\2\2\2\2i\3\2\2\2\3\u00a3\3\2\2\2\5\u00a9\3\2\2\2\7"+
		"\u00ae\3\2\2\2\t\u00b3\3\2\2\2\13\u00b9\3\2\2\2\r\u00bd\3\2\2\2\17\u00c5"+
		"\3\2\2\2\21\u00cb\3\2\2\2\23\u00cf\3\2\2\2\25\u00d4\3\2\2\2\27\u00d8\3"+
		"\2\2\2\31\u00dd\3\2\2\2\33\u00e2\3\2\2\2\35\u00e6\3\2\2\2\37\u00ea\3\2"+
		"\2\2!\u00ef\3\2\2\2#\u00f5\3\2\2\2%\u00ff\3\2\2\2\'\u010e\3\2\2\2)\u0117"+
		"\3\2\2\2+\u0123\3\2\2\2-\u0129\3\2\2\2/\u0131\3\2\2\2\61\u0136\3\2\2\2"+
		"\63\u013c\3\2\2\2\65\u0143\3\2\2\2\67\u014a\3\2\2\29\u0150\3\2\2\2;\u015e"+
		"\3\2\2\2=\u016a\3\2\2\2?\u0173\3\2\2\2A\u017e\3\2\2\2C\u0189\3\2\2\2E"+
		"\u0196\3\2\2\2G\u01a3\3\2\2\2I\u01ae\3\2\2\2K\u01b3\3\2\2\2M\u01b8\3\2"+
		"\2\2O\u01bb\3\2\2\2Q\u01c0\3\2\2\2S\u01ca\3\2\2\2U\u01ce\3\2\2\2W\u01d3"+
		"\3\2\2\2Y\u01da\3\2\2\2[\u01de\3\2\2\2]\u01e7\3\2\2\2_\u01e9\3\2\2\2a"+
		"\u01eb\3\2\2\2c\u01ed\3\2\2\2e\u01ef\3\2\2\2g\u01f3\3\2\2\2i\u01f7\3\2"+
		"\2\2k\u01f9\3\2\2\2m\u01fb\3\2\2\2o\u01fd\3\2\2\2q\u01ff\3\2\2\2s\u0201"+
		"\3\2\2\2u\u0203\3\2\2\2w\u0205\3\2\2\2y\u0207\3\2\2\2{\u0209\3\2\2\2}"+
		"\u020b\3\2\2\2\177\u020d\3\2\2\2\u0081\u020f\3\2\2\2\u0083\u0211\3\2\2"+
		"\2\u0085\u0213\3\2\2\2\u0087\u0215\3\2\2\2\u0089\u0217\3\2\2\2\u008b\u0219"+
		"\3\2\2\2\u008d\u021b\3\2\2\2\u008f\u021d\3\2\2\2\u0091\u021f\3\2\2\2\u0093"+
		"\u0221\3\2\2\2\u0095\u0223\3\2\2\2\u0097\u0225\3\2\2\2\u0099\u0227\3\2"+
		"\2\2\u009b\u0229\3\2\2\2\u009d\u022b\3\2\2\2\u009f\u022d\3\2\2\2\u00a1"+
		"\u022f\3\2\2\2\u00a3\u00a4\7r\2\2\u00a4\u00a5\7t\2\2\u00a5\u00a6\7k\2"+
		"\2\u00a6\u00a7\7p\2\2\u00a7\u00a8\7v\2\2\u00a8\4\3\2\2\2\u00a9\u00aa\7"+
		"u\2\2\u00aa\u00ab\7c\2\2\u00ab\u00ac\7x\2\2\u00ac\u00ad\7g\2\2\u00ad\6"+
		"\3\2\2\2\u00ae\u00af\7n\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7c\2\2\u00b1"+
		"\u00b2\7f\2\2\u00b2\b\3\2\2\2\u00b3\u00b4\7e\2\2\u00b4\u00b5\7n\2\2\u00b5"+
		"\u00b6\7g\2\2\u00b6\u00b7\7c\2\2\u00b7\u00b8\7t\2\2\u00b8\n\3\2\2\2\u00b9"+
		"\u00ba\5o8\2\u00ba\u00bb\5u;\2\u00bb\u00bc\5u;\2\u00bc\f\3\2\2\2\u00bd"+
		"\u00be\5s:\2\u00be\u00bf\5\u008bF\2\u00bf\u00c0\5\u0089E\2\u00c0\u00c1"+
		"\5\u0089E\2\u00c1\u00c2\5w<\2\u00c2\u00c3\5s:\2\u00c3\u00c4\5\u0095K\2"+
		"\u00c4\16\3\2\2\2\u00c5\u00c6\5q9\2\u00c6\u00c7\5w<\2\u00c7\u00c8\5{>"+
		"\2\u00c8\u00c9\5\177@\2\u00c9\u00ca\5\u0089E\2\u00ca\20\3\2\2\2\u00cb"+
		"\u00cc\5w<\2\u00cc\u00cd\5\u0089E\2\u00cd\u00ce\5u;\2\u00ce\22\3\2\2\2"+
		"\u00cf\u00d0\5\u0087D\2\u00d0\u00d1\5\u008bF\2\u00d1\u00d2\5\u0099M\2"+
		"\u00d2\u00d3\5w<\2\u00d3\24\3\2\2\2\u00d4\u00d5\5\u0097L\2\u00d5\u00d6"+
		"\5\u0093J\2\u00d6\u00d7\5w<\2\u00d7\26\3\2\2\2\u00d8\u00d9\5\u009bN\2"+
		"\u00d9\u00da\5\u008bF\2\u00da\u00db\5\u0091I\2\u00db\u00dc\5\u0083B\2"+
		"\u00dc\30\3\2\2\2\u00dd\u00de\5\u008dG\2\u00de\u00df\5\u0097L\2\u00df"+
		"\u00e0\5\u0093J\2\u00e0\u00e1\5}?\2\u00e1\32\3\2\2\2\u00e2\u00e3\5\u008d"+
		"G\2\u00e3\u00e4\5\u008bF\2\u00e4\u00e5\5\u008dG\2\u00e5\34\3\2\2\2\u00e6"+
		"\u00e7\5\u0093J\2\u00e7\u00e8\5w<\2\u00e8\u00e9\5\u0095K\2\u00e9\36\3"+
		"\2\2\2\u00ea\u00eb\5\u0095K\2\u00eb\u00ec\5\177@\2\u00ec\u00ed\5\u0085"+
		"C\2\u00ed\u00ee\5w<\2\u00ee \3\2\2\2\u00ef\u00f0\5\u008dG\2\u00f0\u00f1"+
		"\5o8\2\u00f1\u00f2\5\u0089E\2\u00f2\u00f3\5u;\2\u00f3\u00f4\5o8\2\u00f4"+
		"\"\3\2\2\2\u00f5\u00f6\5\u008bF\2\u00f6\u00f7\5\u0091I\2\u00f7\u00f8\5"+
		"o8\2\u00f8\u00f9\5\u0089E\2\u00f9\u00fa\5{>\2\u00fa\u00fb\5\u0097L\2\u00fb"+
		"\u00fc\5\u0095K\2\u00fc\u00fd\5o8\2\u00fd\u00fe\5\u0089E\2\u00fe$\3\2"+
		"\2\2\u00ff\u0100\5\u0099M\2\u0100\u0101\5w<\2\u0101\u0102\5\u0089E\2\u0102"+
		"\u0103\5u;\2\u0103\u0104\5\177@\2\u0104\u0105\5\u0089E\2\u0105\u0106\5"+
		"{>\2\u0106\u0107\5\u0087D\2\u0107\u0108\5o8\2\u0108\u0109\5s:\2\u0109"+
		"\u010a\5}?\2\u010a\u010b\5\177@\2\u010b\u010c\5\u0089E\2\u010c\u010d\5"+
		"w<\2\u010d&\3\2\2\2\u010e\u010f\5\u009bN\2\u010f\u0110\5o8\2\u0110\u0111"+
		"\5\u0091I\2\u0111\u0112\5u;\2\u0112\u0113\5\u0091I\2\u0113\u0114\5\u008b"+
		"F\2\u0114\u0115\5q9\2\u0115\u0116\5w<\2\u0116(\3\2\2\2\u0117\u0118\5{"+
		">\2\u0118\u0119\5o8\2\u0119\u011a\5\u0087D\2\u011a\u011b\5w<\2\u011b\u011c"+
		"\5\u0087D\2\u011c\u011d\5o8\2\u011d\u011e\5s:\2\u011e\u011f\5}?\2\u011f"+
		"\u0120\5\177@\2\u0120\u0121\5\u0089E\2\u0121\u0122\5w<\2\u0122*\3\2\2"+
		"\2\u0123\u0124\5s:\2\u0124\u0125\5\u008bF\2\u0125\u0126\5\u0097L\2\u0126"+
		"\u0127\5s:\2\u0127\u0128\5}?\2\u0128,\3\2\2\2\u0129\u012a\5y=\2\u012a"+
		"\u012b\5\u0091I\2\u012b\u012c\5o8\2\u012c\u012d\5{>\2\u012d\u012e\5\177"+
		"@\2\u012e\u012f\5\u0085C\2\u012f\u0130\5w<\2\u0130.\3\2\2\2\u0131\u0132"+
		"\5w<\2\u0132\u0133\5\u009dO\2\u0133\u0134\5\177@\2\u0134\u0135\5\u0095"+
		"K\2\u0135\60\3\2\2\2\u0136\u0137\5\u0093J\2\u0137\u0138\5\u0095K\2\u0138"+
		"\u0139\5o8\2\u0139\u013a\5\u0091I\2\u013a\u013b\5\u0095K\2\u013b\62\3"+
		"\2\2\2\u013c\u013d\5s:\2\u013d\u013e\5\u008bF\2\u013e\u013f\5\u009bN\2"+
		"\u013f\u0140\5o8\2\u0140\u0141\5\u0091I\2\u0141\u0142\5u;\2\u0142\64\3"+
		"\2\2\2\u0143\u0144\5\u0093J\2\u0144\u0145\5\u0085C\2\u0145\u0146\5w<\2"+
		"\u0146\u0147\5w<\2\u0147\u0148\5\u008dG\2\u0148\u0149\5\u009fP\2\u0149"+
		"\66\3\2\2\2\u014a\u014b\5\u0081A\2\u014b\u014c\5\u0097L\2\u014c\u014d"+
		"\5\u0087D\2\u014d\u014e\5\u008dG\2\u014e\u014f\5\u009fP\2\u014f8\3\2\2"+
		"\2\u0150\u0151\5s:\2\u0151\u0152\5\u0097L\2\u0152\u0153\5\u0091I\2\u0153"+
		"\u0154\5\u0091I\2\u0154\u0155\5w<\2\u0155\u0156\5\u0089E\2\u0156\u0157"+
		"\5\u0095K\2\u0157\u0158\5o8\2\u0158\u0159\5\u0089E\2\u0159\u015a\5\177"+
		"@\2\u015a\u015b\5\u0087D\2\u015b\u015c\5o8\2\u015c\u015d\5\u0085C\2\u015d"+
		":\3\2\2\2\u015e\u015f\5s:\2\u015f\u0160\5\u0097L\2\u0160\u0161\5\u0091"+
		"I\2\u0161\u0162\5\u0091I\2\u0162\u0163\5w<\2\u0163\u0164\5\u0089E\2\u0164"+
		"\u0165\5\u0095K\2\u0165\u0166\5\177@\2\u0166\u0167\5\u0095K\2\u0167\u0168"+
		"\5w<\2\u0168\u0169\5\u0087D\2\u0169<\3\2\2\2\u016a\u016b\5\u008dG\2\u016b"+
		"\u016c\5\u0085C\2\u016c\u016d\5o8\2\u016d\u016e\5s:\2\u016e\u016f\5w<"+
		"\2\u016f\u0170\5u;\2\u0170\u0171\5\u008bF\2\u0171\u0172\5\u0089E\2\u0172"+
		">\3\2\2\2\u0173\u0174\5\u0093J\2\u0174\u0175\5\u0095K\2\u0175\u0176\5"+
		"o8\2\u0176\u0177\5\u0089E\2\u0177\u0178\5u;\2\u0178\u0179\5\177@\2\u0179"+
		"\u017a\5\u0089E\2\u017a\u017b\5{>\2\u017b\u017c\5\u008bF\2\u017c\u017d"+
		"\5\u0089E\2\u017d@\3\2\2\2\u017e\u017f\5\u0093J\2\u017f\u0180\5\u0085"+
		"C\2\u0180\u0181\5w<\2\u0181\u0182\5w<\2\u0182\u0183\5\u008dG\2\u0183\u0184"+
		"\5\177@\2\u0184\u0185\5\u0089E\2\u0185\u0186\5{>\2\u0186\u0187\5\177@"+
		"\2\u0187\u0188\5\u0089E\2\u0188B\3\2\2\2\u0189\u018a\5\u0085C\2\u018a"+
		"\u018b\5w<\2\u018b\u018c\5o8\2\u018c\u018d\5u;\2\u018d\u018e\5w<\2\u018e"+
		"\u018f\5\u0091I\2\u018f\u0190\5o8\2\u0190\u0191\5\u0089E\2\u0191\u0192"+
		"\5\177@\2\u0192\u0193\5\u0087D\2\u0193\u0194\5o8\2\u0194\u0195\5\u0085"+
		"C\2\u0195D\3\2\2\2\u0196\u0197\5{>\2\u0197\u0198\5\u0097L\2\u0198\u0199"+
		"\5\177@\2\u0199\u019a\5u;\2\u019a\u019b\5w<\2\u019b\u019c\5u;\2\u019c"+
		"\u019d\5o8\2\u019d\u019e\5\u0089E\2\u019e\u019f\5\177@\2\u019f\u01a0\5"+
		"\u0087D\2\u01a0\u01a1\5o8\2\u01a1\u01a2\5\u0085C\2\u01a2F\3\2\2\2\u01a3"+
		"\u01a4\5\u0095K\2\u01a4\u01a5\5}?\2\u01a5\u01a6\5w<\2\u01a6\u01a7\5y="+
		"\2\u01a7\u01a8\5\u0095K\2\u01a8\u01a9\5\u0095K\2\u01a9\u01aa\5\177@\2"+
		"\u01aa\u01ab\5\u0087D\2\u01ab\u01ac\5w<\2\u01ac\u01ad\5\u0091I\2\u01ad"+
		"H\3\2\2\2\u01ae\u01af\5\u0089E\2\u01af\u01b0\5\u0097L\2\u01b0\u01b1\5"+
		"\u0085C\2\u01b1\u01b2\5\u0085C\2\u01b2J\3\2\2\2\u01b3\u01b4\5\u009bN\2"+
		"\u01b4\u01b5\5\177@\2\u01b5\u01b6\5\u0095K\2\u01b6\u01b7\5}?\2\u01b7L"+
		"\3\2\2\2\u01b8\u01b9\5\177@\2\u01b9\u01ba\5u;\2\u01baN\3\2\2\2\u01bb\u01bc"+
		"\5\u008bF\2\u01bc\u01bd\5\u0089E\2\u01bd\u01be\5\u0095K\2\u01be\u01bf"+
		"\5\u008bF\2\u01bfP\3\2\2\2\u01c0\u01c1\5s:\2\u01c1\u01c2\5\u008bF\2\u01c2"+
		"\u01c3\5\u0089E\2\u01c3\u01c4\5\u0089E\2\u01c4\u01c5\5w<\2\u01c5\u01c6"+
		"\5s:\2\u01c6\u01c7\5\u0095K\2\u01c7\u01c8\5w<\2\u01c8\u01c9\5u;\2\u01c9"+
		"R\3\2\2\2\u01ca\u01cb\5q9\2\u01cb\u01cc\5\u009fP\2\u01ccT\3\2\2\2\u01cd"+
		"\u01cf\5k\66\2\u01ce\u01cd\3\2\2\2\u01cf\u01d0\3\2\2\2\u01d0\u01ce\3\2"+
		"\2\2\u01d0\u01d1\3\2\2\2\u01d1V\3\2\2\2\u01d2\u01d4\t\2\2\2\u01d3\u01d2"+
		"\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d3\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d8\b,\2\2\u01d8X\3\2\2\2\u01d9\u01db\7\17\2\2"+
		"\u01da\u01d9\3\2\2\2\u01da\u01db\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01dd"+
		"\7\f\2\2\u01ddZ\3\2\2\2\u01de\u01e2\7%\2\2\u01df\u01e1\n\3\2\2\u01e0\u01df"+
		"\3\2\2\2\u01e1\u01e4\3\2\2\2\u01e2\u01e0\3\2\2\2\u01e2\u01e3\3\2\2\2\u01e3"+
		"\u01e5\3\2\2\2\u01e4\u01e2\3\2\2\2\u01e5\u01e6\b.\2\2\u01e6\\\3\2\2\2"+
		"\u01e7\u01e8\7=\2\2\u01e8^\3\2\2\2\u01e9\u01ea\7*\2\2\u01ea`\3\2\2\2\u01eb"+
		"\u01ec\7+\2\2\u01ecb\3\2\2\2\u01ed\u01ee\7?\2\2\u01eed\3\2\2\2\u01ef\u01f0"+
		"\7\61\2\2\u01f0f\3\2\2\2\u01f1\u01f4\5m\67\2\u01f2\u01f4\5k\66\2\u01f3"+
		"\u01f1\3\2\2\2\u01f3\u01f2\3\2\2\2\u01f4\u01f5\3\2\2\2\u01f5\u01f3\3\2"+
		"\2\2\u01f5\u01f6\3\2\2\2\u01f6h\3\2\2\2\u01f7\u01f8\13\2\2\2\u01f8j\3"+
		"\2\2\2\u01f9\u01fa\t\4\2\2\u01fal\3\2\2\2\u01fb\u01fc\t\5\2\2\u01fcn\3"+
		"\2\2\2\u01fd\u01fe\t\6\2\2\u01fep\3\2\2\2\u01ff\u0200\t\7\2\2\u0200r\3"+
		"\2\2\2\u0201\u0202\t\b\2\2\u0202t\3\2\2\2\u0203\u0204\t\t\2\2\u0204v\3"+
		"\2\2\2\u0205\u0206\t\n\2\2\u0206x\3\2\2\2\u0207\u0208\t\13\2\2\u0208z"+
		"\3\2\2\2\u0209\u020a\t\f\2\2\u020a|\3\2\2\2\u020b\u020c\t\r\2\2\u020c"+
		"~\3\2\2\2\u020d\u020e\t\16\2\2\u020e\u0080\3\2\2\2\u020f\u0210\t\17\2"+
		"\2\u0210\u0082\3\2\2\2\u0211\u0212\t\20\2\2\u0212\u0084\3\2\2\2\u0213"+
		"\u0214\t\21\2\2\u0214\u0086\3\2\2\2\u0215\u0216\t\22\2\2\u0216\u0088\3"+
		"\2\2\2\u0217\u0218\t\23\2\2\u0218\u008a\3\2\2\2\u0219\u021a\t\24\2\2\u021a"+
		"\u008c\3\2\2\2\u021b\u021c\t\25\2\2\u021c\u008e\3\2\2\2\u021d\u021e\t"+
		"\26\2\2\u021e\u0090\3\2\2\2\u021f\u0220\t\27\2\2\u0220\u0092\3\2\2\2\u0221"+
		"\u0222\t\30\2\2\u0222\u0094\3\2\2\2\u0223\u0224\t\31\2\2\u0224\u0096\3"+
		"\2\2\2\u0225\u0226\t\32\2\2\u0226\u0098\3\2\2\2\u0227\u0228\t\33\2\2\u0228"+
		"\u009a\3\2\2\2\u0229\u022a\t\34\2\2\u022a\u009c\3\2\2\2\u022b\u022c\t"+
		"\35\2\2\u022c\u009e\3\2\2\2\u022d\u022e\t\36\2\2\u022e\u00a0\3\2\2\2\u022f"+
		"\u0230\t\37\2\2\u0230\u00a2\3\2\2\2\t\2\u01d0\u01d5\u01da\u01e2\u01f3"+
		"\u01f5\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}