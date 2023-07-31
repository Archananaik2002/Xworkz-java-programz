class FlightArray
{
	public static void main(String[] args)
	{
		System.out.println("FlightArray Items running in main....");
		
		String indiGo      = "IndiGo "  ;  
		String airIndia    = "Air India"  ;  
		String vistara     = "Vistara "  ;  
		String airAsiaIndia= "AirAsia India";
		String saudia      = "Saudia  "    ;
		String spiceJet    = "SpiceJet "  ; 
		String qatarAirways= "Qatar Airways";
		
		String[] flightsNames={indiGo, airIndia, vistara, airAsiaIndia, saudia, spiceJet, qatarAirways};
		
		System.out.println("Items are in  Forword direction....");
		
		for(int i=0;i<flightsNames.length;i++)
		{
			System.out.println("The item stored in index no "+i+ " is : "+flightsNames[i]);
		}
		System.out.println("\n");
		
		flightsNames[0]="Air Arabia";
		
		System.out.println("Items are in  reverse direction....");
		
		for(int i=flightsNames.length-1;i>=0;i--)
		{
			System.out.println("The item stored in index no "+i+ " is : "+flightsNames[i]);
		}
	}
}