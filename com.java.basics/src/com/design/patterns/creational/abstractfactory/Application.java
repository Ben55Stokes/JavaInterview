package com.design.patterns.creational.abstractfactory;

public class Application {
	public static void main(String[] args) {
		AbstractFactory absFac= new AbstractFactory();
		System.out.println(absFac.profession("Profession", true,"teacher"));
	}
}
