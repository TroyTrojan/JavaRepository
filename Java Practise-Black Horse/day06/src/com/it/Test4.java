package com.it;

public class Test4 {
  public static void main(String[] args) {
    // 求1-100之间的偶数和
    int sum = 0;
    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        sum += i;
      }
    }
    System.out.println(sum);
  }
}
