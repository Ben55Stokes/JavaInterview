package com.java.basics.Demo;

public class PassByValueExample {

	static int a =3;
	
	public static int change(int a) {
		return a+=1;
	}
	
	public static void main(String[] args) {
		change(a);  // copy of a is being passed 
		System.out.println(a); //that'y value of a still remains the same
	}
}
