package com.xworkz.abstact.boot;

import com.xworkz.abstact.app.BluelineMetro;
import com.xworkz.abstact.app.Metro;

public class MetroRunner {

	public static void main(String[] args) {

		System.out.println("Running MetroRunner...");

		Metro metro = new BluelineMetro();
		metro.accelerate();
		metro.announcement();
		metro.completeJourney();
		metro.decelerate();
		metro.emergencyBrake();
		metro.move();
		metro.openDoors();
		metro.start();
		metro.stop();
		metro.playAnnouncement("HII");

	}

}
