package com.landasource.wiidget.parser.resource;

import com.landasource.wiidget.Wiidget;
import com.landasource.wiidget.WiidgetException;
import com.landasource.wiidget.reflect.Reflection;
import com.landasource.wiidget.util.Function;
import com.landasource.wiidget.util.FunctionFactory;
import org.apache.commons.lang3.reflect.MethodUtils;

import java.lang.reflect.InvocationTargetException;

/**
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public class ClassWiidgetResource implements WiidgetResource, FunctionFactory {

    private final Class<? extends Wiidget> type;

    public ClassWiidgetResource(final Class<? extends Wiidget> type) {
        this.type = type;
    }

    public Class<? extends Wiidget> getType() {
        return type;
    }

    @Override
    public Function provideFunction(final String name, final Object[] arguments) {
        return new Function() {
            @Override
            public Object invoke(Object... args) {
                try {
                    return MethodUtils.invokeStaticMethod(getType(), name, args);
                } catch (NoSuchMethodException e) {
                    throw new WiidgetException(String.format("Cannot call method '%s' on class '%s'", name, getType().getCanonicalName()), e);
                } catch (IllegalAccessException e) {
                    throw new WiidgetException(String.format("Cannot call method '%s' on class '%s'", name, getType().getCanonicalName()), e);
                } catch (InvocationTargetException e) {
                    throw new WiidgetException(String.format("Cannot call method '%s' on class '%s'", name, getType().getCanonicalName()), e);
                }
            }
        };
    }
}
