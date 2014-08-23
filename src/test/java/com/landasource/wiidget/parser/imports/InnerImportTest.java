package com.landasource.wiidget.parser.imports;

import java.io.InputStream;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import com.landasource.wiidget.Renderer;
import com.landasource.wiidget.engine.configuration.ClassPathFileLoader;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class InnerImportTest {

    @Test
    public void testInnerImport() {

        final InputStream resourceAsStream = new ClassPathFileLoader().getFile("/com/landasource/wiidget/parser/imports/innerImports.wdgt");
        final String result = Renderer.create().render(resourceAsStream);

        Assert.assertThat(result, CoreMatchers.equalTo("component1component2"));
    }

}
