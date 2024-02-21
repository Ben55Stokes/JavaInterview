package com.structural.patterns.flyweight.patterns;

public class Cat extends BodyParts{

	public String name="cat";

	@Override
	public String structure() {
		return super.structure()+ " "+ name;
	}
}
