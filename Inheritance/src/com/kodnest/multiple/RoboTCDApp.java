package com.kodnest.multiple;
public class RoboTCDApp {
public static void main(String[] args) {
	RoboTeacher theTeacherRobo=new RoboTeacher();
	theTeacherRobo.name="Chitti";
	theTeacherRobo.type="Humanoid";
	theTeacherRobo.talk();
	theTeacherRobo.walk();
	theTeacherRobo.charge();
	theTeacherRobo.teach();
	System.out.println("----------------------------");
	RoboChef theChefRobo=new RoboChef();
	theChefRobo.name="Amy";
	theChefRobo.type="Food Humanoid";
	theChefRobo.talk();
	theChefRobo.walk();
	theChefRobo.charge();
	theChefRobo.cooking();
	System.out.println("----------------------------");
	RoboDriver theDriverRobo=new RoboDriver();
	theDriverRobo.name="Sana";
	theDriverRobo.type="Android";
	theDriverRobo.talk();
	theDriverRobo.walk();
	theDriverRobo.charge();
	theDriverRobo.driving();
}
}
