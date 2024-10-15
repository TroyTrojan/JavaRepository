package com.it;

import java.util.Scanner;

public class 设计方法优化机票价格 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("请输入机票原价:");
    int ticket = sc.nextInt();

    System.out.println("请输入月份:");
    int month = sc.nextInt();

    // 0 为头等舱 1 为经济舱
    System.out.println("请输入头等舱或经济舱: 0 为头等舱 1 为经济舱");
    int vip = sc.nextInt();
    // 判断月份
    // 旺季
    if (month >= 5 && month <= 10) {
      ticket = playPrice(ticket, vip, 0.9, 0.85);
      // 淡季
    } else if ((month >= 1 && month <= 4) || (month >= 11 && month <= 12)) {
      ticket = playPrice(ticket, vip, 0.7, 0.65);
    } else {
      System.out.println("没有这个月份!");
      return;
    }
    // 输出机票价格
    System.out.println("您的机票价格为: " + ticket + "元");
  }

  public static int playPrice(int ticket, int vip, double v0, double v1) {
    if (vip == 0) {
      ticket = (int) (ticket * v0);
    } else if (vip == 1) {
      ticket = (int) (ticket * v1);
    } else {
      System.out.println("没有这个舱位!");
    }
    return ticket;
  }
}
