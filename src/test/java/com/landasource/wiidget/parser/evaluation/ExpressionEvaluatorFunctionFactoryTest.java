package com.landasource.wiidget.parser.evaluation;

import com.landasource.wiidget.testutil.AbstractTemplateTest;
import com.landasource.wiidget.testutil.UpperCaseEchoFunctionFactory;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Rita on 2015.05.23..
 */
public class ExpressionEvaluatorFunctionFactoryTest extends AbstractTemplateTest {

    @Before
    public void init() {
        context.put("upperCaseAny", new UpperCaseEchoFunctionFactory());
    }

    @Test
    public void testAnyMethodEchoesUpperCase() {

        assertText("echo:HELLO", "`upperCaseAny.echo(\"hellO\")`;");

    }

}
