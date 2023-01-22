package com.pe.invoice.customers.infrastructure.mapper;

import com.pe.invoice.customers.domain.model.Customer;
import com.pe.invoice.customers.infrastructure.entity.CustomerEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface CustomerMapper {
  @Mapping(target = "_id", ignore = true)
  @Mapping(target = "createdAt", ignore = true)
  @Mapping(target = "updatedAt", ignore = true)
  CustomerEntity toCustomerEntity(Customer customer);
  
  Customer toCustomer(CustomerEntity customerEntity);
  
  Iterable<Customer> toCustomers(Iterable<CustomerEntity> customerEntities);
}
