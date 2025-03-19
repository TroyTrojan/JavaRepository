package com.it.ui;

public class Test {
	public static void main(String[] args) {
		//创建游戏主界面
//		JFrame gameJframe = new JFrame();
//		gameJframe.setSize(603, 680);
//		gameJframe.setVisible(true);
		//2.创建一个登陆界面
//		JFrame loginJframe = new JFrame();
//		loginJframe.setSize(488, 430);
//		loginJframe.setVisible(true);
		//3.创建一个注册页面
//		JFrame registerJframe = new JFrame();
//		registerJframe.setSize(488, 500);
//		registerJframe.setVisible(true);
//		long count = 0;
//		long num = 0;
//		for (num = 0; true; num++) {
//
//			if (num % 20 == 0 || num % 24 == 0 || num % 20 == 0 & num % 24 == 0) {
//				count++;
//				if (count == 202420242024L) {
//					System.out.println(num);
//				}
//			}
//		}
		long count = 0;
		long num = 0;

		while (true) {
			num += 4;  // 以 4 为步长
			if (num % 20 == 0 || num % 24 == 0) {
				count++;
				if (count == 202420242024L) {
					System.out.println(num);
					break;
				}
			}
		}
	}
}