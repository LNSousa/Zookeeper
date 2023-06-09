package com.lsousa.zookeeper;

public class Mammal {
	protected int energyLevel;

	public Mammal() {
		this.energyLevel = 100;
	}
	
	public Mammal(int energyLevel) {
		this.energyLevel = energyLevel;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
	public void expandEnergy (int energy) {
		this.energyLevel = this.energyLevel + energy;
		System.out.printf("Energy level: %d\n", this.energyLevel);
	}
}
