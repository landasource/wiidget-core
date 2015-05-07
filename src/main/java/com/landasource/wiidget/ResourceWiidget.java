package com.landasource.wiidget;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;

import com.landasource.wiidget.commons.ContextualWiidget;
import com.landasource.wiidget.context.Context;

/**
 * Wiidget for files.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ResourceWiidget extends ContextualWiidget {

	/** Full path to file. */
	private String fileName;
	private String content;

	@Override
	public void init() {
		super.init();

		startBuffer();
	}

	@Override
	public void run() {

		try {
			final InputStream inputStream = getEngine().getConfiguration().getFileLoader().getFile(fileName);

			final String template = IOUtils.toString(inputStream);

			final Context context = getEngine().getContext();
			final Object prevThis = context.get("this");

			content = endBuffer(); // use: this.content
			context.set("this", this);

			final String content = Renderer.create(getEngine()).render(template);

			if (null == prevThis) {
				context.remove("this");
			} else {
				context.set("this", prevThis);
			}

			write(content);

		} catch (final WiidgetException exception) {

			throw new WiidgetException("Cannot render wiidget: " + fileName, exception);

		} catch (final IOException e) {
			throw new WiidgetException("Cannot load wiidget", e);
		}

		super.run();
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName
	 *           the fileName to set
	 */
	public void setFileName(final String fileName) {
		this.fileName = fileName;
	}

	public String getContent() {
		return content;
	}

}
