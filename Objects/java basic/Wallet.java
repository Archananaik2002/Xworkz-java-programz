class Wallet
{
	int price;
	String brand;
	String pattern;
	
	Wallet()
	{
		System.out.println("Invoking no argument from Wallet");
		System.out.println("Price:"+this.price);
		System.out.println("Brand:"+this.brand);
		System.out.println("Brand:"+this.pattern);
		this.price=700;
	    this.brand="Fossil";
        this.pattern="Galaxy";
	}
	
	Wallet(int price, String brand, String pattern)
	{
		System.out.println("Invoking String argument from Wallet");
		this.price=price;
		this.brand=brand;
		this.pattern=pattern;
	}
}