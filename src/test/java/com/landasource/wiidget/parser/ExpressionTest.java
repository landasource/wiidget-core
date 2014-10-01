package com.landasource.wiidget.parser;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.landasource.wiidget.Tag;
import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.antlr.WiidgetLexer;
import com.landasource.wiidget.antlr.WiidgetParser;
import com.landasource.wiidget.context.DefaultContext;
import com.landasource.wiidget.context.Context;
import com.landasource.wiidget.engine.DefaultEngine;
import com.landasource.wiidget.parser.evaluation.EvaluationContext;
import com.landasource.wiidget.parser.evaluation.EvaluationException;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluator;
import com.landasource.wiidget.util.DataMap;

public class ExpressionTest {

    protected Context wiidgetContext;

    @Before
    public void initContext() {
        wiidgetContext = new DefaultContext();

    }

    @Test
    public void testIndexedListExpression() {

        final Object object = new Object();
        wiidgetContext.set("list", Arrays.asList(1, 2, 3, 4, "foo", object));

        assertExpression(1, "list[0]");
        assertExpression(2, "list[1]");
        assertExpression("foo", "list[4]");
        assertExpression(object, "list[5]");
    }

    @Test
    public void testPropertyByIndexing() throws NoSuchMethodException, SecurityException {

        final Tag tag = new Tag("div");

        wiidgetContext.set("tag", tag);
        assertExpression("div", "tag[\"name\"]");

        wiidgetContext.set("propertyName", "name");
        assertExpression("div", "tag[propertyName]");

        wiidgetContext.set("list", Arrays.asList(1, 2, 4));
        assertExpression(Collection.class.getMethod("size"), "list[\"size\"]");

        // TODO make it possible
        //assertExpression(3, "list[\"size\"]()");
    }

    @Test
    public void testMapExpression() throws NoSuchMethodException, SecurityException {

        wiidgetContext.set("map", new DataMap().set("someValue", 12));
        assertExpression(12, "map[\"someValue\"]");

        wiidgetContext.set("someValueKey", "someValue");
        assertExpression(12, "map[someValueKey]");

        Assert.assertNull(safeEvaluate("map[\"some\"]"));
    }

    @Test
    public void testMethodCall() {

        final DataMap dataMap = new DataMap();
        wiidgetContext.set("data", dataMap.set("key", "foo"));

        assertExpression(1, "data.size()");
        assertExpression("foo", "data.get(\"key\")");

        wiidgetContext.set("number", 12);
        assertExpression(dataMap, "data.set(\"own\", data).set(\"twelve\", 12)");

        assertExpression(3, "data.size()");
        assertExpression(true, "data.size() == 3");

        assertExpression(dataMap, "data");
    }

    @Test
    public void testEqualityOperator() {

        wiidgetContext.set("foo", "foo");

        // equality
        assertExpression(true, "true == true"); // basic case
        assertExpression(true, "\"foo\" == foo");
        assertExpression(true, "foo == \"foo\"");
        assertExpression(true, "null == null");
        assertExpression(true, "null == someKeyword");
        assertExpression(true, "some == null");
    }

    @Test
    public void testDefaultOperator() {

        assertExpression("foo", "null ~ \"foo\"");
        assertExpression("foobar", "some ~ other ~ keyword ~ (\"foo\" + \"bar\")");

        final int value = 1;
        wiidgetContext.set("value", value);
        assertExpression(value, "some ~ key ~ value ~ 2");

    }

    // Helper methods

    protected void assertExpression(final Object expected, final String template) {

        Assert.assertEquals(expected, safeEvaluate(template));
    }

    protected Object safeEvaluate(final String string) {
        try {
            return evaluate(string);
        } catch (EvaluationException | RecognitionException e) {
            throw new RuntimeException(e);
        }

    }

    protected Object evaluate(final String template) throws EvaluationException, RecognitionException {

        final WiidgetParser createParser = createParser(template);
        final ExpressionEvaluator evaluator = createEvaluator(wiidgetContext);

        return evaluator.evaluate(createParser.expressionList().expression().get(0));
    }

    protected static ExpressionEvaluator createEvaluator(final Context wiidgetContext) {
        final EvaluationContext evaluationContext = new EvaluationContext(new MockImportContext(new DefaultEngine(wiidgetContext)), wiidgetContext,
                new HashMap<String, Wiidget>());

        return new DefaultEngine(wiidgetContext).getConfiguration().getExpressionEvaluatorFactory(evaluationContext).create();
    }

    protected static WiidgetParser createParser(final String template) {
        final ANTLRInputStream input = new ANTLRInputStream(template);
        final WiidgetLexer aWiidgetLexer = new WiidgetLexer(input);
        final BufferedTokenStream tokenStream = new BufferedTokenStream(aWiidgetLexer);
        final WiidgetParser wiidgetParser = new CustomWiidgetParser(tokenStream);

        return wiidgetParser;
    }

}
