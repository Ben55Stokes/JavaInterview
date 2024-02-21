package com.generic.demo;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		
		/*
		 *  list with generic
		 */
		List<String> mylist = new ArrayList<>();
		mylist.add("palani");
		//mylist.add(1);
		System.out.println(mylist.toString());
		/*
		 * list without generic uses object class as generic
		 *  runtime exceptions may occur while type casting
		 */
		List list = new ArrayList<>();
		list.add("aa");
		list.add(1);
		System.out.println(list.toString());
	}
}
