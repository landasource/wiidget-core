package com.landasource.wiidget.parser;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.landasource.wiidget.context.Context;
import com.landasource.wiidget.context.DefaultContext;
import com.landasource.wiidget.engine.DefaultEngine;
import com.landasource.wiidget.engine.Engine;

/**
 * Test single exressions
 *
 * @author lzsolt
 *
 */
public class SingleExpressionEvaluatorTest {

    protected Context wiidgetContext;

    @Before
    public void initContext() {
        wiidgetContext = new DefaultContext();
    }

    @Test
    public void testOneExressionInTemplate1() throws ParserException {
        final String replaced = evaluate("This is {{true ? \"real true\" : \"real false\" }}.");
        Assert.assertEquals("This is real true.", replaced);
    }

    @Test
    public void testOneExressionInTemplate2() throws ParserException {
        final String replaced = evaluate("This is {{ null~ [1,3,5+1]  }}.");
        Assert.assertEquals("This is [1, 3, 6].", replaced);
    }

    @Test
    public void testOneExressionInTemplate3() throws ParserException {
        final String replaced = evaluate("This is {{ {foo: true, bar: false, \"foo\": 2+3}  }}.");
        Assert.assertEquals("This is {foo=5, bar=false}.", replaced);
    }

    private String evaluate(final String template) throws ParserException {
        final SingleExpressionEvaluator expressionEvaluator = getEvaluator();
        final String replaced = expressionEvaluator.replaceExpressions(template);
        return replaced;
    }

    private SingleExpressionEvaluator getEvaluator() {
        final SingleExpressionEvaluator expressionEvaluator = new SingleExpressionEvaluator(getEngine());
        return expressionEvaluator;
    }

    private Engine getEngine() {
        return new DefaultEngine(wiidgetContext);
    }

}
