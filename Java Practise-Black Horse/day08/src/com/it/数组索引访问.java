package com.it;

public class 数组索引访问 {
  public static void main(String[] args) {
    // 获取数组中的数据
    int[] arr = {1, 2, 3, 4, 5};
    int number = arr[0];
    System.out.println(number);
    // 将数据存储到数组中
    arr[0] = 6;
    int result = arr[0];
    System.out.println(result);
  }
}
