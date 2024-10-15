package com.it;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入您的票号:");
    int ticket = scanner.nextInt();
    if (ticket >= 0 && ticket <= 100) {
      if (ticket % 2 == 0) {
        System.out.println("请您坐在右边座位!");
      } else {
        System.out.println("请您坐在左边座位!");
      }
    } else {
      System.out.println("您输入的票号有误!");
    }
  }
}
