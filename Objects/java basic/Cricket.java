class Cricket
{
	float price;
	String color;
	String material;
	
	Cricket()
	{
		System.out.println("Invoking no argument from Cricket");
		System.out.println("Price:"+this.price);
		System.out.println("Color:"+this.color);
		System.out.println("Material:"+this.material);
		this.price=400;
		this.color="black";
		this.material="Plastic";
	}
	Cricket(float price, String color, String material)
	{
		System.out.println("Invoking String argument from Cricket");
		this.price=price;
		this.color=color;
		this.material=material;
	}
}