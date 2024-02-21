package com.java.basics.Demo;

public class CovariantDemo {

	public Object animal() {
		return new Object();

	}
}

class AquaFina extends CovariantDemo {

	@Override
	public Object animal() {
		return "I'm animal";  
	}
	/*
	 * here I'm returning a string which is a child class of Object class this is
	 * an example of covariant in java 
	 */
}
