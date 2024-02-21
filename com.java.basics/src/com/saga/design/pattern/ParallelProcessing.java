package com.saga.design.pattern;

import java.util.Collections;
import java.util.List;

public class ParallelProcessing {
	public List<Transaction> transactions;
	
	public static void processTransactions(List<Transaction> transactions) {
		try {
			transactions.parallelStream().map(v->v.pay()).forEach(System.out::println);
		}catch (Exception e) {
			Collections.reverse(transactions);
			transactions.stream().map(v->v.rollBack()).forEach(System.out::println);
		}
		
	}
}
