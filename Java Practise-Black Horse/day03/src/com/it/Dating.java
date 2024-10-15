package com.it;

import java.util.Scanner;

public class Dating {
  public static void main(String[] args) {
    //        int male
    //        int female
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入男士时髦度");
    int male = sc.nextInt();
    System.out.println("请输入女士时髦度");
    int female = sc.nextInt();
    boolean result = male > female;
    System.out.println(result);
  }
}
