package com.codingdojo.zookeeper;

public class Drogan extends Mammal {
	protected int energyLevel = 300;
	
	public void displayEnergy() {
		System.out.println("harry"+ energyLevel);		
		
	}
	public void fly() {
		this.energyLevel -= 100;
		System.out.println("I can fly");
	}
	public void eatHumans() {
		System.out.println("people puffs in the morning great food");
	}
	public void attackTowin() {
		System.out.println("your town is dust");
	}

}
