package com.it;

import java.util.Scanner;

public class 设计方法求数组中某个数是否存在 {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    Scanner sc = new Scanner(System.in);
    System.out.println("请输入您要判断的数:");
    int num = sc.nextInt();
    boolean result = judge(array, num);
    if (result) {
      System.out.println("数组中存在" + num + "数字");
    } else {
      System.out.println("数组中不存在" + num + "数字");
    }
  }

  public static boolean judge(int[] array, int num) {
    for (int i = 0; i < array.length; i++) {
      if (array[i] == num) {
        return true;
      }
    }
    return false;
  }
}
