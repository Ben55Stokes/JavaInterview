package com.generic.demo;

public class GenericApplication {

	public static void main(String[] args) {
		GenericClassDemo<String> classDemo= new GenericClassDemo<>();
		classDemo.setGender("Male");
		System.out.println(classDemo.getGender());
		System.out.println(classDemo.getGender().getClass().getName());
		
		//we have the flexibility to change it to an Integer
		GenericClassDemo<Integer> classDemo1= new GenericClassDemo<>();
		classDemo1.setGender(1);
		System.out.println(classDemo1.getGender());
		System.out.println(classDemo1.getGender().getClass().getName());
	}
}
