package com.design.patterns.creational.factory;

public class Profession {

	String profession;

	public Factory profession(String profession) {
		if (profession != null) {
			if (profession.equalsIgnoreCase("doctor")) {
				return new Doctor();
			} else if (profession.equalsIgnoreCase("Farmer")) {
				return new Farmer();
			} else if (profession.equalsIgnoreCase("Engineer")) {
				return new Engineer();
			} else {
				return (Factory) Factory.noProfession();
			}
		} else {
			return null;
		}
	}

}
