package com.landasource.wiidget.engine.configuration;

import java.util.Set;

import com.landasource.wiidget.engine.ObjectFactory;
import com.landasource.wiidget.engine.RawWiidget;
import com.landasource.wiidget.engine.externals.ExternalWiidgetLoader;
import com.landasource.wiidget.io.FileLoader;
import com.landasource.wiidget.parser.evaluation.EvaluationContext;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluatorFactory;
import com.landasource.wiidget.url.URLResolver;
import com.landasource.wiidget.validation.WiidgetValidator;

/**
 * Non trivial configuration values of the engine.
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface Configuration {

    /**
     * @return raw type that can render raw wiidgets
     */
    public Class<? extends RawWiidget> getRawType();

    /**
     * @return URL resolver
     */
    public URLResolver getUrlResolver();

    /**
     * @return validator
     */
    public WiidgetValidator getWiidgetValidator();

    /**
     * @return object factory
     * @see ObjectFactory
     */
    public ObjectFactory getObjectFactory();

    /**
     * @param evaluationContext
     *            evaluation context within the evaluation of expressions
     *            happens
     * @return factory of evaluator
     */
    public ExpressionEvaluatorFactory getExpressionEvaluatorFactory(EvaluationContext evaluationContext);

    /**
     * @return set of loaders that can load external wiidget resources
     */
    public Set<ExternalWiidgetLoader> getExternalWiidgetLoaders();

    /**
     * @return file loader
     */
    public FileLoader getFileLoader();
}
