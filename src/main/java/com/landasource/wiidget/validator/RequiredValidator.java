package com.landasource.wiidget.validator;

import com.landasource.wiidget.validation.Validator;

public class RequiredValidator implements Validator {

	@Override
	public boolean isValid(final Object object) {
		return object != null;
	}

}
