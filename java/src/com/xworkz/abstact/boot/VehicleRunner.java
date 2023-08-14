package com.xworkz.abstact.boot;

import com.xworkz.abstact.app.Car;
import com.xworkz.abstact.app.Vehicle;

public class VehicleRunner {

	public static void main(String[] args) {
	
		Vehicle vehicle=new Car();
		 vehicle.accelerate();
		 vehicle.decelerate();
		 vehicle.honk();
		 vehicle.lightsOff();
		 vehicle.lightsOn();
		 vehicle.refillFuel();
		 vehicle.service();
		 vehicle.service();
		 vehicle.start();
		 vehicle.stop();

	}

}
