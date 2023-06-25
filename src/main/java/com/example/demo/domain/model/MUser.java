package com.example.demo.domain.model;

import lombok.Data;

@Data
public class MUser {
  private String userId;
  private String password;
  private String userName;
  private Data birthday;
  private Integer age;
  private Integer departmentId;
  private String role;
}
