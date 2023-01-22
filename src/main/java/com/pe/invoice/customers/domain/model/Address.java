package com.pe.invoice.customers.domain.model;

import lombok.Data;

@Data
public class Address {
  private String address;
  private String country;
  private String ubigeo;
  private String phone;
  private String email;
}
