package com.singleton.designpattern;

public class SingleTonClassDemo {

	//Lazy Loading
	private static SingleTonClassDemo singletonInmstance;

	private SingleTonClassDemo() {
		/*
		 * private constructor ensures no new object is created as constructor is invoked
		 * to create a new object
		 */
	}

	static SingleTonClassDemo checkSingleTon() {
		if (singletonInmstance == null) {
			System.out.println("Instance is not there so creating");
			singletonInmstance= new SingleTonClassDemo(); //to avoid creating
														//a new instace we are assigning obj here
														//while debugging plz comment line 18 and check
			return singletonInmstance;
		} else {
			System.out.println("Instance is there so not creating");
			return singletonInmstance;
		}
	}
	
	//eager loading
	private static SingleTonClassDemo getSingleton() {
		return new SingleTonClassDemo();
	}
	
}
