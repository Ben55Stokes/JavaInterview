package com.design.patterns.creational.abstractfactory;

public interface Job {

	public String profession(); 
	
	public static String noProfessionExist() {
		return  "This profession is Un-available";
	}
}
