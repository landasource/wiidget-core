package com.landasource.wiidget.testutil;

import com.landasource.wiidget.util.Function;
import com.landasource.wiidget.util.FunctionFactory;

/**
 * Created by Rita on 2015.05.23..
 */
public class UpperCaseEchoFunctionFactory implements FunctionFactory {
    @Override
    public Function provideFunction(final String name, Object[] arguments) {
        return new Function() {
            @Override
            public Object invoke(Object... args) {
                if(args.length != 1 || !(args[0] instanceof String)){
                    throw new IllegalArgumentException("Only single string accepted");
                }
                return name + ':'+String.valueOf(args[0]).toUpperCase();
            }
        };
    }
}
