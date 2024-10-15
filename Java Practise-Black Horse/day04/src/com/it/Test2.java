package com.it;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您身上的钱：");
    int money = sc.nextInt();
    if (money >= 100) {
      System.out.println("去吃网红餐厅");
    } else {
      System.out.println("吃沙县小吃");
    }
  }
}
