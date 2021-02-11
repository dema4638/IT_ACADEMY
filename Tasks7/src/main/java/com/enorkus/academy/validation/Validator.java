package com.enorkus.academy.validation;

public interface Validator<T> {

    void validate(T attribute, String message);
}
