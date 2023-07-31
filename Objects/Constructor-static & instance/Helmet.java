class Helmet{
	static String brand;
	static String shape;
	String color;
	double price;
	
	
	Helmet(String color,double price)
	{
		System.out.println("Invoking String,double constructor of Helmet");
		this.color=color;
		this.price=price;
		
	}
	
	static{
		brand="Icon";
		shape="Dome";
	}
	
	static void staticHelmet()
	{
		System.out.println("Invoking printstatic in Helmet");
		System.out.println("Helmet brand :"+brand);
		System.out.println("Helmet size :"+shape);
	}
	
	void instanceHelmet()
	{
		System.out.println("Invoking printInstance in Helmet");
		System.out.println("Helmet color :"+color);
		System.out.println("Helmet price :"+price);

	}
}

		
	