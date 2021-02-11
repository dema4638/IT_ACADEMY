package com.enorkus.academy.validation;

import com.enorkus.academy.entity.CountryCode;
import com.enorkus.academy.exception.ValidationException;

public class CountryCodeValidator implements Validator<String> {

    @Override
    public void validate(String countryCode, String message) {
        if (!CountryCode.checkIfValueIsCountryCode(countryCode.trim())) {
            throw new ValidationException(message);
        }
    }
}

