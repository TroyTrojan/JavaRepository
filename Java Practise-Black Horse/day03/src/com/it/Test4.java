package com.it;

import java.util.Scanner;

public class Test4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入第一只老虎的体重");
    int first = sc.nextInt();
    System.out.println("请输入第二只老虎的体重");
    int second = sc.nextInt();
    String result = first == second ? "相同" : "不同";
    System.out.println(result);
  }
}
