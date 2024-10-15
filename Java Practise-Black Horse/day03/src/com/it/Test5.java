package com.it;

public class Test5 {
  public static void main(String[] args) {
    int height = 150;
    int height2 = 210;
    int height3 = 165;
    int result = height > height2 ? height : height2;
    int result2 = result > height3 ? result : height3;
    System.out.println(result2);
  }
}
