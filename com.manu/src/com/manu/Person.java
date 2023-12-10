package com.manu;

public class Person {
int id;
String name;
String gender;
String email;
long phone;
public Person(int id, String name, String gender, String email, long phone) {
	super();
	this.id = id;
	this.name = name;
	this.gender = gender;
	this.email = email;
	this.phone = phone;
}
void eat() {
	System.out.println(name+" "+"is eating");
}
void sleep() {
	System.out.println(gender+" "+name+" "+"is sleeping");
}

}

