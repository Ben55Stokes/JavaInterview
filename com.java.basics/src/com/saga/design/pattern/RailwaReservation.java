package com.saga.design.pattern;

public class RailwaReservation implements Transaction {

	@Override
	public String pay() {
		return "Pay amount to Irctc";
	}

	@Override
	public String rollBack() {
		return "RollBack payment because there's an error in Irctc server";
	}

}
