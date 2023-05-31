package com.example.demo.hello;

import lombok.Data;

@Data
public class Employee {
  private String employeeId;
  private String employeeName;
  private Integer employeeAge;

  public String getEmployeeId() {
    return this.employeeId;
  }

  public void setEmployeeId(String employeeId) {
    this.employeeId = employeeId;
  }

  public String getEmployeeName() {
    return this.employeeName;
  }

  public void setEmployeeName(String employeeName) {
    this.employeeName = employeeName;
  }

  public Integer getEmployeeAge() {
    return this.employeeAge;
  }

  public void setEmployeeAge(Integer employeeAge) {
    this.employeeAge = employeeAge;
  }
}
