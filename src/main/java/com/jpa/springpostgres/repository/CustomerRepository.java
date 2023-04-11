package com.jpa.springpostgres.repository;

import com.jpa.springpostgres.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * Date: 4/10/2023<br/>
 * Time: 2:56 PM<br/>
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CrudRepository<Customer, Long> {
    Customer findByCustomerId(Long id);
}
