package com.enorkus.academy.validation;

import com.enorkus.academy.entity.CountryCode;
import com.enorkus.academy.entity.Customer;

public class CustomerValidator<T> {

    private MandatoryValueValidator mandatoryValueValidator;
    private CustomerAdultValidator customerAdultValidator;
    private CountryCodeValidator countryCodeValidator;


    public CustomerValidator() {
        mandatoryValueValidator = new MandatoryValueValidator();
        customerAdultValidator = new CustomerAdultValidator();
        countryCodeValidator = new CountryCodeValidator();
    }

    public void validateCustomerFields(Customer customer) {
        String firstNameMandatoryMessage = "First name is mandatory!";
        String lastNameMandatoryMessage = "Last Name is mandatory!";
        String personalNumberMandatoryMessage = "Personal number is mandatory!";
        String ageNotSuitableMessage = "Customer must be 18 or older!";
        String invalidCountryCodeMessage = "Invalid country code!";

        mandatoryValueValidator.validate(customer.getFirstName(), firstNameMandatoryMessage);
        mandatoryValueValidator.validate(customer.getLastName(), lastNameMandatoryMessage);
        mandatoryValueValidator.validate(customer.getPersonalNumber(), personalNumberMandatoryMessage);
        customerAdultValidator.validate(customer.getAge(), ageNotSuitableMessage);

        String countryCode = customer.getCountryCode();
        if (!(countryCode.trim()).isEmpty()) {

            countryCodeValidator.validate(countryCode, invalidCountryCodeMessage);
        }
    }

}
