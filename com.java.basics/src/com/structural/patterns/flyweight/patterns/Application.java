package com.structural.patterns.flyweight.patterns;

public class Application {
	public static void main(String[] args) {
		BodyParts bodyParts= Factory.getCat("cat");
		System.out.println(bodyParts.structure());
		BodyParts bodyParts2= Factory.getCat("cat");
		System.out.println(bodyParts2.hashCode());
		System.out.println(bodyParts.hashCode());

	}
}
