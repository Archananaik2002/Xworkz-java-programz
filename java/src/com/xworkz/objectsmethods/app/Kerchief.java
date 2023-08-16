package com.xworkz.objectsmethods.app;

public class Kerchief {

	private String material;
	private String color;
	private int lengthInInches;
	private int widthInInches;
	private boolean patterned;
	private boolean folded;
	private String brand;

	public Kerchief(String material, String color, int lengthInInches, int widthInInches, boolean patterned,
			boolean folded, String brand) {
		super();
		this.material = material;
		this.color = color;
		this.lengthInInches = lengthInInches;
		this.widthInInches = widthInInches;
		this.patterned = patterned;
		this.folded = folded;
		this.brand = brand;
	}
	public Kerchief() {
		
	}
	
@Override
public String toString() {
	
	return "Material:"+material+" Color:"+color+" Lenth in Inches:"+lengthInInches+" Width in Inches:"+widthInInches+" Patterned:"+patterned+" Folded:"+folded+" Brand:"+brand;
}
}
