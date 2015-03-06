package com.landasource.wiidget.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Wiidget field with this annotation means "value" field.
 *
 * @author Zsolt Lengyel
 */
@Target({ ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultField {

	/**
	 * Name of the default field.
	 */
	String NAME = "value";
}
