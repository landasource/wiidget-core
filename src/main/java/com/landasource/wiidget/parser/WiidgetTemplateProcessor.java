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
import com.landasource.wiidget.antlr.WiidgetParser.CompilationUnitContext;
import com.landasource.wiidget.antlr.WiidgetParser.ControlStatementContext;
import com.landasource.wiidget.antlr.WiidgetParser.ElementValueArrayInitializerContext;
import com.landasource.wiidget.antlr.WiidgetParser.ElementValueContext;
import com.landasource.wiidget.antlr.WiidgetParser.ElementValuePairContext;
import com.landasource.wiidget.antlr.WiidgetParser.ElementValuePairsContext;
import com.landasource.wiidget.antlr.WiidgetParser.ExpressionContext;
import com.landasource.wiidget.antlr.WiidgetParser.ExpressionWiidgetNameContext;
import com.landasource.wiidget.antlr.WiidgetParser.ForeachControlContext;
import com.landasource.wiidget.antlr.WiidgetParser.IfControlContext;
import com.landasource.wiidget.antlr.WiidgetParser.ImportDeclarationContext;
import com.landasource.wiidget.antlr.WiidgetParser.QualifiedNameContext;
import com.landasource.wiidget.antlr.WiidgetParser.SeamStatementContext;
import com.landasource.wiidget.antlr.WiidgetParser.StatementDeclarationContext;
import com.landasource.wiidget.antlr.WiidgetParser.UnifiedWiidgetNameContext;
import com.landasource.wiidget.antlr.WiidgetParser.WiidgetArgumentsContext;
import com.landasource.wiidget.antlr.WiidgetParser.WiidgetBodyContext;
import com.landasource.wiidget.antlr.WiidgetParser.WiidgetDeclarationContext;
import com.landasource.wiidget.antlr.WiidgetParser.WiidgetMethodCallExpressionContext;
import com.landasource.wiidget.antlr.WiidgetParser.WiidgetVariableBindingContext;
import com.landasource.wiidget.basewiidgets.WiidgetTemplate;
import com.landasource.wiidget.engine.RawWiidget;
import com.landasource.wiidget.engine.WiidgetFactory;
import com.landasource.wiidget.engine.configuration.Configuration;
import com.landasource.wiidget.engine.externals.ExternalWiidgetLoader;
import com.landasource.wiidget.io.FileLoader;
import com.landasource.wiidget.parser.control.ForeachControl;
import com.landasource.wiidget.parser.control.ForeachIterator;
import com.landasource.wiidget.parser.control.IfControl;
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
public class WiidgetTemplateProcessor extends WiidgetView {

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
    public WiidgetTemplateProcessor() {
        super();

        this.ownerView = null;
    }

    /**
     * @param wiidgetFactory
     *            specified factory
     */
    public WiidgetTemplateProcessor(final WiidgetFactory wiidgetFactory) {
        this(wiidgetFactory, null);
    }

