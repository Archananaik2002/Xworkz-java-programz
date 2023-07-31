class Candle
{
	static String brand; 
	static String manufacturedState; 
	double price;
	String vacasionFor;
	
	Candle(double price, String vacasionFor)
	{
		System.out.println("Invoking double, string args from Wood"); 
		this.price=price;
		this.vacasionFor=vacasionFor;
	}
	
	static
	{
		brand="HG Global";
		manufacturedState="Karnataka";
	}
	
	static void staticCandle()
	{
			System.out.println("Static varibles in Candle");
			System.out.println("Brand is:"+brand);
			System.out.println("Manufactured state is:"+manufacturedState);
	}
    void instanceCandle()
	{
			System.out.println("Instance varibles in Candle");
			System.out.println("price is "+price);
			System.out.println("vacasion For "+vacasionFor);
	}
	
}