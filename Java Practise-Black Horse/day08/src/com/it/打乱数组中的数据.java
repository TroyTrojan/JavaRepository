package com.it;

import java.util.Random;

public class 打乱数组中的数据 {
  public static void main(String[] args) {
    int[] array = {1, 2, 3, 4, 5};
    Random random = new Random();
    for (int i = 0; i < array.length; i++) {
      int j = random.nextInt(5);
      int temp = array[i];
      array[i] = array[j];
      array[j] = temp;
    }
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
  }
}
