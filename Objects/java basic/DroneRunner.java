class DroneRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in DroneRunner");
		Double ref1=Drone.getDistanceByFlight("Akanksh","Aerial Photography");
		System.out.println("Drone distance by Flight is:"+ref1);
	    ref1=Drone.getDistanceByFlight("Ranjan","Marriage Event");
		System.out.println("Drone distance by Flight is:"+ref1);
		ref1=Drone.getDistanceByFlight("Ranjit","Marriage Event");
		System.out.println("Drone distance by Flight is:"+ref1);
		ref1=Drone.getDistanceByFlight(null,"Marriage Event");
		System.out.println("Drone distance by Flight is:"+ref1);
		System.out.println("\n");
		System.out.println("************************************");
		System.out.println("\n");
		Double ref2=Drone.getPricePerEvent("Aerial Photography");
		System.out.println("Price per Event is:"+ref2);
		ref2=Drone.getPricePerEvent("Marriage Event");
		System.out.println("Price per Event is:"+ref2);
		ref2=Drone.getPricePerEvent("Baloon carrier");
		System.out.println("Price per Event is:"+ref2);
		ref2=Drone.getPricePerEvent("Birthday Event");
		System.out.println("Price per Event is:"+ref2);
		ref2=Drone.getPricePerEvent(null);
		System.out.println("Price per Event is:"+ref2);
		System.out.println("\n");
		System.out.println("************************************");
		System.out.println("\n");
		int ref3=Drone.getDiscountByEvent("Aerial Photography","Jairaj");
		System.out.println("Discount per Event is:"+ref3);
	    ref3=Drone.getDiscountByEvent("Baloon carrier","Rachit");
		System.out.println("Discount per Event is:"+ref3);
		 ref3=Drone.getDiscountByEvent("Baloon carrier",null);
		System.out.println("Discount per Event is:"+ref3);
		 ref3=Drone.getDiscountByEvent("Baloon carrier","Raja");
		System.out.println("Discount per Event is:"+ref3);
	}
}