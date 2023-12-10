package com.kodnest.multiple;

import java.util.Scanner;

public class TeacherPCBApp {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your Physics Sir/Madam Name:");
		String name=scanner.next();
		TeacherPhysics thePhysics=new TeacherPhysics();
		thePhysics.name=name;
		thePhysics.subject="Physics";
		thePhysics.markAttendance();
		thePhysics.teach();
		thePhysics.doLawsExp();
		System.out.println("===============================");

		System.out.println("Enter your Chemistry Sir/Madam Name:");
		String name1=scanner.next();
		TeacherChemistry theChemistry=new TeacherChemistry();
		theChemistry.name=name1;
		theChemistry.subject="Chemistry";
		theChemistry.markAttendance();
		theChemistry.teach();
		theChemistry.doChemicalExp();
		System.out.println("===============================");
		System.out.println("Enter your Bialogy Sir/Madam Name:");
		String name2=scanner.next();
		TeacherBialogy theBialogy=new TeacherBialogy();
		theBialogy.name=name2;
		theBialogy.subject="Bialogy";
		theBialogy.markAttendance();
		theBialogy.teach();
		theBialogy.doBialogyExp();
		
		scanner.close(); 
	}
}
