package com.landasource.wiidget.engine.configuration;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.engine.ObjectFactory;
import com.landasource.wiidget.engine.RawWiidget;
import com.landasource.wiidget.engine.externals.ExternalWiidgetLoader;
import com.landasource.wiidget.io.FileLoader;
import com.landasource.wiidget.parser.TemplateExpressionBound;
import com.landasource.wiidget.parser.evaluation.EvaluationContext;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluatorFactory;
import com.landasource.wiidget.parser.resource.WiidgetResource;
import com.landasource.wiidget.transform.TransformRule;
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
    Class<? extends RawWiidget> getRawType();

    /**
     * @return URL resolver
     */
    URLResolver getUrlResolver();

    /**
     * @return validator
     */
    WiidgetValidator getWiidgetValidator();

    /**
     * @return object factory
     * @see ObjectFactory
     */
    ObjectFactory getObjectFactory();

    /**
     * @param evaluationContext
     *            evaluation context within the evaluation of expressions
     *            happens
     * @return factory of evaluator
     */
    ExpressionEvaluatorFactory getExpressionEvaluatorFactory(EvaluationContext evaluationContext);

    /**
     * @return set of loaders that can load external wiidget resources
     */
    Set<ExternalWiidgetLoader> getExternalWiidgetLoaders();

    /**
     * @return file loader
     */
    FileLoader getFileLoader();

    /**
     * @return class loader
     */
    ClassLoader getClassLoader();

    /**
     *
     * @return map of default imported resources. key: alias, value: resource
     */
    Map<String, WiidgetResource> getDefaultImports();

    /**
     *
     * @param alias
     *            alias
     * @param wiidgetResource
     *            default resource
     */
    void addDefaultImport(String alias, WiidgetResource wiidgetResource);

    /**
     *
     * @param wiidgetClass
     *            default imported class
     */
    void addDefaultImport(Class<? extends Wiidget> wiidgetClass);

    /**
     *
     * @return bounds
     */
    TemplateExpressionBound getTemplateExpressionBound();

    void setTemplateExpressionBound(TemplateExpressionBound bound);

    @SuppressWarnings("rawtypes")
    List<TransformRule> getTransformRules();

    void addTransformRule(TransformRule<? extends Wiidget> rule);

}
