package com.enorkus.academy.validation;

import com.enorkus.academy.exception.ValidationException;

public class MandatoryValueValidator implements Validator<String> {

    @Override
    public void validate(String customerInfo, String message) {
        if ((customerInfo.trim()).equals("")) {
            throw new ValidationException(message);
        }
    }
}
