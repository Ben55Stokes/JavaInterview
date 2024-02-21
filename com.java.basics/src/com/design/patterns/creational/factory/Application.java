package com.design.patterns.creational.factory;

public class Application {
 public static void main(String[] args) {
	Profession profession = new Profession();
	System.out.println(profession.profession("farmer").print());
}
}
