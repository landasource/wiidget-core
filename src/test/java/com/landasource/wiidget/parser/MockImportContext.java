package com.landasource.wiidget.parser;

import com.landasource.wiidget.engine.WiidgetFactory;
import com.landasource.wiidget.parser.imports.ImportContext;
import com.landasource.wiidget.parser.resource.WiidgetResource;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class MockImportContext extends ImportContext {

    public MockImportContext(final WiidgetFactory factory) {
        super(null, factory);
    }

    @Override
    public WiidgetResource findByAlias(final String wiidgetName) {
        return null;
    }

}
