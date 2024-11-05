package test.it;

import java.util.Scanner;

public class 大小写转换 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int money;
		while (true) {
			System.out.println("请输入一个金额");
			money = sc.nextInt();
			if (money >= 0 && money <= 9999999) {
				break;
			} else {
				System.out.println("金额无效");
			}
		}
		//定义一个字符串用来进行拼接操作
		String moneyStr = "";
		//获取输入的每一位数
		while (true) {
			int ge = money % 10;
			String capitalNumber = getCapitalNumber(ge);
//			System.out.println(capitalNumber);
			//去掉刚刚获取的数
			money = money / 10;
			//将字符串进行拼接
			moneyStr = capitalNumber + moneyStr;
			if (money == 0) {
				break;
			}
		}
//		System.out.println(moneyStr);
		//将不满7位的数字补齐为7位
		int count = 7 - moneyStr.length();
		for (int i = 0; i < count; i++) {
			moneyStr = "零" + moneyStr;
		}
//		System.out.println(moneyStr);
		//定义数组进行单位插入W
		String[] arr = {"佰", "拾", "万", "仟", "佰", "拾", "元"};
		//存储拼接结果
		String result = "";
		for (int i = 0; i < moneyStr.length(); i++) {
			char c = moneyStr.charAt(i);
			result = result + c + arr[i];
		}
		System.out.print(result);
	}

	//定义方法用来将输入的数字与大写数字产生对应
	public static String getCapitalNumber(int number) {
		//定义数组用来与输入的数字产生对应关系
		String[] arr = {"零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖",};
		//将值进行返回
		return arr[number];
	}
}

