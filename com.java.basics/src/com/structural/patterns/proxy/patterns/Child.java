package com.structural.patterns.proxy.patterns;

public class Child extends Parent {

	public Child(String password) {
		System.out.println("I'm a method u need to pass me to call my parent");
		String returnType = !password.isEmpty() && password.equals("P@ssword") ? super.parfentMethod() : "You failed!!";
		System.out.println(returnType);
	}
}
