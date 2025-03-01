package com.it;

public class Test {
	public static void main(String[] args) {
		Frog f = new Frog("蛙蛙", 1);
		System.out.println(f.getName() + " " + f.getAge());
		f.eat();
		f.swim();
	}
}
