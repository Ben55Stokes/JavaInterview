package com.design.patterns.creational.abstractfactory;

public class JuniorProfessionals{
	public String professionalJob(String professionType) {
		if (!professionType.isEmpty()) {
			if (professionType.equalsIgnoreCase("Farmer")) {
				return new JuniorFarmer().profession();
			} else if (professionType.equalsIgnoreCase("Teacher")) {
				return new JuniorTeacher().profession();
			} else {
				return Job.noProfessionExist();
			}
		} else {
			return null;
		}
	}

}
