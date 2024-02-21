package com.strategy.design.pattern;

public class CyberAttack implements AttackStrategy {

	@Override
	public void attack() {
		System.out.println("Data hacking attack");
	}

}
