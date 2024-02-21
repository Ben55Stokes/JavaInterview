package com.design.patterns.creational.abstractfactory;

public class ProfessionalExperts {
	public String professionalJob(String professionType) {
		if(!professionType.isEmpty()) {
			if(professionType.equalsIgnoreCase("Farmer")) {
				return new FarmerExperience().profession();
			}else if(professionType.equalsIgnoreCase("Teacher")) {
				return new ProfessionalTeacher().profession();
			}else {
				return Job.noProfessionExist();
			}
		}else {
			return null;
		}
	}
}
