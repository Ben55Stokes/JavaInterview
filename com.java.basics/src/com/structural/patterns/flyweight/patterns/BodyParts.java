package com.structural.patterns.flyweight.patterns;

public class BodyParts {

	public Integer eyes =2;
	public Integer nose=1;
	public Integer ears=2;
	public Integer legs=4;


	public String structure() {
		return " eyes " + eyes + " nose "+ nose + " ears "+ ears + " legs "+ legs;
	}
}
