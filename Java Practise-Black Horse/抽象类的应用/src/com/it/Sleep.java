package com.it;

public class Sleep extends Animal {
	public Sleep() {
	}

	public Sleep(String name, int age) {
		super(name, age);
	}

	@Override
	public void eat() {
		System.out.println("山羊在吃草");
	}
}