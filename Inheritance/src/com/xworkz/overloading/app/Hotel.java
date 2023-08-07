package com.xworkz.overloading.app;

public class Hotel {
	
	public void cook()
	{
		System.out.println("Invoking cook with no args ");
		cook("Empire",2020);
	}
	
	public void cook(String name)
	{
		System.out.println("Invoking cook with String args ");
		System.out.println("Name is:"+name);
	}
	
	public void cook(int since)
	{
		System.out.println("Invoking cook with int args ");
		System.out.println("Since:"+since);
	}
	
	public void cook(String name,int since)
	{
		System.out.println("Invoking cook with String,int args ");
		cook(name);
		cook(since);
	}

}
