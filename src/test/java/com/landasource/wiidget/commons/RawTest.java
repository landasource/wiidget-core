package com.landasource.wiidget.commons;

import org.junit.Assert;
import org.junit.Test;

import com.landasource.wiidget.Renderer;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class RawTest {

    @Test
    public void testEmpty() {

        assertRender("<div> </div>", " \"div\"(\" \"); ");
        assertRender("<div>a</div>", " \"div\"() { \"a\"; } ");
    }

    private void assertRender(final String expected, final String template) {

        final String result = Renderer.create().render(template);
        Assert.assertEquals(expected, result);
    }

}
