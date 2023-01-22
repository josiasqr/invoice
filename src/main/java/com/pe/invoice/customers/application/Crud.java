package com.pe.invoice.customers.application;

import com.pe.invoice.customers.domain.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.CrudRepository;

public interface Crud<T> {
  Iterable<T> listAll();
  
  T getByCode(String code);
  
  T create(T t);
  
  T edit(T t);
}
