package src.com.xworkz.powerbank.boot;

import src.com.xworkz.powerbank.app.PowerBank;

public class BatteryRunner {

	public static void main(String[] args) 
	{
		
		PowerBank powerBank=new PowerBank();
		powerBank.chargeMobile();
		powerBank.info();

	}

}
