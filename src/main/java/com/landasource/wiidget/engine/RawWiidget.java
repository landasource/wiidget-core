package com.landasource.wiidget.engine;

import com.landasource.wiidget.Wiidget;

/**
 * Abstract wiidget to handle wiidgets like above.
 *
 * <pre>
 *
 * "div"(class = "label"){...}
 * </pre>
 *
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public abstract class RawWiidget extends Wiidget {

    /**
     * @param name
     *            name of the tag
     */
    public abstract void setRawTagName(String name);
}
