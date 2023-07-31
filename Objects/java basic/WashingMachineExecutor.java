class WashingMachine
{
	static void washClothes()
	{
		System.out.println("1.WashingMachine wash clothes...");
	}
	static void soak()
	{
		System.out.println("2.WashingMachine soaks...");
	}
	static void rinse()
	{
		System.out.println("3.WashingMachine rinses");
	}
	static void dry()
	{
		System.out.println("4.WashingMachine dry");
	}
	static void checkWaterLevel()
	{
		System.out.println("5.WashingMachine check Water Level...");
	}
	static void clean()
	{
		System.out.println("6.WashingMachine cleans...");
	}
	static void waterInlet()
	{
		System.out.println("7.WashingMachine water inlet...");
	}
	static void waterOutlet()
	{
		System.out.println("8.WashingMachine water outlet...");
	}
	static void start()
	{
		System.out.println("9.WashingMachine starts...");
	}
	static void stop()
	{
		System.out.println("10.WashingMachine dial stops...");
	}
	static void load()
	{
		System.out.println("11.WashingMachine loads");
	}
	static void timer()
	{
		System.out.println("12.WashingMachine timer...");
	}
	static void cycle()
	{
		System.out.println("13.WashingMachine cycle.");
	}
	static void alaram()
	{
		System.out.println("14.WashingMachine alaram");
	}
	static void display()
	{
		System.out.println("15.WashingMachine display");
	}
	static void detergents()
	{
		System.out.println("16.WashingMachine detergents");
	}
	static void stain()
	{
		System.out.println("17.WashingMachine stain");
	}
	static void agitation()
	{
		System.out.println("18.WashingMachine agitation");
	}
	static void spin()
	{
		System.out.println("19.WashingMachine spins");
	}
	static void preWash()
	{
		System.out.println("20.WashingMachine pre wash");
	}
	static void expressWash()
	{
		System.out.println("21.WashingMachine express wash");
	}
	
}

class WashingMachineExecutor{
	public static void main(String[] args)
	{
		System.out.println("WashingMachineExecutor running in main method..");
		
		//method invoking in main method
		
		WashingMachine.washClothes();
		WashingMachine.soak();
		WashingMachine.rinse();
		WashingMachine.dry();
		WashingMachine.checkWaterLevel();
		WashingMachine.clean();
		WashingMachine.waterInlet();
		WashingMachine.waterOutlet();
		WashingMachine.start();
		WashingMachine.stop();
		WashingMachine.load();
		WashingMachine.timer();
		WashingMachine.cycle();
		WashingMachine.alaram();
		WashingMachine.display();
		WashingMachine.detergents();
		WashingMachine.stain();
		WashingMachine.agitation();
		WashingMachine.spin();
		WashingMachine.preWash();
		WashingMachine.expressWash();
		
	}
}