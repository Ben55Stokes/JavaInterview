package com.strategy.design.pattern;

public class AirAttack implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("Attack Through Air");
	}

}
