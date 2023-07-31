class PowerRunner
{
	
	public static void main(String[] args)
	{
		System.out.println("Running main in PowerRunner");
		
		Power power= new Power("140 hz", 140);
		Power.staticPower();
		power.instancePower();
		System.out.println("***********************");
		Power power1= new Power("110 hz", 120);
		Power.staticPower();
		power1.instancePower();
		
	}
}