package com.strategy.design.pattern;

public class Soldier {
	private AttackStrategy attackStrategy;

	public Soldier(AttackStrategy attackStrategy) {
		super();
		this.attackStrategy = attackStrategy;
		attack();
	}
	private void attack() {
		attackStrategy.attack();
	}
}
