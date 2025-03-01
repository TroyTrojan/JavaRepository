package com.it;

public class Test {
	public static void main(String[] args) {
		com.it.Frog f = new com.it.Frog("丽丽", 18);
		System.out.println(f.getName() + " " + f.getAge());
		f.drink();
		f.eat();
	}

}
