package com.xworkz.inheritance.seventhlevel.app;

public class TeslaModelSPlaidPus extends  TeslaModelSPlaid
{

	public int year = 1989;

	public TeslaModelSPlaidPus()
	{
		System.out.println("No args const of TeslaModelSPlaid");
		System.out.println("Year:"+year);
	}

	public void Capacity() {
		System.out.println("Invkoing Capacity");
	}

}
