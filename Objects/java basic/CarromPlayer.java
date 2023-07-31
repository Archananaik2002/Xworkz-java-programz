class CarromPlayer
{
	public static void main(String[] args)
	{
		System.out.println("Running main method in carromplayer");
		
		Carrom carrom1=new Carrom();
		System.out.println("Carrom in main method:"+carrom1.price);
		System.out.println("Carrom in main method:"+carrom1.noOfCoin);
		System.out.println("Carrom in main method:"+carrom1.brand);
		System.out.println("Carrom in main method:"+carrom1.size);
		System.out.println("Carrom in main method:"+carrom1.maxPlayers);
		
		Carrom carrom2=new Carrom(2000);
		System.out.println("Carrom in main method:"+carrom2.price);
		System.out.println("Carrom in main method:"+carrom2.noOfCoin);
		System.out.println("Carrom in main method:"+carrom2.brand);
		System.out.println("Carrom in main method:"+carrom2.size);
		System.out.println("Carrom in main method:"+carrom2.maxPlayers);
		
		Carrom carrom3=new Carrom(4000,21);
		System.out.println("Carrom in main method:"+carrom3.price);
		System.out.println("Carrom in main method:"+carrom3.noOfCoin);
		System.out.println("Carrom in main method:"+carrom3.brand);
		System.out.println("Carrom in main method:"+carrom3.size);
		System.out.println("Carrom in main method:"+carrom3.maxPlayers);
		
		Carrom carrom4=new Carrom(3000,20,"Disney");
		System.out.println("Carrom in main method:"+carrom4.price);
		System.out.println("Carrom in main method:"+carrom4.noOfCoin);
		System.out.println("Carrom in main method:"+carrom4.brand);
		System.out.println("Carrom in main method:"+carrom4.size);
		System.out.println("Carrom in main method:"+carrom4.maxPlayers);
		
		Carrom carrom5=new Carrom(8000,21,"Disney",23);
		System.out.println("Carrom in main method:"+carrom5.price);
		System.out.println("Carrom in main method:"+carrom5.noOfCoin);
		System.out.println("Carrom in main method:"+carrom5.brand);
		System.out.println("Carrom in main method:"+carrom5.size);
		System.out.println("Carrom in main method:"+carrom5.maxPlayers);
	}
}