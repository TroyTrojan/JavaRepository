package com.it;

public class GirlFriend {
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setAge(int age) {
    if (age >= 18 && age <= 60) {
      this.age = age;
    } else {
      System.out.println("年龄不合法");
    }
  }

  public int getAge() {
    return age;
  }

  public void accompany() {
    System.out.println("可以给你陪伴");
  }
}
