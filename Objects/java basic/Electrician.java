class Electrician
{
	static void repair()
	{
		System.out.println("Running repair() in Electrician");
	
	}
	static void repair(String name)
	{
		System.out.println("Running repair() in Electrician");
		System.out.println("Name:"+name);
	
	}
	static void install(String location)
	{
		System.out.println("Running install() in Electrician");
		System.out.println("Location:"+location);
	}
	static void install(String location,int cost)
	{
		System.out.println("Running install() in Electrician");
		System.out.println("Location:"+location);
		System.out.println("Cost:"+cost);
	}
	static void switchDevice()
	{
		System.out.println("Running switchDevice() in Electrician");
	}
	static void switchDevice(String devName)
	{
		System.out.println("Running switchDevice() in Electrician");
		System.out.println("Device Name:"+devName);
	}
	static void switchDevice(int No, String devName)
	{
		System.out.println("Running switchDevice() in Electrician");
		System.out.println("Number:"+No);
		System.out.println("Device Name:"+devName);
    }
	static void switchDevice(int No, String devName, int hours)
	{
		System.out.println("Running switchDevice() in Electrician");
		System.out.println("Number:"+No);
		System.out.println("Device Name:"+devName);
	    System.out.println("Hours:"+hours);
    }
	static void replace()
	{
		System.out.println("Running replace() in Electrician");
		replace("Earphones");
	}
	static void replace(String devName)
	{
		System.out.println("Running replace() in Electrician");
		System.out.println("Device Name:"+devName);
		
	}
}


