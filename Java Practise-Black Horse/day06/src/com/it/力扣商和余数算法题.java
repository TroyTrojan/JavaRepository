package com.it;

public class 力扣商和余数算法题 {
  public static void main(String[] args) {
    int dividend = 100;
    int divisor = 10;
    int count = 0;
    int remainder = 0;
    while (dividend >= divisor) {
      dividend = dividend - divisor;
      count++;
      remainder = dividend;
    }
    System.out.println("商是:" + count);
    System.out.println("余数是:" + remainder);
  }
}
