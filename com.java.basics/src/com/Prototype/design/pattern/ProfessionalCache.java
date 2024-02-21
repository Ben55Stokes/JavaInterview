package com.Prototype.design.pattern;

import java.util.HashMap;
import java.util.Map;

public class ProfessionalCache {

	private static Map<Integer, Profession> cacheMap = new HashMap<>();

	public static Profession cacheGetter(Integer id) throws CloneNotSupportedException {
		loadCache();
		Profession cachProfession = cacheMap.get(id);
		return (Profession) cachProfession.cloningMethod();
	}

	public static void loadCache() {
		Doctor doctor = new Doctor();
		doctor.id=1;
		cacheMap.put(doctor.id, doctor);
		Teacher teach = new Teacher();
		teach.id=2;
		cacheMap.put(teach.id, teach);
		Farmer farmer = new Farmer();
		farmer.id= 3;
		cacheMap.put(farmer.id, farmer);
	}
}
