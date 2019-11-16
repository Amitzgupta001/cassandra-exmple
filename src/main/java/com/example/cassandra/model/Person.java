package com.example.cassandra.model;

import org.springframework.data.cassandra.core.mapping.Column;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

@Table("people")
public class Person {

  @PrimaryKey("emp_id")
  private Integer id;

  @Column("first_name")
  private String firstName;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Double getSalary() {
    return salary;
  }

  public void setSalary(Double salary) {
    this.salary = salary;
  }

  @Column("last_name")
  private String lastName;

  @Column private Double salary;

  public Person(final Integer id, final String lastName, final Double salary) {
    this.id = id;
    this.lastName = lastName;
    this.salary = salary;
  }

  // getters and setters
}