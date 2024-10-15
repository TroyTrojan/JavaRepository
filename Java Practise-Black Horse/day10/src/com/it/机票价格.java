package com.it;

import java.util.Scanner;

public class 机票价格 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入机票原价:");
    double ticket = sc.nextDouble(); // 改为 double 类型，处理小数

    System.out.println("请输入月份:");
    int month = sc.nextInt();

    // 0 为头等舱 1 为经济舱
    System.out.println("请输入头等舱或经济舱: 0 为头等舱 1 为经济舱");
    int vip = sc.nextInt();

    // 判断舱位是否有效
    if (vip != 0 && vip != 1) {
      System.out.println("没有这个舱位!");
      return;
    }

    // 判断月份
    if (month >= 5 && month <= 10) { // 旺季
      if (vip == 0) {
        ticket = ticket * 0.9; // 头等舱 9 折
      } else {
        ticket = ticket * 0.85; // 经济舱 8.5 折
      }
    } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) { // 淡季
      if (vip == 0) {
        ticket = ticket * 0.7; // 头等舱 7 折
      } else {
        ticket = ticket * 0.65; // 经济舱 6.5 折
      }
    } else {
      System.out.println("没有这个月份!");
      return;
    }

    // 输出机票价格
    System.out.println("您的机票价格为: " + ticket);
  }
}
