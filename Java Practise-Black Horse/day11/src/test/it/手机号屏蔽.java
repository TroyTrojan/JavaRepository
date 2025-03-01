package test.it;

import java.util.Scanner;

public class 手机号屏蔽 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入您的手机号码:");
		String phoneNumber = sc.next();
		String left = phoneNumber.substring(0, 3);
		String right = phoneNumber.substring(7, 11);
		String result = left + "****" + right;
		System.out.println(result);
	}
}
