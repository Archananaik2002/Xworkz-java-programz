package com.xworkz.overridingg.boot;

import com.xworkz.overridingg.app.GirlsHostel;
import com.xworkz.overridingg.app.Hostel;

public class HostelRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in HostelRunner");
		
		Hostel hostel=new GirlsHostel();
		hostel.stay();
		hostel.stay("Siddhi");
		hostel.stay("Siddhi", "Udupi");
		hostel.stay("Siddhi", "Udupi", 650);
		hostel.stay(650);
		hostel.stay("Girls hostel", 400);
		
		System.out.println("****************************");
		
		Hostel hostel1=new GirlsHostel();
		hostel1.stay();
		hostel1.stay("Shri");
		hostel1.stay("Shri", "Udupi");
		hostel1.stay("Shri", "Udupi", 650);
		hostel1.stay(650);
		hostel1.stay("Girls Hostel", 400);

	}

	
	
	


}