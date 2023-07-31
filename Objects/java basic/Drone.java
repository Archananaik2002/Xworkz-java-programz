class Drone
{
	static double getDistanceByFlight(String operator, String event)
	{
		System.out.println("Invoking getDistanceByFlight in Drone...");
		
		if (operator!=null && event!=null)
		{
		    System.out.println("Operator and Event Name is valid");
			
			if(operator=="Akanksh" && event=="Aerial Photography")
			{
				return 1.5;
			}
			if(operator=="Ranjan" && event=="Marriage Event")
			{
				return 2.5;
			}
			
			
		}
		else
		{
			System.out.println("Operator and Event name is In valid");
			return 0;
		}
		
		return -1;
		
	}
	static double getPricePerEvent(String eventName)
	{
		System.out.println("Invoking getPricePerEvent in Drone...");
		
		if(eventName!=null)
		{
			System.out.println("Event Name is valid");
			if(eventName=="Aerial Photography")
			{
				return 5000;
			}
			if(eventName=="Marriage Event")
			{
				return 9000;
			}
			if(eventName=="Baloon carrier")
			{
				return 3000;
			}
			
		}
		else
		{
			System.out.println("Event name is In valid");
			return 0;	
		}
		return -1;
	}
	
	static int getDiscountByEvent(String eventName, String refPerson)
	{
		System.out.println("Invoking getDiscountByEvent in Drone...");
		if(eventName!=null && refPerson!=null)
		{
			System.out.println("Event Name and refPerson is valid");
			if(eventName=="Aerial Photography" && refPerson=="Jairaj")
			{
				return 10;
			}
			if(eventName=="Baloon carrier" && refPerson=="Rachit")
			{
				return 20;
			}
			return -1;
		}
		else{
			System.out.println("Event name and refPerson name is In valid");
			return 0;	
		}
	}
	
	
}