package com.it;

public class 逢七过 {
  public static void main(String[] args) {
    int count = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0) {
        count++;
        System.out.println("过");
        continue;
      }
      System.out.println(i);
    }
    System.out.println("总共有" + count + "个满足条件的数");
  }
}
