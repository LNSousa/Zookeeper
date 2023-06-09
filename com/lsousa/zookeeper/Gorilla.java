package com.lsousa.zookeeper;

public class Gorilla extends Mammal {

	public Gorilla() {
		super();
	}
	
	public void expandEnergy(int energy) {
		super.expandEnergy(energy);
	}
	
	public void throwObject () {
		System.out.println("Thowing things at people.");
		this.expandEnergy(-5);
	}
	
	public void eatBananas () {
		System.out.println("Eating bananas, regaining energy.");
		this.expandEnergy(10);
	}
	
	public void climb () {
		System.out.println("Climbing!");
		this.expandEnergy(-10);
	}
	
	

}
