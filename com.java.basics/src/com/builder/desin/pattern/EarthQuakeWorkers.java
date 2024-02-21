package com.builder.desin.pattern;

public class EarthQuakeWorkers implements Builder{

	@Override
	public void buildHome() {
		Home home= new Home();
		home.setFloor("Wooden floor");
		home.setWalls("steel bars");
		home.setTop("Concrete pavers");
		System.out.println(home);
	}

}
