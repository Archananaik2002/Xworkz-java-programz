package com.xworkz.inheritance.seventhlevel.app;

public class Vehicle {
	
	public int noOfWheels=4;
	
	public Vehicle()
	{
		
		System.out.println("No args const of Vehicle");
		System.out.println("no of wheels :"+noOfWheels);
	}
	
	public void stop()
	{
		System.out.println("Invkoing stop");
	}
}
