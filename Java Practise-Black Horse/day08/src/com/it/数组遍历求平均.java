package com.it;

import java.util.Random;

public class 数组遍历求平均 {
  public static void main(String[] args) {
    int[] arr = new int[10];
    Random r = new Random();
    // 将随机数存入数组
    for (int i = 0; i < arr.length; i++) {
      int numer = r.nextInt(100) + 1;
      arr[i] = numer;
    }
    // 求出所有数据的和
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    System.out.println("所有数据的和是:" + sum);
    // 求所有数据的平均数
    int avg = sum / arr.length;
    System.out.println("所有数据的平均数是:" + avg);
    // 统计有多少个数据比平均数小
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] < avg) {
        count++;
      }
    }
    System.out.println("有" + count + "个数据比平均数小");
  }
}
