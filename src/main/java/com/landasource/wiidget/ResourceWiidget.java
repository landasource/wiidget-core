package com.landasource.wiidget;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

/**
 * Wiidget for files.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ResourceWiidget extends Wiidget {

	/** Stream of the file. */
	private InputStream stream;
	private String fileName;

	// TODO handle children

	@Override
	public void run() {

		try {
			final InputStream inputStream = getWiidgetFactory().getConfiguration().getFileLoader().getFile(fileName);

			final String template = IOUtils.toString(inputStream);

			final String content = Renderer.create(getWiidgetFactory()).render(template);

			write(content);

		} catch (final WiidgetException exception) {

			throw new WiidgetException("Cannot render wiidget: " + fileName, exception);

		} catch (final IOException e) {
			throw new WiidgetException("Cannot load wiidget", e);
		}

	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *            the fileName to set
	 */
	public void setFileName(final String fileName) {
		this.fileName = fileName;
	}

}
