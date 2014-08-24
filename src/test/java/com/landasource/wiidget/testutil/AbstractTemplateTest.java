package com.landasource.wiidget.testutil;

import java.io.InputStream;

import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Assert;
import org.junit.Before;

import com.landasource.wiidget.Renderer;
import com.landasource.wiidget.engine.configuration.ClassPathFileLoader;
import com.landasource.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class AbstractTemplateTest {

    /**
     * Context of renderer.
     */
    protected DataMap context;

    /**
     * Clear context.
     */
    @Before
    public void before() {
        context = new DataMap();
    }

    protected String render(final String file) {
        final String pack = getClass().getPackage().getName().replaceAll("\\.", "/");

        final InputStream resourceAsStream = new ClassPathFileLoader().getFile(pack + "/" + file);
        final String result = Renderer.create(context).render(resourceAsStream);
        return result;
    }

    protected String renderText(final String content) {

        return Renderer.create(context).render(content);
    }

    protected void assertText(final String expected, final String content) {

        assertMatch(content, CoreMatchers.equalTo(expected));

    }

    protected void assertMatch(final String content, final Matcher... matchers) {

        final String result = renderText(content);

        for (final Matcher<String> matcher : matchers) {
            Assert.assertThat(result, matcher);
        }
    }

}
