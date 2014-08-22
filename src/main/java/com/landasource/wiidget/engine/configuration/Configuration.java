package com.landasource.wiidget.engine.configuration;

import java.util.Map;
import java.util.Set;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.context.WiidgetContext;
import com.landasource.wiidget.engine.ObjectFactory;
import com.landasource.wiidget.engine.externals.ExternalWiidgetLoader;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluatorFactory;
import com.landasource.wiidget.url.URLResolver;
import com.landasource.wiidget.validation.WiidgetValidator;

/**
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 *
 */
public interface Configuration {

	public Class<? extends Wiidget> getRawType();

	public URLResolver getUrlResolver();

	public WiidgetValidator getWiidgetValidator();

	public ObjectFactory getObjectFactory();

	public ExpressionEvaluatorFactory getExpressionEvaluatorFactory(WiidgetContext wiidgetContext, Map<String, Wiidget> wiidgetMap);

	public Set<ExternalWiidgetLoader> getExternalWiidgetLoaders();
}
