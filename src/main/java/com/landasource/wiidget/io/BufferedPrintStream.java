package com.landasource.wiidget.io;

import java.util.EmptyStackException;
import java.util.Stack;

import com.landasource.wiidget.WiidgetException;
import com.landasource.wiidget.util.Strings;

/**
 * Simple stream supporting interval buffering, while write in the stream.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class BufferedPrintStream {

	/**
	 * Stack of builders.
	 */
	private final Stack<StringBuilder> outputStreams = new Stack<StringBuilder>();

	/**
	 * Default constructor.
	 */
	public BufferedPrintStream() {
		startBuffer();
	}

	/** Starts a new buffer and pushes to the stack. */
	public void startBuffer() {

		final StringBuilder stringBuilder = new StringBuilder();
		outputStreams.push(stringBuilder);
	}

	/**
	 * Pops the last buffer and gets content.
	 *
	 * @return the content of the last buffer
	 */
	public String endBuffer() {

		try {

			final StringBuilder stringBuilder = outputStreams.pop();

			return stringBuilder.toString();

		} catch (final EmptyStackException emptyStackException) {
			throw new RuntimeException("No item in buffer.", emptyStackException);
		}

	}

	/**
	 * Removes the last buffer and retreives content. Throws
	 * {@link WiidgetException} when the stack is not empty.
	 *
	 * @return content of buffer
	 */
	public String flush() {
		final String buffer = endBuffer();

		if (!outputStreams.isEmpty()) {
			throw new WiidgetException("Buffer is not empty: \"" + outputStreams.toString() + "\"");
		}

		return buffer;
	}

	/**
	 * Writes content to current buffer.
	 * 
	 * @param string
	 *            content to write
	 */
	public void write(final String string) {

		if (outputStreams.isEmpty()) {
			throw new RuntimeException("No buffered item.");
		}

		outputStreams.peek().append(Strings.emptyIfNull(string));
	}

}
