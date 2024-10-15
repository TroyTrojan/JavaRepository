package com.it;

public class 设计方法求数组最大值 {
  public static void main(String[] args) {
    int[] array = {11, 22, 33, 44, 55};
    int max = playMax(array);
    System.out.println(max);
  }

  public static int playMax(int[] array) {
    int max = array[0];
    for (int i = 1; i < array.length; i++) {

      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }
}
