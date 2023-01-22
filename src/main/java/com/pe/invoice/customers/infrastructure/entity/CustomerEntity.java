package com.pe.invoice.customers.infrastructure.entity;

import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "customer")
public class CustomerEntity {
  @Id
  private String _id;
  private DocumentEntity typeDocument;
  private String number;
  private String name;
  private String tradeName;
  private String code;
  private AddressEntity address;
  @CreatedDate
  private LocalDateTime createdAt;
  @LastModifiedDate
  private LocalDateTime updatedAt;
}
