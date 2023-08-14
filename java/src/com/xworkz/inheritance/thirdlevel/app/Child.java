package com.xworkz.inheritance.thirdlevel.app;

public class Child extends Parent{
	
public String name="Arch";
	
	public Child()
	{
		
		System.out.println("No args const of Child");
		System.out.println("No of Childrens:"+name);
	}
	
	public void play()
	{
		System.out.println("Invkoing care in Child");
	}


}
