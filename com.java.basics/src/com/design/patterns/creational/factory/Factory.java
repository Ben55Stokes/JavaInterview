package com.design.patterns.creational.factory;

public interface Factory {

	public String print();
	
	static Object noProfession() {
		return "Doesnot Exist";
	}
}
