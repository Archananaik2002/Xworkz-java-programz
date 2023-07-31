class City
{
	String cityName;
	int pinCode;
	int population;
	
	City()
	{
		System.out.println("Invoking no argument from City");
		System.out.println("City Name:"+this.cityName);
		System.out.println("Pincode of the city is:"+this.pinCode);
		System.out.println("Population :"+this.population);
		this.cityName="Karwar";
		this.pinCode=581324;
		this.population=230000;
	}
	
	City(String cityName, int pinCode, int population)
	{
		System.out.println("Invoking string argument from City");
		this.cityName=cityName;
		this.pinCode=pinCode;
		this.population=population;
	}
	
	
}