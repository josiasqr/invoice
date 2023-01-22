package com.pe.invoice.customers.infrastructure.entity;

import jakarta.validation.constraints.Email;
import lombok.Data;

@Data
public class AddressEntity {
  private String address;
  private String country;
  private String ubigeo;
  private String phone;
  @Email
  private String email;
}
