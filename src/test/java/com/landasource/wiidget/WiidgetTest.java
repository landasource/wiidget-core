/**
 *
 */
package com.landasource.wiidget;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.WiidgetException;
import com.landasource.wiidget.WiidgetView;
import com.landasource.wiidget.commons.Raw;
import com.landasource.wiidget.engine.DefaultEngine;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public class WiidgetTest {

	private Wiidget wiidget;
	private WiidgetView wiidgetView;

	@Before
	public void initView() {
		wiidgetView = new WiidgetView(new DefaultEngine()) {
		};

		wiidget = wiidgetView.wiidget(Raw.class);
	}

	@Test
	public void testOwner() {

		Assert.assertSame(wiidgetView, wiidget.getOwner());
	}

	/**
	 * Assert that the variable put into context is the same (by reference).
	 */
	@Test
	public void testWiidgetContext() {

		final Object value = new Object();
		wiidget.getEngine().getContext().set("var", value);

		final Object object = wiidget.getEngine().getContext().get("var");

		Assert.assertSame(value, object);
	}

	@Test
	public void testBuffer() {

		wiidget.write("Hello");
		wiidget.write(" world!");

		Assert.assertEquals("Hello world!", wiidget.getPrintStream().flush());
	}

	@Test
	public void testStartBuffer() {

		wiidget.write("Hello");

		wiidget.startBuffer();

		wiidget.write(" world!");

		Assert.assertEquals(" world!", wiidget.endBuffer());
	}

	@Test
	public void testIllegalBufferState() {

		wiidget.startBuffer();

		try {
			wiidget.getPrintStream().flush();

			Assert.fail(String.format("% was not thrown", WiidgetException.class));
		} catch (final Exception exception) {

			Assert.assertEquals(WiidgetException.class, exception.getClass());
		}
	}
}
