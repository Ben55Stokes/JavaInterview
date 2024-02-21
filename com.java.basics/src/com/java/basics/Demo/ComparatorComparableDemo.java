package com.java.basics.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorComparableDemo {

	public static void main(String[] args) {
		List<Employee> empList= new ArrayList<>();
		empList.add(new Employee(1, "emp1"));
		empList.add(new Employee(1, "Amp2"));
		empList.add(new Employee(3, "bmp3"));
		System.out.println(empList);
		Collections.sort(empList);
		System.out.println(empList);

		Comparator<Employee> comparator= Comparator.comparing(Employee::getEmpName, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(empList,comparator);
		System.out.println(empList);

	}
}
