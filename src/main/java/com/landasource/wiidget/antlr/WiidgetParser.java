// Generated from C:\Users\Zsolti\Documents\GitHub\landasource\wiidget-core\src\main\java\com\landasource\wiidget\antlr\Wiidget.g4 by ANTLR 4.1
package com.landasource.wiidget.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class WiidgetParser extends Parser {
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
	public static final String[] tokenNames = {
		"<INVALID>", "'`'", "LogicalOperator", "MathematicalOperator", "NegotionOperator", 
		"CompareOperator", "EqualityOperator", "'import'", "DEFAULT_OPERATOR", 
		"'$'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", 
		"StringLiteral", "'null'", "'if'", "'foreach'", "'else'", "'as'", "'('", 
		"')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'>'", 
		"'<'", "'!'", "TILDE", "'?'", "':'", "'=='", "'<='", "'>='", "'!='", "'&&'", 
		"'||'", "'++'", "'--'", "'+'", "'-'", "'='", "'*'", "'/'", "'&'", "'|'", 
		"'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='", 
		"'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "WS", "COMMENT", "LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_innerImport = 2, 
		RULE_externalImport = 3, RULE_statementDeclaration = 4, RULE_controlStatement = 5, 
		RULE_ifControl = 6, RULE_foreachControl = 7, RULE_elseControl = 8, RULE_foreachVariable = 9, 
		RULE_wiidgetDeclaration = 10, RULE_wiidgetVariableBinding = 11, RULE_wiidgetVariable = 12, 
		RULE_unifiedWiidgetName = 13, RULE_expressionWiidgetName = 14, RULE_wiidgetArguments = 15, 
		RULE_elementValuePairs = 16, RULE_elementValuePair = 17, RULE_attributeName = 18, 
		RULE_elementValue = 19, RULE_mapExpression = 20, RULE_mapEntry = 21, RULE_mapKey = 22, 
		RULE_listExpression = 23, RULE_wiidgetBody = 24, RULE_qualifiedName = 25, 
		RULE_literal = 26, RULE_expressionList = 27, RULE_expression = 28, RULE_primary = 29;
	public static final String[] ruleNames = {
		"compilationUnit", "importDeclaration", "innerImport", "externalImport", 
		"statementDeclaration", "controlStatement", "ifControl", "foreachControl", 
		"elseControl", "foreachVariable", "wiidgetDeclaration", "wiidgetVariableBinding", 
		"wiidgetVariable", "unifiedWiidgetName", "expressionWiidgetName", "wiidgetArguments", 
		"elementValuePairs", "elementValuePair", "attributeName", "elementValue", 
		"mapExpression", "mapEntry", "mapKey", "listExpression", "wiidgetBody", 
		"qualifiedName", "literal", "expressionList", "expression", "primary"
	};

	@Override
	public String getGrammarFileName() { return "Wiidget.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public WiidgetParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class CompilationUnitContext extends ParserRuleContext {
		public List<ImportDeclarationContext> importDeclaration() {
			return getRuleContexts(ImportDeclarationContext.class);
		}
		public TerminalNode EOF() { return getToken(WiidgetParser.EOF, 0); }
		public ImportDeclarationContext importDeclaration(int i) {
			return getRuleContext(ImportDeclarationContext.class,i);
		}
		public StatementDeclarationContext statementDeclaration(int i) {
			return getRuleContext(StatementDeclarationContext.class,i);
		}
		public List<StatementDeclarationContext> statementDeclaration() {
			return getRuleContexts(StatementDeclarationContext.class);
		}
		public CompilationUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compilationUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterCompilationUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitCompilationUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitCompilationUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompilationUnitContext compilationUnit() throws RecognitionException {
		CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_compilationUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(60); importDeclaration();
				}
				}
				setState(65);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(69);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (WiidgetVarSign - 1)) | (1L << (StringLiteral - 1)) | (1L << (IF - 1)) | (1L << (FOREACH - 1)) | (1L << (Identifier - 1)))) != 0)) {
				{
				{
				setState(66); statementDeclaration();
				}
				}
				setState(71);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(72); match(EOF);
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

	public static class ImportDeclarationContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(WiidgetParser.IMPORT, 0); }
		public ExternalImportContext externalImport() {
			return getRuleContext(ExternalImportContext.class,0);
		}
		public InnerImportContext innerImport() {
			return getRuleContext(InnerImportContext.class,0);
		}
		public ImportDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterImportDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitImportDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitImportDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ImportDeclarationContext importDeclaration() throws RecognitionException {
		ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_importDeclaration);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(74); match(IMPORT);
			setState(77);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(75); innerImport();
				}
				break;
			case StringLiteral:
				{
				setState(76); externalImport();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(79); match(SEMI);
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

	public static class InnerImportContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(WiidgetParser.AS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public InnerImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_innerImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterInnerImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitInnerImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitInnerImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InnerImportContext innerImport() throws RecognitionException {
		InnerImportContext _localctx = new InnerImportContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_innerImport);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81); qualifiedName();
			setState(84);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(82); match(AS);
				setState(83); match(Identifier);
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

	public static class ExternalImportContext extends ParserRuleContext {
		public TerminalNode AS() { return getToken(WiidgetParser.AS, 0); }
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(WiidgetParser.StringLiteral, 0); }
		public ExternalImportContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_externalImport; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterExternalImport(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitExternalImport(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitExternalImport(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExternalImportContext externalImport() throws RecognitionException {
		ExternalImportContext _localctx = new ExternalImportContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_externalImport);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86); match(StringLiteral);
			setState(87); match(AS);
			setState(88); match(Identifier);
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

	public static class StatementDeclarationContext extends ParserRuleContext {
		public WiidgetDeclarationContext wiidgetDeclaration() {
			return getRuleContext(WiidgetDeclarationContext.class,0);
		}
		public ControlStatementContext controlStatement() {
			return getRuleContext(ControlStatementContext.class,0);
		}
		public StatementDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statementDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterStatementDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitStatementDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitStatementDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementDeclarationContext statementDeclaration() throws RecognitionException {
		StatementDeclarationContext _localctx = new StatementDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_statementDeclaration);
		try {
			setState(92);
			switch (_input.LA(1)) {
			case IF:
			case FOREACH:
				enterOuterAlt(_localctx, 1);
				{
				setState(90); controlStatement();
				}
				break;
			case 1:
			case WiidgetVarSign:
			case StringLiteral:
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(91); wiidgetDeclaration();
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ControlStatementContext extends ParserRuleContext {
		public IfControlContext ifControl() {
			return getRuleContext(IfControlContext.class,0);
		}
		public ElseControlContext elseControl() {
			return getRuleContext(ElseControlContext.class,0);
		}
		public WiidgetBodyContext wiidgetBody() {
			return getRuleContext(WiidgetBodyContext.class,0);
		}
		public ForeachControlContext foreachControl() {
			return getRuleContext(ForeachControlContext.class,0);
		}
		public ControlStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_controlStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterControlStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitControlStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitControlStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ControlStatementContext controlStatement() throws RecognitionException {
		ControlStatementContext _localctx = new ControlStatementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_controlStatement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(96);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(94); ifControl();
				}
				break;
			case FOREACH:
				{
				setState(95); foreachControl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(98); wiidgetBody();
			setState(100);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(99); elseControl();
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

	public static class IfControlContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(WiidgetParser.IF, 0); }
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public IfControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterIfControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitIfControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitIfControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfControlContext ifControl() throws RecognitionException {
		IfControlContext _localctx = new IfControlContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_ifControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); match(IF);
			setState(103); match(LPAREN);
			setState(104); expression(0);
			setState(105); match(RPAREN);
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

	public static class ForeachControlContext extends ParserRuleContext {
		public ForeachVariableContext foreachVariable() {
			return getRuleContext(ForeachVariableContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public TerminalNode FOREACH() { return getToken(WiidgetParser.FOREACH, 0); }
		public ForeachControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterForeachControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitForeachControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitForeachControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachControlContext foreachControl() throws RecognitionException {
		ForeachControlContext _localctx = new ForeachControlContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_foreachControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(107); match(FOREACH);
			setState(108); match(LPAREN);
			setState(109); foreachVariable();
			setState(110); match(COLON);
			setState(111); expression(0);
			setState(112); match(RPAREN);
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

	public static class ElseControlContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(WiidgetParser.ELSE, 0); }
		public WiidgetBodyContext wiidgetBody() {
			return getRuleContext(WiidgetBodyContext.class,0);
		}
		public ElseControlContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elseControl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterElseControl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitElseControl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitElseControl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElseControlContext elseControl() throws RecognitionException {
		ElseControlContext _localctx = new ElseControlContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_elseControl);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114); match(ELSE);
			setState(115); wiidgetBody();
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

	public static class ForeachVariableContext extends ParserRuleContext {
		public TerminalNode ARROW() { return getToken(WiidgetParser.ARROW, 0); }
		public TerminalNode Identifier(int i) {
			return getToken(WiidgetParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(WiidgetParser.Identifier); }
		public ForeachVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_foreachVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterForeachVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitForeachVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitForeachVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ForeachVariableContext foreachVariable() throws RecognitionException {
		ForeachVariableContext _localctx = new ForeachVariableContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_foreachVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(119);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(117); match(Identifier);
				setState(118); match(ARROW);
				}
				break;
			}
			setState(121); match(Identifier);
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

	public static class WiidgetDeclarationContext extends ParserRuleContext {
		public WiidgetVariableBindingContext wiidgetVariableBinding() {
			return getRuleContext(WiidgetVariableBindingContext.class,0);
		}
		public WiidgetArgumentsContext wiidgetArguments() {
			return getRuleContext(WiidgetArgumentsContext.class,0);
		}
		public UnifiedWiidgetNameContext unifiedWiidgetName() {
			return getRuleContext(UnifiedWiidgetNameContext.class,0);
		}
		public WiidgetBodyContext wiidgetBody() {
			return getRuleContext(WiidgetBodyContext.class,0);
		}
		public WiidgetDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetDeclarationContext wiidgetDeclaration() throws RecognitionException {
		WiidgetDeclarationContext _localctx = new WiidgetDeclarationContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_wiidgetDeclaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(124);
			_la = _input.LA(1);
			if (_la==WiidgetVarSign) {
				{
				setState(123); wiidgetVariableBinding();
				}
			}

			setState(126); unifiedWiidgetName();
			setState(128);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(127); wiidgetArguments();
				}
			}

			setState(130); wiidgetBody();
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

	public static class WiidgetVariableBindingContext extends ParserRuleContext {
		public WiidgetVariableContext wiidgetVariable() {
			return getRuleContext(WiidgetVariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(WiidgetParser.COLON, 0); }
		public WiidgetVariableBindingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetVariableBinding; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetVariableBinding(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetVariableBinding(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetVariableBinding(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetVariableBindingContext wiidgetVariableBinding() throws RecognitionException {
		WiidgetVariableBindingContext _localctx = new WiidgetVariableBindingContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_wiidgetVariableBinding);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132); wiidgetVariable();
			setState(133); match(COLON);
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

	public static class WiidgetVariableContext extends ParserRuleContext {
		public TerminalNode WiidgetVarSign() { return getToken(WiidgetParser.WiidgetVarSign, 0); }
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public WiidgetVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetVariableContext wiidgetVariable() throws RecognitionException {
		WiidgetVariableContext _localctx = new WiidgetVariableContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_wiidgetVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); match(WiidgetVarSign);
			setState(136); match(Identifier);
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

	public static class UnifiedWiidgetNameContext extends ParserRuleContext {
		public ExpressionWiidgetNameContext expressionWiidgetName() {
			return getRuleContext(ExpressionWiidgetNameContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(WiidgetParser.StringLiteral, 0); }
		public UnifiedWiidgetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unifiedWiidgetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterUnifiedWiidgetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitUnifiedWiidgetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitUnifiedWiidgetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnifiedWiidgetNameContext unifiedWiidgetName() throws RecognitionException {
		UnifiedWiidgetNameContext _localctx = new UnifiedWiidgetNameContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_unifiedWiidgetName);
		try {
			setState(141);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(138); expressionWiidgetName();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(139); match(Identifier);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(140); match(StringLiteral);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class ExpressionWiidgetNameContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ExpressionWiidgetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionWiidgetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterExpressionWiidgetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitExpressionWiidgetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitExpressionWiidgetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionWiidgetNameContext expressionWiidgetName() throws RecognitionException {
		ExpressionWiidgetNameContext _localctx = new ExpressionWiidgetNameContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_expressionWiidgetName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(143); match(1);
			setState(144); expression(0);
			setState(145); match(1);
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

	public static class WiidgetArgumentsContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public ElementValuePairsContext elementValuePairs() {
			return getRuleContext(ElementValuePairsContext.class,0);
		}
		public WiidgetArgumentsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetArguments; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetArguments(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetArguments(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetArguments(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetArgumentsContext wiidgetArguments() throws RecognitionException {
		WiidgetArgumentsContext _localctx = new WiidgetArgumentsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_wiidgetArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(147); match(LPAREN);
			setState(150);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(148); elementValue();
				}
				break;

			case 2:
				{
				setState(149); elementValuePairs();
				}
				break;
			}
			setState(152); match(RPAREN);
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

	public static class ElementValuePairsContext extends ParserRuleContext {
		public List<ElementValuePairContext> elementValuePair() {
			return getRuleContexts(ElementValuePairContext.class);
		}
		public ElementValuePairContext elementValuePair(int i) {
			return getRuleContext(ElementValuePairContext.class,i);
		}
		public ElementValuePairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterElementValuePairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitElementValuePairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitElementValuePairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
		ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154); elementValuePair();
			setState(159);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(155); match(COMMA);
				setState(156); elementValuePair();
				}
				}
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ElementValuePairContext extends ParserRuleContext {
		public ElementValueContext elementValue() {
			return getRuleContext(ElementValueContext.class,0);
		}
		public AttributeNameContext attributeName() {
			return getRuleContext(AttributeNameContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(WiidgetParser.ASSIGN, 0); }
		public ElementValuePairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValuePair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterElementValuePair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitElementValuePair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitElementValuePair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValuePairContext elementValuePair() throws RecognitionException {
		ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(162); attributeName();
			setState(163); match(ASSIGN);
			setState(164); elementValue();
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

	public static class AttributeNameContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(WiidgetParser.StringLiteral, 0); }
		public AttributeNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attributeName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterAttributeName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitAttributeName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitAttributeName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeNameContext attributeName() throws RecognitionException {
		AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(166);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ElementValueContext extends ParserRuleContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ElementValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterElementValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitElementValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitElementValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueContext elementValue() throws RecognitionException {
		ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_elementValue);
		try {
			setState(170);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(168); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(169); qualifiedName();
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

	public static class MapExpressionContext extends ParserRuleContext {
		public MapEntryContext mapEntry(int i) {
			return getRuleContext(MapEntryContext.class,i);
		}
		public List<MapEntryContext> mapEntry() {
			return getRuleContexts(MapEntryContext.class);
		}
		public MapExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterMapExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitMapExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitMapExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapExpressionContext mapExpression() throws RecognitionException {
		MapExpressionContext _localctx = new MapExpressionContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_mapExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172); match(LBRACE);
			setState(181);
			_la = _input.LA(1);
			if (_la==StringLiteral || _la==Identifier) {
				{
				setState(173); mapEntry();
				setState(178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(174); match(COMMA);
					setState(175); mapEntry();
					}
					}
					setState(180);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(183); match(RBRACE);
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

	public static class MapEntryContext extends ParserRuleContext {
		public MapKeyContext mapKey() {
			return getRuleContext(MapKeyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public MapEntryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapEntry; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterMapEntry(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitMapEntry(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitMapEntry(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapEntryContext mapEntry() throws RecognitionException {
		MapEntryContext _localctx = new MapEntryContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_mapEntry);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(185); mapKey();
			setState(186); match(COLON);
			setState(187); expression(0);
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

	public static class MapKeyContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode StringLiteral() { return getToken(WiidgetParser.StringLiteral, 0); }
		public MapKeyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mapKey; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterMapKey(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitMapKey(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitMapKey(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MapKeyContext mapKey() throws RecognitionException {
		MapKeyContext _localctx = new MapKeyContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_mapKey);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(189);
			_la = _input.LA(1);
			if ( !(_la==StringLiteral || _la==Identifier) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ListExpressionContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ListExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_listExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterListExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitListExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitListExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ListExpressionContext listExpression() throws RecognitionException {
		ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_listExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(191); match(LBRACK);
			setState(200);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4)) | (1L << (IntegerLiteral - 4)) | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4)) | (1L << (StringLiteral - 4)) | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (LBRACE - 4)) | (1L << (LBRACK - 4)) | (1L << (Identifier - 4)))) != 0)) {
				{
				setState(192); expression(0);
				setState(197);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(193); match(COMMA);
					setState(194); expression(0);
					}
					}
					setState(199);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(202); match(RBRACK);
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

	public static class WiidgetBodyContext extends ParserRuleContext {
		public StatementDeclarationContext statementDeclaration(int i) {
			return getRuleContext(StatementDeclarationContext.class,i);
		}
		public List<StatementDeclarationContext> statementDeclaration() {
			return getRuleContexts(StatementDeclarationContext.class);
		}
		public WiidgetBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetBody(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetBody(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetBodyContext wiidgetBody() throws RecognitionException {
		WiidgetBodyContext _localctx = new WiidgetBodyContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_wiidgetBody);
		int _la;
		try {
			setState(213);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(204); match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(205); match(LBRACE);
				setState(209);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (((((_la - 1)) & ~0x3f) == 0 && ((1L << (_la - 1)) & ((1L << (1 - 1)) | (1L << (WiidgetVarSign - 1)) | (1L << (StringLiteral - 1)) | (1L << (IF - 1)) | (1L << (FOREACH - 1)) | (1L << (Identifier - 1)))) != 0)) {
					{
					{
					setState(206); statementDeclaration();
					}
					}
					setState(211);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(212); match(RBRACE);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public static class QualifiedNameContext extends ParserRuleContext {
		public TerminalNode Identifier(int i) {
			return getToken(WiidgetParser.Identifier, i);
		}
		public List<TerminalNode> Identifier() { return getTokens(WiidgetParser.Identifier); }
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(215); match(Identifier);
			setState(220);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(216); match(DOT);
				setState(217); match(Identifier);
				}
				}
				setState(222);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class LiteralContext extends ParserRuleContext {
		public TerminalNode NullLiteral() { return getToken(WiidgetParser.NullLiteral, 0); }
		public TerminalNode CharacterLiteral() { return getToken(WiidgetParser.CharacterLiteral, 0); }
		public TerminalNode IntegerLiteral() { return getToken(WiidgetParser.IntegerLiteral, 0); }
		public TerminalNode StringLiteral() { return getToken(WiidgetParser.StringLiteral, 0); }
		public TerminalNode FloatingPointLiteral() { return getToken(WiidgetParser.FloatingPointLiteral, 0); }
		public TerminalNode BooleanLiteral() { return getToken(WiidgetParser.BooleanLiteral, 0); }
		public LiteralContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literal; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralContext literal() throws RecognitionException {
		LiteralContext _localctx = new LiteralContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(223);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral) | (1L << StringLiteral) | (1L << NullLiteral))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			consume();
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

	public static class ExpressionListContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expressionList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterExpressionList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitExpressionList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitExpressionList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionListContext expressionList() throws RecognitionException {
		ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(225); expression(0);
			setState(230);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(226); match(COMMA);
				setState(227); expression(0);
				}
				}
				setState(232);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class ExpressionContext extends ParserRuleContext {
		public int _p;
		public TerminalNode RBRACK() { return getToken(WiidgetParser.RBRACK, 0); }
		public TerminalNode QUESTION() { return getToken(WiidgetParser.QUESTION, 0); }
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode NegotionOperator() { return getToken(WiidgetParser.NegotionOperator, 0); }
		public ListExpressionContext listExpression() {
			return getRuleContext(ListExpressionContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public MapExpressionContext mapExpression() {
			return getRuleContext(MapExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public TerminalNode EqualityOperator() { return getToken(WiidgetParser.EqualityOperator, 0); }
		public TerminalNode LBRACK() { return getToken(WiidgetParser.LBRACK, 0); }
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public PrimaryContext primary() {
			return getRuleContext(PrimaryContext.class,0);
		}
		public TerminalNode LogicalOperator() { return getToken(WiidgetParser.LogicalOperator, 0); }
		public TerminalNode DOT() { return getToken(WiidgetParser.DOT, 0); }
		public TerminalNode MathematicalOperator() { return getToken(WiidgetParser.MathematicalOperator, 0); }
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode CompareOperator() { return getToken(WiidgetParser.CompareOperator, 0); }
		public TerminalNode DEFAULT_OPERATOR() { return getToken(WiidgetParser.DEFAULT_OPERATOR, 0); }
		public WiidgetVariableContext wiidgetVariable() {
			return getRuleContext(WiidgetVariableContext.class,0);
		}
		public TerminalNode COLON() { return getToken(WiidgetParser.COLON, 0); }
		public ExpressionContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public ExpressionContext(ParserRuleContext parent, int invokingState, int _p) {
			super(parent, invokingState);
			this._p = _p;
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
		ExpressionContext _prevctx = _localctx;
		int _startState = 56;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(240);
			switch (_input.LA(1)) {
			case NegotionOperator:
				{
				setState(234); match(NegotionOperator);
				setState(235); expression(7);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
			case LPAREN:
			case Identifier:
				{
				setState(236); primary();
				}
				break;
			case WiidgetVarSign:
				{
				setState(237); wiidgetVariable();
				}
				break;
			case LBRACE:
				{
				setState(238); mapExpression();
				}
				break;
			case LBRACK:
				{
				setState(239); listExpression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(279);
					switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(242);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(243); match(MathematicalOperator);
						setState(244); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(245);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(246); match(CompareOperator);
						setState(247); expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(248);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(249); match(EqualityOperator);
						setState(250); expression(5);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(251);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(252); match(LogicalOperator);
						setState(253); expression(4);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(254);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(255); match(DEFAULT_OPERATOR);
						setState(256); expression(3);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(257);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(258); match(QUESTION);
						setState(259); expression(0);
						setState(260); match(COLON);
						setState(261); expression(2);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(263);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(264); match(DOT);
						setState(265); match(Identifier);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(266);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(267); match(LBRACK);
						setState(268); expression(0);
						setState(269); match(RBRACK);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(271);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(272); match(DOT);
						setState(273); match(Identifier);
						setState(274); match(LPAREN);
						setState(276);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4)) | (1L << (IntegerLiteral - 4)) | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4)) | (1L << (StringLiteral - 4)) | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (LBRACE - 4)) | (1L << (LBRACK - 4)) | (1L << (Identifier - 4)))) != 0)) {
							{
							setState(275); expressionList();
							}
						}

						setState(278); match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,25,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public LiteralContext literal() {
			return getRuleContext(LiteralContext.class,0);
		}
		public PrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryContext primary() throws RecognitionException {
		PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_primary);
		try {
			setState(290);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(284); match(Identifier);
				}
				break;
			case IntegerLiteral:
			case FloatingPointLiteral:
			case BooleanLiteral:
			case CharacterLiteral:
			case StringLiteral:
			case NullLiteral:
				enterOuterAlt(_localctx, 2);
				{
				setState(285); literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(286); match(LPAREN);
				setState(287); expression(0);
				setState(288); match(RPAREN);
				}
				break;
			default:
				throw new NoViableAltException(this);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 28: return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return 6 >= _localctx._p;

		case 1: return 5 >= _localctx._p;

		case 2: return 4 >= _localctx._p;

		case 3: return 3 >= _localctx._p;

		case 4: return 2 >= _localctx._p;

		case 5: return 1 >= _localctx._p;

		case 6: return 10 >= _localctx._p;

		case 7: return 9 >= _localctx._p;

		case 8: return 8 >= _localctx._p;
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3E\u0127\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\3\2\7\2@"+
		"\n\2\f\2\16\2C\13\2\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\3\2\3\3\3\3\3\3\5"+
		"\3P\n\3\3\3\3\3\3\4\3\4\3\4\5\4W\n\4\3\5\3\5\3\5\3\5\3\6\3\6\5\6_\n\6"+
		"\3\7\3\7\5\7c\n\7\3\7\3\7\5\7g\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t"+
		"\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13z\n\13\3\13\3\13\3\f\5\f\177\n"+
		"\f\3\f\3\f\5\f\u0083\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17"+
		"\3\17\5\17\u0090\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\5\21\u0099\n"+
		"\21\3\21\3\21\3\22\3\22\3\22\7\22\u00a0\n\22\f\22\16\22\u00a3\13\22\3"+
		"\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25\5\25\u00ad\n\25\3\26\3\26\3\26"+
		"\3\26\7\26\u00b3\n\26\f\26\16\26\u00b6\13\26\5\26\u00b8\n\26\3\26\3\26"+
		"\3\27\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\31\3\31\7\31\u00c6\n\31\f\31"+
		"\16\31\u00c9\13\31\5\31\u00cb\n\31\3\31\3\31\3\32\3\32\3\32\7\32\u00d2"+
		"\n\32\f\32\16\32\u00d5\13\32\3\32\5\32\u00d8\n\32\3\33\3\33\3\33\7\33"+
		"\u00dd\n\33\f\33\16\33\u00e0\13\33\3\34\3\34\3\35\3\35\3\35\7\35\u00e7"+
		"\n\35\f\35\16\35\u00ea\13\35\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u00f3"+
		"\n\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36\3\36"+
		"\3\36\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0117\n\36\3\36\7\36\u011a\n"+
		"\36\f\36\16\36\u011d\13\36\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0125\n"+
		"\37\3\37\2 \2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\66"+
		"8:<\2\4\4\2\20\20BB\3\2\f\21\u0130\2A\3\2\2\2\4L\3\2\2\2\6S\3\2\2\2\b"+
		"X\3\2\2\2\n^\3\2\2\2\fb\3\2\2\2\16h\3\2\2\2\20m\3\2\2\2\22t\3\2\2\2\24"+
		"y\3\2\2\2\26~\3\2\2\2\30\u0086\3\2\2\2\32\u0089\3\2\2\2\34\u008f\3\2\2"+
		"\2\36\u0091\3\2\2\2 \u0095\3\2\2\2\"\u009c\3\2\2\2$\u00a4\3\2\2\2&\u00a8"+
		"\3\2\2\2(\u00ac\3\2\2\2*\u00ae\3\2\2\2,\u00bb\3\2\2\2.\u00bf\3\2\2\2\60"+
		"\u00c1\3\2\2\2\62\u00d7\3\2\2\2\64\u00d9\3\2\2\2\66\u00e1\3\2\2\28\u00e3"+
		"\3\2\2\2:\u00f2\3\2\2\2<\u0124\3\2\2\2>@\5\4\3\2?>\3\2\2\2@C\3\2\2\2A"+
		"?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\n\6\2ED\3\2\2\2FI\3\2\2\2"+
		"GE\3\2\2\2GH\3\2\2\2HJ\3\2\2\2IG\3\2\2\2JK\7\2\2\3K\3\3\2\2\2LO\7\t\2"+
		"\2MP\5\6\4\2NP\5\b\5\2OM\3\2\2\2ON\3\2\2\2PQ\3\2\2\2QR\7\34\2\2R\5\3\2"+
		"\2\2SV\5\64\33\2TU\7\25\2\2UW\7B\2\2VT\3\2\2\2VW\3\2\2\2W\7\3\2\2\2XY"+
		"\7\20\2\2YZ\7\25\2\2Z[\7B\2\2[\t\3\2\2\2\\_\5\f\7\2]_\5\26\f\2^\\\3\2"+
		"\2\2^]\3\2\2\2_\13\3\2\2\2`c\5\16\b\2ac\5\20\t\2b`\3\2\2\2ba\3\2\2\2c"+
		"d\3\2\2\2df\5\62\32\2eg\5\22\n\2fe\3\2\2\2fg\3\2\2\2g\r\3\2\2\2hi\7\22"+
		"\2\2ij\7\26\2\2jk\5:\36\2kl\7\27\2\2l\17\3\2\2\2mn\7\23\2\2no\7\26\2\2"+
		"op\5\24\13\2pq\7%\2\2qr\5:\36\2rs\7\27\2\2s\21\3\2\2\2tu\7\24\2\2uv\5"+
		"\62\32\2v\23\3\2\2\2wx\7B\2\2xz\7\37\2\2yw\3\2\2\2yz\3\2\2\2z{\3\2\2\2"+
		"{|\7B\2\2|\25\3\2\2\2}\177\5\30\r\2~}\3\2\2\2~\177\3\2\2\2\177\u0080\3"+
		"\2\2\2\u0080\u0082\5\34\17\2\u0081\u0083\5 \21\2\u0082\u0081\3\2\2\2\u0082"+
		"\u0083\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\5\62\32\2\u0085\27\3\2"+
		"\2\2\u0086\u0087\5\32\16\2\u0087\u0088\7%\2\2\u0088\31\3\2\2\2\u0089\u008a"+
		"\7\13\2\2\u008a\u008b\7B\2\2\u008b\33\3\2\2\2\u008c\u0090\5\36\20\2\u008d"+
		"\u0090\7B\2\2\u008e\u0090\7\20\2\2\u008f\u008c\3\2\2\2\u008f\u008d\3\2"+
		"\2\2\u008f\u008e\3\2\2\2\u0090\35\3\2\2\2\u0091\u0092\7\3\2\2\u0092\u0093"+
		"\5:\36\2\u0093\u0094\7\3\2\2\u0094\37\3\2\2\2\u0095\u0098\7\26\2\2\u0096"+
		"\u0099\5(\25\2\u0097\u0099\5\"\22\2\u0098\u0096\3\2\2\2\u0098\u0097\3"+
		"\2\2\2\u0098\u0099\3\2\2\2\u0099\u009a\3\2\2\2\u009a\u009b\7\27\2\2\u009b"+
		"!\3\2\2\2\u009c\u00a1\5$\23\2\u009d\u009e\7\35\2\2\u009e\u00a0\5$\23\2"+
		"\u009f\u009d\3\2\2\2\u00a0\u00a3\3\2\2\2\u00a1\u009f\3\2\2\2\u00a1\u00a2"+
		"\3\2\2\2\u00a2#\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a4\u00a5\5&\24\2\u00a5"+
		"\u00a6\7\60\2\2\u00a6\u00a7\5(\25\2\u00a7%\3\2\2\2\u00a8\u00a9\t\2\2\2"+
		"\u00a9\'\3\2\2\2\u00aa\u00ad\5:\36\2\u00ab\u00ad\5\64\33\2\u00ac\u00aa"+
		"\3\2\2\2\u00ac\u00ab\3\2\2\2\u00ad)\3\2\2\2\u00ae\u00b7\7\30\2\2\u00af"+
		"\u00b4\5,\27\2\u00b0\u00b1\7\35\2\2\u00b1\u00b3\5,\27\2\u00b2\u00b0\3"+
		"\2\2\2\u00b3\u00b6\3\2\2\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b7\u00af\3\2\2\2\u00b7\u00b8\3\2"+
		"\2\2\u00b8\u00b9\3\2\2\2\u00b9\u00ba\7\31\2\2\u00ba+\3\2\2\2\u00bb\u00bc"+
		"\5.\30\2\u00bc\u00bd\7%\2\2\u00bd\u00be\5:\36\2\u00be-\3\2\2\2\u00bf\u00c0"+
		"\t\2\2\2\u00c0/\3\2\2\2\u00c1\u00ca\7\32\2\2\u00c2\u00c7\5:\36\2\u00c3"+
		"\u00c4\7\35\2\2\u00c4\u00c6\5:\36\2\u00c5\u00c3\3\2\2\2\u00c6\u00c9\3"+
		"\2\2\2\u00c7\u00c5\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00cb\3\2\2\2\u00c9"+
		"\u00c7\3\2\2\2\u00ca\u00c2\3\2\2\2\u00ca\u00cb\3\2\2\2\u00cb\u00cc\3\2"+
		"\2\2\u00cc\u00cd\7\33\2\2\u00cd\61\3\2\2\2\u00ce\u00d8\7\34\2\2\u00cf"+
		"\u00d3\7\30\2\2\u00d0\u00d2\5\n\6\2\u00d1\u00d0\3\2\2\2\u00d2\u00d5\3"+
		"\2\2\2\u00d3\u00d1\3\2\2\2\u00d3\u00d4\3\2\2\2\u00d4\u00d6\3\2\2\2\u00d5"+
		"\u00d3\3\2\2\2\u00d6\u00d8\7\31\2\2\u00d7\u00ce\3\2\2\2\u00d7\u00cf\3"+
		"\2\2\2\u00d8\63\3\2\2\2\u00d9\u00de\7B\2\2\u00da\u00db\7\36\2\2\u00db"+
		"\u00dd\7B\2\2\u00dc\u00da\3\2\2\2\u00dd\u00e0\3\2\2\2\u00de\u00dc\3\2"+
		"\2\2\u00de\u00df\3\2\2\2\u00df\65\3\2\2\2\u00e0\u00de\3\2\2\2\u00e1\u00e2"+
		"\t\3\2\2\u00e2\67\3\2\2\2\u00e3\u00e8\5:\36\2\u00e4\u00e5\7\35\2\2\u00e5"+
		"\u00e7\5:\36\2\u00e6\u00e4\3\2\2\2\u00e7\u00ea\3\2\2\2\u00e8\u00e6\3\2"+
		"\2\2\u00e8\u00e9\3\2\2\2\u00e99\3\2\2\2\u00ea\u00e8\3\2\2\2\u00eb\u00ec"+
		"\b\36\1\2\u00ec\u00ed\7\6\2\2\u00ed\u00f3\5:\36\2\u00ee\u00f3\5<\37\2"+
		"\u00ef\u00f3\5\32\16\2\u00f0\u00f3\5*\26\2\u00f1\u00f3\5\60\31\2\u00f2"+
		"\u00eb\3\2\2\2\u00f2\u00ee\3\2\2\2\u00f2\u00ef\3\2\2\2\u00f2\u00f0\3\2"+
		"\2\2\u00f2\u00f1\3\2\2\2\u00f3\u011b\3\2\2\2\u00f4\u00f5\6\36\2\3\u00f5"+
		"\u00f6\7\5\2\2\u00f6\u011a\5:\36\2\u00f7\u00f8\6\36\3\3\u00f8\u00f9\7"+
		"\7\2\2\u00f9\u011a\5:\36\2\u00fa\u00fb\6\36\4\3\u00fb\u00fc\7\b\2\2\u00fc"+
		"\u011a\5:\36\2\u00fd\u00fe\6\36\5\3\u00fe\u00ff\7\4\2\2\u00ff\u011a\5"+
		":\36\2\u0100\u0101\6\36\6\3\u0101\u0102\7\n\2\2\u0102\u011a\5:\36\2\u0103"+
		"\u0104\6\36\7\3\u0104\u0105\7$\2\2\u0105\u0106\5:\36\2\u0106\u0107\7%"+
		"\2\2\u0107\u0108\5:\36\2\u0108\u011a\3\2\2\2\u0109\u010a\6\36\b\3\u010a"+
		"\u010b\7\36\2\2\u010b\u011a\7B\2\2\u010c\u010d\6\36\t\3\u010d\u010e\7"+
		"\32\2\2\u010e\u010f\5:\36\2\u010f\u0110\7\33\2\2\u0110\u011a\3\2\2\2\u0111"+
		"\u0112\6\36\n\3\u0112\u0113\7\36\2\2\u0113\u0114\7B\2\2\u0114\u0116\7"+
		"\26\2\2\u0115\u0117\58\35\2\u0116\u0115\3\2\2\2\u0116\u0117\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u011a\7\27\2\2\u0119\u00f4\3\2\2\2\u0119\u00f7\3"+
		"\2\2\2\u0119\u00fa\3\2\2\2\u0119\u00fd\3\2\2\2\u0119\u0100\3\2\2\2\u0119"+
		"\u0103\3\2\2\2\u0119\u0109\3\2\2\2\u0119\u010c\3\2\2\2\u0119\u0111\3\2"+
		"\2\2\u011a\u011d\3\2\2\2\u011b\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c"+
		";\3\2\2\2\u011d\u011b\3\2\2\2\u011e\u0125\7B\2\2\u011f\u0125\5\66\34\2"+
		"\u0120\u0121\7\26\2\2\u0121\u0122\5:\36\2\u0122\u0123\7\27\2\2\u0123\u0125"+
		"\3\2\2\2\u0124\u011e\3\2\2\2\u0124\u011f\3\2\2\2\u0124\u0120\3\2\2\2\u0125"+
		"=\3\2\2\2\35AGOV^bfy~\u0082\u008f\u0098\u00a1\u00ac\u00b4\u00b7\u00c7"+
		"\u00ca\u00d3\u00d7\u00de\u00e8\u00f2\u0116\u0119\u011b\u0124";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}