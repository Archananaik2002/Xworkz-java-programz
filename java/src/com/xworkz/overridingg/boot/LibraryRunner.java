package com.xworkz.overridingg.boot;

import com.xworkz.overridingg.app.Library;
import com.xworkz.overridingg.app.ResearchLibrary;

public class LibraryRunner {
	public static void main(String[] args) {
		System.out.println("Running main in LibraryRunner");
		
		Library library=new ResearchLibrary();
		library.store();
		library.store("National Library");
		library.store("National Library", "Delhi");
		library.store("National Library", "Delhi", 20);
		library.store(25000);
		library.store("National Library", 26000);
		
		System.out.println("****************************");
		
		Library library1=new ResearchLibrary();
		library1.store();
		library1.store("National Library");
		library1.store("National Library", "Delhi");
		library1.store("National Library", "Delhi", 20);
		library1.store(25000);
		library1.store("National Library", 26000);

	}

	

}