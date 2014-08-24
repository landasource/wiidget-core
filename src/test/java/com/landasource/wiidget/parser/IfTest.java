package com.landasource.wiidget.parser;

import org.junit.Test;

import com.landasource.wiidget.testutil.AbstractTemplateTest;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class IfTest extends AbstractTemplateTest {

    @Test
    public void testSimpleIfWithTrue() {
        context.set("truevalue", true);

        assertText("Foo", " if(truevalue){ \"Foo\"; } ");
        assertText("", " if(!truevalue){ \"Foo\"; } ");
    }

    @Test
    public void testSimpleIfWithFalse() {
        context.set("falsevalue", false);

        assertText("", " if(falsevalue){ \"Foo\"; } ");
        assertText("Foo", " if(!falsevalue){ \"Foo\"; } ");
    }

    @Test
    public void testElseIfWithTrue() {

        context.set("truevalue", true);

        assertText("Foo", " if(!truevalue){ \"Bar\"; } else { \"Foo\"; } ");
        assertText("Foo", " if(truevalue){ \"Foo\"; } else { \"Bar\"; } ");

    }

}
