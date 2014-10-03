package com.landasource.wiidget.parser.resource;

import com.landasource.wiidget.Wiidget;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ClassWiidgetResource implements WiidgetResource {

    private final Class<? extends Wiidget> type;

    public ClassWiidgetResource(final Class<? extends Wiidget> type) {
        this.type = type;
    }

    public Class<? extends Wiidget> getType() {
        return type;
    }

}
