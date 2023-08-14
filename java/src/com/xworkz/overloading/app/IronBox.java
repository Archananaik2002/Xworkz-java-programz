package com.xworkz.overloading.app;

public class IronBox {
	
	public void iron()
	{
		System.out.println("Invoking iron with no args");
		iron("Philips",800);
	}
	public void iron(String brand)
	{
		System.out.println("Invoking iron with String args");
		System.out.println("Brand is:"+brand);
	}

	public void iron(double price)
	{
		System.out.println("Invoking iron with double args");
		System.out.println("Price is:"+price);
	}

	public void iron(String brand,double price)
	{
		System.out.println("Invoking iron with String,double args");
		iron(brand);
		iron(price);
	}


}
