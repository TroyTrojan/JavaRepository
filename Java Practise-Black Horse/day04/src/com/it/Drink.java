package com.it;

import java.util.Scanner;

public class Drink {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入酒量");
    int wine = sc.nextInt();
    if (wine > 2) {
      System.out.println("牛逼");
    } else {
      System.out.println("垃圾");
    }
  }
}
