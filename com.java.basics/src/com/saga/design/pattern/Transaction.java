package com.saga.design.pattern;

public interface Transaction {

	public String pay();
	
	public String rollBack();
}
