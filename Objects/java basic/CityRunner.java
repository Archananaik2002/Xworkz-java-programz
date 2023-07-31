class CityRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running CityRunner in main method");
		
		City city=new City();
		System.out.println("****************************************");
		System.out.println("City name in main method:"+city.cityName);
		System.out.println("City pincodein main method:"+city.pinCode);
		System.out.println("City population in main method:"+city.population);
		System.out.println("****************************************");
		City city1=new City("Bangalore",654545,1200000);
		System.out.println("City name in main method:"+city1.cityName);
		System.out.println("City pincodein main method:"+city1.pinCode);
		System.out.println("City population in main method:"+city1.population);
		
		
	}
}