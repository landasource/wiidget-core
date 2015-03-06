package com.landasource.wiidget.engine.configuration;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.commons.Raw;
import com.landasource.wiidget.engine.ObjectFactory;
import com.landasource.wiidget.engine.RawWiidget;
import com.landasource.wiidget.engine.ReflectionObjectFactory;
import com.landasource.wiidget.engine.externals.ExternalWiidgetLoader;
import com.landasource.wiidget.engine.externals.LocalFileWiidgetLoader;
import com.landasource.wiidget.engine.externals.ResourceWiidgetLoader;
import com.landasource.wiidget.engine.externals.WebWiidgetLoader;
import com.landasource.wiidget.io.FileLoader;
import com.landasource.wiidget.parser.TemplateExpressionBound;
import com.landasource.wiidget.parser.evaluation.EvaluationContext;
import com.landasource.wiidget.parser.evaluation.ExpressionEvaluatorFactory;
import com.landasource.wiidget.parser.resource.ClassWiidgetResource;
import com.landasource.wiidget.parser.resource.WiidgetResource;
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
     * Default imported resources.
     */
    private final Map<String, WiidgetResource> defaultImports = new HashMap<String, WiidgetResource>();

    private TemplateExpressionBound templateExpressionBound;

    /**
     * Default constructor.
     */
    public DefaultConfiguration() {
        super();
        getExternalWiidgetLoaders().add(new WebWiidgetLoader());
        getExternalWiidgetLoaders().add(new LocalFileWiidgetLoader());
        getExternalWiidgetLoaders().add(new ResourceWiidgetLoader());
        setTemplateExpressionBound(new TemplateExpressionBound("{{", "}}"));
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
    public ExpressionEvaluatorFactory getExpressionEvaluatorFactory(final EvaluationContext evaluationContext) {
        return new DefaultExpressionEvaluatorFactory(evaluationContext);
    }

    @Override
    public Set<ExternalWiidgetLoader> getExternalWiidgetLoaders() {
        return externalWiidgetLoader;
    }

    @Override
    public FileLoader getFileLoader() {
        return new ClassPathFileLoader();
    }

    @Override
    public ClassLoader getClassLoader() {
        return new DefaultClassLoader();
    }

    @Override
    public Map<String, WiidgetResource> getDefaultImports() {
        return Collections.unmodifiableMap(defaultImports);
    }

    @Override
    public void addDefaultImport(final String alias, final WiidgetResource wiidgetResource) {
        defaultImports.put(alias, wiidgetResource);
    }

    @Override
    public void addDefaultImport(final Class<? extends Wiidget> wiidgetClass) {
        addDefaultImport(wiidgetClass.getSimpleName(), new ClassWiidgetResource(wiidgetClass));
    }

    @Override
    public TemplateExpressionBound getTemplateExpressionBound() {
        return templateExpressionBound;
    }

    @Override
    public void setTemplateExpressionBound(final TemplateExpressionBound templateExpressionBound) {
        this.templateExpressionBound = templateExpressionBound;
    }

}
