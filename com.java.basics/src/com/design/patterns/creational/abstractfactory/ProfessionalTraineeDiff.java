package com.design.patterns.creational.abstractfactory;

public class ProfessionalTraineeDiff{

	public String differentiation(boolean isExpert,String professionalJob) {
		if (isExpert) {
			return new ProfessionalExperts().professionalJob(professionalJob);
		} else {
			return new JuniorProfessionals().professionalJob(professionalJob);
		}
	}

}
