package com.xworkz.inheritance.seventhlevel.app;

public class ElectricCar extends Car{
	
	public double price;
	
	public ElectricCar()
	{
		
		System.out.println("No args const of ElectricCar");
		System.out.println("Price:"+price);
	}
	
	public void charge()
	{
		System.out.println("Invkoing Charge");
	}

}
