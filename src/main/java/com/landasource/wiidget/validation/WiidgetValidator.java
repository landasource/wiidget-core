package com.landasource.wiidget.validation;

import java.util.List;

import com.landasource.wiidget.Wiidget;

public interface WiidgetValidator {

	public List<ValidationError> validate(Wiidget wiidget);
}
