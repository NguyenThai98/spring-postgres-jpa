package com.jpa.springpostgres.mapper;

import com.jpa.springpostgres.domain.Customer;
import com.jpa.springpostgres.model.CustomerModel;
import org.mapstruct.Mapper;

import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

/**
 * Date: 4/12/2023<br/>
 * Time: 9:09 AM<br/>
 */
@Mapper
public interface CustomerMapper {
    CustomerMapper INSTANCE = Mappers.getMapper(CustomerMapper.class);


    Customer map (CustomerModel model);

    @Mapping(target = "address",source ="address")
    CustomerModel domainToDto (Customer model);


    List<CustomerModel> listCustomerModel (List<Customer> listCustomer);
}
