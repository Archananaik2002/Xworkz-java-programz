class GraphicsCard
{
	String brand;
	float price;
	int memory;
	
	GraphicsCard()
	{
		System.out.println("Invoking no argument from GraphicsCard");
		System.out.println("Brand Name:"+this.brand);
		System.out.println("Price:"+this.price);
		System.out.println("Memory:"+this.memory);
		this.brand="ASUS";
		this.price=3500.43f;
		this.memory=4;
	}
	
	GraphicsCard(String brand, float price, int memory)
	{
		System.out.println("Invoking String argument from GraphicsCard");
		this.brand=brand;
		this.price=price;
		this.memory=memory;
	}
}