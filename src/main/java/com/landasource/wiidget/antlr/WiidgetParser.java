// Generated from C:\Users\Zsolti\Documents\GitHub\landasource\wiidget-core\src\main\java\com\landasource\wiidget\antlr\Wiidget.g4 by ANTLR 4.1
package com.landasource.wiidget.antlr;

import java.util.List;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNSimulator;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings({ "all", "warnings", "unchecked", "unused", "cast" })
public class WiidgetParser extends Parser {
    protected static final DFA[] _decisionToDFA;
    protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
    public static final int T__0 = 1, LogicalOperator = 2, MathematicalOperator = 3, NegotionOperator = 4, CompareOperator = 5, EqualityOperator = 6, IMPORT = 7,
            DEFAULT_OPERATOR = 8, SEAM = 9, WiidgetVarSign = 10, IntegerLiteral = 11, FloatingPointLiteral = 12, BooleanLiteral = 13, CharacterLiteral = 14, StringLiteral = 15,
            NullLiteral = 16, IF = 17, FOREACH = 18, ELSE = 19, AS = 20, LPAREN = 21, RPAREN = 22, LBRACE = 23, RBRACE = 24, LBRACK = 25, RBRACK = 26, SEMI = 27, COMMA = 28,
            DOT = 29, ARROW = 30, GT = 31, LT = 32, BANG = 33, TILDE = 34, QUESTION = 35, COLON = 36, EQUAL = 37, LE = 38, GE = 39, NOTEQUAL = 40, AND = 41, OR = 42, INC = 43,
            DEC = 44, ADD = 45, SUB = 46, ASSIGN = 47, MUL = 48, DIV = 49, BITAND = 50, BITOR = 51, CARET = 52, MOD = 53, ADD_ASSIGN = 54, SUB_ASSIGN = 55, MUL_ASSIGN = 56,
            DIV_ASSIGN = 57, AND_ASSIGN = 58, OR_ASSIGN = 59, XOR_ASSIGN = 60, MOD_ASSIGN = 61, LSHIFT_ASSIGN = 62, RSHIFT_ASSIGN = 63, URSHIFT_ASSIGN = 64, Identifier = 65,
            WS = 66, COMMENT = 67, LINE_COMMENT = 68;
    public static final String[] tokenNames = { "<INVALID>", "'`'", "LogicalOperator", "MathematicalOperator", "NegotionOperator", "CompareOperator", "EqualityOperator",
            "'import'", "DEFAULT_OPERATOR", "'seam'", "'$'", "IntegerLiteral", "FloatingPointLiteral", "BooleanLiteral", "CharacterLiteral", "StringLiteral", "'null'", "'if'",
            "'foreach'", "'else'", "'as'", "'('", "')'", "'{'", "'}'", "'['", "']'", "';'", "','", "'.'", "'->'", "'>'", "'<'", "'!'", "TILDE", "'?'", "':'", "'=='", "'<='",
            "'>='", "'!='", "'&&'", "'||'", "'++'", "'--'", "'+'", "'-'", "'='", "'*'", "'/'", "'&'", "'|'", "'^'", "'%'", "'+='", "'-='", "'*='", "'/='", "'&='", "'|='", "'^='",
            "'%='", "'<<='", "'>>='", "'>>>='", "Identifier", "WS", "COMMENT", "LINE_COMMENT" };
    public static final int RULE_compilationUnit = 0, RULE_importDeclaration = 1, RULE_innerImport = 2, RULE_externalImport = 3, RULE_statementDeclaration = 4,
            RULE_controlStatement = 5, RULE_ifControl = 6, RULE_foreachControl = 7, RULE_elseControl = 8, RULE_foreachVariable = 9, RULE_wiidgetDeclaration = 10,
            RULE_wiidgetVariableBinding = 11, RULE_wiidgetVariable = 12, RULE_unifiedWiidgetName = 13, RULE_expressionWiidgetName = 14, RULE_wiidgetMethodCallExpression = 15,
            RULE_seamStatement = 16, RULE_wiidgetArguments = 17, RULE_elementValuePairs = 18, RULE_elementValuePair = 19, RULE_attributeName = 20, RULE_elementValue = 21,
            RULE_elementValueArrayInitializer = 22, RULE_mapExpression = 23, RULE_mapEntry = 24, RULE_mapKey = 25, RULE_listExpression = 26, RULE_wiidgetBody = 27,
            RULE_qualifiedName = 28, RULE_literal = 29, RULE_expressionList = 30, RULE_expression = 31, RULE_primary = 32;
    public static final String[] ruleNames = { "compilationUnit", "importDeclaration", "innerImport", "externalImport", "statementDeclaration", "controlStatement", "ifControl",
            "foreachControl", "elseControl", "foreachVariable", "wiidgetDeclaration", "wiidgetVariableBinding", "wiidgetVariable", "unifiedWiidgetName", "expressionWiidgetName",
            "wiidgetMethodCallExpression", "seamStatement", "wiidgetArguments", "elementValuePairs", "elementValuePair", "attributeName", "elementValue",
            "elementValueArrayInitializer", "mapExpression", "mapEntry", "mapKey", "listExpression", "wiidgetBody", "qualifiedName", "literal", "expressionList", "expression",
            "primary" };

    @Override
    public String getGrammarFileName() {
        return "Wiidget.g4";
    }

    @Override
    public String[] getTokenNames() {
        return tokenNames;
    }

    @Override
    public String[] getRuleNames() {
        return ruleNames;
    }

    @Override
    public ATN getATN() {
        return _ATN;
    }

    public WiidgetParser(final TokenStream input) {
        super(input);
        _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
    }

    public static class CompilationUnitContext extends ParserRuleContext {
        public List<ImportDeclarationContext> importDeclaration() {
            return getRuleContexts(ImportDeclarationContext.class);
        }

        public TerminalNode EOF() {
            return getToken(WiidgetParser.EOF, 0);
        }

        public ImportDeclarationContext importDeclaration(final int i) {
            return getRuleContext(ImportDeclarationContext.class, i);
        }

        public StatementDeclarationContext statementDeclaration(final int i) {
            return getRuleContext(StatementDeclarationContext.class, i);
        }

        public List<StatementDeclarationContext> statementDeclaration() {
            return getRuleContexts(StatementDeclarationContext.class);
        }

