package com.jpa.springpostgres.controller;

import com.jpa.springpostgres.domain.Customer;
import com.jpa.springpostgres.service.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Date: 4/10/2023<br/>
 * Time: 3:22 PM<br/>
 */
@RestController
@RequestMapping("/api/customer")
public class CustomerController {
    private final CustomerService CustomerService;

    public CustomerController(CustomerService CustomerService) {
        this.CustomerService = CustomerService;
    }

    @GetMapping()
    public Map<String, List<Customer>> getCustomers() {
        return Collections.singletonMap("customers", this.CustomerService.getCustomerList());
    }

    @PostMapping()
    public void addCustomer() {
        this.CustomerService.getCustomerList();
    }

    @GetMapping(value="/{id}")
    public Map<String, Customer> getCustomer(@PathVariable("id") Long id) {
        return Collections.singletonMap("customer", this.CustomerService.getCustomer(id));
    }

    @GetMapping("/count")
    public Map<String, Long> countCustomers() {
        return Collections.singletonMap("countCustomers", this.CustomerService.countCustomers());
    }
}
