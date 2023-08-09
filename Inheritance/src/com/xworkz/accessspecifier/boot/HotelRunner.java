package com.xworkz.accessspecifier.boot;

import com.xworkz.accessspecifier.app.BoutiqueHotel;
import com.xworkz.overloading.app.Hotel;

public class HotelRunner {

	public static void main(String[] args) {
		System.out.println("Running main in HotelRunner");
		
		BoutiqueHotel hotel=new BoutiqueHotel();
		hotel.serve();
		hotel.serve("Shri");
		hotel.serve("Shri", "Udupi");
		hotel.serve("Shri", "Udupi", "Boutique");
		hotel.serve(6);
		hotel.serve("Boutique", 4);
		
		System.out.println("****************************");
		
		BoutiqueHotel hotel1=new BoutiqueHotel();
		hotel1.serve();
		hotel1.serve("Shri");
		hotel1.serve("Shri", "Udupi");
		hotel1.serve("Shri", "Udupi", "Boutique");
		hotel1.serve(6);
		hotel1.serve("Boutique", 4);

	}

}