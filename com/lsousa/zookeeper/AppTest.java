package com.lsousa.zookeeper;

public class AppTest {
	public static void main(String[] args) {
		Gorilla harambe = new Gorilla();
		Bat vampire = new Bat();

		harambe.throwObject();
		harambe.throwObject();
		harambe.throwObject();

		harambe.eatBananas();
		harambe.eatBananas();
		
		harambe.climb();
		
		vampire.attackTown();
		vampire.attackTown();
		vampire.attackTown();

		vampire.eatPeople();
		vampire.eatPeople();

		vampire.fly();
		vampire.fly();

	}
}
