package com.xworkz.inheritance.secondlevel.app;

public class Jumpers extends Wool{

	public String type = "tunics";

	public Jumpers()
	{
		System.out.println("No args const of Wool");
		System.out.println("Type is:"+type);
	}

	public void wear() {
		System.out.println("Invkoing wear in Jumpers");
	}

}