        public CompilationUnitContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_compilationUnit;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterCompilationUnit(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitCompilationUnit(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitCompilationUnit(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final CompilationUnitContext compilationUnit() throws RecognitionException {
        final CompilationUnitContext _localctx = new CompilationUnitContext(_ctx, getState());
        enterRule(_localctx, 0, RULE_compilationUnit);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(69);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == IMPORT) {
                    {
                        {
                            setState(66);
                            importDeclaration();
                        }
                    }
                    setState(71);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(75);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << SEAM) | (1L << WiidgetVarSign) | (1L << StringLiteral) | (1L << IF) | (1L << FOREACH))) != 0)
                        || _la == Identifier) {
                    {
                        {
                            setState(72);
                            statementDeclaration();
                        }
                    }
                    setState(77);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
                setState(78);
                match(EOF);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ImportDeclarationContext extends ParserRuleContext {
        public TerminalNode IMPORT() {
            return getToken(WiidgetParser.IMPORT, 0);
        }

        public ExternalImportContext externalImport() {
            return getRuleContext(ExternalImportContext.class, 0);
        }

        public InnerImportContext innerImport() {
            return getRuleContext(InnerImportContext.class, 0);
        }

        public ImportDeclarationContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_importDeclaration;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterImportDeclaration(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitImportDeclaration(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitImportDeclaration(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ImportDeclarationContext importDeclaration() throws RecognitionException {
        final ImportDeclarationContext _localctx = new ImportDeclarationContext(_ctx, getState());
        enterRule(_localctx, 2, RULE_importDeclaration);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(80);
                match(IMPORT);
                setState(83);
                switch (_input.LA(1)) {
                case Identifier: {
                    setState(81);
                    innerImport();
                }
                    break;
                case StringLiteral: {
                    setState(82);
                    externalImport();
                }
                    break;
                default:
                    throw new NoViableAltException(this);
                }
                setState(85);
                match(SEMI);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class InnerImportContext extends ParserRuleContext {
        public TerminalNode AS() {
            return getToken(WiidgetParser.AS, 0);
        }

        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(WiidgetParser.Identifier, 0);
        }

        public InnerImportContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_innerImport;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterInnerImport(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitInnerImport(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitInnerImport(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final InnerImportContext innerImport() throws RecognitionException {
        final InnerImportContext _localctx = new InnerImportContext(_ctx, getState());
        enterRule(_localctx, 4, RULE_innerImport);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(87);
                qualifiedName();
                setState(90);
                _la = _input.LA(1);
                if (_la == AS) {
                    {
                        setState(88);
                        match(AS);
                        setState(89);
                        match(Identifier);
                    }
                }

            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExternalImportContext extends ParserRuleContext {
        public TerminalNode AS() {
            return getToken(WiidgetParser.AS, 0);
        }

        public TerminalNode Identifier() {
            return getToken(WiidgetParser.Identifier, 0);
        }

        public TerminalNode StringLiteral() {
            return getToken(WiidgetParser.StringLiteral, 0);
        }

        public ExternalImportContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_externalImport;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterExternalImport(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitExternalImport(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitExternalImport(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ExternalImportContext externalImport() throws RecognitionException {
        final ExternalImportContext _localctx = new ExternalImportContext(_ctx, getState());
        enterRule(_localctx, 6, RULE_externalImport);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(92);
                match(StringLiteral);
                setState(93);
                match(AS);
                setState(94);
                match(Identifier);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class StatementDeclarationContext extends ParserRuleContext {
        public SeamStatementContext seamStatement() {
            return getRuleContext(SeamStatementContext.class, 0);
        }

        public WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() {
            return getRuleContext(WiidgetMethodCallExpressionContext.class, 0);
        }

        public WiidgetDeclarationContext wiidgetDeclaration() {
            return getRuleContext(WiidgetDeclarationContext.class, 0);
        }

        public ControlStatementContext controlStatement() {
            return getRuleContext(ControlStatementContext.class, 0);
        }

        public StatementDeclarationContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_statementDeclaration;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterStatementDeclaration(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitStatementDeclaration(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitStatementDeclaration(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final StatementDeclarationContext statementDeclaration() throws RecognitionException {
        final StatementDeclarationContext _localctx = new StatementDeclarationContext(_ctx, getState());
        enterRule(_localctx, 8, RULE_statementDeclaration);
        try {
            setState(102);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(96);
                    controlStatement();
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(97);
                    wiidgetDeclaration();
                }
                break;

            case 3:
                enterOuterAlt(_localctx, 3);
                {
                    setState(98);
                    wiidgetMethodCallExpression();
                    setState(99);
                    match(SEMI);
                }
                break;

            case 4:
                enterOuterAlt(_localctx, 4);
                {
                    setState(101);
                    seamStatement();
                }
                break;
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ControlStatementContext extends ParserRuleContext {
        public IfControlContext ifControl() {
            return getRuleContext(IfControlContext.class, 0);
        }

        public ElseControlContext elseControl() {
            return getRuleContext(ElseControlContext.class, 0);
        }

        public WiidgetBodyContext wiidgetBody() {
            return getRuleContext(WiidgetBodyContext.class, 0);
        }

        public ForeachControlContext foreachControl() {
            return getRuleContext(ForeachControlContext.class, 0);
        }

        public ControlStatementContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_controlStatement;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterControlStatement(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitControlStatement(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitControlStatement(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ControlStatementContext controlStatement() throws RecognitionException {
        final ControlStatementContext _localctx = new ControlStatementContext(_ctx, getState());
        enterRule(_localctx, 10, RULE_controlStatement);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(106);
                switch (_input.LA(1)) {
                case IF: {
                    setState(104);
                    ifControl();
                }
                    break;
                case FOREACH: {
                    setState(105);
                    foreachControl();
                }
                    break;
                default:
                    throw new NoViableAltException(this);
                }
                setState(108);
                wiidgetBody();
                setState(110);
                _la = _input.LA(1);
                if (_la == ELSE) {
                    {
                        setState(109);
                        elseControl();
                    }
                }

            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class IfControlContext extends ParserRuleContext {
        public TerminalNode IF() {
            return getToken(WiidgetParser.IF, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(WiidgetParser.RPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(WiidgetParser.LPAREN, 0);
        }

        public IfControlContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_ifControl;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterIfControl(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitIfControl(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitIfControl(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final IfControlContext ifControl() throws RecognitionException {
        final IfControlContext _localctx = new IfControlContext(_ctx, getState());
        enterRule(_localctx, 12, RULE_ifControl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(112);
                match(IF);
                setState(113);
                match(LPAREN);
                setState(114);
                expression(0);
                setState(115);
                match(RPAREN);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForeachControlContext extends ParserRuleContext {
        public ForeachVariableContext foreachVariable() {
            return getRuleContext(ForeachVariableContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(WiidgetParser.RPAREN, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(WiidgetParser.LPAREN, 0);
        }

        public TerminalNode FOREACH() {
            return getToken(WiidgetParser.FOREACH, 0);
        }

        public ForeachControlContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_foreachControl;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterForeachControl(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitForeachControl(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitForeachControl(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ForeachControlContext foreachControl() throws RecognitionException {
        final ForeachControlContext _localctx = new ForeachControlContext(_ctx, getState());
        enterRule(_localctx, 14, RULE_foreachControl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(117);
                match(FOREACH);
                setState(118);
                match(LPAREN);
                setState(119);
                foreachVariable();
                setState(120);
                match(COLON);
                setState(121);
                expression(0);
                setState(122);
                match(RPAREN);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElseControlContext extends ParserRuleContext {
        public TerminalNode ELSE() {
            return getToken(WiidgetParser.ELSE, 0);
        }

        public WiidgetBodyContext wiidgetBody() {
            return getRuleContext(WiidgetBodyContext.class, 0);
        }

        public ElseControlContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elseControl;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterElseControl(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitElseControl(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitElseControl(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ElseControlContext elseControl() throws RecognitionException {
        final ElseControlContext _localctx = new ElseControlContext(_ctx, getState());
        enterRule(_localctx, 16, RULE_elseControl);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(124);
                match(ELSE);
                setState(125);
                wiidgetBody();
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ForeachVariableContext extends ParserRuleContext {
        public TerminalNode ARROW() {
            return getToken(WiidgetParser.ARROW, 0);
        }

        public TerminalNode Identifier(final int i) {
            return getToken(WiidgetParser.Identifier, i);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(WiidgetParser.Identifier);
        }

        public ForeachVariableContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_foreachVariable;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterForeachVariable(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitForeachVariable(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitForeachVariable(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ForeachVariableContext foreachVariable() throws RecognitionException {
        final ForeachVariableContext _localctx = new ForeachVariableContext(_ctx, getState());
        enterRule(_localctx, 18, RULE_foreachVariable);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(129);
                switch (getInterpreter().adaptivePredict(_input, 7, _ctx)) {
                case 1: {
                    setState(127);
                    match(Identifier);
                    setState(128);
                    match(ARROW);
                }
                    break;
                }
                setState(131);
                match(Identifier);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WiidgetDeclarationContext extends ParserRuleContext {
        public WiidgetVariableBindingContext wiidgetVariableBinding() {
            return getRuleContext(WiidgetVariableBindingContext.class, 0);
        }

        public WiidgetArgumentsContext wiidgetArguments() {
            return getRuleContext(WiidgetArgumentsContext.class, 0);
        }

        public UnifiedWiidgetNameContext unifiedWiidgetName() {
            return getRuleContext(UnifiedWiidgetNameContext.class, 0);
        }

        public WiidgetBodyContext wiidgetBody() {
            return getRuleContext(WiidgetBodyContext.class, 0);
        }

        public WiidgetDeclarationContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_wiidgetDeclaration;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterWiidgetDeclaration(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitWiidgetDeclaration(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitWiidgetDeclaration(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final WiidgetDeclarationContext wiidgetDeclaration() throws RecognitionException {
        final WiidgetDeclarationContext _localctx = new WiidgetDeclarationContext(_ctx, getState());
        enterRule(_localctx, 20, RULE_wiidgetDeclaration);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(134);
                _la = _input.LA(1);
                if (_la == WiidgetVarSign) {
                    {
                        setState(133);
                        wiidgetVariableBinding();
                    }
                }

                setState(136);
                unifiedWiidgetName();
                setState(138);
                _la = _input.LA(1);
                if (_la == LPAREN) {
                    {
                        setState(137);
                        wiidgetArguments();
                    }
                }

                setState(140);
                wiidgetBody();
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WiidgetVariableBindingContext extends ParserRuleContext {
        public WiidgetVariableContext wiidgetVariable() {
            return getRuleContext(WiidgetVariableContext.class, 0);
        }

        public TerminalNode COLON() {
            return getToken(WiidgetParser.COLON, 0);
        }

        public WiidgetVariableBindingContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_wiidgetVariableBinding;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterWiidgetVariableBinding(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitWiidgetVariableBinding(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitWiidgetVariableBinding(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final WiidgetVariableBindingContext wiidgetVariableBinding() throws RecognitionException {
        final WiidgetVariableBindingContext _localctx = new WiidgetVariableBindingContext(_ctx, getState());
        enterRule(_localctx, 22, RULE_wiidgetVariableBinding);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(142);
                wiidgetVariable();
                setState(143);
                match(COLON);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WiidgetVariableContext extends ParserRuleContext {
        public TerminalNode WiidgetVarSign() {
            return getToken(WiidgetParser.WiidgetVarSign, 0);
        }

        public TerminalNode Identifier() {
            return getToken(WiidgetParser.Identifier, 0);
        }

        public WiidgetVariableContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_wiidgetVariable;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterWiidgetVariable(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitWiidgetVariable(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitWiidgetVariable(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final WiidgetVariableContext wiidgetVariable() throws RecognitionException {
        final WiidgetVariableContext _localctx = new WiidgetVariableContext(_ctx, getState());
        enterRule(_localctx, 24, RULE_wiidgetVariable);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(145);
                match(WiidgetVarSign);
                setState(146);
                match(Identifier);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class UnifiedWiidgetNameContext extends ParserRuleContext {
        public ExpressionWiidgetNameContext expressionWiidgetName() {
            return getRuleContext(ExpressionWiidgetNameContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(WiidgetParser.Identifier, 0);
        }

        public TerminalNode StringLiteral() {
            return getToken(WiidgetParser.StringLiteral, 0);
        }

        public UnifiedWiidgetNameContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_unifiedWiidgetName;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterUnifiedWiidgetName(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitUnifiedWiidgetName(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitUnifiedWiidgetName(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final UnifiedWiidgetNameContext unifiedWiidgetName() throws RecognitionException {
        final UnifiedWiidgetNameContext _localctx = new UnifiedWiidgetNameContext(_ctx, getState());
        enterRule(_localctx, 26, RULE_unifiedWiidgetName);
        try {
            setState(151);
            switch (_input.LA(1)) {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(148);
                    expressionWiidgetName();
                }
                break;
            case Identifier:
                enterOuterAlt(_localctx, 2);
                {
                    setState(149);
                    match(Identifier);
                }
                break;
            case StringLiteral:
                enterOuterAlt(_localctx, 3);
                {
                    setState(150);
                    match(StringLiteral);
                }
                break;
            default:
                throw new NoViableAltException(this);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionWiidgetNameContext extends ParserRuleContext {
        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ExpressionWiidgetNameContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expressionWiidgetName;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterExpressionWiidgetName(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitExpressionWiidgetName(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitExpressionWiidgetName(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ExpressionWiidgetNameContext expressionWiidgetName() throws RecognitionException {
        final ExpressionWiidgetNameContext _localctx = new ExpressionWiidgetNameContext(_ctx, getState());
        enterRule(_localctx, 28, RULE_expressionWiidgetName);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(153);
                match(1);
                setState(154);
                expression(0);
                setState(155);
                match(1);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WiidgetMethodCallExpressionContext extends ParserRuleContext {
        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(WiidgetParser.RPAREN, 0);
        }

        public TerminalNode Identifier() {
            return getToken(WiidgetParser.Identifier, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(WiidgetParser.LPAREN, 0);
        }

        public WiidgetVariableContext wiidgetVariable() {
            return getRuleContext(WiidgetVariableContext.class, 0);
        }

        public WiidgetMethodCallExpressionContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_wiidgetMethodCallExpression;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterWiidgetMethodCallExpression(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitWiidgetMethodCallExpression(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitWiidgetMethodCallExpression(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() throws RecognitionException {
        final WiidgetMethodCallExpressionContext _localctx = new WiidgetMethodCallExpressionContext(_ctx, getState());
        enterRule(_localctx, 30, RULE_wiidgetMethodCallExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(157);
                wiidgetVariable();
                setState(158);
                match(DOT);
                setState(159);
                match(Identifier);
                setState(160);
                match(LPAREN);
                setState(162);
                _la = _input.LA(1);
                if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4)) | (1L << (IntegerLiteral - 4))
                        | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4)) | (1L << (StringLiteral - 4))
                        | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (LBRACE - 4)) | (1L << (LBRACK - 4)) | (1L << (Identifier - 4)))) != 0)) {
                    {
                        setState(161);
                        expressionList();
                    }
                }

                setState(164);
                match(RPAREN);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class SeamStatementContext extends ParserRuleContext {
        public TerminalNode RPAREN() {
            return getToken(WiidgetParser.RPAREN, 0);
        }

        public TerminalNode SEAM() {
            return getToken(WiidgetParser.SEAM, 0);
        }

        public WiidgetBodyContext wiidgetBody() {
            return getRuleContext(WiidgetBodyContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(WiidgetParser.LPAREN, 0);
        }

        public SeamStatementContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_seamStatement;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterSeamStatement(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitSeamStatement(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitSeamStatement(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final SeamStatementContext seamStatement() throws RecognitionException {
        final SeamStatementContext _localctx = new SeamStatementContext(_ctx, getState());
        enterRule(_localctx, 32, RULE_seamStatement);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(166);
                match(SEAM);
                setState(167);
                match(LPAREN);
                setState(168);
                expression(0);
                setState(169);
                match(RPAREN);
                setState(170);
                wiidgetBody();
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WiidgetArgumentsContext extends ParserRuleContext {
        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class, 0);
        }

        public ElementValuePairsContext elementValuePairs() {
            return getRuleContext(ElementValuePairsContext.class, 0);
        }

        public WiidgetArgumentsContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_wiidgetArguments;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterWiidgetArguments(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitWiidgetArguments(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitWiidgetArguments(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final WiidgetArgumentsContext wiidgetArguments() throws RecognitionException {
        final WiidgetArgumentsContext _localctx = new WiidgetArgumentsContext(_ctx, getState());
        enterRule(_localctx, 34, RULE_wiidgetArguments);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(172);
                match(LPAREN);
                setState(175);
                switch (getInterpreter().adaptivePredict(_input, 12, _ctx)) {
                case 1: {
                    setState(173);
                    elementValue();
                }
                    break;

                case 2: {
                    setState(174);
                    elementValuePairs();
                }
                    break;
                }
                setState(177);
                match(RPAREN);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementValuePairsContext extends ParserRuleContext {
        public List<ElementValuePairContext> elementValuePair() {
            return getRuleContexts(ElementValuePairContext.class);
        }

        public ElementValuePairContext elementValuePair(final int i) {
            return getRuleContext(ElementValuePairContext.class, i);
        }

        public ElementValuePairsContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValuePairs;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterElementValuePairs(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitElementValuePairs(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitElementValuePairs(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ElementValuePairsContext elementValuePairs() throws RecognitionException {
        final ElementValuePairsContext _localctx = new ElementValuePairsContext(_ctx, getState());
        enterRule(_localctx, 36, RULE_elementValuePairs);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(179);
                elementValuePair();
                setState(184);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(180);
                            match(COMMA);
                            setState(181);
                            elementValuePair();
                        }
                    }
                    setState(186);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementValuePairContext extends ParserRuleContext {
        public ElementValueContext elementValue() {
            return getRuleContext(ElementValueContext.class, 0);
        }

        public AttributeNameContext attributeName() {
            return getRuleContext(AttributeNameContext.class, 0);
        }

        public TerminalNode ASSIGN() {
            return getToken(WiidgetParser.ASSIGN, 0);
        }

        public ElementValuePairContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValuePair;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterElementValuePair(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitElementValuePair(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitElementValuePair(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ElementValuePairContext elementValuePair() throws RecognitionException {
        final ElementValuePairContext _localctx = new ElementValuePairContext(_ctx, getState());
        enterRule(_localctx, 38, RULE_elementValuePair);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(187);
                attributeName();
                setState(188);
                match(ASSIGN);
                setState(189);
                elementValue();
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class AttributeNameContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(WiidgetParser.Identifier, 0);
        }

        public TerminalNode StringLiteral() {
            return getToken(WiidgetParser.StringLiteral, 0);
        }

        public AttributeNameContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_attributeName;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterAttributeName(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitAttributeName(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitAttributeName(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final AttributeNameContext attributeName() throws RecognitionException {
        final AttributeNameContext _localctx = new AttributeNameContext(_ctx, getState());
        enterRule(_localctx, 40, RULE_attributeName);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(191);
                _la = _input.LA(1);
                if (!(_la == StringLiteral || _la == Identifier)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ElementValueContext extends ParserRuleContext {
        public QualifiedNameContext qualifiedName() {
            return getRuleContext(QualifiedNameContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public ElementValueContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_elementValue;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterElementValue(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitElementValue(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitElementValue(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ElementValueContext elementValue() throws RecognitionException {
        final ElementValueContext _localctx = new ElementValueContext(_ctx, getState());
        enterRule(_localctx, 42, RULE_elementValue);
        try {
            setState(196);
            switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
            case 1:
                enterOuterAlt(_localctx, 1);
                {
                    setState(193);
                    expression(0);
                }
                break;

            case 2:
                enterOuterAlt(_localctx, 2);
                {
                    setState(194);
                    qualifiedName();
                }
                break;
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MapExpressionContext extends ParserRuleContext {
        public MapEntryContext mapEntry(final int i) {
            return getRuleContext(MapEntryContext.class, i);
        }

        public List<MapEntryContext> mapEntry() {
            return getRuleContexts(MapEntryContext.class);
        }

        public MapExpressionContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapExpression;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterMapExpression(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitMapExpression(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitMapExpression(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final MapExpressionContext mapExpression() throws RecognitionException {
        final MapExpressionContext _localctx = new MapExpressionContext(_ctx, getState());
        enterRule(_localctx, 46, RULE_mapExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(211);
                match(LBRACE);
                setState(220);
                _la = _input.LA(1);
                if (_la == StringLiteral || _la == Identifier) {
                    {
                        setState(212);
                        mapEntry();
                        setState(217);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(213);
                                    match(COMMA);
                                    setState(214);
                                    mapEntry();
                                }
                            }
                            setState(219);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(222);
                match(RBRACE);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MapEntryContext extends ParserRuleContext {
        public MapKeyContext mapKey() {
            return getRuleContext(MapKeyContext.class, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public MapEntryContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapEntry;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterMapEntry(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitMapEntry(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitMapEntry(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final MapEntryContext mapEntry() throws RecognitionException {
        final MapEntryContext _localctx = new MapEntryContext(_ctx, getState());
        enterRule(_localctx, 48, RULE_mapEntry);
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(224);
                mapKey();
                setState(225);
                match(COLON);
                setState(226);
                expression(0);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class MapKeyContext extends ParserRuleContext {
        public TerminalNode Identifier() {
            return getToken(WiidgetParser.Identifier, 0);
        }

        public TerminalNode StringLiteral() {
            return getToken(WiidgetParser.StringLiteral, 0);
        }

        public MapKeyContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_mapKey;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterMapKey(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitMapKey(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitMapKey(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final MapKeyContext mapKey() throws RecognitionException {
        final MapKeyContext _localctx = new MapKeyContext(_ctx, getState());
        enterRule(_localctx, 50, RULE_mapKey);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(228);
                _la = _input.LA(1);
                if (!(_la == StringLiteral || _la == Identifier)) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ListExpressionContext extends ParserRuleContext {
        public ExpressionContext expression(final int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ListExpressionContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_listExpression;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterListExpression(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitListExpression(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitListExpression(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ListExpressionContext listExpression() throws RecognitionException {
        final ListExpressionContext _localctx = new ListExpressionContext(_ctx, getState());
        enterRule(_localctx, 52, RULE_listExpression);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(230);
                match(LBRACK);
                setState(239);
                _la = _input.LA(1);
                if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4)) | (1L << (IntegerLiteral - 4))
                        | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4)) | (1L << (StringLiteral - 4))
                        | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (LBRACE - 4)) | (1L << (LBRACK - 4)) | (1L << (Identifier - 4)))) != 0)) {
                    {
                        setState(231);
                        expression(0);
                        setState(236);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                        while (_la == COMMA) {
                            {
                                {
                                    setState(232);
                                    match(COMMA);
                                    setState(233);
                                    expression(0);
                                }
                            }
                            setState(238);
                            _errHandler.sync(this);
                            _la = _input.LA(1);
                        }
                    }
                }

                setState(241);
                match(RBRACK);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class WiidgetBodyContext extends ParserRuleContext {
        public StatementDeclarationContext statementDeclaration(final int i) {
            return getRuleContext(StatementDeclarationContext.class, i);
        }

        public List<StatementDeclarationContext> statementDeclaration() {
            return getRuleContexts(StatementDeclarationContext.class);
        }

        public WiidgetBodyContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_wiidgetBody;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterWiidgetBody(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitWiidgetBody(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitWiidgetBody(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final WiidgetBodyContext wiidgetBody() throws RecognitionException {
        final WiidgetBodyContext _localctx = new WiidgetBodyContext(_ctx, getState());
        enterRule(_localctx, 54, RULE_wiidgetBody);
        int _la;
        try {
            setState(252);
            switch (_input.LA(1)) {
            case SEMI:
                enterOuterAlt(_localctx, 1);
                {
                    setState(243);
                    match(SEMI);
                }
                break;
            case LBRACE:
                enterOuterAlt(_localctx, 2);
                {
                    setState(244);
                    match(LBRACE);
                    setState(248);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << SEAM) | (1L << WiidgetVarSign) | (1L << StringLiteral) | (1L << IF) | (1L << FOREACH))) != 0)
                            || _la == Identifier) {
                        {
                            {
                                setState(245);
                                statementDeclaration();
                            }
                        }
                        setState(250);
                        _errHandler.sync(this);
                        _la = _input.LA(1);
                    }
                    setState(251);
                    match(RBRACE);
                }
                break;
            default:
                throw new NoViableAltException(this);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class QualifiedNameContext extends ParserRuleContext {
        public TerminalNode Identifier(final int i) {
            return getToken(WiidgetParser.Identifier, i);
        }

        public List<TerminalNode> Identifier() {
            return getTokens(WiidgetParser.Identifier);
        }

        public QualifiedNameContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_qualifiedName;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterQualifiedName(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitQualifiedName(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitQualifiedName(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final QualifiedNameContext qualifiedName() throws RecognitionException {
        final QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
        enterRule(_localctx, 56, RULE_qualifiedName);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(254);
                match(Identifier);
                setState(259);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == DOT) {
                    {
                        {
                            setState(255);
                            match(DOT);
                            setState(256);
                            match(Identifier);
                        }
                    }
                    setState(261);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class LiteralContext extends ParserRuleContext {
        public TerminalNode NullLiteral() {
            return getToken(WiidgetParser.NullLiteral, 0);
        }

        public TerminalNode CharacterLiteral() {
            return getToken(WiidgetParser.CharacterLiteral, 0);
        }

        public TerminalNode IntegerLiteral() {
            return getToken(WiidgetParser.IntegerLiteral, 0);
        }

        public TerminalNode StringLiteral() {
            return getToken(WiidgetParser.StringLiteral, 0);
        }

        public TerminalNode FloatingPointLiteral() {
            return getToken(WiidgetParser.FloatingPointLiteral, 0);
        }

        public TerminalNode BooleanLiteral() {
            return getToken(WiidgetParser.BooleanLiteral, 0);
        }

        public LiteralContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_literal;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterLiteral(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitLiteral(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitLiteral(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final LiteralContext literal() throws RecognitionException {
        final LiteralContext _localctx = new LiteralContext(_ctx, getState());
        enterRule(_localctx, 58, RULE_literal);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(262);
                _la = _input.LA(1);
                if (!((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << IntegerLiteral) | (1L << FloatingPointLiteral) | (1L << BooleanLiteral) | (1L << CharacterLiteral)
                        | (1L << StringLiteral) | (1L << NullLiteral))) != 0))) {
                    _errHandler.recoverInline(this);
                }
                consume();
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionListContext extends ParserRuleContext {
        public ExpressionContext expression(final int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public ExpressionListContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_expressionList;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterExpressionList(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitExpressionList(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitExpressionList(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ExpressionListContext expressionList() throws RecognitionException {
        final ExpressionListContext _localctx = new ExpressionListContext(_ctx, getState());
        enterRule(_localctx, 60, RULE_expressionList);
        int _la;
        try {
            enterOuterAlt(_localctx, 1);
            {
                setState(264);
                expression(0);
                setState(269);
                _errHandler.sync(this);
                _la = _input.LA(1);
                while (_la == COMMA) {
                    {
                        {
                            setState(265);
                            match(COMMA);
                            setState(266);
                            expression(0);
                        }
                    }
                    setState(271);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                }
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    public static class ExpressionContext extends ParserRuleContext {
        public int _p;

        public TerminalNode RBRACK() {
            return getToken(WiidgetParser.RBRACK, 0);
        }

        public TerminalNode QUESTION() {
            return getToken(WiidgetParser.QUESTION, 0);
        }

        public ExpressionListContext expressionList() {
            return getRuleContext(ExpressionListContext.class, 0);
        }

        public TerminalNode Identifier() {
            return getToken(WiidgetParser.Identifier, 0);
        }

        public TerminalNode NegotionOperator() {
            return getToken(WiidgetParser.NegotionOperator, 0);
        }

        public ListExpressionContext listExpression() {
            return getRuleContext(ListExpressionContext.class, 0);
        }

        public List<ExpressionContext> expression() {
            return getRuleContexts(ExpressionContext.class);
        }

        public MapExpressionContext mapExpression() {
            return getRuleContext(MapExpressionContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(WiidgetParser.LPAREN, 0);
        }

        public TerminalNode EqualityOperator() {
            return getToken(WiidgetParser.EqualityOperator, 0);
        }

        public TerminalNode LBRACK() {
            return getToken(WiidgetParser.LBRACK, 0);
        }

        public ExpressionContext expression(final int i) {
            return getRuleContext(ExpressionContext.class, i);
        }

        public PrimaryContext primary() {
            return getRuleContext(PrimaryContext.class, 0);
        }

        public TerminalNode LogicalOperator() {
            return getToken(WiidgetParser.LogicalOperator, 0);
        }

        public TerminalNode DOT() {
            return getToken(WiidgetParser.DOT, 0);
        }

        public TerminalNode MathematicalOperator() {
            return getToken(WiidgetParser.MathematicalOperator, 0);
        }

        public TerminalNode RPAREN() {
            return getToken(WiidgetParser.RPAREN, 0);
        }

        public WiidgetMethodCallExpressionContext wiidgetMethodCallExpression() {
            return getRuleContext(WiidgetMethodCallExpressionContext.class, 0);
        }

        public TerminalNode DEFAULT_OPERATOR() {
            return getToken(WiidgetParser.DEFAULT_OPERATOR, 0);
        }

        public TerminalNode CompareOperator() {
            return getToken(WiidgetParser.CompareOperator, 0);
        }

        public WiidgetVariableContext wiidgetVariable() {
            return getRuleContext(WiidgetVariableContext.class, 0);
        }

        public TerminalNode COLON() {
            return getToken(WiidgetParser.COLON, 0);
        }

        public ExpressionContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        public ExpressionContext(final ParserRuleContext parent, final int invokingState, final int _p) {
            super(parent, invokingState);
            this._p = _p;
        }

        @Override
        public int getRuleIndex() {
            return RULE_expression;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterExpression(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitExpression(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitExpression(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final ExpressionContext expression(final int _p) throws RecognitionException {
        final ParserRuleContext _parentctx = _ctx;
        final int _parentState = getState();
        ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState, _p);
        ExpressionContext _prevctx = _localctx;
        final int _startState = 62;
        enterRecursionRule(_localctx, RULE_expression);
        int _la;
        try {
            int _alt;
            enterOuterAlt(_localctx, 1);
            {
                setState(280);
                switch (getInterpreter().adaptivePredict(_input, 25, _ctx)) {
                case 1: {
                    setState(273);
                    match(NegotionOperator);
                    setState(274);
                    expression(7);
                }
                    break;

                case 2: {
                    setState(275);
                    primary();
                }
                    break;

                case 3: {
                    setState(276);
                    wiidgetVariable();
                }
                    break;

                case 4: {
                    setState(277);
                    wiidgetMethodCallExpression();
                }
                    break;

                case 5: {
                    setState(278);
                    mapExpression();
                }
                    break;

                case 6: {
                    setState(279);
                    listExpression();
                }
                    break;
                }
                _ctx.stop = _input.LT(-1);
                setState(321);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                while (_alt != 2 && _alt != -1) {
                    if (_alt == 1) {
                        if (_parseListeners != null) {
                            triggerExitRuleEvent();
                        }
                        _prevctx = _localctx;
                        {
                            setState(319);
                            switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
                            case 1: {
                                _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(282);
                                if (!(6 >= _localctx._p)) {
                                    throw new FailedPredicateException(this, "6 >= $_p");
                                }
                                setState(283);
                                match(MathematicalOperator);
                                setState(284);
                                expression(7);
                            }
                                break;

                            case 2: {
                                _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(285);
                                if (!(5 >= _localctx._p)) {
                                    throw new FailedPredicateException(this, "5 >= $_p");
                                }
                                setState(286);
                                match(CompareOperator);
                                setState(287);
                                expression(6);
                            }
                                break;

                            case 3: {
                                _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(288);
                                if (!(4 >= _localctx._p)) {
                                    throw new FailedPredicateException(this, "4 >= $_p");
                                }
                                setState(289);
                                match(EqualityOperator);
                                setState(290);
                                expression(5);
                            }
                                break;

                            case 4: {
                                _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(291);
                                if (!(3 >= _localctx._p)) {
                                    throw new FailedPredicateException(this, "3 >= $_p");
                                }
                                setState(292);
                                match(LogicalOperator);
                                setState(293);
                                expression(4);
                            }
                                break;

                            case 5: {
                                _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(294);
                                if (!(2 >= _localctx._p)) {
                                    throw new FailedPredicateException(this, "2 >= $_p");
                                }
                                setState(295);
                                match(DEFAULT_OPERATOR);
                                setState(296);
                                expression(3);
                            }
                                break;

                            case 6: {
                                _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(297);
                                if (!(1 >= _localctx._p)) {
                                    throw new FailedPredicateException(this, "1 >= $_p");
                                }
                                setState(298);
                                match(QUESTION);
                                setState(299);
                                expression(0);
                                setState(300);
                                match(COLON);
                                setState(301);
                                expression(2);
                            }
                                break;

                            case 7: {
                                _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(303);
                                if (!(10 >= _localctx._p)) {
                                    throw new FailedPredicateException(this, "10 >= $_p");
                                }
                                setState(304);
                                match(DOT);
                                setState(305);
                                match(Identifier);
                            }
                                break;

                            case 8: {
                                _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(306);
                                if (!(9 >= _localctx._p)) {
                                    throw new FailedPredicateException(this, "9 >= $_p");
                                }
                                setState(307);
                                match(LBRACK);
                                setState(308);
                                expression(0);
                                setState(309);
                                match(RBRACK);
                            }
                                break;

                            case 9: {
                                _localctx = new ExpressionContext(_parentctx, _parentState, _p);
                                pushNewRecursionContext(_localctx, _startState, RULE_expression);
                                setState(311);
                                if (!(8 >= _localctx._p)) {
                                    throw new FailedPredicateException(this, "8 >= $_p");
                                }
                                setState(312);
                                match(DOT);
                                setState(313);
                                match(Identifier);
                                setState(314);
                                match(LPAREN);
                                setState(316);
                                _la = _input.LA(1);
                                if (((((_la - 4)) & ~0x3f) == 0 && ((1L << (_la - 4)) & ((1L << (NegotionOperator - 4)) | (1L << (WiidgetVarSign - 4))
                                        | (1L << (IntegerLiteral - 4)) | (1L << (FloatingPointLiteral - 4)) | (1L << (BooleanLiteral - 4)) | (1L << (CharacterLiteral - 4))
                                        | (1L << (StringLiteral - 4)) | (1L << (NullLiteral - 4)) | (1L << (LPAREN - 4)) | (1L << (LBRACE - 4)) | (1L << (LBRACK - 4)) | (1L << (Identifier - 4)))) != 0)) {
                                    {
                                        setState(315);
                                        expressionList();
                                    }
                                }

                                setState(318);
                                match(RPAREN);
                            }
                                break;
                            }
                        }
                    }
                    setState(323);
                    _errHandler.sync(this);
                    _alt = getInterpreter().adaptivePredict(_input, 28, _ctx);
                }
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            unrollRecursionContexts(_parentctx);
        }
        return _localctx;
    }

    public static class PrimaryContext extends ParserRuleContext {
        public TerminalNode RPAREN() {
            return getToken(WiidgetParser.RPAREN, 0);
        }

        public TerminalNode Identifier() {
            return getToken(WiidgetParser.Identifier, 0);
        }

        public ExpressionContext expression() {
            return getRuleContext(ExpressionContext.class, 0);
        }

        public TerminalNode LPAREN() {
            return getToken(WiidgetParser.LPAREN, 0);
        }

        public LiteralContext literal() {
            return getRuleContext(LiteralContext.class, 0);
        }

        public PrimaryContext(final ParserRuleContext parent, final int invokingState) {
            super(parent, invokingState);
        }

        @Override
        public int getRuleIndex() {
            return RULE_primary;
        }

        @Override
        public void enterRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).enterPrimary(this);
            }
        }

        @Override
        public void exitRule(final ParseTreeListener listener) {
            if (listener instanceof WiidgetListener) {
                ((WiidgetListener) listener).exitPrimary(this);
            }
        }

        @Override
        public <T> T accept(final ParseTreeVisitor<? extends T> visitor) {
            if (visitor instanceof WiidgetVisitor) {
                return ((WiidgetVisitor<? extends T>) visitor).visitPrimary(this);
            } else {
                return visitor.visitChildren(this);
            }
        }
    }

    public final PrimaryContext primary() throws RecognitionException {
        final PrimaryContext _localctx = new PrimaryContext(_ctx, getState());
        enterRule(_localctx, 64, RULE_primary);
        try {
            setState(330);
            switch (_input.LA(1)) {
            case Identifier:
                enterOuterAlt(_localctx, 1);
                {
                    setState(324);
                    match(Identifier);
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
                    setState(325);
                    literal();
                }
                break;
            case LPAREN:
                enterOuterAlt(_localctx, 3);
                {
                    setState(326);
                    match(LPAREN);
                    setState(327);
                    expression(0);
                    setState(328);
                    match(RPAREN);
                }
                break;
            default:
                throw new NoViableAltException(this);
            }
        } catch (final RecognitionException re) {
            _localctx.exception = re;
            _errHandler.reportError(this, re);
            _errHandler.recover(this, re);
        } finally {
            exitRule();
        }
        return _localctx;
    }

    @Override
    public boolean sempred(final RuleContext _localctx, final int ruleIndex, final int predIndex) {
        switch (ruleIndex) {
        case 31:
            return expression_sempred((ExpressionContext) _localctx, predIndex);
        }
        return true;
    }

    private boolean expression_sempred(final ExpressionContext _localctx, final int predIndex) {
        switch (predIndex) {
        case 0:
            return 6 >= _localctx._p;

        case 1:
            return 5 >= _localctx._p;

        case 2:
            return 4 >= _localctx._p;

        case 3:
            return 3 >= _localctx._p;

        case 4:
            return 2 >= _localctx._p;

        case 5:
            return 1 >= _localctx._p;

        case 6:
            return 10 >= _localctx._p;

        case 7:
            return 9 >= _localctx._p;

        case 8:
            return 8 >= _localctx._p;
        }
        return true;
    }

    public static final String _serializedATN = "\3\uacf5\uee8c\u4f5d\u8b0d\u4a45\u78bd\u1b2f\u3378\3F\u014f\4\2\t\2\4"
            + "\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t" + "\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"
            + "\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31" + "\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"
            + "\t!\4\"\t\"\3\2\7\2F\n\2\f\2\16\2I\13\2\3\2\7\2L\n\2\f\2\16\2O\13\2\3" + "\2\3\2\3\3\3\3\3\3\5\3V\n\3\3\3\3\3\3\4\3\4\3\4\5\4]\n\4\3\5\3\5\3\5\3"
            + "\5\3\6\3\6\3\6\3\6\3\6\3\6\5\6i\n\6\3\7\3\7\5\7m\n\7\3\7\3\7\5\7q\n\7" + "\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\13\3\13"
            + "\5\13\u0084\n\13\3\13\3\13\3\f\5\f\u0089\n\f\3\f\3\f\5\f\u008d\n\f\3\f" + "\3\f\3\r\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\17\5\17\u009a\n\17\3\20\3"
            + "\20\3\20\3\20\3\21\3\21\3\21\3\21\3\21\5\21\u00a5\n\21\3\21\3\21\3\22" + "\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\5\23\u00b2\n\23\3\23\3\23\3\24"
            + "\3\24\3\24\7\24\u00b9\n\24\f\24\16\24\u00bc\13\24\3\25\3\25\3\25\3\25" + "\3\26\3\26\3\27\3\27\3\27\5\27\u00c7\n\27\3\30\3\30\3\30\3\30\7\30\u00cd"
            + "\n\30\f\30\16\30\u00d0\13\30\5\30\u00d2\n\30\3\30\3\30\3\31\3\31\3\31" + "\3\31\7\31\u00da\n\31\f\31\16\31\u00dd\13\31\5\31\u00df\n\31\3\31\3\31"
            + "\3\32\3\32\3\32\3\32\3\33\3\33\3\34\3\34\3\34\3\34\7\34\u00ed\n\34\f\34" + "\16\34\u00f0\13\34\5\34\u00f2\n\34\3\34\3\34\3\35\3\35\3\35\7\35\u00f9"
            + "\n\35\f\35\16\35\u00fc\13\35\3\35\5\35\u00ff\n\35\3\36\3\36\3\36\7\36" + "\u0104\n\36\f\36\16\36\u0107\13\36\3\37\3\37\3 \3 \3 \7 \u010e\n \f \16"
            + " \u0111\13 \3!\3!\3!\3!\3!\3!\3!\3!\5!\u011b\n!\3!\3!\3!\3!\3!\3!\3!\3" + "!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3!\3"
            + "!\3!\3!\3!\5!\u013f\n!\3!\7!\u0142\n!\f!\16!\u0145\13!\3\"\3\"\3\"\3\"" + "\3\"\3\"\5\"\u014d\n\"\3\"\2#\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 "
            + "\"$&(*,.\60\62\64\668:<>@B\2\4\4\2\21\21CC\3\2\r\22\u015c\2G\3\2\2\2\4" + "R\3\2\2\2\6Y\3\2\2\2\b^\3\2\2\2\nh\3\2\2\2\fl\3\2\2\2\16r\3\2\2\2\20w"
            + "\3\2\2\2\22~\3\2\2\2\24\u0083\3\2\2\2\26\u0088\3\2\2\2\30\u0090\3\2\2" + "\2\32\u0093\3\2\2\2\34\u0099\3\2\2\2\36\u009b\3\2\2\2 \u009f\3\2\2\2\""
            + "\u00a8\3\2\2\2$\u00ae\3\2\2\2&\u00b5\3\2\2\2(\u00bd\3\2\2\2*\u00c1\3\2" + "\2\2,\u00c6\3\2\2\2.\u00c8\3\2\2\2\60\u00d5\3\2\2\2\62\u00e2\3\2\2\2\64"
            + "\u00e6\3\2\2\2\66\u00e8\3\2\2\28\u00fe\3\2\2\2:\u0100\3\2\2\2<\u0108\3" + "\2\2\2>\u010a\3\2\2\2@\u011a\3\2\2\2B\u014c\3\2\2\2DF\5\4\3\2ED\3\2\2"
            + "\2FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2JL\5\n\6\2KJ\3\2\2" + "\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NP\3\2\2\2OM\3\2\2\2PQ\7\2\2\3Q\3\3\2"
            + "\2\2RU\7\t\2\2SV\5\6\4\2TV\5\b\5\2US\3\2\2\2UT\3\2\2\2VW\3\2\2\2WX\7\35" + "\2\2X\5\3\2\2\2Y\\\5:\36\2Z[\7\26\2\2[]\7C\2\2\\Z\3\2\2\2\\]\3\2\2\2]"
            + "\7\3\2\2\2^_\7\21\2\2_`\7\26\2\2`a\7C\2\2a\t\3\2\2\2bi\5\f\7\2ci\5\26" + "\f\2de\5 \21\2ef\7\35\2\2fi\3\2\2\2gi\5\"\22\2hb\3\2\2\2hc\3\2\2\2hd\3"
            + "\2\2\2hg\3\2\2\2i\13\3\2\2\2jm\5\16\b\2km\5\20\t\2lj\3\2\2\2lk\3\2\2\2" + "mn\3\2\2\2np\58\35\2oq\5\22\n\2po\3\2\2\2pq\3\2\2\2q\r\3\2\2\2rs\7\23"
            + "\2\2st\7\27\2\2tu\5@!\2uv\7\30\2\2v\17\3\2\2\2wx\7\24\2\2xy\7\27\2\2y" + "z\5\24\13\2z{\7&\2\2{|\5@!\2|}\7\30\2\2}\21\3\2\2\2~\177\7\25\2\2\177"
            + "\u0080\58\35\2\u0080\23\3\2\2\2\u0081\u0082\7C\2\2\u0082\u0084\7 \2\2" + "\u0083\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0085\3\2\2\2\u0085\u0086"
            + "\7C\2\2\u0086\25\3\2\2\2\u0087\u0089\5\30\r\2\u0088\u0087\3\2\2\2\u0088" + "\u0089\3\2\2\2\u0089\u008a\3\2\2\2\u008a\u008c\5\34\17\2\u008b\u008d\5"
            + "$\23\2\u008c\u008b\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e" + "\u008f\58\35\2\u008f\27\3\2\2\2\u0090\u0091\5\32\16\2\u0091\u0092\7&\2"
            + "\2\u0092\31\3\2\2\2\u0093\u0094\7\f\2\2\u0094\u0095\7C\2\2\u0095\33\3" + "\2\2\2\u0096\u009a\5\36\20\2\u0097\u009a\7C\2\2\u0098\u009a\7\21\2\2\u0099"
            + "\u0096\3\2\2\2\u0099\u0097\3\2\2\2\u0099\u0098\3\2\2\2\u009a\35\3\2\2" + "\2\u009b\u009c\7\3\2\2\u009c\u009d\5@!\2\u009d\u009e\7\3\2\2\u009e\37"
            + "\3\2\2\2\u009f\u00a0\5\32\16\2\u00a0\u00a1\7\37\2\2\u00a1\u00a2\7C\2\2" + "\u00a2\u00a4\7\27\2\2\u00a3\u00a5\5> \2\u00a4\u00a3\3\2\2\2\u00a4\u00a5"
            + "\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a7\7\30\2\2\u00a7!\3\2\2\2\u00a8" + "\u00a9\7\13\2\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab\5@!\2\u00ab\u00ac\7\30"
            + "\2\2\u00ac\u00ad\58\35\2\u00ad#\3\2\2\2\u00ae\u00b1\7\27\2\2\u00af\u00b2" + "\5,\27\2\u00b0\u00b2\5&\24\2\u00b1\u00af\3\2\2\2\u00b1\u00b0\3\2\2\2\u00b1"
            + "\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3\u00b4\7\30\2\2\u00b4%\3\2\2\2" + "\u00b5\u00ba\5(\25\2\u00b6\u00b7\7\36\2\2\u00b7\u00b9\5(\25\2\u00b8\u00b6"
            + "\3\2\2\2\u00b9\u00bc\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb" + "\'\3\2\2\2\u00bc\u00ba\3\2\2\2\u00bd\u00be\5*\26\2\u00be\u00bf\7\61\2"
            + "\2\u00bf\u00c0\5,\27\2\u00c0)\3\2\2\2\u00c1\u00c2\t\2\2\2\u00c2+\3\2\2" + "\2\u00c3\u00c7\5@!\2\u00c4\u00c7\5:\36\2\u00c5\u00c7\5.\30\2\u00c6\u00c3"
            + "\3\2\2\2\u00c6\u00c4\3\2\2\2\u00c6\u00c5\3\2\2\2\u00c7-\3\2\2\2\u00c8" + "\u00d1\7\31\2\2\u00c9\u00ce\5,\27\2\u00ca\u00cb\7\36\2\2\u00cb\u00cd\5"
            + ",\27\2\u00cc\u00ca\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00ce" + "\u00cf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d1\u00c9\3\2"
            + "\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3\u00d4\7\32\2\2\u00d4" + "/\3\2\2\2\u00d5\u00de\7\31\2\2\u00d6\u00db\5\62\32\2\u00d7\u00d8\7\36"
            + "\2\2\u00d8\u00da\5\62\32\2\u00d9\u00d7\3\2\2\2\u00da\u00dd\3\2\2\2\u00db" + "\u00d9\3\2\2\2\u00db\u00dc\3\2\2\2\u00dc\u00df\3\2\2\2\u00dd\u00db\3\2"
            + "\2\2\u00de\u00d6\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\3\2\2\2\u00e0" + "\u00e1\7\32\2\2\u00e1\61\3\2\2\2\u00e2\u00e3\5\64\33\2\u00e3\u00e4\7&"
            + "\2\2\u00e4\u00e5\5@!\2\u00e5\63\3\2\2\2\u00e6\u00e7\t\2\2\2\u00e7\65\3" + "\2\2\2\u00e8\u00f1\7\33\2\2\u00e9\u00ee\5@!\2\u00ea\u00eb\7\36\2\2\u00eb"
            + "\u00ed\5@!\2\u00ec\u00ea\3\2\2\2\u00ed\u00f0\3\2\2\2\u00ee\u00ec\3\2\2" + "\2\u00ee\u00ef\3\2\2\2\u00ef\u00f2\3\2\2\2\u00f0\u00ee\3\2\2\2\u00f1\u00e9"
            + "\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2\u00f3\3\2\2\2\u00f3\u00f4\7\34\2\2" + "\u00f4\67\3\2\2\2\u00f5\u00ff\7\35\2\2\u00f6\u00fa\7\31\2\2\u00f7\u00f9"
            + "\5\n\6\2\u00f8\u00f7\3\2\2\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa" + "\u00fb\3\2\2\2\u00fb\u00fd\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00ff\7\32"
            + "\2\2\u00fe\u00f5\3\2\2\2\u00fe\u00f6\3\2\2\2\u00ff9\3\2\2\2\u0100\u0105" + "\7C\2\2\u0101\u0102\7\37\2\2\u0102\u0104\7C\2\2\u0103\u0101\3\2\2\2\u0104"
            + "\u0107\3\2\2\2\u0105\u0103\3\2\2\2\u0105\u0106\3\2\2\2\u0106;\3\2\2\2" + "\u0107\u0105\3\2\2\2\u0108\u0109\t\3\2\2\u0109=\3\2\2\2\u010a\u010f\5"
            + "@!\2\u010b\u010c\7\36\2\2\u010c\u010e\5@!\2\u010d\u010b\3\2\2\2\u010e" + "\u0111\3\2\2\2\u010f\u010d\3\2\2\2\u010f\u0110\3\2\2\2\u0110?\3\2\2\2"
            + "\u0111\u010f\3\2\2\2\u0112\u0113\b!\1\2\u0113\u0114\7\6\2\2\u0114\u011b" + "\5@!\2\u0115\u011b\5B\"\2\u0116\u011b\5\32\16\2\u0117\u011b\5 \21\2\u0118"
            + "\u011b\5\60\31\2\u0119\u011b\5\66\34\2\u011a\u0112\3\2\2\2\u011a\u0115" + "\3\2\2\2\u011a\u0116\3\2\2\2\u011a\u0117\3\2\2\2\u011a\u0118\3\2\2\2\u011a"
            + "\u0119\3\2\2\2\u011b\u0143\3\2\2\2\u011c\u011d\6!\2\3\u011d\u011e\7\5" + "\2\2\u011e\u0142\5@!\2\u011f\u0120\6!\3\3\u0120\u0121\7\7\2\2\u0121\u0142"
            + "\5@!\2\u0122\u0123\6!\4\3\u0123\u0124\7\b\2\2\u0124\u0142\5@!\2\u0125" + "\u0126\6!\5\3\u0126\u0127\7\4\2\2\u0127\u0142\5@!\2\u0128\u0129\6!\6\3"
            + "\u0129\u012a\7\n\2\2\u012a\u0142\5@!\2\u012b\u012c\6!\7\3\u012c\u012d" + "\7%\2\2\u012d\u012e\5@!\2\u012e\u012f\7&\2\2\u012f\u0130\5@!\2\u0130\u0142"
            + "\3\2\2\2\u0131\u0132\6!\b\3\u0132\u0133\7\37\2\2\u0133\u0142\7C\2\2\u0134" + "\u0135\6!\t\3\u0135\u0136\7\33\2\2\u0136\u0137\5@!\2\u0137\u0138\7\34"
            + "\2\2\u0138\u0142\3\2\2\2\u0139\u013a\6!\n\3\u013a\u013b\7\37\2\2\u013b" + "\u013c\7C\2\2\u013c\u013e\7\27\2\2\u013d\u013f\5> \2\u013e\u013d\3\2\2"
            + "\2\u013e\u013f\3\2\2\2\u013f\u0140\3\2\2\2\u0140\u0142\7\30\2\2\u0141" + "\u011c\3\2\2\2\u0141\u011f\3\2\2\2\u0141\u0122\3\2\2\2\u0141\u0125\3\2"
            + "\2\2\u0141\u0128\3\2\2\2\u0141\u012b\3\2\2\2\u0141\u0131\3\2\2\2\u0141" + "\u0134\3\2\2\2\u0141\u0139\3\2\2\2\u0142\u0145\3\2\2\2\u0143\u0141\3\2"
            + "\2\2\u0143\u0144\3\2\2\2\u0144A\3\2\2\2\u0145\u0143\3\2\2\2\u0146\u014d" + "\7C\2\2\u0147\u014d\5<\37\2\u0148\u0149\7\27\2\2\u0149\u014a\5@!\2\u014a"
            + "\u014b\7\30\2\2\u014b\u014d\3\2\2\2\u014c\u0146\3\2\2\2\u014c\u0147\3" + "\2\2\2\u014c\u0148\3\2\2\2\u014dC\3\2\2\2 GMU\\hlp\u0083\u0088\u008c\u0099"
            + "\u00a4\u00b1\u00ba\u00c6\u00ce\u00d1\u00db\u00de\u00ee\u00f1\u00fa\u00fe" + "\u0105\u010f\u011a\u013e\u0141\u0143\u014c";
    public static final ATN _ATN = ATNSimulator.deserialize(_serializedATN.toCharArray());
    static {
        _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
        for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
            _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
        }
    }
}