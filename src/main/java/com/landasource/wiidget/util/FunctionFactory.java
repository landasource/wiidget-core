package com.landasource.wiidget.util;

/**
 * Created by Rita on 2015.05.23..
 */
public interface FunctionFactory {

    Function provideFunction(String name, Object[] arguments);
}
