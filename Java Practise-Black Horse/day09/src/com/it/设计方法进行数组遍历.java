package com.it;

public class 设计方法进行数组遍历 {
  public static void main(String[] args) {
    int[] array = {11, 22, 33, 44, 55};
    method(array);
  }

  public static void method(int[] array) {
    System.out.print("[");
    for (int i = 0; i < array.length; i++) {
      if (i < array.length - 1) {
        System.out.print(array[i] + ",");
      } else {
        System.out.print(array[i]);
      }
    }
    System.out.println("]");
  }
}
