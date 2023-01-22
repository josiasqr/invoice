package com.pe.invoice.customers.domain.model;

import lombok.Data;

@Data
public class Customer {
  private Document typeDocument;
  private String number;
  private String name;
  private String tradeName;
  private String code;
  private Address address;
}
