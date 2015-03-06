package com.landasource.wiidget.context;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.landasource.wiidget.context.DefaultContext;
import com.landasource.wiidget.context.Context;

public class WiidgetContextTest {

	private Context wiidgetContext;

	@Before
	public void initContext() {
		wiidgetContext = new DefaultContext();
	}

	@Test
	public void testLoopReference() {
		Assert.assertSame(wiidgetContext, wiidgetContext.get(Context.CONTEXT_VARIABLE));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testReservedWords1() {
		wiidgetContext.set("true", false);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testReservedWords2() {
		wiidgetContext.set("false", false);

	}

	@Test(expected = IllegalArgumentException.class)
	public void testReservedWords3() {
		wiidgetContext.set("context", false);
	}
}
