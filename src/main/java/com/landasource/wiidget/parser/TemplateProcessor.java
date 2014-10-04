package com.landasource.wiidget.parser;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.net.URI;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.tree.TerminalNode;

import com.landasource.wiidget.ResourceWiidget;
import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.WiidgetException;
import com.landasource.wiidget.WiidgetView;
import com.landasource.wiidget.annotation.DefaultField;
import com.landasource.wiidget.antlr.WiidgetLexer;
import com.landasource.wiidget.antlr.WiidgetParser;
import com.landasource.wiidget.antlr.WiidgetParser.AttributeNameContext;
import com.landasource.wiidget.antlr.WiidgetParser.CompilationUnitContext;
import com.landasource.wiidget.antlr.WiidgetParser.ControlStatementContext;
import com.landasource.wiidget.antlr.WiidgetParser.ElementValueContext;
import com.landasource.wiidget.antlr.WiidgetParser.ElementValuePairContext;
import com.landasource.wiidget.antlr.WiidgetParser.ElementValuePairsContext;
import com.landasource.wiidget.antlr.WiidgetParser.ElseControlContext;
import com.landasource.wiidget.antlr.WiidgetParser.ExpressionContext;
import com.landasource.wiidget.antlr.WiidgetParser.ExpressionWiidgetNameContext;
import com.landasource.wiidget.antlr.WiidgetParser.ForeachControlContext;
import com.landasource.wiidget.antlr.WiidgetParser.IfControlContext;
import com.landasource.wiidget.antlr.WiidgetParser.ImportDeclarationContext;
import com.landasource.wiidget.antlr.WiidgetParser.QualifiedNameContext;
import com.landasource.wiidget.antlr.WiidgetParser.StatementDeclarationContext;
import com.landasource.wiidget.antlr.WiidgetParser.UnifiedWiidgetNameContext;
import com.landasource.wiidget.antlr.WiidgetParser.WiidgetArgumentsContext;
import com.landasource.wiidget.antlr.WiidgetParser.WiidgetBodyContext;
import com.landasource.wiidget.antlr.WiidgetParser.WiidgetDeclarationContext;
import com.landasource.wiidget.antlr.WiidgetParser.WiidgetVariableBindingContext;
import com.landasource.wiidget.commons.WiidgetTemplate;
import com.landasource.wiidget.engine.Engine;
import com.landasource.wiidget.engine.RawWiidget;
import com.landasource.wiidget.engine.configuration.Configuration;
import com.landasource.wiidget.engine.externals.ExternalWiidgetLoader;
import com.landasource.wiidget.io.FileLoader;
import com.landasource.wiidget.parser.control.ForeachControl;
import com.landasource.wiidget.parser.control.ForeachIterator;
import com.landasource.wiidget.parser.control.IfControl;
import com.landasource.wiidget.parser.evaluation.EvaluationContext;
import com.landasource.wiidget.parser.evaluation.EvaluationException;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluator;
import com.landasource.wiidget.parser.imports.ImportContext;
import com.landasource.wiidget.parser.imports.ImportException;
import com.landasource.wiidget.parser.resource.ClassWiidgetResource;
import com.landasource.wiidget.parser.resource.ExternalWiidgetResource;
import com.landasource.wiidget.parser.resource.FileWiidgetResource;
import com.landasource.wiidget.parser.resource.WiidgetResource;
import com.landasource.wiidget.parser.util.StringDeclaration;
import com.landasource.wiidget.reflect.Reflection;
import com.landasource.wiidget.util.DataMap;
import com.landasource.wiidget.util.Pair;

