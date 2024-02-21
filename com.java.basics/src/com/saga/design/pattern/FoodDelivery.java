package com.saga.design.pattern;

public class FoodDelivery implements Transaction {

	@Override
	public String pay() {
		return "pay amount to FoodDelivery";
	}

	@Override
	public String rollBack() {
		return "RollBack payment because there's an error in Swiggy server";
	}

}
