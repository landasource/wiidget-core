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
		CompareOperator=5, EqualityOperator=6, IMPORT=7, DEFAULT_OPERATOR=8, SEAM=9, 
		WiidgetVarSign=10, IntegerLiteral=11, FloatingPointLiteral=12, BooleanLiteral=13, 
		CharacterLiteral=14, StringLiteral=15, NullLiteral=16, IF=17, FOREACH=18, 
		ELSE=19, AS=20, LPAREN=21, RPAREN=22, LBRACE=23, RBRACE=24, LBRACK=25, 
		RBRACK=26, SEMI=27, COMMA=28, DOT=29, ARROW=30, GT=31, LT=32, BANG=33, 
		TILDE=34, QUESTION=35, COLON=36, EQUAL=37, LE=38, GE=39, NOTEQUAL=40, 
		AND=41, OR=42, INC=43, DEC=44, ADD=45, SUB=46, ASSIGN=47, MUL=48, DIV=49, 
		BITAND=50, BITOR=51, CARET=52, MOD=53, ADD_ASSIGN=54, SUB_ASSIGN=55, MUL_ASSIGN=56, 
		DIV_ASSIGN=57, AND_ASSIGN=58, OR_ASSIGN=59, XOR_ASSIGN=60, MOD_ASSIGN=61, 
		LSHIFT_ASSIGN=62, RSHIFT_ASSIGN=63, URSHIFT_ASSIGN=64, Identifier=65, 
		WS=66, COMMENT=67, LINE_COMMENT=68;
	public static final String[] tokenNames = {
		"<INVALID>", "'`'", "LogicalOperator", "MathematicalOperator", "NegotionOperator", 
		"CompareOperator", "EqualityOperator", "'import'", "DEFAULT_OPERATOR", 
		"'seam'", "'$'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", 
		"CharacterLiteral", "StringLiteral", "'null'", "'if'", "'foreach'", "'else'", 
		"'as'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", 
		"'->'", "'>'", "'<'", "'!'", "TILDE", "'?'", "':'", "'=='", "'<='", "'>='", 
		"'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'='", "'*'", "'/'", 
		"'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", 
		"'^='", "'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "WS", "COMMENT", 
		"LINE_COMMENT"
	};
	public static final int
		RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_innerImport = 2, 
		RULE_externalImport = 3, RULE_statementDeclaration = 4, RULE_controlStatement = 5, 
		RULE_ifControl = 6, RULE_foreachControl = 7, RULE_elseControl = 8, RULE_foreachVariable = 9, 
		RULE_wiidgetDeclaration = 10, RULE_wiidgetVariableBinding = 11, RULE_wiidgetVariable = 12, 
		RULE_unifiedWiidgetName = 13, RULE_expressionWiidgetName = 14, RULE_wiidgetMethodCallExpression = 15, 
		RULE_seamStatement = 16, RULE_wiidgetArguments = 17, RULE_elementValuePairs = 18, 
		RULE_elementValuePair = 19, RULE_attributeName = 20, RULE_elementValue = 21, 
		RULE_elementValueArrayInitializer = 22, RULE_wiidgetBody = 23, RULE_qualifiedName = 24, 
		RULE_literal = 25, RULE_expressionList = 26, RULE_expression = 27, RULE_primary = 28;
	public static final String[] ruleNames = {
		"compilationUnit", "importDeclaration", "innerImport", "externalImport", 
		"statementDeclaration", "controlStatement", "ifControl", "foreachControl", 
		"elseControl", "foreachVariable", "wiidgetDeclaration", "wiidgetVariableBinding", 
		"wiidgetVariable", "unifiedWiidgetName", "expressionWiidgetName", "wiidgetMethodCallExpression", 
		"seamStatement", "wiidgetArguments", "elementValuePairs", "elementValuePair", 
		"attributeName", "elementValue", "elementValueArrayInitializer", "wiidgetBody", 
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
			setState(61);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IMPORT) {
				{
				{
				setState(58); importDeclaration();
				}
				}
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(67);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << SEAM) | (1L << WiidgetVarSign) | (1L << StringLiteral) | (1L << IF) | (1L << FOREACH))) != 0) || _la==Identifier) {
				{
				{
				setState(64); statementDeclaration();
				}
				}
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(70); match(EOF);
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
			setState(72); match(IMPORT);
			setState(75);
			switch (_input.LA(1)) {
			case Identifier:
				{
				setState(73); innerImport();
				}
				break;
			case StringLiteral:
				{
				setState(74); externalImport();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(77); match(SEMI);
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
			setState(79); qualifiedName();
			setState(82);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(80); match(AS);
				setState(81); match(Identifier);
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
			setState(84); match(StringLiteral);
			setState(85); match(AS);
			setState(86); match(Identifier);
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
		public SeamStatementContext seamStatement() {
			return getRuleContext(SeamStatementContext.class,0);
		}
		public WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() {
			return getRuleContext(WiidgetMethodCallExpressionContext.class,0);
		}
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
			setState(94);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(88); controlStatement();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(89); wiidgetDeclaration();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(90); wiidgetMethodCallExpression();
				setState(91); match(SEMI);
				}
				break;

			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(93); seamStatement();
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
			setState(98);
			switch (_input.LA(1)) {
			case IF:
				{
				setState(96); ifControl();
				}
				break;
			case FOREACH:
				{
				setState(97); foreachControl();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(100); wiidgetBody();
			setState(102);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(101); elseControl();
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
			setState(104); match(IF);
			setState(105); match(LPAREN);
			setState(106); expression(0);
			setState(107); match(RPAREN);
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
			setState(109); match(FOREACH);
			setState(110); match(LPAREN);
			setState(111); foreachVariable();
			setState(112); match(COLON);
			setState(113); expression(0);
			setState(114); match(RPAREN);
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
			setState(116); match(ELSE);
			setState(117); wiidgetBody();
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
			setState(121);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				{
				setState(119); match(Identifier);
				setState(120); match(ARROW);
				}
				break;
			}
			setState(123); match(Identifier);
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
			setState(126);
			_la = _input.LA(1);
			if (_la==WiidgetVarSign) {
				{
				setState(125); wiidgetVariableBinding();
				}
			}

			setState(128); unifiedWiidgetName();
			setState(130);
			_la = _input.LA(1);
			if (_la==LPAREN) {
				{
				setState(129); wiidgetArguments();
				}
			}

			setState(132); wiidgetBody();
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
			setState(134); wiidgetVariable();
			setState(135); match(COLON);
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
			setState(137); match(WiidgetVarSign);
			setState(138); match(Identifier);
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
			setState(143);
			switch (_input.LA(1)) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(140); expressionWiidgetName();
				}
				break;
			case Identifier:
				enterOuterAlt(_localctx, 2);
				{
				setState(141); match(Identifier);
				}
				break;
			case StringLiteral:
				enterOuterAlt(_localctx, 3);
				{
				setState(142); match(StringLiteral);
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
			setState(145); match(1);
			setState(146); expression(0);
			setState(147); match(1);
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

	public static class WiidgetMethodCallExpressionContext extends ParserRuleContext {
		public ExpressionListContext expressionList() {
			return getRuleContext(ExpressionListContext.class,0);
		}
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode Identifier() { return getToken(WiidgetParser.Identifier, 0); }
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public WiidgetVariableContext wiidgetVariable() {
			return getRuleContext(WiidgetVariableContext.class,0);
		}
		public WiidgetMethodCallExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wiidgetMethodCallExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterWiidgetMethodCallExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitWiidgetMethodCallExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitWiidgetMethodCallExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() throws RecognitionException {
		WiidgetMethodCallExpressionContext _localctx = new WiidgetMethodCallExpressionContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_wiidgetMethodCallExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149); wiidgetVariable();
			setState(150); match(DOT);
			setState(151); match(Identifier);
			setState(152); match(LPAREN);
			setState(154);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4)) | (1L << (IntegerLiteral - 4)) | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4)) | (1L << (StringLiteral - 4)) | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (Identifier - 4)))) != 0)) {
				{
				setState(153); expressionList();
				}
			}

			setState(156); match(RPAREN);
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

	public static class SeamStatementContext extends ParserRuleContext {
		public TerminalNode RPAREN() { return getToken(WiidgetParser.RPAREN, 0); }
		public TerminalNode SEAM() { return getToken(WiidgetParser.SEAM, 0); }
		public WiidgetBodyContext wiidgetBody() {
			return getRuleContext(WiidgetBodyContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode LPAREN() { return getToken(WiidgetParser.LPAREN, 0); }
		public SeamStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_seamStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterSeamStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitSeamStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitSeamStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SeamStatementContext seamStatement() throws RecognitionException {
		SeamStatementContext _localctx = new SeamStatementContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_seamStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(158); match(SEAM);
			setState(159); match(LPAREN);
			setState(160); expression(0);
			setState(161); match(RPAREN);
			setState(162); wiidgetBody();
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
		enterRule(_localctx, 34, RULE_wiidgetArguments);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164); match(LPAREN);
			setState(167);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				{
				setState(165); elementValue();
				}
				break;

			case 2:
				{
				setState(166); elementValuePairs();
				}
				break;
			}
			setState(169); match(RPAREN);
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
		enterRule(_localctx, 36, RULE_elementValuePairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(171); elementValuePair();
			setState(176);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(172); match(COMMA);
				setState(173); elementValuePair();
				}
				}
				setState(178);
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
		enterRule(_localctx, 38, RULE_elementValuePair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179); attributeName();
			setState(180); match(ASSIGN);
			setState(181); elementValue();
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
		enterRule(_localctx, 40, RULE_attributeName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
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
		public ElementValueArrayInitializerContext elementValueArrayInitializer() {
			return getRuleContext(ElementValueArrayInitializerContext.class,0);
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
		enterRule(_localctx, 42, RULE_elementValue);
		try {
			setState(188);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(185); expression(0);
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(186); qualifiedName();
				}
				break;

			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(187); elementValueArrayInitializer();
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

	public static class ElementValueArrayInitializerContext extends ParserRuleContext {
		public ElementValueContext elementValue(int i) {
			return getRuleContext(ElementValueContext.class,i);
		}
		public List<ElementValueContext> elementValue() {
			return getRuleContexts(ElementValueContext.class);
		}
		public ElementValueArrayInitializerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elementValueArrayInitializer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).enterElementValueArrayInitializer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof WiidgetListener ) ((WiidgetListener)listener).exitElementValueArrayInitializer(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof WiidgetVisitor ) return ((WiidgetVisitor<? extends T>)visitor).visitElementValueArrayInitializer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ElementValueArrayInitializerContext elementValueArrayInitializer() throws RecognitionException {
		ElementValueArrayInitializerContext _localctx = new ElementValueArrayInitializerContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_elementValueArrayInitializer);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(190); match(LBRACE);
			setState(199);
			_la = _input.LA(1);
			if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4)) | (1L << (IntegerLiteral - 4)) | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4)) | (1L << (StringLiteral - 4)) | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (LBRACE - 4)) | (1L << (Identifier - 4)))) != 0)) {
				{
				setState(191); elementValue();
				setState(196);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(192); match(COMMA);
					setState(193); elementValue();
					}
					}
					setState(198);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(201); match(RBRACE);
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
		enterRule(_localctx, 46, RULE_wiidgetBody);
		int _la;
		try {
			setState(212);
			switch (_input.LA(1)) {
			case SEMI:
				enterOuterAlt(_localctx, 1);
				{
				setState(203); match(SEMI);
				}
				break;
			case LBRACE:
				enterOuterAlt(_localctx, 2);
				{
				setState(204); match(LBRACE);
				setState(208);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << SEAM) | (1L << WiidgetVarSign) | (1L << StringLiteral) | (1L << IF) | (1L << FOREACH))) != 0) || _la==Identifier) {
					{
					{
					setState(205); statementDeclaration();
					}
					}
					setState(210);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(211); match(RBRACE);
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
		enterRule(_localctx, 48, RULE_qualifiedName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(Identifier);
			setState(219);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==DOT) {
				{
				{
				setState(215); match(DOT);
				setState(216); match(Identifier);
				}
				}
				setState(221);
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
		enterRule(_localctx, 50, RULE_literal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(222);
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
		enterRule(_localctx, 52, RULE_expressionList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(224); expression(0);
			setState(229);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(225); match(COMMA);
				setState(226); expression(0);
				}
				}
				setState(231);
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
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
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
		public WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() {
			return getRuleContext(WiidgetMethodCallExpressionContext.class,0);
		}
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
		int _startState = 54;
		enterRecursionRule(_localctx, RULE_expression);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(238);
			switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
			case 1:
				{
				setState(233); match(NegotionOperator);
				setState(234); expression(7);
				}
				break;

			case 2:
				{
				setState(235); primary();
				}
				break;

			case 3:
				{
				setState(236); wiidgetVariable();
				}
				break;

			case 4:
				{
				setState(237); wiidgetMethodCallExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(279);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(277);
					switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
					case 1:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(240);
						if (!(6 >= _localctx._p)) throw new FailedPredicateException(this, "6 >= $_p");
						setState(241); match(MathematicalOperator);
						setState(242); expression(7);
						}
						break;

					case 2:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(243);
						if (!(5 >= _localctx._p)) throw new FailedPredicateException(this, "5 >= $_p");
						setState(244); match(CompareOperator);
						setState(245); expression(6);
						}
						break;

					case 3:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(246);
						if (!(4 >= _localctx._p)) throw new FailedPredicateException(this, "4 >= $_p");
						setState(247); match(EqualityOperator);
						setState(248); expression(5);
						}
						break;

					case 4:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(249);
						if (!(3 >= _localctx._p)) throw new FailedPredicateException(this, "3 >= $_p");
						setState(250); match(LogicalOperator);
						setState(251); expression(4);
						}
						break;

					case 5:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(252);
						if (!(2 >= _localctx._p)) throw new FailedPredicateException(this, "2 >= $_p");
						setState(253); match(DEFAULT_OPERATOR);
						setState(254); expression(3);
						}
						break;

					case 6:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(255);
						if (!(1 >= _localctx._p)) throw new FailedPredicateException(this, "1 >= $_p");
						setState(256); match(QUESTION);
						setState(257); expression(0);
						setState(258); match(COLON);
						setState(259); expression(2);
						}
						break;

					case 7:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(261);
						if (!(10 >= _localctx._p)) throw new FailedPredicateException(this, "10 >= $_p");
						setState(262); match(DOT);
						setState(263); match(Identifier);
						}
						break;

					case 8:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(264);
						if (!(9 >= _localctx._p)) throw new FailedPredicateException(this, "9 >= $_p");
						setState(265); match(LBRACK);
						setState(266); expression(0);
						setState(267); match(RBRACK);
						}
						break;

					case 9:
						{
						_localctx = new ExpressionContext(_parentctx, _parentState, _p);
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(269);
						if (!(8 >= _localctx._p)) throw new FailedPredicateException(this, "8 >= $_p");
						setState(270); match(DOT);
						setState(271); match(Identifier);
						setState(272); match(LPAREN);
						setState(274);
						_la = _input.LA(1);
						if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4)) | (1L << (IntegerLiteral - 4)) | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4)) | (1L << (StringLiteral - 4)) | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (Identifier - 4)))) != 0)) {
							{
							setState(273); expressionList();
							}
						}

						setState(276); match(RPAREN);
						}
						break;
					}
					} 
				}
				setState(281);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
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
		enterRule(_localctx, 56, RULE_primary);
		try {
			setState(288);
			switch (_input.LA(1)) {
			case Identifier:
				enterOuterAlt(_localctx, 1);
				{
				setState(282); match(Identifier);
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
				setState(283); literal();
				}
				break;
			case LPAREN:
				enterOuterAlt(_localctx, 3);
				{
				setState(284); match(LPAREN);
				setState(285); expression(0);
				setState(286); match(RPAREN);
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
		case 27: return expression_sempred((ExpressionContext)_localctx, predIndex);
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
		"\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3F\u0125\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\3\2\7\2>\n\2\f\2\16"+
		"\2A\13\2\3\2\7\2D\n\2\f\2\16\2G\13\2\3\2\3\2\3\3\3\3\3\3\5\3N\n\3\3\3"+
		"\3\3\3\4\3\4\3\4\5\4U\n\4\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6"+
		"a\n\6\3\7\3\7\5\7e\n\7\3\7\3\7\5\7i\n\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13\5\13|\n\13\3\13\3\13\3\f\5\f"+
		"\u0081\n\f\3\f\3\f\5\f\u0085\n\f\3\f\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3"+
		"\17\3\17\3\17\5\17\u0092\n\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21"+
		"\3\21\5\21\u009d\n\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23"+
		"\3\23\5\23\u00aa\n\23\3\23\3\23\3\24\3\24\3\24\7\24\u00b1\n\24\f\24\16"+
		"\24\u00b4\13\24\3\25\3\25\3\25\3\25\3\26\3\26\3\27\3\27\3\27\5\27\u00bf"+
		"\n\27\3\30\3\30\3\30\3\30\7\30\u00c5\n\30\f\30\16\30\u00c8\13\30\5\30"+
		"\u00ca\n\30\3\30\3\30\3\31\3\31\3\31\7\31\u00d1\n\31\f\31\16\31\u00d4"+
		"\13\31\3\31\5\31\u00d7\n\31\3\32\3\32\3\32\7\32\u00dc\n\32\f\32\16\32"+
		"\u00df\13\32\3\33\3\33\3\34\3\34\3\34\7\34\u00e6\n\34\f\34\16\34\u00e9"+
		"\13\34\3\35\3\35\3\35\3\35\3\35\3\35\5\35\u00f1\n\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\5\35\u0115\n\35\3\35\7\35\u0118\n\35\f\35\16\35\u011b\13"+
		"\35\3\36\3\36\3\36\3\36\3\36\3\36\5\36\u0123\n\36\3\36\2\37\2\4\6\b\n"+
		"\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62\64\668:\2\4\4\2\21\21CC\3"+
		"\2\r\22\u0130\2?\3\2\2\2\4J\3\2\2\2\6Q\3\2\2\2\bV\3\2\2\2\n`\3\2\2\2\f"+
		"d\3\2\2\2\16j\3\2\2\2\20o\3\2\2\2\22v\3\2\2\2\24{\3\2\2\2\26\u0080\3\2"+
		"\2\2\30\u0088\3\2\2\2\32\u008b\3\2\2\2\34\u0091\3\2\2\2\36\u0093\3\2\2"+
		"\2 \u0097\3\2\2\2\"\u00a0\3\2\2\2$\u00a6\3\2\2\2&\u00ad\3\2\2\2(\u00b5"+
		"\3\2\2\2*\u00b9\3\2\2\2,\u00be\3\2\2\2.\u00c0\3\2\2\2\60\u00d6\3\2\2\2"+
		"\62\u00d8\3\2\2\2\64\u00e0\3\2\2\2\66\u00e2\3\2\2\28\u00f0\3\2\2\2:\u0122"+
		"\3\2\2\2<>\5\4\3\2=<\3\2\2\2>A\3\2\2\2?=\3\2\2\2?@\3\2\2\2@E\3\2\2\2A"+
		"?\3\2\2\2BD\5\n\6\2CB\3\2\2\2DG\3\2\2\2EC\3\2\2\2EF\3\2\2\2FH\3\2\2\2"+
		"GE\3\2\2\2HI\7\2\2\3I\3\3\2\2\2JM\7\t\2\2KN\5\6\4\2LN\5\b\5\2MK\3\2\2"+
		"\2ML\3\2\2\2NO\3\2\2\2OP\7\35\2\2P\5\3\2\2\2QT\5\62\32\2RS\7\26\2\2SU"+
		"\7C\2\2TR\3\2\2\2TU\3\2\2\2U\7\3\2\2\2VW\7\21\2\2WX\7\26\2\2XY\7C\2\2"+
		"Y\t\3\2\2\2Za\5\f\7\2[a\5\26\f\2\\]\5 \21\2]^\7\35\2\2^a\3\2\2\2_a\5\""+
		"\22\2`Z\3\2\2\2`[\3\2\2\2`\\\3\2\2\2`_\3\2\2\2a\13\3\2\2\2be\5\16\b\2"+
		"ce\5\20\t\2db\3\2\2\2dc\3\2\2\2ef\3\2\2\2fh\5\60\31\2gi\5\22\n\2hg\3\2"+
		"\2\2hi\3\2\2\2i\r\3\2\2\2jk\7\23\2\2kl\7\27\2\2lm\58\35\2mn\7\30\2\2n"+
		"\17\3\2\2\2op\7\24\2\2pq\7\27\2\2qr\5\24\13\2rs\7&\2\2st\58\35\2tu\7\30"+
		"\2\2u\21\3\2\2\2vw\7\25\2\2wx\5\60\31\2x\23\3\2\2\2yz\7C\2\2z|\7 \2\2"+
		"{y\3\2\2\2{|\3\2\2\2|}\3\2\2\2}~\7C\2\2~\25\3\2\2\2\177\u0081\5\30\r\2"+
		"\u0080\177\3\2\2\2\u0080\u0081\3\2\2\2\u0081\u0082\3\2\2\2\u0082\u0084"+
		"\5\34\17\2\u0083\u0085\5$\23\2\u0084\u0083\3\2\2\2\u0084\u0085\3\2\2\2"+
		"\u0085\u0086\3\2\2\2\u0086\u0087\5\60\31\2\u0087\27\3\2\2\2\u0088\u0089"+
		"\5\32\16\2\u0089\u008a\7&\2\2\u008a\31\3\2\2\2\u008b\u008c\7\f\2\2\u008c"+
		"\u008d\7C\2\2\u008d\33\3\2\2\2\u008e\u0092\5\36\20\2\u008f\u0092\7C\2"+
		"\2\u0090\u0092\7\21\2\2\u0091\u008e\3\2\2\2\u0091\u008f\3\2\2\2\u0091"+
		"\u0090\3\2\2\2\u0092\35\3\2\2\2\u0093\u0094\7\3\2\2\u0094\u0095\58\35"+
		"\2\u0095\u0096\7\3\2\2\u0096\37\3\2\2\2\u0097\u0098\5\32\16\2\u0098\u0099"+
		"\7\37\2\2\u0099\u009a\7C\2\2\u009a\u009c\7\27\2\2\u009b\u009d\5\66\34"+
		"\2\u009c\u009b\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009f"+
		"\7\30\2\2\u009f!\3\2\2\2\u00a0\u00a1\7\13\2\2\u00a1\u00a2\7\27\2\2\u00a2"+
		"\u00a3\58\35\2\u00a3\u00a4\7\30\2\2\u00a4\u00a5\5\60\31\2\u00a5#\3\2\2"+
		"\2\u00a6\u00a9\7\27\2\2\u00a7\u00aa\5,\27\2\u00a8\u00aa\5&\24\2\u00a9"+
		"\u00a7\3\2\2\2\u00a9\u00a8\3\2\2\2\u00a9\u00aa\3\2\2\2\u00aa\u00ab\3\2"+
		"\2\2\u00ab\u00ac\7\30\2\2\u00ac%\3\2\2\2\u00ad\u00b2\5(\25\2\u00ae\u00af"+
		"\7\36\2\2\u00af\u00b1\5(\25\2\u00b0\u00ae\3\2\2\2\u00b1\u00b4\3\2\2\2"+
		"\u00b2\u00b0\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\'\3\2\2\2\u00b4\u00b2\3"+
		"\2\2\2\u00b5\u00b6\5*\26\2\u00b6\u00b7\7\61\2\2\u00b7\u00b8\5,\27\2\u00b8"+
		")\3\2\2\2\u00b9\u00ba\t\2\2\2\u00ba+\3\2\2\2\u00bb\u00bf\58\35\2\u00bc"+
		"\u00bf\5\62\32\2\u00bd\u00bf\5.\30\2\u00be\u00bb\3\2\2\2\u00be\u00bc\3"+
		"\2\2\2\u00be\u00bd\3\2\2\2\u00bf-\3\2\2\2\u00c0\u00c9\7\31\2\2\u00c1\u00c6"+
		"\5,\27\2\u00c2\u00c3\7\36\2\2\u00c3\u00c5\5,\27\2\u00c4\u00c2\3\2\2\2"+
		"\u00c5\u00c8\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00ca"+
		"\3\2\2\2\u00c8\u00c6\3\2\2\2\u00c9\u00c1\3\2\2\2\u00c9\u00ca\3\2\2\2\u00ca"+
		"\u00cb\3\2\2\2\u00cb\u00cc\7\32\2\2\u00cc/\3\2\2\2\u00cd\u00d7\7\35\2"+
		"\2\u00ce\u00d2\7\31\2\2\u00cf\u00d1\5\n\6\2\u00d0\u00cf\3\2\2\2\u00d1"+
		"\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d5\3\2"+
		"\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d7\7\32\2\2\u00d6\u00cd\3\2\2\2\u00d6"+
		"\u00ce\3\2\2\2\u00d7\61\3\2\2\2\u00d8\u00dd\7C\2\2\u00d9\u00da\7\37\2"+
		"\2\u00da\u00dc\7C\2\2\u00db\u00d9\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\63\3\2\2\2\u00df\u00dd\3\2\2\2\u00e0"+
		"\u00e1\t\3\2\2\u00e1\65\3\2\2\2\u00e2\u00e7\58\35\2\u00e3\u00e4\7\36\2"+
		"\2\u00e4\u00e6\58\35\2\u00e5\u00e3\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7\u00e5"+
		"\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8\67\3\2\2\2\u00e9\u00e7\3\2\2\2\u00ea"+
		"\u00eb\b\35\1\2\u00eb\u00ec\7\6\2\2\u00ec\u00f1\58\35\2\u00ed\u00f1\5"+
		":\36\2\u00ee\u00f1\5\32\16\2\u00ef\u00f1\5 \21\2\u00f0\u00ea\3\2\2\2\u00f0"+
		"\u00ed\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f0\u00ef\3\2\2\2\u00f1\u0119\3\2"+
		"\2\2\u00f2\u00f3\6\35\2\3\u00f3\u00f4\7\5\2\2\u00f4\u0118\58\35\2\u00f5"+
		"\u00f6\6\35\3\3\u00f6\u00f7\7\7\2\2\u00f7\u0118\58\35\2\u00f8\u00f9\6"+
		"\35\4\3\u00f9\u00fa\7\b\2\2\u00fa\u0118\58\35\2\u00fb\u00fc\6\35\5\3\u00fc"+
		"\u00fd\7\4\2\2\u00fd\u0118\58\35\2\u00fe\u00ff\6\35\6\3\u00ff\u0100\7"+
		"\n\2\2\u0100\u0118\58\35\2\u0101\u0102\6\35\7\3\u0102\u0103\7%\2\2\u0103"+
		"\u0104\58\35\2\u0104\u0105\7&\2\2\u0105\u0106\58\35\2\u0106\u0118\3\2"+
		"\2\2\u0107\u0108\6\35\b\3\u0108\u0109\7\37\2\2\u0109\u0118\7C\2\2\u010a"+
		"\u010b\6\35\t\3\u010b\u010c\7\33\2\2\u010c\u010d\58\35\2\u010d\u010e\7"+
		"\34\2\2\u010e\u0118\3\2\2\2\u010f\u0110\6\35\n\3\u0110\u0111\7\37\2\2"+
		"\u0111\u0112\7C\2\2\u0112\u0114\7\27\2\2\u0113\u0115\5\66\34\2\u0114\u0113"+
		"\3\2\2\2\u0114\u0115\3\2\2\2\u0115\u0116\3\2\2\2\u0116\u0118\7\30\2\2"+
		"\u0117\u00f2\3\2\2\2\u0117\u00f5\3\2\2\2\u0117\u00f8\3\2\2\2\u0117\u00fb"+
		"\3\2\2\2\u0117\u00fe\3\2\2\2\u0117\u0101\3\2\2\2\u0117\u0107\3\2\2\2\u0117"+
		"\u010a\3\2\2\2\u0117\u010f\3\2\2\2\u0118\u011b\3\2\2\2\u0119\u0117\3\2"+
		"\2\2\u0119\u011a\3\2\2\2\u011a9\3\2\2\2\u011b\u0119\3\2\2\2\u011c\u0123"+
		"\7C\2\2\u011d\u0123\5\64\33\2\u011e\u011f\7\27\2\2\u011f\u0120\58\35\2"+
		"\u0120\u0121\7\30\2\2\u0121\u0123\3\2\2\2\u0122\u011c\3\2\2\2\u0122\u011d"+
		"\3\2\2\2\u0122\u011e\3\2\2\2\u0123;\3\2\2\2\34?EMT`dh{\u0080\u0084\u0091"+
		"\u009c\u00a9\u00b2\u00be\u00c6\u00c9\u00d2\u00d6\u00dd\u00e7\u00f0\u0114"+
		"\u0117\u0119\u0122";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}