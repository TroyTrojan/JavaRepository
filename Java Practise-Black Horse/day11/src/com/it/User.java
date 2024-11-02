package com.it;

public class User {
  private String username;
  private String password;
  private String repassword;
  private String email;
  private String gender;
  private int age;

  public User() {}

  public User(
      String username, String password, String repassword, String email, String gender, int age) {
    this.username = username;
    this.password = password;
    this.repassword = repassword;
    this.email = email;
    this.gender = gender;
    this.age = age;
  }

  public void setUserName() {
    this.username = username;
  }

  public String getUserName() {
    return username;
  }

  public void setPassword() {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setRepassword() {
    this.repassword = repassword;
  }

  public String getRepassword() {
    return repassword;
  }

  public void setEmail() {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }

  public void setGender() {
    this.gender = gender;
  }

  public String getGender() {
    return gender;
  }

  public void setAge() {
    this.age = age;
  }

  public int getAge() {
    return age;
  }
}
