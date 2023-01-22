package com.pe.invoice.customers.domain.repository;

import com.pe.invoice.customers.domain.model.Customer;

public interface CustomerRepository {
  Iterable<Customer> listAll();
  
  Customer getByCode(String code);
  
  Customer create(Customer customer);
  
  Customer edit(Customer customer);
}
