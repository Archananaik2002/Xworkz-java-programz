class WirelessControllerRunner
{
	public static void main(String[] args){
		System.out.println("Running main in WirelessControllerRunner");
		
		WirelessController wireless=new WirelessController();
		
		System.out.println("WirelessController model number:"+wireless.modelNo);
		System.out.println("WirelessController brand is:"+wireless.brand);
		System.out.println("WirelessController type :"+wireless.type);
		System.out.println("WirelessController cost :"+wireless.cost);
		System.out.println("WirelessController connectivity:"+wireless.connectivity);
		
		System.out.println("****************************************");

		WirelessController wireless1=new WirelessController();
		
		wireless1.modelNo="C9800";
		wireless1.brand="Cisco";
		wireless1.type="Game Type";
		wireless1.cost=6580;
		wireless1.connectivity="Bluetooth";
		
		
		System.out.println("WirelessController model number:"+wireless1.modelNo);
		System.out.println("WirelessController brand is:"+wireless1.brand);
		System.out.println("WirelessController type :"+wireless1.type);
		System.out.println("WirelessController cost :"+wireless1.cost);
		System.out.println("WirelessController connectivity:"+wireless1.connectivity);
		
		
	}
}