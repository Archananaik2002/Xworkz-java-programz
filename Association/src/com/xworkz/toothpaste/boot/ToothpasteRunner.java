package com.xworkz.toothpaste.boot;

import com.xworkz.toothpaste.app.Company;
import com.xworkz.toothpaste.app.Ingredents;
import com.xworkz.toothpaste.app.Toothpaste;

public class ToothpasteRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Running main in ToothpasteRunner");
		
		String name="Pepsodent";
		String brand="Colgate";
		Company company=new Company("Colgate","Janardhan Reddy","India");
		 Ingredents ingredients = new Ingredents("salt", 10.8f, 50);
		 Ingredents ingredients1 = new Ingredents("Sugar", 7.8f, 20);
		 Ingredents ingredients2 = new Ingredents("water", 1.1f, 20);
		 Ingredents ingredients3 = new Ingredents("Garlic", 1.1f, 20); 
		 Ingredents ingredients4 = new Ingredents(" Zinc Phosphate", 1.6f, 20);
		 Ingredents[] ingredents= {ingredients,ingredients1,ingredients2,ingredients3,ingredients4};
	     

	        Toothpaste toothpaste = new Toothpaste(name, brand, company, ingredents);
	        toothpaste.printInfo();
	    
		

	}

}