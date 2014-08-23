package com.landasource.wiidget.engine.configuration;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.basewiidgets.Raw;
import com.landasource.wiidget.context.WiidgetContext;
import com.landasource.wiidget.engine.ObjectFactory;
import com.landasource.wiidget.engine.RawWiidget;
import com.landasource.wiidget.engine.ReflectionObjectFactory;
import com.landasource.wiidget.engine.externals.ExternalWiidgetLoader;
import com.landasource.wiidget.engine.externals.LocalFileWiidgetLoader;
import com.landasource.wiidget.engine.externals.ResourceWiidgetLoader;
import com.landasource.wiidget.engine.externals.WebWiidgetLoader;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluatorFactory;
import com.landasource.wiidget.url.TransparentURLResolver;
import com.landasource.wiidget.url.URLResolver;
import com.landasource.wiidget.validation.DefaultWiidgetValidator;
import com.landasource.wiidget.validation.WiidgetValidator;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class DefaultConfiguration implements Configuration {

	/**
	 * Set of external loaders.
	 */
	private final Set<ExternalWiidgetLoader> externalWiidgetLoader = new HashSet<>();

	/**
	 * Default constructor.
	 */
	public DefaultConfiguration() {
		super();
		getExternalWiidgetLoaders().add(new WebWiidgetLoader());
		getExternalWiidgetLoaders().add(new LocalFileWiidgetLoader());
		getExternalWiidgetLoaders().add(new ResourceWiidgetLoader());
	}

	@Override
	public Class<? extends RawWiidget> getRawType() {
		return Raw.class;
	}

	@Override
	public URLResolver getUrlResolver() {
		return new TransparentURLResolver();
	}

	@Override
	public WiidgetValidator getWiidgetValidator() {

		return new DefaultWiidgetValidator(getObjectFactory());
	}

	@Override
	public ObjectFactory getObjectFactory() {
		return new ReflectionObjectFactory();
	}

	@Override
	public ExpressionEvaluatorFactory getExpressionEvaluatorFactory(final WiidgetContext wiidgetContext, final Map<String, Wiidget> wiidgetMap) {
		return new DefaultExpressionEvaluatorFactory(wiidgetContext, wiidgetMap);
	}

	@Override
	public Set<ExternalWiidgetLoader> getExternalWiidgetLoaders() {
		return externalWiidgetLoader;
	}

}
