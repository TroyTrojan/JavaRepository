package com.it;

import java.util.Scanner;

public class Test5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入第一个数字");
    int first = sc.nextInt();
    System.out.println("请输入第二个数字");
    int second = sc.nextInt();
    int count = 0;
    for (int i = first; i < second; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        count++;
      }
    }
    System.out.println(count);
  }
}
