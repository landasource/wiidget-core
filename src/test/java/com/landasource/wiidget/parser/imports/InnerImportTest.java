package com.landasource.wiidget.parser.imports;

import java.io.InputStream;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.landasource.wiidget.Renderer;
import com.landasource.wiidget.engine.configuration.ClassPathFileLoader;
import com.landasource.wiidget.util.DataMap;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class InnerImportTest {

    /**
     * Context of renderer.
     */
    private DataMap context;

    /**
     * Clear context.
     */
    @Before
    public void before() {
        context = new DataMap();
    }

    @Test
    public void testInnerImport() {

        final String result = render("innerImports.wdgt");

        Assert.assertThat(result, CoreMatchers.equalTo("component1component2"));
    }

    @Test
    public void testInnerImportParameter() {

        context.set("title", "Hello param");
        final String result = render("innerImportsWithParams.wdgt");

        Assert.assertThat(result, CoreMatchers.equalTo("<div>Hello param</div><div>Foobar</div>"));
    }

    private String render(final String file) {
        final InputStream resourceAsStream = new ClassPathFileLoader().getFile("/com/landasource/wiidget/parser/imports/" + file);
        final String result = Renderer.create(context).render(resourceAsStream);
        return result;
    }

}