/**
 * The part of Wiidget framework interprets the ANTLR lexer result.
 * <p>
 * The processor extends the {@link WiidgetView}, so behaves as a view. Cause of
 * this fact, the processor can create wiidgets, and can render a template.
 * </p>
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class TemplateProcessor extends WiidgetView {

    /** In this object can we store imported classes, files and aliases. */
    private ImportContext importContext;

    /**
     * Lang processor will act as this view.
     */
    private final WiidgetView ownerView;

    /**
     * Stores wiidget by names if name is defined.
     */
    private final Map<String, Wiidget> wiidgetMap = new HashMap<>();

    /**
     * Default constructor.
     */
    public TemplateProcessor() {
        super();

        this.ownerView = null;
    }

    /**
     * @param engine
     *            specified factory
     */
    public TemplateProcessor(final Engine engine) {
        this(engine, null);
    }

    /**
     * @param engine
     *            specified factory
     * @param owner
     *            the owner wiidget
     */
    public TemplateProcessor(final Engine engine, final WiidgetView owner) {
        super(engine);

        this.ownerView = owner == null ? this : owner;

    }

    /**
     * Children processors can import default classes here.
     */
    protected void importDefaultClasses() {
    }

    @Override
    public void run() {
        // NO-OP
    }

    @Override
    public WiidgetView getOwner() {
        return ownerView == null ? super.getOwner() : ownerView;
    }

    /**
     * @param template
     * @return
     * @throws ParserException
     */
    public String render(final String template) throws ParserException {

        final CompilationUnitContext compilationUnitContext = getCompilationUnitContext(template);
        return render(compilationUnitContext);
    }

    /**
     * @param template
     * @return
     * @throws ParserException
     * @throws IOException
     */
    public String render(final InputStream template) throws ParserException {

        final CompilationUnitContext compilationUnitContext = getCompilationUnitContext(template);
        return render(compilationUnitContext);
    }

    /**
     * @param compilationUnitContext
     * @return
     * @throws ParserException
     */
    private String render(final CompilationUnitContext compilationUnitContext) throws ParserException {

        importContext = createImportContext(compilationUnitContext.importDeclaration());
        try {
            importContext.process();
        } catch (final ImportException e) {
            throw new WiidgetException("Illegal import", e);
        }

        importDefaultClasses();

        processStatements(compilationUnitContext.statementDeclaration());

        final String result = this.render();

        return result;
    }

    /**
     * Creates import context that can process and hold import informatons.
     *
     * @param importDeclaration
     *            imports in template
     * @return import context
     */
    protected ImportContext createImportContext(final List<ImportDeclarationContext> importDeclaration) {
        return new ImportContext(importDeclaration, getEngine()); // use default context
    }

    /**
     * @param statementDeclaration
     *            statements
     * @throws ParserException
     *             when cannot parse statement
     */
    private void processStatements(final List<StatementDeclarationContext> statementDeclaration) throws ParserException {

        // no child statement
        if (null == statementDeclaration) {
            return;
        }

        for (final StatementDeclarationContext statementDeclarationContext : statementDeclaration) {
            processStatement(statementDeclarationContext);
        }

    }

    /**
     * @param statementDeclarationContext
     *            statement
     * @throws ParserException
     *             when cannot parse statement
     */
    private void processStatement(final StatementDeclarationContext statementDeclarationContext) throws ParserException {
        final ControlStatementContext controlStatementContext = statementDeclarationContext.controlStatement();

        if (null != controlStatementContext) {

            processControl(controlStatementContext);
            return;
        }

        final WiidgetDeclarationContext wiidgetDeclarationContext = statementDeclarationContext.wiidgetDeclaration();
        if (null != wiidgetDeclarationContext) {
            processWiidget(wiidgetDeclarationContext);
        }

    }

    /**
     * @param controlStatementContext
     *            control statements
     * @throws ParserException
     *             when cannot do control
     */
    private void processControl(final ControlStatementContext controlStatementContext) throws ParserException {

        final WiidgetBodyContext bodyContext = controlStatementContext.wiidgetBody();

        final IfControlContext ifControlContext = controlStatementContext.ifControl();
        final ElseControlContext elseControl = controlStatementContext.elseControl(); // this will be used everywhere

        if (null != ifControlContext) {

            final IfControl ifControl = processIfControl(ifControlContext, elseControl);

            processIf(ifControl, bodyContext);

        } else {

            final ForeachControlContext foreachControlContext = controlStatementContext.foreachControl();
            if (null != foreachControlContext) {
                final ForeachControl foreachControl = processForeachControl(foreachControlContext, elseControl);

                processForeach(foreachControl, bodyContext);
            }
            // in this case there is an extra ';'
        }

    }

    /**
     * @param foreachControl
     *            foreach declaration
     * @param bodyContext
     *            body of loop
     * @throws ParserException
     *             when cannot iterate over value
     */
    private void processForeach(final ForeachControl foreachControl, final WiidgetBodyContext bodyContext) throws ParserException {

        final String key = foreachControl.getKey();
        final String variable = foreachControl.getVariable();
        final Object value = foreachControl.getValue();

        Object oldVariableValue = null;
        if (getWiidgetContext().isSet(variable)) {
            oldVariableValue = getWiidgetContext().get(variable);
        }

        if (null == value) {
            throw new WiidgetException("Itarable value in 'foreach' statement is null.");
        }

        final ForeachIterator iterator = new ForeachIterator(value);
        final boolean mustSetKey = null != key;

        final List<Pair<Object, Object>> entrySet = iterator.entrySet(); // get the iterable list
        if (entrySet.isEmpty()) { // handle the else here

            final ElseControlContext elseControl = foreachControl.getElseControl();
            if (null != elseControl) {
                processStatements(elseControl.wiidgetBody().statementDeclaration());
            }

        } else {
            for (final Pair<Object, Object> item : entrySet) {

                if (mustSetKey) {
                    getWiidgetContext().set(key, item.getLeft());
                }

                getWiidgetContext().set(variable, item.getRight());

                processStatements(bodyContext.statementDeclaration());
            }
        }

        if (oldVariableValue == null) {
            getWiidgetContext().remove(variable); // remove
        } else {
            getWiidgetContext().set(variable, oldVariableValue); // set back old
            // value
        }

    }

    /**
     * @param ifControl
     *            statement
     * @param bodyContext
     *            body of context
     * @param
     * @throws ParserException
     *             when cannot process body
     */
    private void processIf(final IfControl ifControl, final WiidgetBodyContext bodyContext) throws ParserException {

        final Boolean value = ifControl.getValue();
        if (null == value) {
            throw new ParserException(ifControl.getControlContext(), "Value of 'if' control is null.");
        }

        // THIS IF IS THE STATEMENT IN THE TEMPLATE
        if (value) {
            processStatements(bodyContext.statementDeclaration());
        } else {
            // THIS ELSE IS THE STATEMENT IN TEMPLATE

            final ElseControlContext elseContext = ifControl.getElseContext();
            if (null != elseContext) {
                processStatements(elseContext.wiidgetBody().statementDeclaration());
            }

        }

    }

    /**
     * @param foreachControlContext
     *            foreach
     * @param elseControl
     *            the optional else
     * @return control object
     * @throws ParserException
     *             when cannot iterate over value
     */
    private ForeachControl processForeachControl(final ForeachControlContext foreachControlContext, final ElseControlContext elseControl) throws ParserException {

        String variable;
        String key = null;
        final List<TerminalNode> identifiers = foreachControlContext.foreachVariable().Identifier();

        if (identifiers.size() == 2) {
            key = identifiers.get(0).getText();
            variable = identifiers.get(1).getText();
        } else {
            variable = identifiers.get(0).getText();
        }

        final Object value = evaluateExpression(foreachControlContext.expression());

        return new ForeachControl(key, variable, value, elseControl);

    }

    /**
     * @param ifControlContext
     *            if control
     * @param elseControlContext
     *            the optional else
     * @return control object
     * @throws ParserException
     *             when the expression is not a boolean
     */
    private IfControl processIfControl(final IfControlContext ifControlContext, final ElseControlContext elseControlContext) throws ParserException {
        try {

            final Boolean condition = (Boolean) evaluateExpression(ifControlContext.expression());

            return new IfControl(ifControlContext, elseControlContext, condition);

        } catch (final ClassCastException castException) {

            throw new ParserException(ifControlContext, "Expression must be boolean: " + ifControlContext.expression().getText(), castException);
        }

    }

    /**
     * Processes wiidget statement.
     *
     * @param declarationContext
     *            wiidget declaration
     * @throws ParserException
     *             when cannot create wiidget or declaration is illegal
     */
    private void processWiidget(final WiidgetDeclarationContext declarationContext) throws ParserException {

        // variable name of wiidget
        String wiidgetVariable = null;

        final WiidgetVariableBindingContext wiidgetVariableBindingContext = declarationContext.wiidgetVariableBinding();
        if (null != wiidgetVariableBindingContext) {
            wiidgetVariable = wiidgetVariableBindingContext.wiidgetVariable().Identifier().getText();
        }

        Wiidget wiidget;

        final UnifiedWiidgetNameContext wiidgetNameContext = declarationContext.unifiedWiidgetName();
        final TerminalNode stringWiidgetName = wiidgetNameContext.StringLiteral();
        final WiidgetArgumentsContext wiidgetArguments = declarationContext.wiidgetArguments();

        if (null == stringWiidgetName) {

            final ExpressionWiidgetNameContext expressionWiidgetName = wiidgetNameContext.expressionWiidgetName();
            if (null == expressionWiidgetName) {

                final String alias = wiidgetNameContext.Identifier().getText();
                final WiidgetResource wiidgetResource = getWiidgetClass(alias);

                if (null == wiidgetResource) {
                    //throw new UnknownWiidgetTypeException(declarationContext, "Unknown wiidget alias: " + alias);

                    wiidget = createRawWiidget(alias, wiidgetArguments);
                } else {
                    wiidget = createWiidget(wiidgetResource, wiidgetArguments);
                }
            } else {

                wiidget = createWiidgetFromExpression(expressionWiidgetName.expression(), wiidgetArguments);

            }

        } else {

            final String tagName = new StringDeclaration(stringWiidgetName).getContent();
            wiidget = createRawWiidget(tagName, wiidgetArguments);

        }

        wiidget = startWiidget(wiidget); // after start wiidget can be null when its not rendered

        // bind to variable
        if (null != wiidgetVariable) {
            getWiidgetMap().put(wiidgetVariable, wiidget);
        }

        // rendered property has meaning here
        if (null != wiidget) {
            processStatements(declarationContext.wiidgetBody().statementDeclaration());
        }

        endWiidget(wiidget);

    }

    /**
     * @param expression
     * @param wiidgetArguments
     * @return
     * @throws ParserException
     */
    private Wiidget createWiidgetFromExpression(final ExpressionContext expression, final WiidgetArgumentsContext wiidgetArguments) throws ParserException {

        final Object value = evaluateExpression(expression);
        if (value instanceof Wiidget) {
            return (Wiidget) value;

        } else if (value instanceof String) {
            return createRawWiidget((String) value, wiidgetArguments);
        } else if (value instanceof Class) {

            if (Wiidget.class.isAssignableFrom((Class<?>) value)) {

                @SuppressWarnings("unchecked")
                final Class<? extends Wiidget> type = (Class<? extends Wiidget>) value;
                final DataMap dataMap = processArguments(wiidgetArguments, type);

                final Wiidget wiidget = getEngine().createWiidget(this, type, dataMap, true);

                return wiidget;

            }

        }

        throw new ParserException(expression, String.format("Unsupported wiidget name expression: %s (%s)", value, expression.getText()));
    }

    private Wiidget createRawWiidget(final String tagName, final WiidgetArgumentsContext wiidgetArguments) throws ParserException {

        final Class<? extends RawWiidget> rawType = getRawType();

        final DataMap dataMap = processArguments(wiidgetArguments, rawType);

        final RawWiidget wiidget = getEngine().createWiidget(this, rawType, dataMap, true);
        wiidget.setRawTagName(tagName);

        return wiidget;
    }

    /**
     * @return the configured raw type
     */
    private Class<? extends RawWiidget> getRawType() {
        return getEngine().getConfiguration().getRawType();
    }

    /**
     * @param wiidgetResource
     *            resource
     * @param arguments
     *            arguments declaration
     * @return wiidget
     * @throws ParserException
     *             when cannot create wiidget
     */
    private Wiidget createWiidget(final WiidgetResource wiidgetResource, final WiidgetArgumentsContext arguments) throws ParserException {
        Wiidget wiidget;
        if (wiidgetResource instanceof FileWiidgetResource) {

            wiidget = createFileWiidgetResource(wiidgetResource, arguments);

        } else if (wiidgetResource instanceof ClassWiidgetResource) {

            final Class<? extends Wiidget> type = ((ClassWiidgetResource) wiidgetResource).getType();
            final DataMap dataMap = processArguments(arguments, type);

            wiidget = getEngine().createWiidget(this, type, dataMap, true);

        } else if (wiidgetResource instanceof ExternalWiidgetResource) {

            wiidget = createExternalWiidget((ExternalWiidgetResource) wiidgetResource, arguments);

        } else {
            throw new IllegalStateException("Illegal import elemenet: " + wiidgetResource);
        }

        return wiidget;
    }

    private Wiidget createFileWiidgetResource(final WiidgetResource wiidgetResource, final WiidgetArgumentsContext arguments) throws ParserException {

        final FileWiidgetResource fileWiidgetResource = (FileWiidgetResource) wiidgetResource;
        final DataMap data = processArguments(arguments, null);

        final ResourceWiidget resourceWiidget = getEngine().createWiidget(getOwner(), ResourceWiidget.class, EMPTY_DATA, true);
        resourceWiidget.setFileName(fileWiidgetResource.getCanonicalFileName());

        resourceWiidget.setContext(data);

        return resourceWiidget;
    }

    private Wiidget createExternalWiidget(final ExternalWiidgetResource wiidgetResource, final WiidgetArgumentsContext arguments) throws ParserException {

        final URI uri = wiidgetResource.getUri();
        final ExternalWiidgetLoader matchingLoader = getWiidgetLoader(uri);

        final String content = matchingLoader.load(uri);

        final DataMap data = processArguments(arguments, null);

        return getEngine().createWiidget(this, WiidgetTemplate.class, data().set(DefaultField.NAME, content).set("context", data), true);

    }

    private ExternalWiidgetLoader getWiidgetLoader(final URI uri) {

        for (final ExternalWiidgetLoader loader : getEngine().getConfiguration().getExternalWiidgetLoaders()) {
            if (loader.canHandle(uri)) {
                return loader;
            }
        }

        throw new WiidgetException(String.format("No loader for URI: %s", uri));
    }

    private InputStream getFileInputStream(final String canonicalFileName) {
        final FileLoader fileLoader = getEngine().getConfiguration().getFileLoader();
        return fileLoader.getFile(canonicalFileName);
    }

    private WiidgetResource getWiidgetClass(final String wiidgetName) throws ParserException {
        return importContext.findByAlias(wiidgetName);
    }

    // TODO refactor
    private DataMap processArguments(final WiidgetArgumentsContext wiidgetArguments, final Class<? extends Wiidget> wiidgetClass) throws ParserException {

        final DataMap dataMap = new DataMap();

        if (null == wiidgetArguments) {
            return dataMap;
        }

        final ElementValueContext elementValueContext = wiidgetArguments.elementValue();

        if (null == elementValueContext) {

            final ElementValuePairsContext elementValuePairsContext = wiidgetArguments.elementValuePairs();
            if (null != elementValuePairsContext) {
                final List<ElementValuePairContext> valuePairContext = elementValuePairsContext.elementValuePair();

                if (valuePairContext != null) {
                    for (final ElementValuePairContext elementValuePairContext : valuePairContext) {

                        final String property = getAttributeName(elementValuePairContext.attributeName());

                        final ElementValueContext elementValue = elementValuePairContext.elementValue();
                        final Object value = processArgumentValue(elementValue);

                        dataMap.put(property, value);
                    }
                }
            }

        } else {

            final Object value = processArgumentValue(elementValueContext);

            if (null == wiidgetClass) {
                dataMap.put("id", value); // id is the default attribute
            } else {
                final String property = getDefaultValueProperty(wiidgetClass);
                dataMap.put(property, value);
            }

        }

        return dataMap;

    }

    private String getAttributeName(final AttributeNameContext attributeName) {

        final TerminalNode stringLiteral = attributeName.StringLiteral();
        if (null == stringLiteral) {
            return attributeName.Identifier().getText();
        }
        return new StringDeclaration(stringLiteral).getContent();
    }

    private String getDefaultValueProperty(final Class<? extends Wiidget> wiidgetClass) {

        final Field defaultField = Reflection.getField(wiidgetClass, DefaultField.class);

        if (null == defaultField) {
            return "value";
        } else {
            return defaultField.getName();
        }

    }

    private Object processArgumentValue(final ElementValueContext valueContext) throws ParserException {

        final QualifiedNameContext qualifiedNameContext = valueContext.qualifiedName();
        if (null != qualifiedNameContext) {
            return processQualifiedName(qualifiedNameContext);
        }

        final ExpressionContext expressionContext = valueContext.expression();
        if (null != expressionContext) {
            return evaluateExpression(expressionContext);
        }
        throw new ParserException(valueContext, "Cannot get value of : " + valueContext.getText());

    }

    private Object processQualifiedName(final QualifiedNameContext qualifiedNameContext) throws ParserException {
        final Iterator<TerminalNode> iterator = qualifiedNameContext.Identifier().iterator();

        final TerminalNode baseNode = iterator.next();

        Object baseObject = getWiidgetContext().get(baseNode.getText());

        while (iterator.hasNext()) {
            final TerminalNode terminalNode = iterator.next();
            final String property = terminalNode.getText();

            baseObject = Reflection.getFieldValue(baseObject, property);

        }

        return baseObject;

    }

    /**
     * Evaluates expression value.
     *
     * @param expression
     *            the expression descriptor
     * @return value of expression
     * @throws EvaluationException
     *             when expression is illegal or cannot evaluate
     */
    private Object evaluateExpression(final ExpressionContext expression) throws EvaluationException {

        final ExpressionEvaluator evaluator = createExpressionEvaluator();

        return evaluator.evaluate(expression);
    }

    protected ExpressionEvaluator createExpressionEvaluator() {
        final Configuration configuration = getEngine().getConfiguration();

        final EvaluationContext evaluationContext = new EvaluationContext(importContext, getWiidgetContext(), getWiidgetMap());
        return configuration.getExpressionEvaluatorFactory(evaluationContext).create();
    }

    public static CompilationUnitContext getCompilationUnitContext(final InputStream inputStream) throws WiidgetException {
        try {
            final ANTLRInputStream input = new ANTLRInputStream(inputStream);
            return getCompilationUnitContext(input);

        } catch (final IOException exception) {
            throw new WiidgetException("Cannot parse input.", exception);
        }
    }

    public static CompilationUnitContext getCompilationUnitContext(final String template) {
        final ANTLRInputStream input = new ANTLRInputStream(template);

        return getCompilationUnitContext(input);
    }

    /**
     * Returns the compilation context of input.
     *
     * @param antlrInputStream
     *            ANTLR input
     * @return the parsed context
     */
    private static CompilationUnitContext getCompilationUnitContext(final ANTLRInputStream antlrInputStream) {

        final WiidgetLexer aWiidgetLexer = new WiidgetLexer(antlrInputStream);
        final BufferedTokenStream tokenStream = new BufferedTokenStream(aWiidgetLexer);
        final WiidgetParser aWiidgetParser = new CustomWiidgetParser(tokenStream);
        final CompilationUnitContext compilationUnit = aWiidgetParser.compilationUnit();

        return compilationUnit;
    }

    /**
     * @return the wiidgetMap
     */
    public Map<String, Wiidget> getWiidgetMap() {
        return wiidgetMap;
    }
}
