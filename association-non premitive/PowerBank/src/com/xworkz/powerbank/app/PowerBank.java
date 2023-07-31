package src.com.xworkz.powerbank.app;

public class PowerBank {
	
	public int price;
	public Battery battery=new Battery(	);
	
	public void chargeMobile()
	{
		System.out.println("Invoking chargeMobile in PowerBank");
		if(this.battery!=null)
		{
			this.battery.storeCharge();
			this.battery.backupPower();
		}
		else
		{
			System.err.println("Battery is null.Cannot invoke methods of battery");
		}
	}
	
	public void info()
	{
		System.out.println("Price is:"+price);
	}
	

}
