package com.xworkz.objectsmethods.boot;

import com.xworkz.objectsmethods.app.Cave;
import com.xworkz.objectsmethods.app.Flag;
import com.xworkz.objectsmethods.app.Kerchief;
import com.xworkz.objectsmethods.app.Logo;
import com.xworkz.objectsmethods.app.Pendant;

public class LogoRunner {
	public static void main(String[] args) {

		System.out.println("Running LogoRunner");
		Logo logo = new Logo();
		System.out.println(logo);
		Logo logo1 = new Logo("Google", "M", "Blue", 10, 20);
		System.out.println(logo1);
		Logo logo2 = new Logo("Eclipse", "M", "Black", 10, 20);
		System.out.println(logo1);

		System.out.println("***********************");
		Kerchief kerchief = new Kerchief();
		System.out.println(kerchief);
		Kerchief kerchief1 = new Kerchief("Nylon", "Pink", 150, 200, true, false, "Myntra");
		System.out.println(kerchief1);
		Kerchief kerchief2 = new Kerchief("Nylon", "White", 150, 200, true, false, "Jockey");
		System.out.println(kerchief2);

		System.out.println("***********************");
		Flag flag = new Flag();
		System.out.println(flag);
		Flag flag1 = new Flag("India", "Orange", 3);
		System.out.println(flag1);
		Flag flag2 = new Flag("Austrailia", "Blue", 3);
		System.out.println(flag2);

		System.out.println("***********************");
		Cave cave = new Cave();
		System.out.println(cave);
		Cave cave2 = new Cave("Badami", 37.4333, 23.88, 100, false, "LimeStone", 12, 85, true, true);
		System.out.println(cave2);
		Cave cave3 = new Cave("Ellora", 34.54, 21.54, 100, true, "LimeStone", 34, 34, false, true);
		System.out.println(cave3);

		System.out.println("***********************");
		Pendant pendant = new Pendant();
		System.out.println(pendant);

		Pendant pendant1 = new Pendant("Giva", 15000, "daimond", "Square", "20-07-2023", 10, 25, 50, "Daimond", true,
				"red", "rope", true, 1, true);
		System.out.println(pendant1);

		Pendant pendant2 = new Pendant("Caratlane", 18000, "daimond", "Traingle", "25-07-2023", 10, 25, 50, "Daimond",
				true, "white", "curb", true, 1, true);
		System.out.println(pendant2);

	}

}
