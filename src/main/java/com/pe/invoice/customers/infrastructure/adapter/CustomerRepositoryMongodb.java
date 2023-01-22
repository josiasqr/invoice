package com.pe.invoice.customers.infrastructure.adapter;

import com.pe.invoice.customers.infrastructure.entity.CustomerEntity;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepositoryMongodb extends CrudRepository<CustomerEntity, String> {
  CustomerEntity findByCode(String code);
}
