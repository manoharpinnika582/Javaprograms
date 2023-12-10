package com.kodnest.multiple;

public class BirdESApp {
	public static void main(String[] args) {
		BirdEagle theBirdEagle=new BirdEagle();
		theBirdEagle.name="Eagle";
		theBirdEagle.color="Gold";
		theBirdEagle.eat();
		theBirdEagle.fly();
		theBirdEagle.hunt();
		
		BirdSparrow theBirdSparrow=new BirdSparrow();
		theBirdSparrow.name="Sparrow";
		theBirdSparrow.color="Green";
		theBirdSparrow.eat();
		theBirdEagle.fly();
		theBirdSparrow.buildNest();
		
		
	}
}
