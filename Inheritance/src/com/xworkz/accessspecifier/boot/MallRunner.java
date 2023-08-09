package com.xworkz.accessspecifier.boot;

import com.xworkz.accessspecifier.app.Mall;
import com.xworkz.accessspecifier.app.RegionalMall;

public class MallRunner {

	public static void main(String[] args) {
    System.out.println("Running main in MallRunner");
		
		Mall mall=new RegionalMall();
		mall.shop();
		mall.shop("GT World mall");
		mall.shop("GT World mall", "Bnagalore");
		mall.shop("GT World mall", "Bnagalore", "Regional mall");
		mall.shop(12000);
		mall.shop("Regional mall", 12000);
		
		System.out.println("****************************");
		
		Mall mall1=new RegionalMall();
		mall1.shop();
		mall1.shop("GT World mall");
		mall1.shop("GT World mall", "Bnagalore");
		mall1.shop("GT World mall", "Bnagalore", "Regional mall");
		mall1.shop(12000);
		mall1.shop("Regional mall", 12000);
	}

}
