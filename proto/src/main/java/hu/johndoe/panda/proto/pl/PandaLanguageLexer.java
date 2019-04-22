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
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "FILENAME", "KW_ADD", "KW_CONNECT", "KW_BEGIN", 
			"KW_END", "KW_MOVE", "KW_USE", "KW_WORK", "KW_PUSH", "KW_POP", "KW_SET", 
			"KW_RELEASE", "KW_TILE", "KW_PANDA", "KW_ORANGUTAN", "KW_VENDINGMACHINE", 
			"KW_WARDROBE", "KW_GAMEMACHINE", "KW_COUCH", "KW_FRAGILE", "KW_EXIT", 
			"KW_START", "KW_COWARD", "KW_SLEEPY", "KW_JUMPY", "KW_CURRENTANIMAL", 
			"KW_CURRENTITEM", "KW_PLACEDON", "KW_STANDINGON", "KW_SLEEPINGIN", "KW_LEADERANIMAL", 
			"KW_GUIDEDANIMAL", "KW_THEFTTIMER", "KW_NULL", "KW_WITH", "KW_ID", "KW_ONTO", 
			"KW_CONNECTED", "KW_BY", "IDENTIFIER", "WHITESPACE", "NEWLINE", "COMMENT", 
			"SEMICOLON", "LEFTPAR", "RIGHTPAR", "EQUALS", "SLASH", "WORD", "UNEXPECTED_CHAR", 
			"DIGIT", "LETTER", "FILENAME_CHAR", "A", "B", "C", "D", "E", "F", "G", 
			"H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", 
			"V", "W", "X", "Y", "Z"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\28\u0249\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\3\6\3\6\6\6\u00c2\n\6\r\6\16\6\u00c3\3\6\3\6\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r"+
		"\3\r\3\16\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20"+
		"\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24"+
		"\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27"+
		"\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3\32"+
		"\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\3\34\3\34\3\34\3\34\3\34\3\35"+
		"\3\35\3\35\3\35\3\35\3\35\3\35\3\36\3\36\3\36\3\36\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3$\3$\3"+
		"$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3%\3"+
		"%\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3("+
		"\3)\3)\3)\3*\3*\3*\3*\3*\3+\3+\3+\3+\3+\3+\3+\3+\3+\3+\3,\3,\3,\3-\6-"+
		"\u01e5\n-\r-\16-\u01e6\3.\6.\u01ea\n.\r.\16.\u01eb\3.\3.\3/\5/\u01f1\n"+
		"/\3/\3/\3\60\3\60\7\60\u01f7\n\60\f\60\16\60\u01fa\13\60\3\60\3\60\3\61"+
		"\3\61\3\62\3\62\3\63\3\63\3\64\3\64\3\65\3\65\3\66\3\66\6\66\u020a\n\66"+
		"\r\66\16\66\u020b\3\67\3\67\38\38\39\39\3:\3:\3;\3;\3<\3<\3=\3=\3>\3>"+
		"\3?\3?\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3H\3I\3I\3J"+
		"\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3R\3R\3S\3S\3T\3T\2\2U\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37"+
		"\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37="+
		" ?!A\"C#E$G%I&K\'M(O)Q*S+U,W-Y.[/]\60_\61a\62c\63e\64g\65i\66k\67m8o\2"+
		"q\2s\2u\2w\2y\2{\2}\2\177\2\u0081\2\u0083\2\u0085\2\u0087\2\u0089\2\u008b"+
		"\2\u008d\2\u008f\2\u0091\2\u0093\2\u0095\2\u0097\2\u0099\2\u009b\2\u009d"+
		"\2\u009f\2\u00a1\2\u00a3\2\u00a5\2\u00a7\2\3\2!\4\2\13\13\"\"\4\2\f\f"+
		"\17\17\3\2\62;\4\2C\\c|\5\2\f\f\17\17$$\4\2CCcc\4\2DDdd\4\2EEee\4\2FF"+
		"ff\4\2GGgg\4\2HHhh\4\2IIii\4\2JJjj\4\2KKkk\4\2LLll\4\2MMmm\4\2NNnn\4\2"+
		"OOoo\4\2PPpp\4\2QQqq\4\2RRrr\4\2SSss\4\2TTtt\4\2UUuu\4\2VVvv\4\2WWww\4"+
		"\2XXxx\4\2YYyy\4\2ZZzz\4\2[[{{\4\2\\\\||\2\u0232\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3"+
		"\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2"+
		"\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2"+
		"Y\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\2_\3\2\2\2\2a\3\2\2\2\2c\3\2\2\2\2e\3"+
		"\2\2\2\2g\3\2\2\2\2i\3\2\2\2\2k\3\2\2\2\2m\3\2\2\2\3\u00a9\3\2\2\2\5\u00af"+
		"\3\2\2\2\7\u00b4\3\2\2\2\t\u00b9\3\2\2\2\13\u00bf\3\2\2\2\r\u00c7\3\2"+
		"\2\2\17\u00cb\3\2\2\2\21\u00d3\3\2\2\2\23\u00d9\3\2\2\2\25\u00dd\3\2\2"+
		"\2\27\u00e2\3\2\2\2\31\u00e6\3\2\2\2\33\u00eb\3\2\2\2\35\u00f0\3\2\2\2"+
		"\37\u00f4\3\2\2\2!\u00f8\3\2\2\2#\u0100\3\2\2\2%\u0105\3\2\2\2\'\u010b"+
		"\3\2\2\2)\u0115\3\2\2\2+\u0124\3\2\2\2-\u012d\3\2\2\2/\u0139\3\2\2\2\61"+
		"\u013f\3\2\2\2\63\u0147\3\2\2\2\65\u014c\3\2\2\2\67\u0152\3\2\2\29\u0159"+
		"\3\2\2\2;\u0160\3\2\2\2=\u0166\3\2\2\2?\u0174\3\2\2\2A\u0180\3\2\2\2C"+
		"\u0189\3\2\2\2E\u0194\3\2\2\2G\u019f\3\2\2\2I\u01ac\3\2\2\2K\u01b9\3\2"+
		"\2\2M\u01c4\3\2\2\2O\u01c9\3\2\2\2Q\u01ce\3\2\2\2S\u01d1\3\2\2\2U\u01d6"+
		"\3\2\2\2W\u01e0\3\2\2\2Y\u01e4\3\2\2\2[\u01e9\3\2\2\2]\u01f0\3\2\2\2_"+
		"\u01f4\3\2\2\2a\u01fd\3\2\2\2c\u01ff\3\2\2\2e\u0201\3\2\2\2g\u0203\3\2"+
		"\2\2i\u0205\3\2\2\2k\u0209\3\2\2\2m\u020d\3\2\2\2o\u020f\3\2\2\2q\u0211"+
		"\3\2\2\2s\u0213\3\2\2\2u\u0215\3\2\2\2w\u0217\3\2\2\2y\u0219\3\2\2\2{"+
		"\u021b\3\2\2\2}\u021d\3\2\2\2\177\u021f\3\2\2\2\u0081\u0221\3\2\2\2\u0083"+
		"\u0223\3\2\2\2\u0085\u0225\3\2\2\2\u0087\u0227\3\2\2\2\u0089\u0229\3\2"+
		"\2\2\u008b\u022b\3\2\2\2\u008d\u022d\3\2\2\2\u008f\u022f\3\2\2\2\u0091"+
		"\u0231\3\2\2\2\u0093\u0233\3\2\2\2\u0095\u0235\3\2\2\2\u0097\u0237\3\2"+
		"\2\2\u0099\u0239\3\2\2\2\u009b\u023b\3\2\2\2\u009d\u023d\3\2\2\2\u009f"+
		"\u023f\3\2\2\2\u00a1\u0241\3\2\2\2\u00a3\u0243\3\2\2\2\u00a5\u0245\3\2"+
		"\2\2\u00a7\u0247\3\2\2\2\u00a9\u00aa\7r\2\2\u00aa\u00ab\7t\2\2\u00ab\u00ac"+
		"\7k\2\2\u00ac\u00ad\7p\2\2\u00ad\u00ae\7v\2\2\u00ae\4\3\2\2\2\u00af\u00b0"+
		"\7u\2\2\u00b0\u00b1\7c\2\2\u00b1\u00b2\7x\2\2\u00b2\u00b3\7g\2\2\u00b3"+
		"\6\3\2\2\2\u00b4\u00b5\7n\2\2\u00b5\u00b6\7q\2\2\u00b6\u00b7\7c\2\2\u00b7"+
		"\u00b8\7f\2\2\u00b8\b\3\2\2\2\u00b9\u00ba\7e\2\2\u00ba\u00bb\7n\2\2\u00bb"+
		"\u00bc\7g\2\2\u00bc\u00bd\7c\2\2\u00bd\u00be\7t\2\2\u00be\n\3\2\2\2\u00bf"+
		"\u00c1\7$\2\2\u00c0\u00c2\5s:\2\u00c1\u00c0\3\2\2\2\u00c2\u00c3\3\2\2"+
		"\2\u00c3\u00c1\3\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00c5\3\2\2\2\u00c5\u00c6"+
		"\7$\2\2\u00c6\f\3\2\2\2\u00c7\u00c8\5u;\2\u00c8\u00c9\5{>\2\u00c9\u00ca"+
		"\5{>\2\u00ca\16\3\2\2\2\u00cb\u00cc\5y=\2\u00cc\u00cd\5\u0091I\2\u00cd"+
		"\u00ce\5\u008fH\2\u00ce\u00cf\5\u008fH\2\u00cf\u00d0\5}?\2\u00d0\u00d1"+
		"\5y=\2\u00d1\u00d2\5\u009bN\2\u00d2\20\3\2\2\2\u00d3\u00d4\5w<\2\u00d4"+
		"\u00d5\5}?\2\u00d5\u00d6\5\u0081A\2\u00d6\u00d7\5\u0085C\2\u00d7\u00d8"+
		"\5\u008fH\2\u00d8\22\3\2\2\2\u00d9\u00da\5}?\2\u00da\u00db\5\u008fH\2"+
		"\u00db\u00dc\5{>\2\u00dc\24\3\2\2\2\u00dd\u00de\5\u008dG\2\u00de\u00df"+
		"\5\u0091I\2\u00df\u00e0\5\u009fP\2\u00e0\u00e1\5}?\2\u00e1\26\3\2\2\2"+
		"\u00e2\u00e3\5\u009dO\2\u00e3\u00e4\5\u0099M\2\u00e4\u00e5\5}?\2\u00e5"+
		"\30\3\2\2\2\u00e6\u00e7\5\u00a1Q\2\u00e7\u00e8\5\u0091I\2\u00e8\u00e9"+
		"\5\u0097L\2\u00e9\u00ea\5\u0089E\2\u00ea\32\3\2\2\2\u00eb\u00ec\5\u0093"+
		"J\2\u00ec\u00ed\5\u009dO\2\u00ed\u00ee\5\u0099M\2\u00ee\u00ef\5\u0083"+
		"B\2\u00ef\34\3\2\2\2\u00f0\u00f1\5\u0093J\2\u00f1\u00f2\5\u0091I\2\u00f2"+
		"\u00f3\5\u0093J\2\u00f3\36\3\2\2\2\u00f4\u00f5\5\u0099M\2\u00f5\u00f6"+
		"\5}?\2\u00f6\u00f7\5\u009bN\2\u00f7 \3\2\2\2\u00f8\u00f9\5\u0097L\2\u00f9"+
		"\u00fa\5}?\2\u00fa\u00fb\5\u008bF\2\u00fb\u00fc\5}?\2\u00fc\u00fd\5u;"+
		"\2\u00fd\u00fe\5\u0099M\2\u00fe\u00ff\5}?\2\u00ff\"\3\2\2\2\u0100\u0101"+
		"\5\u009bN\2\u0101\u0102\5\u0085C\2\u0102\u0103\5\u008bF\2\u0103\u0104"+
		"\5}?\2\u0104$\3\2\2\2\u0105\u0106\5\u0093J\2\u0106\u0107\5u;\2\u0107\u0108"+
		"\5\u008fH\2\u0108\u0109\5{>\2\u0109\u010a\5u;\2\u010a&\3\2\2\2\u010b\u010c"+
		"\5\u0091I\2\u010c\u010d\5\u0097L\2\u010d\u010e\5u;\2\u010e\u010f\5\u008f"+
		"H\2\u010f\u0110\5\u0081A\2\u0110\u0111\5\u009dO\2\u0111\u0112\5\u009b"+
		"N\2\u0112\u0113\5u;\2\u0113\u0114\5\u008fH\2\u0114(\3\2\2\2\u0115\u0116"+
		"\5\u009fP\2\u0116\u0117\5}?\2\u0117\u0118\5\u008fH\2\u0118\u0119\5{>\2"+
		"\u0119\u011a\5\u0085C\2\u011a\u011b\5\u008fH\2\u011b\u011c\5\u0081A\2"+
		"\u011c\u011d\5\u008dG\2\u011d\u011e\5u;\2\u011e\u011f\5y=\2\u011f\u0120"+
		"\5\u0083B\2\u0120\u0121\5\u0085C\2\u0121\u0122\5\u008fH\2\u0122\u0123"+
		"\5}?\2\u0123*\3\2\2\2\u0124\u0125\5\u00a1Q\2\u0125\u0126\5u;\2\u0126\u0127"+
		"\5\u0097L\2\u0127\u0128\5{>\2\u0128\u0129\5\u0097L\2\u0129\u012a\5\u0091"+
		"I\2\u012a\u012b\5w<\2\u012b\u012c\5}?\2\u012c,\3\2\2\2\u012d\u012e\5\u0081"+
		"A\2\u012e\u012f\5u;\2\u012f\u0130\5\u008dG\2\u0130\u0131\5}?\2\u0131\u0132"+
		"\5\u008dG\2\u0132\u0133\5u;\2\u0133\u0134\5y=\2\u0134\u0135\5\u0083B\2"+
		"\u0135\u0136\5\u0085C\2\u0136\u0137\5\u008fH\2\u0137\u0138\5}?\2\u0138"+
		".\3\2\2\2\u0139\u013a\5y=\2\u013a\u013b\5\u0091I\2\u013b\u013c\5\u009d"+
		"O\2\u013c\u013d\5y=\2\u013d\u013e\5\u0083B\2\u013e\60\3\2\2\2\u013f\u0140"+
		"\5\177@\2\u0140\u0141\5\u0097L\2\u0141\u0142\5u;\2\u0142\u0143\5\u0081"+
		"A\2\u0143\u0144\5\u0085C\2\u0144\u0145\5\u008bF\2\u0145\u0146\5}?\2\u0146"+
		"\62\3\2\2\2\u0147\u0148\5}?\2\u0148\u0149\5\u00a3R\2\u0149\u014a\5\u0085"+
		"C\2\u014a\u014b\5\u009bN\2\u014b\64\3\2\2\2\u014c\u014d\5\u0099M\2\u014d"+
		"\u014e\5\u009bN\2\u014e\u014f\5u;\2\u014f\u0150\5\u0097L\2\u0150\u0151"+
		"\5\u009bN\2\u0151\66\3\2\2\2\u0152\u0153\5y=\2\u0153\u0154\5\u0091I\2"+
		"\u0154\u0155\5\u00a1Q\2\u0155\u0156\5u;\2\u0156\u0157\5\u0097L\2\u0157"+
		"\u0158\5{>\2\u01588\3\2\2\2\u0159\u015a\5\u0099M\2\u015a\u015b\5\u008b"+
		"F\2\u015b\u015c\5}?\2\u015c\u015d\5}?\2\u015d\u015e\5\u0093J\2\u015e\u015f"+
		"\5\u00a5S\2\u015f:\3\2\2\2\u0160\u0161\5\u0087D\2\u0161\u0162\5\u009d"+
		"O\2\u0162\u0163\5\u008dG\2\u0163\u0164\5\u0093J\2\u0164\u0165\5\u00a5"+
		"S\2\u0165<\3\2\2\2\u0166\u0167\5y=\2\u0167\u0168\5\u009dO\2\u0168\u0169"+
		"\5\u0097L\2\u0169\u016a\5\u0097L\2\u016a\u016b\5}?\2\u016b\u016c\5\u008f"+
		"H\2\u016c\u016d\5\u009bN\2\u016d\u016e\5u;\2\u016e\u016f\5\u008fH\2\u016f"+
		"\u0170\5\u0085C\2\u0170\u0171\5\u008dG\2\u0171\u0172\5u;\2\u0172\u0173"+
		"\5\u008bF\2\u0173>\3\2\2\2\u0174\u0175\5y=\2\u0175\u0176\5\u009dO\2\u0176"+
		"\u0177\5\u0097L\2\u0177\u0178\5\u0097L\2\u0178\u0179\5}?\2\u0179\u017a"+
		"\5\u008fH\2\u017a\u017b\5\u009bN\2\u017b\u017c\5\u0085C\2\u017c\u017d"+
		"\5\u009bN\2\u017d\u017e\5}?\2\u017e\u017f\5\u008dG\2\u017f@\3\2\2\2\u0180"+
		"\u0181\5\u0093J\2\u0181\u0182\5\u008bF\2\u0182\u0183\5u;\2\u0183\u0184"+
		"\5y=\2\u0184\u0185\5}?\2\u0185\u0186\5{>\2\u0186\u0187\5\u0091I\2\u0187"+
		"\u0188\5\u008fH\2\u0188B\3\2\2\2\u0189\u018a\5\u0099M\2\u018a\u018b\5"+
		"\u009bN\2\u018b\u018c\5u;\2\u018c\u018d\5\u008fH\2\u018d\u018e\5{>\2\u018e"+
		"\u018f\5\u0085C\2\u018f\u0190\5\u008fH\2\u0190\u0191\5\u0081A\2\u0191"+
		"\u0192\5\u0091I\2\u0192\u0193\5\u008fH\2\u0193D\3\2\2\2\u0194\u0195\5"+
		"\u0099M\2\u0195\u0196\5\u008bF\2\u0196\u0197\5}?\2\u0197\u0198\5}?\2\u0198"+
		"\u0199\5\u0093J\2\u0199\u019a\5\u0085C\2\u019a\u019b\5\u008fH\2\u019b"+
		"\u019c\5\u0081A\2\u019c\u019d\5\u0085C\2\u019d\u019e\5\u008fH\2\u019e"+
		"F\3\2\2\2\u019f\u01a0\5\u008bF\2\u01a0\u01a1\5}?\2\u01a1\u01a2\5u;\2\u01a2"+
		"\u01a3\5{>\2\u01a3\u01a4\5}?\2\u01a4\u01a5\5\u0097L\2\u01a5\u01a6\5u;"+
		"\2\u01a6\u01a7\5\u008fH\2\u01a7\u01a8\5\u0085C\2\u01a8\u01a9\5\u008dG"+
		"\2\u01a9\u01aa\5u;\2\u01aa\u01ab\5\u008bF\2\u01abH\3\2\2\2\u01ac\u01ad"+
		"\5\u0081A\2\u01ad\u01ae\5\u009dO\2\u01ae\u01af\5\u0085C\2\u01af\u01b0"+
		"\5{>\2\u01b0\u01b1\5}?\2\u01b1\u01b2\5{>\2\u01b2\u01b3\5u;\2\u01b3\u01b4"+
		"\5\u008fH\2\u01b4\u01b5\5\u0085C\2\u01b5\u01b6\5\u008dG\2\u01b6\u01b7"+
		"\5u;\2\u01b7\u01b8\5\u008bF\2\u01b8J\3\2\2\2\u01b9\u01ba\5\u009bN\2\u01ba"+
		"\u01bb\5\u0083B\2\u01bb\u01bc\5}?\2\u01bc\u01bd\5\177@\2\u01bd\u01be\5"+
		"\u009bN\2\u01be\u01bf\5\u009bN\2\u01bf\u01c0\5\u0085C\2\u01c0\u01c1\5"+
		"\u008dG\2\u01c1\u01c2\5}?\2\u01c2\u01c3\5\u0097L\2\u01c3L\3\2\2\2\u01c4"+
		"\u01c5\5\u008fH\2\u01c5\u01c6\5\u009dO\2\u01c6\u01c7\5\u008bF\2\u01c7"+
		"\u01c8\5\u008bF\2\u01c8N\3\2\2\2\u01c9\u01ca\5\u00a1Q\2\u01ca\u01cb\5"+
		"\u0085C\2\u01cb\u01cc\5\u009bN\2\u01cc\u01cd\5\u0083B\2\u01cdP\3\2\2\2"+
		"\u01ce\u01cf\5\u0085C\2\u01cf\u01d0\5{>\2\u01d0R\3\2\2\2\u01d1\u01d2\5"+
		"\u0091I\2\u01d2\u01d3\5\u008fH\2\u01d3\u01d4\5\u009bN\2\u01d4\u01d5\5"+
		"\u0091I\2\u01d5T\3\2\2\2\u01d6\u01d7\5y=\2\u01d7\u01d8\5\u0091I\2\u01d8"+
		"\u01d9\5\u008fH\2\u01d9\u01da\5\u008fH\2\u01da\u01db\5}?\2\u01db\u01dc"+
		"\5y=\2\u01dc\u01dd\5\u009bN\2\u01dd\u01de\5}?\2\u01de\u01df\5{>\2\u01df"+
		"V\3\2\2\2\u01e0\u01e1\5w<\2\u01e1\u01e2\5\u00a5S\2\u01e2X\3\2\2\2\u01e3"+
		"\u01e5\5o8\2\u01e4\u01e3\3\2\2\2\u01e5\u01e6\3\2\2\2\u01e6\u01e4\3\2\2"+
		"\2\u01e6\u01e7\3\2\2\2\u01e7Z\3\2\2\2\u01e8\u01ea\t\2\2\2\u01e9\u01e8"+
		"\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01e9\3\2\2\2\u01eb\u01ec\3\2\2\2\u01ec"+
		"\u01ed\3\2\2\2\u01ed\u01ee\b.\2\2\u01ee\\\3\2\2\2\u01ef\u01f1\7\17\2\2"+
		"\u01f0\u01ef\3\2\2\2\u01f0\u01f1\3\2\2\2\u01f1\u01f2\3\2\2\2\u01f2\u01f3"+
		"\7\f\2\2\u01f3^\3\2\2\2\u01f4\u01f8\7%\2\2\u01f5\u01f7\n\3\2\2\u01f6\u01f5"+
		"\3\2\2\2\u01f7\u01fa\3\2\2\2\u01f8\u01f6\3\2\2\2\u01f8\u01f9\3\2\2\2\u01f9"+
		"\u01fb\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fb\u01fc\b\60\2\2\u01fc`\3\2\2\2"+
		"\u01fd\u01fe\7=\2\2\u01feb\3\2\2\2\u01ff\u0200\7*\2\2\u0200d\3\2\2\2\u0201"+
		"\u0202\7+\2\2\u0202f\3\2\2\2\u0203\u0204\7?\2\2\u0204h\3\2\2\2\u0205\u0206"+
		"\7\61\2\2\u0206j\3\2\2\2\u0207\u020a\5q9\2\u0208\u020a\5o8\2\u0209\u0207"+
		"\3\2\2\2\u0209\u0208\3\2\2\2\u020a\u020b\3\2\2\2\u020b\u0209\3\2\2\2\u020b"+
		"\u020c\3\2\2\2\u020cl\3\2\2\2\u020d\u020e\13\2\2\2\u020en\3\2\2\2\u020f"+
		"\u0210\t\4\2\2\u0210p\3\2\2\2\u0211\u0212\t\5\2\2\u0212r\3\2\2\2\u0213"+
		"\u0214\n\6\2\2\u0214t\3\2\2\2\u0215\u0216\t\7\2\2\u0216v\3\2\2\2\u0217"+
		"\u0218\t\b\2\2\u0218x\3\2\2\2\u0219\u021a\t\t\2\2\u021az\3\2\2\2\u021b"+
		"\u021c\t\n\2\2\u021c|\3\2\2\2\u021d\u021e\t\13\2\2\u021e~\3\2\2\2\u021f"+
		"\u0220\t\f\2\2\u0220\u0080\3\2\2\2\u0221\u0222\t\r\2\2\u0222\u0082\3\2"+
		"\2\2\u0223\u0224\t\16\2\2\u0224\u0084\3\2\2\2\u0225\u0226\t\17\2\2\u0226"+
		"\u0086\3\2\2\2\u0227\u0228\t\20\2\2\u0228\u0088\3\2\2\2\u0229\u022a\t"+
		"\21\2\2\u022a\u008a\3\2\2\2\u022b\u022c\t\22\2\2\u022c\u008c\3\2\2\2\u022d"+
		"\u022e\t\23\2\2\u022e\u008e\3\2\2\2\u022f\u0230\t\24\2\2\u0230\u0090\3"+
		"\2\2\2\u0231\u0232\t\25\2\2\u0232\u0092\3\2\2\2\u0233\u0234\t\26\2\2\u0234"+
		"\u0094\3\2\2\2\u0235\u0236\t\27\2\2\u0236\u0096\3\2\2\2\u0237\u0238\t"+
		"\30\2\2\u0238\u0098\3\2\2\2\u0239\u023a\t\31\2\2\u023a\u009a\3\2\2\2\u023b"+
		"\u023c\t\32\2\2\u023c\u009c\3\2\2\2\u023d\u023e\t\33\2\2\u023e\u009e\3"+
		"\2\2\2\u023f\u0240\t\34\2\2\u0240\u00a0\3\2\2\2\u0241\u0242\t\35\2\2\u0242"+
		"\u00a2\3\2\2\2\u0243\u0244\t\36\2\2\u0244\u00a4\3\2\2\2\u0245\u0246\t"+
		"\37\2\2\u0246\u00a6\3\2\2\2\u0247\u0248\t \2\2\u0248\u00a8\3\2\2\2\n\2"+
		"\u00c3\u01e6\u01eb\u01f0\u01f8\u0209\u020b\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}