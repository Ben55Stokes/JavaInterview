package com.interfaceseggregation.design.pattern;


//Forcing class to implement every unnecessary method
public class PizzaClient implements PizzaOrders{

	@Override
	public String offlineOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String onlineOrder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String tableBooking() {
		// TODO Auto-generated method stub
		return null;
	}

}
