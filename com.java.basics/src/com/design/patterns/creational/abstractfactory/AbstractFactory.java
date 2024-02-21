package com.design.patterns.creational.abstractfactory;

public class AbstractFactory {
    public String profession(String profession,boolean expert, String type) {
    	if(profession.equalsIgnoreCase("profession")) {
    		return new ProfessionalTraineeDiff().differentiation(expert, type);
    	}else {
    		return null;
    	}
    }
}
