package com.landasource.wiidget.engine;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ResultTransformerRegistrator {

	/**
	 * List of transformers.
	 */
	// TODO add priority to transformers
	private final List<ResultTransformer> resultTransformers;

	/**
	 * Default constructor.
	 */
	public ResultTransformerRegistrator() {
		this.resultTransformers = new ArrayList<ResultTransformer>();
	}

	/**
	 * Adds new transformer to registry.
	 *
	 * @param resultTransformer
	 *            the transformer
	 */
	public void register(final ResultTransformer resultTransformer) {
		this.resultTransformers.add(resultTransformer);
	}

	/**
	 * Uses registered transformers to transform the result.
	 *
	 * @param content
	 *            content to transform
	 * @return the new content
	 */
	public String transform(final String content) {
		String transformed = content;

		for (final ResultTransformer resultTransformer : this.resultTransformers) {
			transformed = resultTransformer.transform(transformed);
		}

		return transformed;
	}

}
