package com.it;

public class Test7 {
  public static void main(String[] args) {
    // 打印折纸的次数
    double paperSize = 0.1;
    int count = 0;
    while (paperSize <= 8844430) {
      paperSize = paperSize * 2;
      count++;
    }
    System.out.println(count);
  }
}
