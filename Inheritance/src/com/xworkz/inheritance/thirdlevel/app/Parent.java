package com.xworkz.inheritance.thirdlevel.app;

public class Parent extends GrandParent {
	
	
	public int noOfChild=2;
	
	public Parent()
	{
		
		System.out.println("No args const of Parent");
		System.out.println("No of Childrens:"+noOfChild);
	}
	
	public void care()
	{
		System.out.println("Invkoing care in Parent");
	}

}
