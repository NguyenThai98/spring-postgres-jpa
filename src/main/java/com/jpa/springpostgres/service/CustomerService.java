package com.jpa.springpostgres.service;

import com.jpa.springpostgres.domain.Customer;
import com.jpa.springpostgres.exception.InternalServerError;
import com.jpa.springpostgres.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Date: 4/10/2023<br/>
 * Time: 3:19 PM<br/>
 */
@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public List<Customer> getCustomerList() {
        List<Customer> customerEntities;

        try {
            customerEntities = this.customerRepository.findAll();
        } catch (Exception ex) {
            throw new InternalServerError();
        }

        return customerEntities;
    }

    public Long countCustomers() {
        Long countAllActor;

        try {
            countAllActor = this.customerRepository.count();
        } catch (Exception ex) {
            throw new InternalServerError();
        }

        return countAllActor;
    }

    public Customer getCustomer(Long actorId) {
        Customer customer;

        try {
            customer = this.customerRepository.findByCustomerId(actorId);
        } catch (Exception ex) {
            throw new InternalServerError();
        }

        return customer;
    }
}
