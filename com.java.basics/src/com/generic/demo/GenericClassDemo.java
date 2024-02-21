package com.generic.demo;

import lombok.Data;

@Data
public class GenericClassDemo<T> {

	//now we can decide the type of gender while we create an object, we have the flexibility to decide the type of T
	T gender;
}
