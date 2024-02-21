package com.strategy.design.pattern;

public class LandAttack implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("Attack through Land");
	}

}
