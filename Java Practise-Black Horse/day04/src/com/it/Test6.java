package com.it;

import java.util.Scanner;

public class Test6 {
  public static void main(String[] args) {
    int price = 1000;
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入会员的等级:");
    int vip = sc.nextInt();
    if (vip == 1) {
      int result = (int) (price * 0.9);
      System.out.println(result);
    } else if (vip == 2) {
      int result = (int) (price * 0.8);
      System.out.println(result);
    } else if (vip == 3) {
      int result = (int) (price * 0.7);
      System.out.println(result);
    } else {
      System.out.println("打几把折，梆梆就是两拳");
    }
  }
}
