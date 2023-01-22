package com.pe.invoice.customers.application.service;

import com.pe.invoice.customers.domain.model.Customer;
import com.pe.invoice.customers.domain.repository.CustomerRepository;

public class InCustomerService implements CustomerService {
  private final CustomerRepository customerRepository;
  
  public InCustomerService(CustomerRepository customerRepository) {
    this.customerRepository = customerRepository;
  }
  
  @Override
  public Iterable<Customer> listAll() {
    return this.customerRepository.listAll();
  }
  
  @Override
  public Customer getByCode(String code) {
    return this.customerRepository.getByCode(code);
  }
  
  @Override
  public Customer create(Customer customer) {
    return this.customerRepository.create(customer);
  }
  
  @Override
  public Customer edit(Customer customer) {
    return this.customerRepository.edit(customer);
  }
}
