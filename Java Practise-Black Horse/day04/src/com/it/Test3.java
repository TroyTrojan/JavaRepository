package com.it;

import java.util.Scanner;

public class Test3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("请输入您支付的钱:");
    int money = scanner.nextInt();
    if (money >= 600) {
      System.out.println("支付成功！");
    } else {
      System.out.println("支付失败！");
    }
  }
}
