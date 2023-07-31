class DoorBellRunner
{
public static void main(String[] args)
	{
		System.out.println("Running main method in DoorBellRunner");
		
		
		DoorBell doorBell =new DoorBell();
		System.out.println("DoorBell in main method:"+doorBell.ringType);
		System.out.println("DoorBell in main method:"+doorBell.volume);
		System.out.println("DoorBell in main method:"+doorBell.color);
		System.out.println("DoorBell in main method:"+doorBell.cost);
		System.out.println("DoorBell in main method:"+doorBell.brand);
		System.out.println("DoorBell in main method:"+doorBell.size);
		System.out.println("DoorBell in main method:"+doorBell.connection);
		
		DoorBell doorBell1=new DoorBell("Door Chimes");
		System.out.println("DoorBell in main method:"+doorBell1.ringType);
		System.out.println("DoorBell in main method:"+doorBell1.volume);
		System.out.println("DoorBell in main method:"+doorBell1.color);
		System.out.println("DoorBell in main method:"+doorBell1.cost);
		System.out.println("DoorBell in main method:"+doorBell1.brand);
		System.out.println("DoorBell in main method:"+doorBell1.size);
		System.out.println("DoorBell in main method:"+doorBell1.connection);
		DoorBell doorBell2 =new DoorBell("Door Chimes", 100);
		System.out.println("DoorBell in main method:"+doorBell2.ringType);
		System.out.println("DoorBell in main method:"+doorBell2.volume);
		System.out.println("DoorBell in main method:"+doorBell2.color);
		System.out.println("DoorBell in main method:"+doorBell2.cost);
		System.out.println("DoorBell in main method:"+doorBell2.brand);
		System.out.println("DoorBell in main method:"+doorBell2.size);
		System.out.println("DoorBell in main method:"+doorBell2.connection);
		
		DoorBell doorBell3 =new DoorBell("Intercoms",76, "black");
		System.out.println("DoorBell in main method:"+doorBell3.ringType);
		System.out.println("DoorBell in main method:"+doorBell3.volume);
		System.out.println("DoorBell in main method:"+doorBell3.color);
		System.out.println("DoorBell in main method:"+doorBell3.cost);
		System.out.println("DoorBell in main method:"+doorBell3.brand);
		System.out.println("DoorBell in main method:"+doorBell3.size);
		System.out.println("DoorBell in main method:"+doorBell3.connection);
		
		DoorBell doorBell4 =new DoorBell("Wireless",78, "white", 1200);
		System.out.println("DoorBell in main method:"+doorBell4.ringType);
		System.out.println("DoorBell in main method:"+doorBell4.volume);
		System.out.println("DoorBell in main method:"+doorBell4.color);
		System.out.println("DoorBell in main method:"+doorBell4.cost);
		System.out.println("DoorBell in main method:"+doorBell4.brand);
		System.out.println("DoorBell in main method:"+doorBell4.size);
		System.out.println("DoorBell in main method:"+doorBell4.connection);
		
		DoorBell doorBell5 =new DoorBell("Inter coms",78, "white", 1200, "Ring");
		System.out.println("DoorBell in main method:"+doorBell5.ringType);
		System.out.println("DoorBell in main method:"+doorBell5.volume);
		System.out.println("DoorBell in main method:"+doorBell5.color);
		System.out.println("DoorBell in main method:"+doorBell5.cost);
		System.out.println("DoorBell in main method:"+doorBell5.brand);
		System.out.println("DoorBell in main method:"+doorBell5.size);
		System.out.println("DoorBell in main method:"+doorBell5.connection);
		
		DoorBell doorBell7 =new DoorBell("Door chimes",78, "white", 7200, "Ring","Wired");
		System.out.println("DoorBell in main method:"+doorBell7.ringType);
		System.out.println("DoorBell in main method:"+doorBell7.volume);
		System.out.println("DoorBell in main method:"+doorBell7.color);
		System.out.println("DoorBell in main method:"+doorBell7.cost);
		System.out.println("DoorBell in main method:"+doorBell7.brand);
		System.out.println("DoorBell in main method:"+doorBell7.size);
		System.out.println("DoorBell in main method:"+doorBell7.connection);
	}
}