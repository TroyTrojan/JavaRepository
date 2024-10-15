package com.it;

public class 带参数方法的定义和调用 {
  public static void main(String[] args) {
    playSum(10, 66);
  }

  public static void playSum(int num1, int num2) {
    int num = num1 + num2;
    System.out.println(num);
  }
}
