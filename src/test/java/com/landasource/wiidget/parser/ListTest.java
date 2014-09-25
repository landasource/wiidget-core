package com.landasource.wiidget.parser;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.landasource.wiidget.testutil.AbstractTemplateTest;

public class ListTest extends AbstractTemplateTest {

    @Test
    public void testTemplate() {

        final String render = render("listExpression.wdgt");
        Assert.assertEquals("124", render);

        Assert.assertEquals(1, ((List<?>) context.get("val1")).get(0));
        Assert.assertEquals("Hello", ((List<?>) context.get("val1")).get(1));
        Assert.assertEquals(null, ((List<?>) context.get("val1")).get(2));

    }
}
