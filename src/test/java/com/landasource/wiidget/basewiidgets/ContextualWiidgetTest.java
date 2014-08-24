package com.landasource.wiidget.basewiidgets;

import org.junit.Assert;
import org.junit.Test;

import com.landasource.wiidget.testutil.AbstractTemplateTest;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ContextualWiidgetTest extends AbstractTemplateTest {

    @Test
    public void testContextRestore() {

        context.set("title", "Foo");

        final String result = render("contextual.wdgt");

        Assert.assertEquals("FooBarFoo", result);
        Assert.assertEquals("Foo", context.get("title"));
    }

}
