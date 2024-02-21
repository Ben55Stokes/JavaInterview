package com.builder.desin.pattern;

public class FloodWorkers implements Builder{

	@Override
	public void buildHome() {
		Home home= new Home();
		home.setFloor("Porcelain Tile");
		home.setTop("Concrete with Drainage System");
		home.setWalls("Fiber Cement Siding");
		System.out.println(home);
	}

}
