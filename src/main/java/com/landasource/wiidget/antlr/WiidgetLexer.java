// Generated from C:\Users\Zsolti\Documents\GitHub\landasource\wiidget-core\src\main\java\com\landasource\wiidget\antlr\Wiidget.g4 by ANTLR 4.1
package com.landasource.wiidget.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WiidgetLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, LogicalOperator=2, MathematicalOperator=3, NegotionOperator=4, 
		CompareOperator=5, EqualityOperator=6, IMPORT=7, DEFAULT_OPERATOR=8, WiidgetVarSign=9, 
		IntegerLiteral=10, FloatingPointLiteral=11, BooleanLiteral=12, CharacterLiteral=13, 
		StringLiteral=14, NullLiteral=15, IF=16, FOREACH=17, ELSE=18, AS=19, LPAREN=20, 
		RPAREN=21, LBRACE=22, RBRACE=23, LBRACK=24, RBRACK=25, SEMI=26, COMMA=27, 
		DOT=28, ARROW=29, GT=30, LT=31, BANG=32, TILDE=33, QUESTION=34, COLON=35, 
		EQUAL=36, LE=37, GE=38, NOTEQUAL=39, AND=40, OR=41, INC=42, DEC=43, ADD=44, 
		SUB=45, ASSIGN=46, MUL=47, DIV=48, BITAND=49, BITOR=50, CARET=51, MOD=52, 
		ADD_ASSIGN=53, SUB_ASSIGN=54, MUL_ASSIGN=55, DIV_ASSIGN=56, AND_ASSIGN=57, 
		OR_ASSIGN=58, XOR_ASSIGN=59, MOD_ASSIGN=60, LSHIFT_ASSIGN=61, RSHIFT_ASSIGN=62, 
		URSHIFT_ASSIGN=63, Identifier=64, WS=65, COMMENT=66, LINE_COMMENT=67;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'`'", "LogicalOperator", "MathematicalOperator", "NegotionOperator", 
		"CompareOperator", "EqualityOperator", "'import'", "DEFAULT_OPERATOR", 
		"'$'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "'null'", "'if'", "'foreach'", "'else'", "'as'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'>'", 
		"'<'", "'!'", "TILDE", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'='", "'*'", "'/'", "'&'", "'|'", 
		"'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__0", "LogicalOperator", "MathematicalOperator", "NegotionOperator", 
		"CompareOperator", "EqualityOperator", "IMPORT", "DEFAULT_OPERATOR", "WiidgetVarSign", 
		"IntegerLiteral", "DecimalIntegerLiteral", "HexIntegerLiteral", "OctalIntegerLiteral", 
		"BinaryIntegerLiteral", "IntegerTypeSuffix", "DecimalNumeral", "Digits", 
		"Digit", "NonZeroDigit", "DigitsAndUnderscores", "DigitOrUnderscore", 
		"Underscores", "HexNumeral", "HexDigits", "HexDigit", "HexDigitsAndUnderscores", 
		"HexDigitOrUnderscore", "OctalNumeral", "OctalDigits", "OctalDigit", "OctalDigitsAndUnderscores", 
		"OctalDigitOrUnderscore", "BinaryNumeral", "BinaryDigits", "BinaryDigit", 
		"BinaryDigitsAndUnderscores", "BinaryDigitOrUnderscore", "FloatingPointLiteral", 
		"DecimalFloatingPointLiteral", "ExponentPart", "ExponentIndicator", "SignedInteger", 
		"Sign", "FloatTypeSuffix", "HexadecimalFloatingPointLiteral", "HexSignificand", 
		"BinaryExponent", "BinaryExponentIndicator", "BooleanLiteral", "CharacterLiteral", 
		"SingleCharacter", "StringLiteral", "StringCharacters", "StringCharacter", 
		"EscapeSequence", "OctalEscape", "UnicodeEscape", "ZeroToThree", "NullLiteral", 
		"IF", "FOREACH", "ELSE", "AS", "LPAREN", "RPAREN", "LBRACE", "RBRACE", 
		"LBRACK", "RBRACK", "SEMI", "COMMA", "DOT", "ARROW", "GT", "LT", "BANG", 
		"TILDE", "QUESTION", "COLON", "EQUAL", "LE", "GE", "NOTEQUAL", "AND", 
		"OR", "INC", "DEC", "ADD", "SUB", "ASSIGN", "MUL", "DIV", "BITAND", "BITOR", 
		"CARET", "MOD", "ADD_ASSIGN", "SUB_ASSIGN", "MUL_ASSIGN", "DIV_ASSIGN", 
		"AND_ASSIGN", "OR_ASSIGN", "XOR_ASSIGN", "MOD_ASSIGN", "LSHIFT_ASSIGN", 
		"RSHIFT_ASSIGN", "URSHIFT_ASSIGN", "Identifier", "AttributeCharacter", 
		"JavaLetter", "JavaLetterOrDigit", "WS", "COMMENT", "LINE_COMMENT"
	};


	public WiidgetLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Wiidget.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 111: WS_action((RuleContext)_localctx, actionIndex); break;

		case 112: COMMENT_action((RuleContext)_localctx, actionIndex); break;

		case 113: LINE_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip();  break;
		}
	}
	private void LINE_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 2: skip();  break;
		}
	}
	private void COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip();  break;
		}
	}
	@Override
	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 109: return JavaLetter_sempred((RuleContext)_localctx, predIndex);

		case 110: return JavaLetterOrDigit_sempred((RuleContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean JavaLetterOrDigit_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2: return Character.isJavaIdentifierPart(_input.LA(-1));

		case 3: return Character.isJavaIdentifierPart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}
	private boolean JavaLetter_sempred(RuleContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return Character.isJavaIdentifierStart(_input.LA(-1));

		case 1: return Character.isJavaIdentifierStart(Character.toCodePoint((char)_input.LA(-2), (char)_input.LA(-1)));
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\2E\u02d8\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\3\2\3\2\3\3\3\3\3\3"+
		"\3\3\5\3\u00ee\n\3\3\4\3\4\3\5\3\5\3\6\3\6\3\6\3\6\3\6\5\6\u00f9\n\6\3"+
		"\7\3\7\3\7\3\7\5\7\u00ff\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\13\3\13\3\13\3\13\5\13\u0110\n\13\3\f\3\f\5\f\u0114\n\f\3\r\3\r\5"+
		"\r\u0118\n\r\3\16\3\16\5\16\u011c\n\16\3\17\3\17\5\17\u0120\n\17\3\20"+
		"\3\20\3\21\3\21\3\21\5\21\u0127\n\21\3\21\3\21\3\21\5\21\u012c\n\21\5"+
		"\21\u012e\n\21\3\22\3\22\5\22\u0132\n\22\3\22\5\22\u0135\n\22\3\23\3\23"+
		"\5\23\u0139\n\23\3\24\3\24\3\25\6\25\u013e\n\25\r\25\16\25\u013f\3\26"+
		"\3\26\5\26\u0144\n\26\3\27\6\27\u0147\n\27\r\27\16\27\u0148\3\30\3\30"+
		"\3\30\3\30\3\31\3\31\5\31\u0151\n\31\3\31\5\31\u0154\n\31\3\32\3\32\3"+
		"\33\6\33\u0159\n\33\r\33\16\33\u015a\3\34\3\34\5\34\u015f\n\34\3\35\3"+
		"\35\5\35\u0163\n\35\3\35\3\35\3\36\3\36\5\36\u0169\n\36\3\36\5\36\u016c"+
		"\n\36\3\37\3\37\3 \6 \u0171\n \r \16 \u0172\3!\3!\5!\u0177\n!\3\"\3\""+
		"\3\"\3\"\3#\3#\5#\u017f\n#\3#\5#\u0182\n#\3$\3$\3%\6%\u0187\n%\r%\16%"+
		"\u0188\3&\3&\5&\u018d\n&\3\'\3\'\5\'\u0191\n\'\3(\3(\3(\5(\u0196\n(\3"+
		"(\5(\u0199\n(\3(\5(\u019c\n(\3(\3(\3(\5(\u01a1\n(\3(\5(\u01a4\n(\3(\3"+
		"(\3(\5(\u01a9\n(\3(\3(\3(\5(\u01ae\n(\3)\3)\3)\3*\3*\3+\5+\u01b6\n+\3"+
		"+\3+\3,\3,\3-\3-\3.\3.\3.\5.\u01c1\n.\3/\3/\5/\u01c5\n/\3/\3/\3/\5/\u01ca"+
		"\n/\3/\3/\5/\u01ce\n/\3\60\3\60\3\60\3\61\3\61\3\62\3\62\3\62\3\62\3\62"+
		"\3\62\3\62\3\62\3\62\5\62\u01de\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\3\63\5\63\u01e8\n\63\3\64\3\64\3\65\3\65\5\65\u01ee\n\65\3\65\3\65\3"+
		"\66\6\66\u01f3\n\66\r\66\16\66\u01f4\3\67\3\67\5\67\u01f9\n\67\38\38\3"+
		"8\38\58\u01ff\n8\39\39\39\39\39\39\39\39\39\39\39\59\u020c\n9\3:\3:\3"+
		":\3:\3:\3:\3:\3;\3;\3<\3<\3<\3<\3<\3=\3=\3=\3>\3>\3>\3>\3>\3>\3>\3>\3"+
		"?\3?\3?\3?\3?\3@\3@\3@\3A\3A\3B\3B\3C\3C\3D\3D\3E\3E\3F\3F\3G\3G\3H\3"+
		"H\3I\3I\3J\3J\3J\3K\3K\3L\3L\3M\3M\3N\3N\3O\3O\3P\3P\3Q\3Q\3Q\3R\3R\3"+
		"R\3S\3S\3S\3T\3T\3T\3U\3U\3U\3V\3V\3V\3W\3W\3W\3X\3X\3X\3Y\3Y\3Z\3Z\3"+
		"[\3[\3\\\3\\\3]\3]\3^\3^\3_\3_\3`\3`\3a\3a\3b\3b\3b\3c\3c\3c\3d\3d\3d"+
		"\3e\3e\3e\3f\3f\3f\3g\3g\3g\3h\3h\3h\3i\3i\3i\3j\3j\3j\3j\3k\3k\3k\3k"+
		"\3l\3l\3l\3l\3l\3m\3m\7m\u02a1\nm\fm\16m\u02a4\13m\3n\5n\u02a7\nn\3o\3"+
		"o\3o\3o\3o\3o\5o\u02af\no\3p\3p\3p\3p\3p\3p\5p\u02b7\np\3q\6q\u02ba\n"+
		"q\rq\16q\u02bb\3q\3q\3r\3r\3r\3r\7r\u02c4\nr\fr\16r\u02c7\13r\3r\3r\3"+
		"r\3r\3r\3s\3s\3s\3s\7s\u02d2\ns\fs\16s\u02d5\13s\3s\3s\3\u02c5t\3\3\1"+
		"\5\4\1\7\5\1\t\6\1\13\7\1\r\b\1\17\t\1\21\n\1\23\13\1\25\f\1\27\2\1\31"+
		"\2\1\33\2\1\35\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\2\1-\2\1/\2\1\61"+
		"\2\1\63\2\1\65\2\1\67\2\19\2\1;\2\1=\2\1?\2\1A\2\1C\2\1E\2\1G\2\1I\2\1"+
		"K\2\1M\r\1O\2\1Q\2\1S\2\1U\2\1W\2\1Y\2\1[\2\1]\2\1_\2\1a\2\1c\16\1e\17"+
		"\1g\2\1i\20\1k\2\1m\2\1o\2\1q\2\1s\2\1u\2\1w\21\1y\22\1{\23\1}\24\1\177"+
		"\25\1\u0081\26\1\u0083\27\1\u0085\30\1\u0087\31\1\u0089\32\1\u008b\33"+
		"\1\u008d\34\1\u008f\35\1\u0091\36\1\u0093\37\1\u0095 \1\u0097!\1\u0099"+
		"\"\1\u009b#\1\u009d$\1\u009f%\1\u00a1&\1\u00a3\'\1\u00a5(\1\u00a7)\1\u00a9"+
		"*\1\u00ab+\1\u00ad,\1\u00af-\1\u00b1.\1\u00b3/\1\u00b5\60\1\u00b7\61\1"+
		"\u00b9\62\1\u00bb\63\1\u00bd\64\1\u00bf\65\1\u00c1\66\1\u00c3\67\1\u00c5"+
		"8\1\u00c79\1\u00c9:\1\u00cb;\1\u00cd<\1\u00cf=\1\u00d1>\1\u00d3?\1\u00d5"+
		"@\1\u00d7A\1\u00d9B\1\u00db\2\1\u00dd\2\1\u00df\2\1\u00e1C\2\u00e3D\3"+
		"\u00e5E\4\3\2\33\6\2\'\',-//\61\61\4\2>>@@\4\2NNnn\3\2\63;\4\2ZZzz\5\2"+
		"\62;CHch\3\2\629\4\2DDdd\3\2\62\63\4\2GGgg\4\2--//\6\2FFHHffhh\4\2RRr"+
		"r\4\2))^^\4\2$$^^\n\2$$))^^ddhhppttvv\3\2\62\65\7\2//\62<C\\aac|\5\2C"+
		"\\aac|\4\2\2\u0101\ud802\udc01\3\2\ud802\udc01\3\2\udc02\ue001\7\2&&\62"+
		";C\\aac|\5\2\13\f\16\17\"\"\4\2\f\f\17\17\u02e9\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2M\3\2\2\2\2c\3\2\2\2\2e\3\2\2\2\2"+
		"i\3\2\2\2\2w\3\2\2\2\2y\3\2\2\2\2{\3\2\2\2\2}\3\2\2\2\2\177\3\2\2\2\2"+
		"\u0081\3\2\2\2\2\u0083\3\2\2\2\2\u0085\3\2\2\2\2\u0087\3\2\2\2\2\u0089"+
		"\3\2\2\2\2\u008b\3\2\2\2\2\u008d\3\2\2\2\2\u008f\3\2\2\2\2\u0091\3\2\2"+
		"\2\2\u0093\3\2\2\2\2\u0095\3\2\2\2\2\u0097\3\2\2\2\2\u0099\3\2\2\2\2\u009b"+
		"\3\2\2\2\2\u009d\3\2\2\2\2\u009f\3\2\2\2\2\u00a1\3\2\2\2\2\u00a3\3\2\2"+
		"\2\2\u00a5\3\2\2\2\2\u00a7\3\2\2\2\2\u00a9\3\2\2\2\2\u00ab\3\2\2\2\2\u00ad"+
		"\3\2\2\2\2\u00af\3\2\2\2\2\u00b1\3\2\2\2\2\u00b3\3\2\2\2\2\u00b5\3\2\2"+
		"\2\2\u00b7\3\2\2\2\2\u00b9\3\2\2\2\2\u00bb\3\2\2\2\2\u00bd\3\2\2\2\2\u00bf"+
		"\3\2\2\2\2\u00c1\3\2\2\2\2\u00c3\3\2\2\2\2\u00c5\3\2\2\2\2\u00c7\3\2\2"+
		"\2\2\u00c9\3\2\2\2\2\u00cb\3\2\2\2\2\u00cd\3\2\2\2\2\u00cf\3\2\2\2\2\u00d1"+
		"\3\2\2\2\2\u00d3\3\2\2\2\2\u00d5\3\2\2\2\2\u00d7\3\2\2\2\2\u00d9\3\2\2"+
		"\2\2\u00e1\3\2\2\2\2\u00e3\3\2\2\2\2\u00e5\3\2\2\2\3\u00e7\3\2\2\2\5\u00ed"+
		"\3\2\2\2\7\u00ef\3\2\2\2\t\u00f1\3\2\2\2\13\u00f8\3\2\2\2\r\u00fe\3\2"+
		"\2\2\17\u0100\3\2\2\2\21\u0107\3\2\2\2\23\u0109\3\2\2\2\25\u010f\3\2\2"+
		"\2\27\u0111\3\2\2\2\31\u0115\3\2\2\2\33\u0119\3\2\2\2\35\u011d\3\2\2\2"+
		"\37\u0121\3\2\2\2!\u012d\3\2\2\2#\u012f\3\2\2\2%\u0138\3\2\2\2\'\u013a"+
		"\3\2\2\2)\u013d\3\2\2\2+\u0143\3\2\2\2-\u0146\3\2\2\2/\u014a\3\2\2\2\61"+
		"\u014e\3\2\2\2\63\u0155\3\2\2\2\65\u0158\3\2\2\2\67\u015e\3\2\2\29\u0160"+
		"\3\2\2\2;\u0166\3\2\2\2=\u016d\3\2\2\2?\u0170\3\2\2\2A\u0176\3\2\2\2C"+
		"\u0178\3\2\2\2E\u017c\3\2\2\2G\u0183\3\2\2\2I\u0186\3\2\2\2K\u018c\3\2"+
		"\2\2M\u0190\3\2\2\2O\u01ad\3\2\2\2Q\u01af\3\2\2\2S\u01b2\3\2\2\2U\u01b5"+
		"\3\2\2\2W\u01b9\3\2\2\2Y\u01bb\3\2\2\2[\u01bd\3\2\2\2]\u01cd\3\2\2\2_"+
		"\u01cf\3\2\2\2a\u01d2\3\2\2\2c\u01dd\3\2\2\2e\u01e7\3\2\2\2g\u01e9\3\2"+
		"\2\2i\u01eb\3\2\2\2k\u01f2\3\2\2\2m\u01f8\3\2\2\2o\u01fe\3\2\2\2q\u020b"+
		"\3\2\2\2s\u020d\3\2\2\2u\u0214\3\2\2\2w\u0216\3\2\2\2y\u021b\3\2\2\2{"+
		"\u021e\3\2\2\2}\u0226\3\2\2\2\177\u022b\3\2\2\2\u0081\u022e\3\2\2\2\u0083"+
		"\u0230\3\2\2\2\u0085\u0232\3\2\2\2\u0087\u0234\3\2\2\2\u0089\u0236\3\2"+
		"\2\2\u008b\u0238\3\2\2\2\u008d\u023a\3\2\2\2\u008f\u023c\3\2\2\2\u0091"+
		"\u023e\3\2\2\2\u0093\u0240\3\2\2\2\u0095\u0243\3\2\2\2\u0097\u0245\3\2"+
		"\2\2\u0099\u0247\3\2\2\2\u009b\u0249\3\2\2\2\u009d\u024b\3\2\2\2\u009f"+
		"\u024d\3\2\2\2\u00a1\u024f\3\2\2\2\u00a3\u0252\3\2\2\2\u00a5\u0255\3\2"+
		"\2\2\u00a7\u0258\3\2\2\2\u00a9\u025b\3\2\2\2\u00ab\u025e\3\2\2\2\u00ad"+
		"\u0261\3\2\2\2\u00af\u0264\3\2\2\2\u00b1\u0267\3\2\2\2\u00b3\u0269\3\2"+
		"\2\2\u00b5\u026b\3\2\2\2\u00b7\u026d\3\2\2\2\u00b9\u026f\3\2\2\2\u00bb"+
		"\u0271\3\2\2\2\u00bd\u0273\3\2\2\2\u00bf\u0275\3\2\2\2\u00c1\u0277\3\2"+
		"\2\2\u00c3\u0279\3\2\2\2\u00c5\u027c\3\2\2\2\u00c7\u027f\3\2\2\2\u00c9"+
		"\u0282\3\2\2\2\u00cb\u0285\3\2\2\2\u00cd\u0288\3\2\2\2\u00cf\u028b\3\2"+
		"\2\2\u00d1\u028e\3\2\2\2\u00d3\u0291\3\2\2\2\u00d5\u0295\3\2\2\2\u00d7"+
		"\u0299\3\2\2\2\u00d9\u029e\3\2\2\2\u00db\u02a6\3\2\2\2\u00dd\u02ae\3\2"+
		"\2\2\u00df\u02b6\3\2\2\2\u00e1\u02b9\3\2\2\2\u00e3\u02bf\3\2\2\2\u00e5"+
		"\u02cd\3\2\2\2\u00e7\u00e8\7b\2\2\u00e8\4\3\2\2\2\u00e9\u00ea\7(\2\2\u00ea"+
		"\u00ee\7(\2\2\u00eb\u00ec\7~\2\2\u00ec\u00ee\7~\2\2\u00ed\u00e9\3\2\2"+
		"\2\u00ed\u00eb\3\2\2\2\u00ee\6\3\2\2\2\u00ef\u00f0\t\2\2\2\u00f0\b\3\2"+
		"\2\2\u00f1\u00f2\7#\2\2\u00f2\n\3\2\2\2\u00f3\u00f4\7>\2\2\u00f4\u00f9"+
		"\7?\2\2\u00f5\u00f6\7@\2\2\u00f6\u00f9\7?\2\2\u00f7\u00f9\t\3\2\2\u00f8"+
		"\u00f3\3\2\2\2\u00f8\u00f5\3\2\2\2\u00f8\u00f7\3\2\2\2\u00f9\f\3\2\2\2"+
		"\u00fa\u00fb\7?\2\2\u00fb\u00ff\7?\2\2\u00fc\u00fd\7#\2\2\u00fd\u00ff"+
		"\7?\2\2\u00fe\u00fa\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\16\3\2\2\2\u0100"+
		"\u0101\7k\2\2\u0101\u0102\7o\2\2\u0102\u0103\7r\2\2\u0103\u0104\7q\2\2"+
		"\u0104\u0105\7t\2\2\u0105\u0106\7v\2\2\u0106\20\3\2\2\2\u0107\u0108\7"+
		"\u0080\2\2\u0108\22\3\2\2\2\u0109\u010a\7&\2\2\u010a\24\3\2\2\2\u010b"+
		"\u0110\5\27\f\2\u010c\u0110\5\31\r\2\u010d\u0110\5\33\16\2\u010e\u0110"+
		"\5\35\17\2\u010f\u010b\3\2\2\2\u010f\u010c\3\2\2\2\u010f\u010d\3\2\2\2"+
		"\u010f\u010e\3\2\2\2\u0110\26\3\2\2\2\u0111\u0113\5!\21\2\u0112\u0114"+
		"\5\37\20\2\u0113\u0112\3\2\2\2\u0113\u0114\3\2\2\2\u0114\30\3\2\2\2\u0115"+
		"\u0117\5/\30\2\u0116\u0118\5\37\20\2\u0117\u0116\3\2\2\2\u0117\u0118\3"+
		"\2\2\2\u0118\32\3\2\2\2\u0119\u011b\59\35\2\u011a\u011c\5\37\20\2\u011b"+
		"\u011a\3\2\2\2\u011b\u011c\3\2\2\2\u011c\34\3\2\2\2\u011d\u011f\5C\"\2"+
		"\u011e\u0120\5\37\20\2\u011f\u011e\3\2\2\2\u011f\u0120\3\2\2\2\u0120\36"+
		"\3\2\2\2\u0121\u0122\t\4\2\2\u0122 \3\2\2\2\u0123\u012e\7\62\2\2\u0124"+
		"\u012b\5\'\24\2\u0125\u0127\5#\22\2\u0126\u0125\3\2\2\2\u0126\u0127\3"+
		"\2\2\2\u0127\u012c\3\2\2\2\u0128\u0129\5-\27\2\u0129\u012a\5#\22\2\u012a"+
		"\u012c\3\2\2\2\u012b\u0126\3\2\2\2\u012b\u0128\3\2\2\2\u012c\u012e\3\2"+
		"\2\2\u012d\u0123\3\2\2\2\u012d\u0124\3\2\2\2\u012e\"\3\2\2\2\u012f\u0134"+
		"\5%\23\2\u0130\u0132\5)\25\2\u0131\u0130\3\2\2\2\u0131\u0132\3\2\2\2\u0132"+
		"\u0133\3\2\2\2\u0133\u0135\5%\23\2\u0134\u0131\3\2\2\2\u0134\u0135\3\2"+
		"\2\2\u0135$\3\2\2\2\u0136\u0139\7\62\2\2\u0137\u0139\5\'\24\2\u0138\u0136"+
		"\3\2\2\2\u0138\u0137\3\2\2\2\u0139&\3\2\2\2\u013a\u013b\t\5\2\2\u013b"+
		"(\3\2\2\2\u013c\u013e\5+\26\2\u013d\u013c\3\2\2\2\u013e\u013f\3\2\2\2"+
		"\u013f\u013d\3\2\2\2\u013f\u0140\3\2\2\2\u0140*\3\2\2\2\u0141\u0144\5"+
		"%\23\2\u0142\u0144\7a\2\2\u0143\u0141\3\2\2\2\u0143\u0142\3\2\2\2\u0144"+
		",\3\2\2\2\u0145\u0147\7a\2\2\u0146\u0145\3\2\2\2\u0147\u0148\3\2\2\2\u0148"+
		"\u0146\3\2\2\2\u0148\u0149\3\2\2\2\u0149.\3\2\2\2\u014a\u014b\7\62\2\2"+
		"\u014b\u014c\t\6\2\2\u014c\u014d\5\61\31\2\u014d\60\3\2\2\2\u014e\u0153"+
		"\5\63\32\2\u014f\u0151\5\65\33\2\u0150\u014f\3\2\2\2\u0150\u0151\3\2\2"+
		"\2\u0151\u0152\3\2\2\2\u0152\u0154\5\63\32\2\u0153\u0150\3\2\2\2\u0153"+
		"\u0154\3\2\2\2\u0154\62\3\2\2\2\u0155\u0156\t\7\2\2\u0156\64\3\2\2\2\u0157"+
		"\u0159\5\67\34\2\u0158\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u0158\3"+
		"\2\2\2\u015a\u015b\3\2\2\2\u015b\66\3\2\2\2\u015c\u015f\5\63\32\2\u015d"+
		"\u015f\7a\2\2\u015e\u015c\3\2\2\2\u015e\u015d\3\2\2\2\u015f8\3\2\2\2\u0160"+
		"\u0162\7\62\2\2\u0161\u0163\5-\27\2\u0162\u0161\3\2\2\2\u0162\u0163\3"+
		"\2\2\2\u0163\u0164\3\2\2\2\u0164\u0165\5;\36\2\u0165:\3\2\2\2\u0166\u016b"+
		"\5=\37\2\u0167\u0169\5? \2\u0168\u0167\3\2\2\2\u0168\u0169\3\2\2\2\u0169"+
		"\u016a\3\2\2\2\u016a\u016c\5=\37\2\u016b\u0168\3\2\2\2\u016b\u016c\3\2"+
		"\2\2\u016c<\3\2\2\2\u016d\u016e\t\b\2\2\u016e>\3\2\2\2\u016f\u0171\5A"+
		"!\2\u0170\u016f\3\2\2\2\u0171\u0172\3\2\2\2\u0172\u0170\3\2\2\2\u0172"+
		"\u0173\3\2\2\2\u0173@\3\2\2\2\u0174\u0177\5=\37\2\u0175\u0177\7a\2\2\u0176"+
		"\u0174\3\2\2\2\u0176\u0175\3\2\2\2\u0177B\3\2\2\2\u0178\u0179\7\62\2\2"+
		"\u0179\u017a\t\t\2\2\u017a\u017b\5E#\2\u017bD\3\2\2\2\u017c\u0181\5G$"+
		"\2\u017d\u017f\5I%\2\u017e\u017d\3\2\2\2\u017e\u017f\3\2\2\2\u017f\u0180"+
		"\3\2\2\2\u0180\u0182\5G$\2\u0181\u017e\3\2\2\2\u0181\u0182\3\2\2\2\u0182"+
		"F\3\2\2\2\u0183\u0184\t\n\2\2\u0184H\3\2\2\2\u0185\u0187\5K&\2\u0186\u0185"+
		"\3\2\2\2\u0187\u0188\3\2\2\2\u0188\u0186\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"J\3\2\2\2\u018a\u018d\5G$\2\u018b\u018d\7a\2\2\u018c\u018a\3\2\2\2\u018c"+
		"\u018b\3\2\2\2\u018dL\3\2\2\2\u018e\u0191\5O(\2\u018f\u0191\5[.\2\u0190"+
		"\u018e\3\2\2\2\u0190\u018f\3\2\2\2\u0191N\3\2\2\2\u0192\u0193\5#\22\2"+
		"\u0193\u0195\7\60\2\2\u0194\u0196\5#\22\2\u0195\u0194\3\2\2\2\u0195\u0196"+
		"\3\2\2\2\u0196\u0198\3\2\2\2\u0197\u0199\5Q)\2\u0198\u0197\3\2\2\2\u0198"+
		"\u0199\3\2\2\2\u0199\u019b\3\2\2\2\u019a\u019c\5Y-\2\u019b\u019a\3\2\2"+
		"\2\u019b\u019c\3\2\2\2\u019c\u01ae\3\2\2\2\u019d\u019e\7\60\2\2\u019e"+
		"\u01a0\5#\22\2\u019f\u01a1\5Q)\2\u01a0\u019f\3\2\2\2\u01a0\u01a1\3\2\2"+
		"\2\u01a1\u01a3\3\2\2\2\u01a2\u01a4\5Y-\2\u01a3\u01a2\3\2\2\2\u01a3\u01a4"+
		"\3\2\2\2\u01a4\u01ae\3\2\2\2\u01a5\u01a6\5#\22\2\u01a6\u01a8\5Q)\2\u01a7"+
		"\u01a9\5Y-\2\u01a8\u01a7\3\2\2\2\u01a8\u01a9\3\2\2\2\u01a9\u01ae\3\2\2"+
		"\2\u01aa\u01ab\5#\22\2\u01ab\u01ac\5Y-\2\u01ac\u01ae\3\2\2\2\u01ad\u0192"+
		"\3\2\2\2\u01ad\u019d\3\2\2\2\u01ad\u01a5\3\2\2\2\u01ad\u01aa\3\2\2\2\u01ae"+
		"P\3\2\2\2\u01af\u01b0\5S*\2\u01b0\u01b1\5U+\2\u01b1R\3\2\2\2\u01b2\u01b3"+
		"\t\13\2\2\u01b3T\3\2\2\2\u01b4\u01b6\5W,\2\u01b5\u01b4\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01b8\5#\22\2\u01b8V\3\2\2\2\u01b9"+
		"\u01ba\t\f\2\2\u01baX\3\2\2\2\u01bb\u01bc\t\r\2\2\u01bcZ\3\2\2\2\u01bd"+
		"\u01be\5]/\2\u01be\u01c0\5_\60\2\u01bf\u01c1\5Y-\2\u01c0\u01bf\3\2\2\2"+
		"\u01c0\u01c1\3\2\2\2\u01c1\\\3\2\2\2\u01c2\u01c4\5/\30\2\u01c3\u01c5\7"+
		"\60\2\2\u01c4\u01c3\3\2\2\2\u01c4\u01c5\3\2\2\2\u01c5\u01ce\3\2\2\2\u01c6"+
		"\u01c7\7\62\2\2\u01c7\u01c9\t\6\2\2\u01c8\u01ca\5\61\31\2\u01c9\u01c8"+
		"\3\2\2\2\u01c9\u01ca\3\2\2\2\u01ca\u01cb\3\2\2\2\u01cb\u01cc\7\60\2\2"+
		"\u01cc\u01ce\5\61\31\2\u01cd\u01c2\3\2\2\2\u01cd\u01c6\3\2\2\2\u01ce^"+
		"\3\2\2\2\u01cf\u01d0\5a\61\2\u01d0\u01d1\5U+\2\u01d1`\3\2\2\2\u01d2\u01d3"+
		"\t\16\2\2\u01d3b\3\2\2\2\u01d4\u01d5\7v\2\2\u01d5\u01d6\7t\2\2\u01d6\u01d7"+
		"\7w\2\2\u01d7\u01de\7g\2\2\u01d8\u01d9\7h\2\2\u01d9\u01da\7c\2\2\u01da"+
		"\u01db\7n\2\2\u01db\u01dc\7u\2\2\u01dc\u01de\7g\2\2\u01dd\u01d4\3\2\2"+
		"\2\u01dd\u01d8\3\2\2\2\u01ded\3\2\2\2\u01df\u01e0\7)\2\2\u01e0\u01e1\5"+
		"g\64\2\u01e1\u01e2\7)\2\2\u01e2\u01e8\3\2\2\2\u01e3\u01e4\7)\2\2\u01e4"+
		"\u01e5\5o8\2\u01e5\u01e6\7)\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01df\3\2\2"+
		"\2\u01e7\u01e3\3\2\2\2\u01e8f\3\2\2\2\u01e9\u01ea\n\17\2\2\u01eah\3\2"+
		"\2\2\u01eb\u01ed\7$\2\2\u01ec\u01ee\5k\66\2\u01ed\u01ec\3\2\2\2\u01ed"+
		"\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef\u01f0\7$\2\2\u01f0j\3\2\2\2\u01f1"+
		"\u01f3\5m\67\2\u01f2\u01f1\3\2\2\2\u01f3\u01f4\3\2\2\2\u01f4\u01f2\3\2"+
		"\2\2\u01f4\u01f5\3\2\2\2\u01f5l\3\2\2\2\u01f6\u01f9\n\20\2\2\u01f7\u01f9"+
		"\5o8\2\u01f8\u01f6\3\2\2\2\u01f8\u01f7\3\2\2\2\u01f9n\3\2\2\2\u01fa\u01fb"+
		"\7^\2\2\u01fb\u01ff\t\21\2\2\u01fc\u01ff\5q9\2\u01fd\u01ff\5s:\2\u01fe"+
		"\u01fa\3\2\2\2\u01fe\u01fc\3\2\2\2\u01fe\u01fd\3\2\2\2\u01ffp\3\2\2\2"+
		"\u0200\u0201\7^\2\2\u0201\u020c\5=\37\2\u0202\u0203\7^\2\2\u0203\u0204"+
		"\5=\37\2\u0204\u0205\5=\37\2\u0205\u020c\3\2\2\2\u0206\u0207\7^\2\2\u0207"+
		"\u0208\5u;\2\u0208\u0209\5=\37\2\u0209\u020a\5=\37\2\u020a\u020c\3\2\2"+
		"\2\u020b\u0200\3\2\2\2\u020b\u0202\3\2\2\2\u020b\u0206\3\2\2\2\u020cr"+
		"\3\2\2\2\u020d\u020e\7^\2\2\u020e\u020f\7w\2\2\u020f\u0210\5\63\32\2\u0210"+
		"\u0211\5\63\32\2\u0211\u0212\5\63\32\2\u0212\u0213\5\63\32\2\u0213t\3"+
		"\2\2\2\u0214\u0215\t\22\2\2\u0215v\3\2\2\2\u0216\u0217\7p\2\2\u0217\u0218"+
		"\7w\2\2\u0218\u0219\7n\2\2\u0219\u021a\7n\2\2\u021ax\3\2\2\2\u021b\u021c"+
		"\7k\2\2\u021c\u021d\7h\2\2\u021dz\3\2\2\2\u021e\u021f\7h\2\2\u021f\u0220"+
		"\7q\2\2\u0220\u0221\7t\2\2\u0221\u0222\7g\2\2\u0222\u0223\7c\2\2\u0223"+
		"\u0224\7e\2\2\u0224\u0225\7j\2\2\u0225|\3\2\2\2\u0226\u0227\7g\2\2\u0227"+
		"\u0228\7n\2\2\u0228\u0229\7u\2\2\u0229\u022a\7g\2\2\u022a~\3\2\2\2\u022b"+
		"\u022c\7c\2\2\u022c\u022d\7u\2\2\u022d\u0080\3\2\2\2\u022e\u022f\7*\2"+
		"\2\u022f\u0082\3\2\2\2\u0230\u0231\7+\2\2\u0231\u0084\3\2\2\2\u0232\u0233"+
		"\7}\2\2\u0233\u0086\3\2\2\2\u0234\u0235\7\177\2\2\u0235\u0088\3\2\2\2"+
		"\u0236\u0237\7]\2\2\u0237\u008a\3\2\2\2\u0238\u0239\7_\2\2\u0239\u008c"+
		"\3\2\2\2\u023a\u023b\7=\2\2\u023b\u008e\3\2\2\2\u023c\u023d\7.\2\2\u023d"+
		"\u0090\3\2\2\2\u023e\u023f\7\60\2\2\u023f\u0092\3\2\2\2\u0240\u0241\7"+
		"/\2\2\u0241\u0242\7@\2\2\u0242\u0094\3\2\2\2\u0243\u0244\7@\2\2\u0244"+
		"\u0096\3\2\2\2\u0245\u0246\7>\2\2\u0246\u0098\3\2\2\2\u0247\u0248\7#\2"+
		"\2\u0248\u009a\3\2\2\2\u0249\u024a\7\u0080\2\2\u024a\u009c\3\2\2\2\u024b"+
		"\u024c\7A\2\2\u024c\u009e\3\2\2\2\u024d\u024e\7<\2\2\u024e\u00a0\3\2\2"+
		"\2\u024f\u0250\7?\2\2\u0250\u0251\7?\2\2\u0251\u00a2\3\2\2\2\u0252\u0253"+
		"\7>\2\2\u0253\u0254\7?\2\2\u0254\u00a4\3\2\2\2\u0255\u0256\7@\2\2\u0256"+
		"\u0257\7?\2\2\u0257\u00a6\3\2\2\2\u0258\u0259\7#\2\2\u0259\u025a\7?\2"+
		"\2\u025a\u00a8\3\2\2\2\u025b\u025c\7(\2\2\u025c\u025d\7(\2\2\u025d\u00aa"+
		"\3\2\2\2\u025e\u025f\7~\2\2\u025f\u0260\7~\2\2\u0260\u00ac\3\2\2\2\u0261"+
		"\u0262\7-\2\2\u0262\u0263\7-\2\2\u0263\u00ae\3\2\2\2\u0264\u0265\7/\2"+
		"\2\u0265\u0266\7/\2\2\u0266\u00b0\3\2\2\2\u0267\u0268\7-\2\2\u0268\u00b2"+
		"\3\2\2\2\u0269\u026a\7/\2\2\u026a\u00b4\3\2\2\2\u026b\u026c\7?\2\2\u026c"+
		"\u00b6\3\2\2\2\u026d\u026e\7,\2\2\u026e\u00b8\3\2\2\2\u026f\u0270\7\61"+
		"\2\2\u0270\u00ba\3\2\2\2\u0271\u0272\7(\2\2\u0272\u00bc\3\2\2\2\u0273"+
		"\u0274\7~\2\2\u0274\u00be\3\2\2\2\u0275\u0276\7`\2\2\u0276\u00c0\3\2\2"+
		"\2\u0277\u0278\7\'\2\2\u0278\u00c2\3\2\2\2\u0279\u027a\7-\2\2\u027a\u027b"+
		"\7?\2\2\u027b\u00c4\3\2\2\2\u027c\u027d\7/\2\2\u027d\u027e\7?\2\2\u027e"+
		"\u00c6\3\2\2\2\u027f\u0280\7,\2\2\u0280\u0281\7?\2\2\u0281\u00c8\3\2\2"+
		"\2\u0282\u0283\7\61\2\2\u0283\u0284\7?\2\2\u0284\u00ca\3\2\2\2\u0285\u0286"+
		"\7(\2\2\u0286\u0287\7?\2\2\u0287\u00cc\3\2\2\2\u0288\u0289\7~\2\2\u0289"+
		"\u028a\7?\2\2\u028a\u00ce\3\2\2\2\u028b\u028c\7`\2\2\u028c\u028d\7?\2"+
		"\2\u028d\u00d0\3\2\2\2\u028e\u028f\7\'\2\2\u028f\u0290\7?\2\2\u0290\u00d2"+
		"\3\2\2\2\u0291\u0292\7>\2\2\u0292\u0293\7>\2\2\u0293\u0294\7?\2\2\u0294"+
		"\u00d4\3\2\2\2\u0295\u0296\7@\2\2\u0296\u0297\7@\2\2\u0297\u0298\7?\2"+
		"\2\u0298\u00d6\3\2\2\2\u0299\u029a\7@\2\2\u029a\u029b\7@\2\2\u029b\u029c"+
		"\7@\2\2\u029c\u029d\7?\2\2\u029d\u00d8\3\2\2\2\u029e\u02a2\5\u00ddo\2"+
		"\u029f\u02a1\5\u00dfp\2\u02a0\u029f\3\2\2\2\u02a1\u02a4\3\2\2\2\u02a2"+
		"\u02a0\3\2\2\2\u02a2\u02a3\3\2\2\2\u02a3\u00da\3\2\2\2\u02a4\u02a2\3\2"+
		"\2\2\u02a5\u02a7\t\23\2\2\u02a6\u02a5\3\2\2\2\u02a7\u00dc\3\2\2\2\u02a8"+
		"\u02af\t\24\2\2\u02a9\u02aa\n\25\2\2\u02aa\u02af\6o\2\2\u02ab\u02ac\t"+
		"\26\2\2\u02ac\u02ad\t\27\2\2\u02ad\u02af\6o\3\2\u02ae\u02a8\3\2\2\2\u02ae"+
		"\u02a9\3\2\2\2\u02ae\u02ab\3\2\2\2\u02af\u00de\3\2\2\2\u02b0\u02b7\t\30"+
		"\2\2\u02b1\u02b2\n\25\2\2\u02b2\u02b7\6p\4\2\u02b3\u02b4\t\26\2\2\u02b4"+
		"\u02b5\t\27\2\2\u02b5\u02b7\6p\5\2\u02b6\u02b0\3\2\2\2\u02b6\u02b1\3\2"+
		"\2\2\u02b6\u02b3\3\2\2\2\u02b7\u00e0\3\2\2\2\u02b8\u02ba\t\31\2\2\u02b9"+
		"\u02b8\3\2\2\2\u02ba\u02bb\3\2\2\2\u02bb\u02b9\3\2\2\2\u02bb\u02bc\3\2"+
		"\2\2\u02bc\u02bd\3\2\2\2\u02bd\u02be\bq\2\2\u02be\u00e2\3\2\2\2\u02bf"+
		"\u02c0\7\61\2\2\u02c0\u02c1\7,\2\2\u02c1\u02c5\3\2\2\2\u02c2\u02c4\13"+
		"\2\2\2\u02c3\u02c2\3\2\2\2\u02c4\u02c7\3\2\2\2\u02c5\u02c6\3\2\2\2\u02c5"+
		"\u02c3\3\2\2\2\u02c6\u02c8\3\2\2\2\u02c7\u02c5\3\2\2\2\u02c8\u02c9\7,"+
		"\2\2\u02c9\u02ca\7\61\2\2\u02ca\u02cb\3\2\2\2\u02cb\u02cc\br\3\2\u02cc"+
		"\u00e4\3\2\2\2\u02cd\u02ce\7\61\2\2\u02ce\u02cf\7\61\2\2\u02cf\u02d3\3"+
		"\2\2\2\u02d0\u02d2\n\32\2\2\u02d1\u02d0\3\2\2\2\u02d2\u02d5\3\2\2\2\u02d3"+
		"\u02d1\3\2\2\2\u02d3\u02d4\3\2\2\2\u02d4\u02d6\3\2\2\2\u02d5\u02d3\3\2"+
		"\2\2\u02d6\u02d7\bs\4\2\u02d7\u00e6\3\2\2\2<\2\u00ed\u00f8\u00fe\u010f"+
		"\u0113\u0117\u011b\u011f\u0126\u012b\u012d\u0131\u0134\u0138\u013f\u0143"+
		"\u0148\u0150\u0153\u015a\u015e\u0162\u0168\u016b\u0172\u0176\u017e\u0181"+
		"\u0188\u018c\u0190\u0195\u0198\u019b\u01a0\u01a3\u01a8\u01ad\u01b5\u01c0"+
		"\u01c4\u01c9\u01cd\u01dd\u01e7\u01ed\u01f4\u01f8\u01fe\u020b\u02a2\u02a6"+
		"\u02ae\u02b6\u02bb\u02c5\u02d3";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}