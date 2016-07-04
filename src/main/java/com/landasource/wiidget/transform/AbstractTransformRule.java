package com.landasource.wiidget.transform;

import com.landasource.wiidget.Wiidget;

public abstract class AbstractTransformRule<W extends Wiidget> implements TransformRule<W> {

    private final Class<W> type;

    public AbstractTransformRule(final Class<W> type) {
        super();
        this.type = type;
    }

    @Override
    public boolean match(final W wiidget) {
        return wiidget != null && wiidget.getClass().isAssignableFrom(type);
    }

}
