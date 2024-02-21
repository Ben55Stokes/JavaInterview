package com.structural.patterns.flyweight.patterns;

import java.util.HashMap;
import java.util.Map;

public class Factory {

	public static Map<String, BodyParts> myMap= new HashMap<>();
	
	public static BodyParts getCat(String name) {
		String key = "cat";
		BodyParts bodyParts= myMap.get(key);
		if(bodyParts!=null) {
			return bodyParts;
		}else {
			bodyParts= new Cat();
			myMap.put(name.toLowerCase(), bodyParts);
			return bodyParts;
		}
	}
	
	public static BodyParts getCamel(String name) {
		String key = "camel";
		BodyParts bodyParts= myMap.get(key);
		if(bodyParts!=null) {
			return bodyParts;
		}else {
			bodyParts= new Camel();
			myMap.put(name.toLowerCase(), bodyParts);
			return bodyParts;
		}
	}
	
}
