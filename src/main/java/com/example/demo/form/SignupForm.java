package com.example.demo.form;

import java.util.Date;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

@Data
public class SignupForm {
  private String userId;
  private String password;
  private String userName;

  @DateTimeFormat(pattern = "MM/dd/yyyy")
  private Date birthday;

  private Integer age;
  private Integer gender;
}
