package com.xworkz.inheritance.seventhlevel.app;

public class Car extends LandVehicle{
	
	public String brand="Audi";
	
	public Car()
	{
		System.out.println("No args const of Vehicle");
		System.out.println("Brand :"+brand);
	}
	
	public void driwe()
	{
		System.out.println("Invkoing driwe");
	}
	
	

}
