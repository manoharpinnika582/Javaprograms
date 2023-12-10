package com.kodnest.bankproject;

public class BankFactory {
	public BankMethods getBank(String name) {
		if(name.equals("kodnest")) {
			return KodnestBank.getInstance();
		}
		else {
			return ManuBank.getInstance();
		}
	}
	
	
}
