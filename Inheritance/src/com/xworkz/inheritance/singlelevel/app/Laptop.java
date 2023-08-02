package com.xworkz.inheritance.singlelevel.app;

public class Laptop extends Computer{
	
	public String brand="HP";
	
	public Laptop()
	{
		System.out.println("No args const of Laptp");
		System.out.println("Brand is:"+brand);
	}
	
	public void startLap()
	{
		System.out.println("invoking startLap in Laptop");
	}

}
