package com.manu;

public class Teacherapp {
	public static void main(String[] args) {
		Teacher t1=new Teacher();
		t1.id=143;
		t1.name="manu";
		t1.subject="java";
		System.out.println("Teacher id : "+t1.id);
		System.out.println("Teacher Name: "+t1.name);
		System.out.println("teacher subject: "+ t1.subject);
		t1.teach();
		t1.motivate();
		t1.giveAssignment();

		
	}

}
