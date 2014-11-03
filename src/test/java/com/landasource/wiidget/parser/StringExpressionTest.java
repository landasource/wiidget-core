package com.landasource.wiidget.parser;

import org.junit.Ignore;
import org.junit.Test;

import com.landasource.wiidget.testutil.AbstractTemplateTest;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
@Ignore
public class StringExpressionTest extends AbstractTemplateTest {

    @Test
    public void testSimpleExpressionInString() {

        assertText("<h1>Hello 2!</h1>", " h1(\"Hello ${1 + 1}!\"); ");
        // test escape characters
        //  assertText("Hello Hello ${1 + 1}3!", "\"Hello \\${1 + 1}${1+1+1}!\";");
    }

}
