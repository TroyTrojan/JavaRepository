package com.it.practice;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数");
        int numer =sc.nextInt();
        int ge = numer % 10;
        int shi = numer/10 % 10;
        int bai = numer/100 % 10;
        System.out.println(bai);
        System.out.println(shi);
        System.out.println(ge);
    }
}
