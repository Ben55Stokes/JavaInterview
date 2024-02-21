package com.saga.design.pattern;

import java.util.Arrays;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		RailwaReservation railwaReservation= new RailwaReservation();
		RailwaReservation railwaReservation2= new RailwaReservation();
		RailwaReservation railwaReservation3= new RailwaReservation();
		FoodDelivery foodDelivery= new FoodDelivery();
		FoodDelivery foodDelivery1= new FoodDelivery();
		FoodDelivery foodDelivery2= new FoodDelivery();
		FoodDelivery foodDelivery3= new FoodDelivery();

		List<Transaction> transactionList= Arrays.asList(railwaReservation,railwaReservation2,railwaReservation3,
				foodDelivery,foodDelivery1,foodDelivery2,foodDelivery3);
		
		ParallelProcessing.processTransactions(transactionList);
		
	}		
}
