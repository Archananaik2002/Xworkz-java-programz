package com.xworkz.overloading.app;

public class Specs {
	
	public void lens()
	{
		System.out.println("Invoking lens with no args");
		lens(4.0,"Concave");
	}
				
	public void lens(double power)
	{
		System.out.println("Invoking lens with double args");
		System.out.println("Power:"+power);
	}
	public void lens(String type)
	{
		System.out.println("Invoking lens with String args");
		System.out.println("Type:"+type);
	}
	public void lens(double power,String type)
	{
		System.out.println("Invoking lens with double,String args");
		lens(power);
		lens(type);
	}

}
