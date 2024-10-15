package com.it;

public class 利用带返回值的方法求营业额 {
  public static void main(String[] args) {
    int money = playSum(10, 20, 30);
    System.out.println(money);
    System.out.println("全年的营业额是" + money * 4 + "元");
  }

  public static int playSum(int num1, int num2, int num3) {
    int result = num1 + num2 + num3;
    return result;
  }
}
