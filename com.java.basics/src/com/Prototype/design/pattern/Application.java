package com.Prototype.design.pattern;

public class Application {

	public static void main(String[] args) {
		Profession profDoc;
		try {
			profDoc = ProfessionalCache.cacheGetter(1);
			profDoc.print();
			Profession profTeach= ProfessionalCache.cacheGetter(2);
			profTeach.print();
			Profession profFarm= ProfessionalCache.cacheGetter(3);
			profFarm.print();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
}
