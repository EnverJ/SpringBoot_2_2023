package com.example.demo.domain.user.model;

import lombok.Data;

@Data
public class MUser {
  private String userId;
  private String password;
  private String userName;
  private Data birthday;
  private Integer age;
  private Integer department;
  private String role;
}
