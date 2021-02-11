package com.enorkus.academy.service;

import com.enorkus.academy.entity.Customer;
import com.enorkus.academy.repository.MemoryCustomerRepository;
import com.enorkus.academy.validation.CustomerValidator;
import org.springframework.web.bind.annotation.*;

import java.util.List;


public class CustomerService {

    private MemoryCustomerRepository customerRepository;
    private CustomerValidator validator;

    private String fixedName;
    private String fixedLastName;
    private String fixedPersonalNumber;

    public CustomerService() {

        customerRepository = new MemoryCustomerRepository();
        validator = new CustomerValidator();
    }

    public List<Customer> fetchCustomers() {
        return customerRepository.findAll();
    }


    public void insertCustomer(@RequestBody Customer customer) {
        validator.validateCustomerFields(customer);
        customerRepository.insert(createNewCustomer(customer));
    }


    private String capitaliseFirstLetter(String attribute) {
        if (attribute.length() != 0) {
            return attribute.substring(0, 1).toUpperCase() + attribute.substring(1);
        }
        return attribute;
    }

    private String formatPersonalNumber(String personalNumber) {
        personalNumber = personalNumber.replace("-", "");
        if (personalNumber.length() > 4) {
            return (personalNumber.substring(0, 4) + "-" + personalNumber.substring(4));
        }
        return personalNumber;
    }

    private Customer createNewCustomer(Customer customer) {
        return new Customer.CustomerBuilder()
                .withId(customer.getId())
                .withFirstName(capitaliseFirstLetter(customer.getFirstName()))
                .withLastName(capitaliseFirstLetter(customer.getLastName()))
                .withPersonalNumber(formatPersonalNumber(customer.getPersonalNumber()))
                .withMiddleName(customer.getMiddleName())
                .withAge(customer.getAge())
                .withCity(customer.getCity())
                .withEmployer(customer.getEmployer())
                .withGender(customer.getGender())
                .withMaritalStatus(customer.getMaritalStatus())
                .withMonthlyIncome(customer.getMonthlyIncome())
                .withCountryCode(customer.getCountryCode())
                .build();
    }


    public void deleteCustomer(@PathVariable String customerId) {
        customerRepository.deleteById(customerId);
    }
}
