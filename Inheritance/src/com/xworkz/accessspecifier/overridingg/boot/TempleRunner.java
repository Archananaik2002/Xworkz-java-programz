package com.xworkz.overridingg.boot;

import com.xworkz.overridingg.app.HinduTemple;
import com.xworkz.overridingg.app.Temple;

public class TempleRunner {
	
	public static void main(String[] args) {
		System.out.println("Running main in TempleRunner");
		
		Temple temple=new HinduTemple();
		temple.spirtual();
		temple.spirtual("ISKON Temple");
		temple.spirtual("ISKON Temple", "Bangalore");
		temple.spirtual("ISKON Temple", "Bangalore", 650);
		temple.spirtual(650);
		temple.spirtual("ISKON Temple", 650);
		
		System.out.println("****************************");
		
		Temple temple1=new HinduTemple();
		temple1.spirtual();
		temple1.spirtual("ISKON Temple");
		temple1.spirtual("ISKON Temple", "Bangalore");
		temple1.spirtual("ISKON Temple", "Bangalore", 650);
		temple1.spirtual(650);
		temple1.spirtual("ISKON Temple", 650);

	}

	

}