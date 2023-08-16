package com.xworkz.objectsmethods.app;

public class Logo {

	private String brand;
	private String size;
	private String color;
	private int height;
	private int width;

	public Logo(String brand, String size, String color, int height, int width) {
		super();
		this.brand = brand;
		this.size = size;
		this.color = color;
		this.height = height;
		this.width = width;
	}
	
	public Logo() {
		System.out.println("");
	}
	
	@Override
	public String toString() {
	
		return ("Brand:"+brand+" Size: "+size+" Color: "+color+" Height: "+height+" Width: "+width);
	}

}
