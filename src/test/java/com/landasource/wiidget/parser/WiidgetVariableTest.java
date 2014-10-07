package com.landasource.wiidget.parser;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.commons.Raw;
import com.landasource.wiidget.testutil.AbstractTemplateTest;


/**
 *
 * @author lzsolt
 *
 */
public class WiidgetVariableTest extends AbstractTemplateTest{

	@Test
	public void testBinding() {


		final String result = render("wiidgetBinding.wdgt");

		Assert.assertThat(context.get("$fooWiidget"), CoreMatchers.instanceOf(Raw.class));
		Assert.assertThat(context.get("$simple"), CoreMatchers.instanceOf(SimpleWiidget.class));
	}

	public static class SimpleWiidget extends Wiidget{

	}

}
