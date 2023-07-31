class DoorBell
{
	String ringType;
	int volume;
	String color;
	float cost;
	String brand;
	String connection;
	int size;
	
	DoorBell()
	{
	 System.out.println("Invoking  no args constructor of carrom");
	 System.out.println(this.ringType);
	 System.out.println(this.volume);
	 System.out.println(this.color);
	 System.out.println(this.cost);
	 System.out.println(this.connection);
	 System.out.println(this.size);  
	}
	
	DoorBell(String ringType)
	{
	 System.out.println("Invoking  String args constructor of carrom");
	 this.ringType=ringType;
     this.volume=volume;
	 this.color=color;
	 this.cost=cost;
	 this.brand=brand;
     this.connection=connection;
     this.size=size;
	}
	DoorBell(String ringType,int volume)
	{
	 System.out.println("Invoking  String,int args constructor of carrom");
	 this.ringType=ringType;
     this.volume=volume;
	 this.color=color;
	 this.cost=cost;
	 this.brand=brand;
     this.connection=connection;
     this.size=size;
	}
	DoorBell(String ringType,int volume, String color)
	{
	 System.out.println("Invoking  String,int, String args constructor of carrom");
	 this.ringType=ringType;
     this.volume=volume;
	 this.color=color;
	 this.brand=brand;
	 this.cost=cost;
     this.connection=connection;
     this.size=size;
	}
	DoorBell(String ringType,int volume, String color, float cost)
	{
	 System.out.println("Invoking  String,int, String, float args constructor of carrom");
	 this.ringType=ringType;
     this.volume=volume;
	 this.color=color;
	 this.brand=brand;
	 this.cost=cost;
     this.connection=connection;
     this.size=size;
	}
	DoorBell(String ringType,int volume, String color, float cost, String band)
	{
	 System.out.println("Invoking  String,int, String, float, string args constructor of carrom");
	 this.ringType=ringType;
     this.volume=volume;
	 this.color=color;
	 this.brand=brand;
	 this.cost=cost;
     this.connection=connection;
     this.size=size;
	}
	DoorBell(String ringType,int volume, String color, float cost, String band, String connection)
	{
	 System.out.println("Invoking  String,int, String , float, string args constructor of carrom");
	 this.ringType=ringType;
     this.volume=volume;
	 this.color=color;
	 this.brand=brand;
	 this.cost=cost;
     this.connection=connection;
     this.size=size;
	}
	
}