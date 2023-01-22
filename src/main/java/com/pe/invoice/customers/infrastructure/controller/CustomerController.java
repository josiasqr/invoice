package com.pe.invoice.customers.infrastructure.controller;

import com.pe.invoice.customers.application.service.CustomerService;
import com.pe.invoice.customers.domain.model.Customer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customers")
public class CustomerController {
  private final CustomerService customerService;
  
  public CustomerController(CustomerService customerService) {
    this.customerService = customerService;
  }
  
  @GetMapping
  public ResponseEntity<Iterable<Customer>> lists() {
    return ResponseEntity.ok().body(this.customerService.listAll());
  }
  
  @GetMapping("/{code}")
  public ResponseEntity<Customer> getById(@PathVariable("code") String code) {
    return ResponseEntity.ok().body(this.customerService.getByCode(code));
  }
  
  @PostMapping
  public ResponseEntity<Customer> create(@RequestBody Customer customer) {
    return ResponseEntity.status(HttpStatus.CREATED).body(this.customerService.create(customer));
  }
}
