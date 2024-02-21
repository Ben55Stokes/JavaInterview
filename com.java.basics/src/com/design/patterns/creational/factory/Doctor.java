package com.design.patterns.creational.factory;

public class Doctor implements Factory {

	@Override
	public String print() {
		return "I'm a Doctor";
	}

}
