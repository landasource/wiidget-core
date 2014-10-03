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
}
