package com.it;

import java.util.Scanner;

public class Test2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入第一个整数");
    int first = sc.nextInt();
    System.out.println("请输入第二个整数");
    int second = sc.nextInt();
    boolean result = first == 6 || second == 6 || (first + second) % 6 == 0;
    System.out.println(result);
  }
}
