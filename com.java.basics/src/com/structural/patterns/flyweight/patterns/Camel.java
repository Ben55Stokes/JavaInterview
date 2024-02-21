package com.structural.patterns.flyweight.patterns;

public class Camel extends BodyParts{

	private String name="camel";
	private Long hump=1l;
	
	@Override
	public String structure() {
		return super.structure()+ " " +name + " hump "+ hump;
	}

}
