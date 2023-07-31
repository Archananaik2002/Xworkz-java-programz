class Power{
	static String formula;
	static String unit;
	String frequency;
	double voltage;
	
	
	Power(String frequency,double voltage)
	{
		System.out.println("Invoking String,double constructor of Power");
		this.frequency=frequency;
		this.voltage=voltage;
	}
	
	static{
		formula="Energy per time";
		unit="Watt";
	}
	
	static void staticPower()
	{
		System.out.println("Invoking staticPower in Power");
		System.out.println("Power formula :"+formula);
		System.out.println("Power unit :"+unit);
	}
	
	void instancePower()
	{
		System.out.println("Invoking instancePower in Power");
		System.out.println("Power frequency :"+frequency);
		System.out.println("Power voltage:"+voltage);
	}
}