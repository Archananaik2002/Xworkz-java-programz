package com.xworkz.overloading.boot;

import com.xworkz.overloading.app.IronBox;

public class IronBoxRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in IronBoxRunner");
		
		IronBox ironBox=new IronBox();
		ironBox.iron();
		ironBox.iron("Pigeon",1000);

	}

	
}
