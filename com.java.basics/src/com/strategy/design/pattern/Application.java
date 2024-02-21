package com.strategy.design.pattern;

public class Application {
	public static void main(String[] args) {
		Soldier navy = new Soldier(new WaterAttackl());
		Soldier army = new Soldier(new LandAttack());
		Soldier airForce = new Soldier(new AirAttack());
		Soldier cyberWar= new Soldier(new CyberAttack());
	}
}
