package com.xworkz.objectsmethods.app;

public class Flag {
	private String country;
	private String colors;
	private int numberOfStripes;

	public Flag() {
	}

	public Flag(String country, String colors, int numberOfStripes) {
		super();
		this.country = country;
		this.colors = colors;
		this.numberOfStripes = numberOfStripes;
	}
	@Override
	public String toString() {
		
		return ("Country:"+country+" Colors:"+colors+" Number of Stripes:"+numberOfStripes);
	}

}		
