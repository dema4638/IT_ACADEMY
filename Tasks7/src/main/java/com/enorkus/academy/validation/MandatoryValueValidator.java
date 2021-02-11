package com.enorkus.academy.validation;

import com.enorkus.academy.exception.ValidationException;

public class MandatoryValueValidator implements Validator<String> {

    @Override
    public void validate(String attribute, String message) {
        if (attribute == null || (attribute.trim()).isEmpty()) {
            throw new ValidationException(message);
        }
    }
}
