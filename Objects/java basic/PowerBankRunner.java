class PowerBankRunner
{
	public static void main(String[] args){
		System.out.println("Running main in PowerBankRunner");
		
		PowerBank powerBank=new PowerBank();
		System.out.println("PowerBank Brand:"+powerBank.brand);
		System.out.println("PowerBank Charging Capacity is:"+powerBank.chargingCapacity);
		System.out.println("PowerBank Cost:"+powerBank.cost);
		System.out.println("PowerBank Connector :"+powerBank.connector);
		System.out.println("PowerBank Charging Cable:"+powerBank.chargingCable);
		
		System.out.println("****************************************");

		PowerBank powerBank1=new PowerBank();
		
		powerBank1.brand="Ambrane";
		powerBank1.chargingCapacity="10000Mah";
		powerBank1.cost=1500;
		powerBank1.connector="Type-C";
		powerBank1.chargingCable="Yes";
		
		System.out.println("PowerBank Brand:"+powerBank1.brand);
		System.out.println("PowerBank Charging Capacity is:"+powerBank1.chargingCapacity);
		System.out.println("PowerBank Cost:"+powerBank1.cost);
		System.out.println("PowerBank Connector :"+powerBank1.connector);
		System.out.println("PowerBank Charging Cable:"+powerBank1.chargingCable);
		
		
	}
}