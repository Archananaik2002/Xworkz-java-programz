class Job
{
	static void nextLine()
	{
		System.out.println("*********************************");
	}
	static void apply()
	{
		System.out.println("Invoking apply() in Job class");
	    nextLine();
	}

	static void apply(String personName,int exp)
	{
		System.out.println("Invoking apply(String,int) in Job class");
		System.out.println("Person Name is:"+personName);
		System.out.println("Experience in year is:"+exp);
	    nextLine();
	
	}
	static void apply(String name,int exp, String refName)
	{
		System.out.println("Invoking apply(String,int,String) in Job class");
		System.out.println("Person Name is:"+name);
		System.out.println("Experience in year is:"+exp);
		System.out.println("Reference Name is:"+refName);
	    nextLine();
	}
	
	static void apply(int exp)
	{
		System.out.println("Invoking apply(int) in Job class");
		System.out.println("Experience in year is:"+exp);
		rejectOffer();
		nextLine();
	}
	
	static void rejectOffer()
	{
		System.out.println("Invoking rejectOffer() in Job class");
		Boolean rejectOffer=true;
		System.out.println("Reject Offer :"+rejectOffer);
		nextLine();
		
	}
	
}