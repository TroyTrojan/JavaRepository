package com.it;

import java.util.Scanner;

public class 设计方法复制数组 {
  public static void main(String[] args) {
    // 定义数组
    int[] arr = {1, 2, 3, 4, 5};
    Scanner sc = new Scanner(System.in);
    // 输入索引的起始和结束
    System.out.println("请输入数组的起始索引:");
    int from = sc.nextInt();
    System.out.println("请输入数组的结束索引:");
    int to = sc.nextInt();
    // 检查索引是否合法
    if (from < 0 || to > arr.length || from >= to) {
      System.out.println("无效的索引范围！请确保 from >= 0, to <= 数组长度, 且 from < to.");
      return;
    }
    // 调用方法接收新数组
    int[] newArr = copyOfRange(arr, from, to);
    for (int i = 0; i < newArr.length; i++) {
      System.out.print(newArr[i] + " ");
    }
  }

  // 定义方法复制数组
  public static int[] copyOfRange(int[] arr, int from, int to) {
    int[] newArr = new int[to - from];
    for (int i = from; i < to; i++) {
      newArr[i - from] = arr[i];
    }
    return newArr;
  }
}
