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
        formatCustomerFields(customer);
        customerRepository.insert(createNewCustomer(customer));
    }


    private void formatCustomerFields(Customer customer) {
        fixedName = customer.getFirstName();
        fixedLastName = customer.getLastName();
        fixedPersonalNumber = customer.getPersonalNumber();

        if (fixedName.length() != 0) {
            fixedName = fixedName.substring(0, 1).toUpperCase() + fixedName.substring(1);
        }

        if (fixedLastName.length() != 0) {
            fixedLastName = fixedLastName.substring(0, 1).toUpperCase() + fixedLastName.substring(1);
        }

        if (fixedPersonalNumber.length() > 4) {
            fixedPersonalNumber = fixedPersonalNumber.substring(0, 4) + "_" + fixedPersonalNumber.substring(4);
        }
    }

    private Customer createNewCustomer(Customer customer) {
        return new Customer.CustomerBuilder()
                .withId(customer.getId())
                .withFirstName(fixedName)
                .withLastName(fixedLastName)
                .withPersonalNumber(fixedPersonalNumber)
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
