package com.it;

import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您的考试成绩:");
    int score = sc.nextInt();
    if (score >= 0 && score <= 100) {
      if (score >= 95) {
        System.out.println("自行车一辆");
      } else if (score >= 90) {
        System.out.println("游乐场玩一天");
      } else if (score >= 80) {
        System.out.println("变形金刚一个");
      } else {
        System.out.println("梆梆就是两拳");
      }
    } else {
      System.out.println("请输入有效成绩！");
    }
  }
}
