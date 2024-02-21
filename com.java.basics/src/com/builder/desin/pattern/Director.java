package com.builder.desin.pattern;

public class Director {

	boolean isEarthQuakeProne;

	Builder builder;
	
	public Director(boolean isEarthQuakeProne) {
		super();
		if(isEarthQuakeProne) {
			builder=new EarthQuakeWorkers();
			builder.buildHome();
		}else {
			builder= new FloodWorkers();
			builder.buildHome();
		}
	}
	
	
}
