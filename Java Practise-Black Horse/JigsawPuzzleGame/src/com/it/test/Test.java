package com.it.test;

import java.util.Random;

public class Test {
	public static void main(String[] args) {
//		把一个一维数组中的数打乱顺序
//		然后按照4个一组的方式添加到二维数组中
//        1.定义一个一维数组
		int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
//			2.打乱数组中数据的顺序
		Random r = new Random();
		for (int i = 0; i < tempArr.length; i++) {
//			获取到随机索引
			int index = r.nextInt(tempArr.length);
//			拿着遍历到的每一个数据,跟随机索引上的数据进行交换
			int temp = tempArr[i];
			tempArr[i] = tempArr[index];
			tempArr[index] = temp;
		}
//			3.遍历数组
		for (int i = 0; i < tempArr.length; i++) {
			System.out.print(tempArr[i] + " ");
		}
//		System.out.println();
//		4.创建二维数组
		int[][] data = new int[4][4];
//		5.给二维数组添加数据
		for (int i = 0; i < tempArr.length; i++) {
			data[i / 4][i % 4] = tempArr[i];
		}
//		遍历二维数组
		for (int i = 0; i < data.length; i++) {
			for (int j = 0; j < data[i].length; j++) {
				System.out.print(data[i][j] + " ");
			}
//			System.out.println();
		}

	}

}
