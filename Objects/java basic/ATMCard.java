class ATMCard{
	String type;
	String holderName;
	int pinNumber;
	
	ATMCard()
	{
		System.out.println("Invoking no-arguments from ATMCard");
		System.out.println("Atm Card type in Constructor:"+this.type);
		System.out.println("Atm Card holderName in Constructor:"+this.holderName);
		System.out.println("Atm Card pinNumber in Constructor:"+this.pinNumber);
		this.type="Visa Card"; 
		this.holderName="Archana";
		this.pinNumber=1234;

	}
	ATMCard(String type, String holderName,int pinNumber){ 
		System.out.println("Invoking arguments from ATMCard");
		this.type=type; 
		this.holderName=holderName;
		this.pinNumber=pinNumber;

		
	}
}