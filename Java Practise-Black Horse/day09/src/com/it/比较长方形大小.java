package com.it;

public class 比较长方形大小 {
  public static void main(String[] args) {
    double area1 = playSum(3, 2);
    double area2 = playSum(4, 1.5);
    if (area1 > area2) {
      System.out.println("第1个长方形更大");
    } else {
      System.out.println("第二个长方形更大");
    }
  }

  public static double playSum(double len, double width) {
    double result = len * width;
    return result;
  }
}
