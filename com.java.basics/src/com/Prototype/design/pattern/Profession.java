package com.Prototype.design.pattern;

import lombok.Data;

@Data
public abstract class Profession implements Cloneable {

	public Integer id;
	public String name;

	abstract void print();

	public Object cloningMethod() throws CloneNotSupportedException {
		Object clone = null;
		clone = super.clone();
		return clone;
	}

}
