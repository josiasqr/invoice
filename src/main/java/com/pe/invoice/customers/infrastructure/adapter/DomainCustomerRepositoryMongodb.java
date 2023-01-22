package com.pe.invoice.customers.infrastructure.adapter;

import com.pe.invoice.customers.domain.model.Customer;
import com.pe.invoice.customers.domain.repository.CustomerRepository;
import com.pe.invoice.customers.infrastructure.entity.CustomerEntity;
import com.pe.invoice.customers.infrastructure.mapper.CustomerMapper;
import org.springframework.stereotype.Repository;

@Repository
public class DomainCustomerRepositoryMongodb implements CustomerRepository {
  private final CustomerRepositoryMongodb customerRepositoryMongodb;
  private final CustomerMapper customerMapper;
  
  public DomainCustomerRepositoryMongodb(CustomerRepositoryMongodb customerRepositoryMongodb,
                                         CustomerMapper customerMapper) {
    this.customerRepositoryMongodb = customerRepositoryMongodb;
    this.customerMapper = customerMapper;
  }
  
  @Override
  public Iterable<Customer> listAll() {
    return this.customerMapper.toCustomers(this.customerRepositoryMongodb.findAll());
  }
  
  @Override
  public Customer getByCode(String code) {
    return this.customerMapper.toCustomer(this.customerRepositoryMongodb.findByCode(code));
  }
  
  @Override
  public Customer create(Customer customer) {
    CustomerEntity customerEntity;
    customerEntity = this.customerMapper.toCustomerEntity(customer);
    
    return this.customerMapper.toCustomer(this.customerRepositoryMongodb.save(customerEntity));
  }
  
  @Override
  public Customer edit(Customer customer) {
    CustomerEntity customerEntity;
    customerEntity = this.customerMapper.toCustomerEntity(customer);
    
    return this.customerMapper.toCustomer(this.customerRepositoryMongodb.save(customerEntity));
  }
}
