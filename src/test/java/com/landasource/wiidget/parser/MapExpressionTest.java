package com.landasource.wiidget.parser;

import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class MapExpressionTest extends ExpressionTest {

    @Test
    public void testMapValue() {

        final Object value = safeEvaluate("{test : \"Hello\", \"foo\" : {bar : 1 + (2 * 4), blame : \"1\"}}");

        Assert.assertTrue("Value is map", value instanceof Map);

        final Map<String, Object> map = (Map<String, Object>) value;
        Assert.assertEquals("Hello", map.get("test"));

        Assert.assertEquals(9, ((Map) map.get("foo")).get("bar"));
        Assert.assertEquals("1", ((Map) map.get("foo")).get("blame"));
    }
}
