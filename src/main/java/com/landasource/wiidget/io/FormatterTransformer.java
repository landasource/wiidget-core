package com.landasource.wiidget.io;

import com.landasource.wiidget.engine.ResultTransformer;

/**
 * This transformer formats XML output.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class FormatterTransformer implements ResultTransformer {

	/** Indentation depth. */
	private final Integer formatIndent;

	/**
	 * @param formatIndent
	 *            depth of indentation
	 */
	public FormatterTransformer(final Integer formatIndent) {
		this.formatIndent = formatIndent;
	}

	@Override
	public String transform(final String result) {

		return XMLFormatter.format(result, formatIndent);

	}

}
