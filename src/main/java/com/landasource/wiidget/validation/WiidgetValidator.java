package com.landasource.wiidget.validation;

import java.util.List;

import com.landasource.wiidget.Wiidget;

/**
 * Validates the wiidget whether valid is.
 * 
 * @author Zsolt Lengyel (zsolt.lengyel.it@gmail.com)
 */
public interface WiidgetValidator {

    public List<ValidationError> validate(Wiidget wiidget);
}
