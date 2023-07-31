class ElectricianExecuter
{
	public static void main(String[] args)
	{
		System.out.println("Running main in ElectricianExecuter...");
		Electrician.repair();
		Electrician.repair("Akshay");
		Electrician.install("Karwar");
		Electrician.install("Karwar",8000);
		Electrician.switchDevice();
		Electrician.switchDevice("Mobile");
		Electrician.switchDevice(5,"Mobile");
		
		Electrician.switchDevice(5,"Mobile",7);
		Electrician.replace();
		Electrician.replace("laptop");
		
		
		
		
		
		
		
		
	}
}