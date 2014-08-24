package com.landasource.wiidget.parser.imports;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import com.landasource.wiidget.WiidgetException;
import com.landasource.wiidget.testutil.AbstractTemplateTest;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class InnerImportTest extends AbstractTemplateTest {

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

    @Test
    public void testIllegalImport() {

        try {

            render("illegalImport.wdgt");
            Assert.fail("Should throw exception.");
        } catch (final WiidgetException exception) {

            Assert.assertEquals(ImportException.class, exception.getCause().getClass());
        }
    }

    @Test
    public void testDuplicateAlias() {
        try {

            render("duplicateAlias.wdgt");
            Assert.fail("Should throw exception.");
        } catch (final WiidgetException exception) {

            Assert.assertEquals(DuplicateAliasException.class, exception.getCause().getClass());
        }
    }

}
