package com.lsousa.zookeeper;

public class Bat extends Mammal {

	public Bat() {
		super(300);
	}
	
	public void expandEnergy(int energy) {
		super.expandEnergy(energy);
	}
	
	public void fly () {
		System.out.println("Flap, flap, flap.");
		this.expandEnergy(-20);
	}
	
	public void eatPeople () {
		System.out.println("Eating delicious people, regaining energy.");
		this.expandEnergy(25);
	}
	
	public void attackTown () {
		System.out.println("RAMPAGE, DESTRUCTION, ANARCHY!!!");
		this.expandEnergy(-100);
	}

}
