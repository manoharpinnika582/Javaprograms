package com.kodnest.learn.example1;

public class Mobile {
	OS os=new OS(32, "Android");
	
	Charger ref;
	public void hasA(Charger ref) {
		this.ref=ref;
		System.out.println(ref.brand);
		System.out.println(ref.color);
		System.out.println(ref.type);
	}
}
