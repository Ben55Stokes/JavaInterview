package com.java.basics.Demo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee implements Comparable<Employee> {

	private Integer empId;
	private String empName;

	@Override
	public int compareTo(Employee o) {
		return o.empId - this.empId;
	}

	@Override
	public boolean equals(Object obj) {
		Employee other = (Employee) obj;
		return this.empId.equals(other.empId);
	}

	@Override
	public int hashCode() {
		return this.empId;
	}
}