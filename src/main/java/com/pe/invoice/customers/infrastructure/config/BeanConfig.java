package com.pe.invoice.customers.infrastructure.config;

import com.pe.invoice.customers.application.service.CustomerService;
import com.pe.invoice.customers.application.service.InCustomerService;
import com.pe.invoice.customers.domain.repository.CustomerRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {
  @Bean
  CustomerService customerBeanService(final CustomerRepository customerRepository) {
    return new InCustomerService(customerRepository);
  }
}
