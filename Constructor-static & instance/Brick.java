class Brick
{
	static String brand;
	static int manufacturedYear;
	double price;
	String color;
	

	Brick(double price, String color)
	{
		System.out.println("Invoking double, string args from Wood");
        this.price=price;
        this.color=color;		
	}
	
	static{
		brand="Supreme";
		manufacturedYear=1989;
		
	}

	
	static void staticBrick()
	{
			System.out.println("Static varibles in Brick");
			System.out.println("Brand is:"+brand);
			System.out.println("Manufactured Year is:"+manufacturedYear);
	}
	void instanceBrick()
	{
		    System.out.println("Instance varibles in Brick");
            System.out.println("price is:"+price);  
            System.out.println("color is:"+color);  
	}
}