    /**
     * @param wiidgetFactory
     *            specified factory
     * @param owner
     *            the owner wiidget
     */
    public WiidgetTemplateProcessor(final WiidgetFactory wiidgetFactory, final WiidgetView owner) {
        super(wiidgetFactory);

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
     * @throws WiidgetParserException
     */
    public String render(final String template) throws WiidgetParserException {

        final CompilationUnitContext compilationUnitContext = getCompilationUnitContext(template);
        return render(compilationUnitContext);
    }

    /**
     * @param template
     * @return
     * @throws WiidgetParserException
     * @throws IOException
     */
    public String render(final InputStream template) throws WiidgetParserException {

        final CompilationUnitContext compilationUnitContext = getCompilationUnitContext(template);
        return render(compilationUnitContext);
    }

    /**
     * @param compilationUnitContext
     * @return
     * @throws WiidgetParserException
     */
    private String render(final CompilationUnitContext compilationUnitContext) throws WiidgetParserException {

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
        return new ImportContext(importDeclaration, getWiidgetFactory()); // use default context
    }

    /**
     * @param statementDeclaration
     *            statements
     * @throws WiidgetParserException
     *             when cannot parse statement
     */
    private void processStatements(final List<StatementDeclarationContext> statementDeclaration) throws WiidgetParserException {

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
     * @throws WiidgetParserException
     *             when cannot parse statement
     */
    private void processStatement(final StatementDeclarationContext statementDeclarationContext) throws WiidgetParserException {
        final ControlStatementContext controlStatementContext = statementDeclarationContext.controlStatement();

        if (null != controlStatementContext) {

            processControl(controlStatementContext);
            return;
        }

        final WiidgetDeclarationContext wiidgetDeclarationContext = statementDeclarationContext.wiidgetDeclaration();
        if (null != wiidgetDeclarationContext) {
            processWiidget(wiidgetDeclarationContext);
        }

        final WiidgetMethodCallExpressionContext wiidgetMethodCallExpressionContext = statementDeclarationContext.wiidgetMethodCallExpression();
        if (null != wiidgetMethodCallExpressionContext) {

            evaluateWiidgetMethodCall(wiidgetMethodCallExpressionContext);
        }

        final SeamStatementContext seamStatementContext = statementDeclarationContext.seamStatement();
        if (null != seamStatementContext) {
            processSeamStatement(seamStatementContext);
        }

    }

    /**
     * @param wiidgetMethodCallExpressionContext
     *            wiidget method call
     * @return result of method call
     * @throws EvaluationException
     *             when cannot invoke method
     */
    private Object evaluateWiidgetMethodCall(final WiidgetMethodCallExpressionContext wiidgetMethodCallExpressionContext) throws EvaluationException {
        final ExpressionEvaluator evaluator = createExpressionEvaluator();
        return evaluator.evaluate(wiidgetMethodCallExpressionContext);
    }

    /**
     * @param seamStatementContext
     *            seaming statement
     * @throws WiidgetParserException
     *             when the object if not a wiidget
     */
    private void processSeamStatement(final SeamStatementContext seamStatementContext) throws WiidgetParserException {

        final ExpressionContext expressionContext = seamStatementContext.expression();

        final Object object = evaluateExpression(expressionContext);

        if (!(object instanceof Wiidget)) {
            throw new WiidgetParserException(seamStatementContext, "Expression '" + expressionContext.getText() + "' must be return wiidget instance.");
        }

        final Wiidget wiidget = (Wiidget) object;

        beginWiidget(wiidget);

        final WiidgetBodyContext wiidgetBodyContext = seamStatementContext.wiidgetBody();
        if (null != wiidgetBodyContext) {
            processStatements(wiidgetBodyContext.statementDeclaration());
        }

        endWiidget(wiidget);
    }

    /**
     * @param controlStatementContext
     *            control statements
     * @throws WiidgetParserException
     *             when cannot do control
     */
    private void processControl(final ControlStatementContext controlStatementContext) throws WiidgetParserException {

        final WiidgetBodyContext bodyContext = controlStatementContext.wiidgetBody();

        final IfControlContext ifControlContext = controlStatementContext.ifControl();

        if (null != ifControlContext) {

            final IfControl ifControl = processIfControl(ifControlContext);

            processIf(ifControl, bodyContext);

        } else {

            final ForeachControlContext foreachControlContext = controlStatementContext.foreachControl();
            if (null != foreachControlContext) {
                final ForeachControl foreachControl = processForeachControl(foreachControlContext);

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
     * @throws WiidgetParserException
     *             when cannot iterate over value
     */
    private void processForeach(final ForeachControl foreachControl, final WiidgetBodyContext bodyContext) throws WiidgetParserException {

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

        for (final Pair<Object, Object> item : iterator.entrySet()) {

            if (mustSetKey) {
                getWiidgetContext().set(key, item.getLeft());
            }

            getWiidgetContext().set(variable, item.getRight());

            processStatements(bodyContext.statementDeclaration());
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
     * @throws WiidgetParserException
     *             when cannot process body
     */
    private void processIf(final IfControl ifControl, final WiidgetBodyContext bodyContext) throws WiidgetParserException {

        // TODO else
        if (ifControl.getValue()) {

            processStatements(bodyContext.statementDeclaration());
        }

    }

    /**
     * @param foreachControlContext
     *            foreach
     * @return control object
     * @throws WiidgetParserException
     *             when cannot iterate over value
     */
    private ForeachControl processForeachControl(final ForeachControlContext foreachControlContext) throws WiidgetParserException {

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

        return new ForeachControl(key, variable, value);

    }

    /**
     * @param ifControlContext
     *            if control
     * @return control object
     * @throws WiidgetParserException
     *             when the expression is not a boolean
     */
    private IfControl processIfControl(final IfControlContext ifControlContext) throws WiidgetParserException {
        try {

            final Boolean condition = (Boolean) evaluateExpression(ifControlContext.expression());

            // TODO else
            return new IfControl(condition);

        } catch (final ClassCastException castException) {

            throw new WiidgetParserException(ifControlContext, "Expression must be boolean: " + ifControlContext.expression().getText(), castException);
        }

    }

    /**
     * Processes wiidget statement.
     *
     * @param declarationContext
     *            wiidget declaration
     * @throws WiidgetParserException
     *             when cannot create wiidget or declaration is illegal
     */
    private void processWiidget(final WiidgetDeclarationContext declarationContext) throws WiidgetParserException {

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
                    throw new WiidgetParserException(declarationContext, "Unknown wiidget alias: " + alias);
                }

                wiidget = createWiidget(wiidgetResource, wiidgetArguments);
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
     * @throws WiidgetParserException
     */
    private Wiidget createWiidgetFromExpression(final ExpressionContext expression, final WiidgetArgumentsContext wiidgetArguments) throws WiidgetParserException {

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

                final Wiidget wiidget = getWiidgetFactory().createWiidget(this, type, dataMap, true);

                return wiidget;

            }

        }

        throw new WiidgetParserException(expression, String.format("Unsupported wiidget name expression: %s (%s)", value, expression.getText()));
    }

    private Wiidget createRawWiidget(final String tagName, final WiidgetArgumentsContext wiidgetArguments) throws WiidgetParserException {

        final Class<? extends RawWiidget> rawType = getRawType();

        final DataMap dataMap = processArguments(wiidgetArguments, rawType);

        final RawWiidget wiidget = getWiidgetFactory().createWiidget(this, rawType, dataMap, true);
        wiidget.setRawTagName(tagName);

        return wiidget;
    }

    /**
     * @return the configured raw type
     */
    private Class<? extends RawWiidget> getRawType() {
        return getWiidgetFactory().getConfiguration().getRawType();
    }

    /**
     * @param wiidgetResource
     *            resource
     * @param arguments
     *            arguments declaration
     * @return wiidget
     * @throws WiidgetParserException
     *             when cannot create wiidget
     */
    private Wiidget createWiidget(final WiidgetResource wiidgetResource, final WiidgetArgumentsContext arguments) throws WiidgetParserException {
        Wiidget wiidget;
        if (wiidgetResource instanceof FileWiidgetResource) {

            final FileWiidgetResource fileWiidgetResource = (FileWiidgetResource) wiidgetResource;

            final ResourceWiidget resourceWiidget = getWiidgetFactory().createWiidget(getOwner(), ResourceWiidget.class, EMPTY_DATA, true);
            resourceWiidget.setFileName(fileWiidgetResource.getCanonicalFileName());

            wiidget = resourceWiidget;

        } else if (wiidgetResource instanceof ClassWiidgetResource) {

            final Class<? extends Wiidget> type = ((ClassWiidgetResource) wiidgetResource).getWiidgetClass();
            final DataMap dataMap = processArguments(arguments, type);

            wiidget = getWiidgetFactory().createWiidget(this, type, dataMap, true);

        } else if (wiidgetResource instanceof ExternalWiidgetResource) {

            wiidget = createExternalWiidget((ExternalWiidgetResource) wiidgetResource, arguments);

        } else {
            throw new IllegalStateException("Illegal import elemenet: " + wiidgetResource);
        }

        return wiidget;
    }

    private Wiidget createExternalWiidget(final ExternalWiidgetResource wiidgetResource, final WiidgetArgumentsContext arguments) throws WiidgetParserException {

        final URI uri = wiidgetResource.getUri();
        final ExternalWiidgetLoader matchingLoader = getWiidgetLoader(uri);

        final String content = matchingLoader.load(uri);

        final DataMap data = processArguments(arguments, null);

        return getWiidgetFactory().createWiidget(this, WiidgetTemplate.class, data().set(DefaultField.NAME, content).set("context", data), true);

    }

    private ExternalWiidgetLoader getWiidgetLoader(final URI uri) {

        for (final ExternalWiidgetLoader loader : getWiidgetFactory().getConfiguration().getExternalWiidgetLoaders()) {
            if (loader.canHandle(uri)) {
                return loader;
            }
        }

        throw new WiidgetException(String.format("No loader for URI: %s", uri));
    }

    private InputStream getFileInputStream(final String canonicalFileName) {
        final FileLoader fileLoader = getWiidgetFactory().getConfiguration().getFileLoader();
        return fileLoader.getFile(canonicalFileName);
    }

    private WiidgetResource getWiidgetClass(final String wiidgetName) throws WiidgetParserException {
        return importContext.findByAlias(wiidgetName);
    }

    // TODO refactor
    private DataMap processArguments(final WiidgetArgumentsContext wiidgetArguments, final Class<? extends Wiidget> wiidgetClass) throws WiidgetParserException {

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

                        final String property = elementValuePairContext.Identifier().getText();

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

    private String getDefaultValueProperty(final Class<? extends Wiidget> wiidgetClass) {

        final Field defaultField = Reflection.getField(wiidgetClass, DefaultField.class);

        if (null == defaultField) {
            return "value";
        } else {
            return defaultField.getName();
        }

    }

    private Object processArgumentValue(final ElementValueContext valueContext) throws WiidgetParserException {

        final QualifiedNameContext qualifiedNameContext = valueContext.qualifiedName();
        if (null != qualifiedNameContext) {
            return processQualifiedName(qualifiedNameContext);
        }

        final ElementValueArrayInitializerContext arrayInitializerContext = valueContext.elementValueArrayInitializer();
        if (null != arrayInitializerContext) {
            return processValueArray(arrayInitializerContext);
        }

        final ExpressionContext expressionContext = valueContext.expression();
        if (null != expressionContext) {
            return evaluateExpression(expressionContext);
        }
        throw new WiidgetParserException(valueContext, "Cannot get value of : " + valueContext.getText());

    }

    /**
     * Element value array evaluator.
     *
     * @param arrayInitializerContext
     *            context
     * @return array of evaluated values
     * @throws WiidgetParserException
     */
    private Object[] processValueArray(final ElementValueArrayInitializerContext arrayInitializerContext) throws WiidgetParserException {

        final List<ElementValueContext> elementValueContexts = arrayInitializerContext.elementValue();
        final int size = elementValueContexts.size();
        final Object[] dataArray = new Object[size];

        for (int index = 0; index < elementValueContexts.size(); index++) {

            dataArray[index] = processArgumentValue(elementValueContexts.get(index));

        }

        return dataArray;
    }

    private Object processQualifiedName(final QualifiedNameContext qualifiedNameContext) throws WiidgetParserException {
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
        final Configuration configuration = getWiidgetFactory().getConfiguration();
        return configuration.getExpressionEvaluatorFactory(getWiidgetContext(), getWiidgetMap()).create();
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
