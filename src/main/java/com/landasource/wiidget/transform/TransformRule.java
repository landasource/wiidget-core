package com.landasource.wiidget.transform;

import com.landasource.wiidget.Wiidget;

public interface TransformRule<W extends Wiidget> {

    boolean match(W wiidget);

    void transform(W wiidget);
}
