package com.it;

import java.util.Scanner;

public class Test8 {
  public static void main(String[] args) {
    // 回文数比较
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您要比较的数:");
    int num = sc.nextInt();
    // 临时变量接收原本的值
    int temp = num;
    // 倒置后的数
    int result = 0;
    while (num != 0) {
      // 从后往前挨个取值
      int ge = num % 10;
      // 调整取值后的数
      num = num / 10;
      // 拼接倒置后的数
      result = result * 10 + ge;
    }
    System.out.println(result == temp);
  }
}
