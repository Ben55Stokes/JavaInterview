package com.enumdemo;

public enum Days {

	monday, tuesday, wednesday, thursday, friday, saturday, sunday;
	
	public static void iterateDays() {
        for (Days day : Days.values()) {
        	if(day==sunday||day==saturday) {
        		System.out.println("Don't work and pick up calls");
        	}else {
        		System.out.println(" work and pick up calls");
        	}
        }
    }
}

