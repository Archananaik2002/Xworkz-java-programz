package com.xworkz.inheritance.singlelevel.app;

public class Computer {
	
	public int price=80;
	
	public Computer()
	{
		System.out.println("No args const of Computer");
		System.out.println("Price is :"+price);
	}
	
	public void startComputer()
	{
		System.out.println("Invkoing StartComputer in Computer");
	}

}
