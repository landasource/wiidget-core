package com.landasource.wiidget.engine.externals;

import java.net.URI;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.landasource.wiidget.engine.externals.WebWiidgetLoader;

public class WebWiidgetLoaderTest {

	private WebWiidgetLoader webWiidgetLoader;

	@Before
	public void initLoader() {
		webWiidgetLoader = new WebWiidgetLoader();
	}

	@Test
	public void testFtp() {

		final URI uri = URI.create("ftp://ftp.bme.hu/.banner");
		Assert.assertTrue("Can handle FTP", webWiidgetLoader.canHandle(uri));
		Assert.assertNotNull(webWiidgetLoader.load(uri));

	}
}
