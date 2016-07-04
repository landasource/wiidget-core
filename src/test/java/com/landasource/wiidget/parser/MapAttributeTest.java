package com.landasource.wiidget.parser;

import org.junit.Assert;
import org.junit.Test;

import com.landasource.wiidget.testutil.AbstractTemplateTest;
import com.landasource.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class MapAttributeTest extends AbstractTemplateTest {

    @Test
    public void testAttribte() {

        context.set("data", new DataMap().set("foo", "bar"));

        final String result = render("mapAttribute.wdgt");

        Assert.assertEquals("bar", context.get("val1"));
    }

    @Test
    public void testComplexAttr() {
        context.set("deviceOperationModes", new DataMap());
        context.set("gpio", 1);

        final String result = render("complex.wdgt");

        System.out.println(result);
    }
}
