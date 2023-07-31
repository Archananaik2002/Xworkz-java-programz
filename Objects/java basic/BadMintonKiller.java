class BadMintonKiller
{
	public static void main(String[] args)
	{
	   System.out.println("Running main in BadMintonKiller..");
	   
	   BadMinton badMinton=new BadMinton();
	   BadMinton badMinton1=new BadMinton();
	   
	   System.out.println(badMinton.color);
	   System.out.println(badMinton.brand);
	   System.out.println(badMinton.cost);
	   System.out.println(badMinton.size);
	   System.out.println(badMinton.material);
	   System.out.println("********************************************");
	   System.out.println(badMinton1.color);
	   System.out.println(badMinton1.brand);
	   System.out.println(badMinton1.cost);
	   System.out.println(badMinton1.size);
	   System.out.println(badMinton1.material);
	   
	  
	   
	  System.out.println("********************************************");
        badMinton.color="Black";
		badMinton.brand="Yonex";
		badMinton.cost=700;
		badMinton.size=24;
		badMinton.material="Carbon Fibre";
	   
	   System.out.println(badMinton.color);
	   System.out.println(badMinton.brand);
	   System.out.println(badMinton.cost);
	   System.out.println(badMinton.size);
	   System.out.println(badMinton.material);
	   
	   System.out.println("********************************************");
 
	    badMinton1.color="White";
		badMinton1.brand="VICTOR";
		badMinton1.cost=1000;
		badMinton1.size=29;
		badMinton1.material="Carbon Fibre";
	   
	   
	   System.out.println(badMinton1.color);
	   System.out.println(badMinton1.brand);
	   System.out.println(badMinton1.cost);
	   System.out.println(badMinton1.size);
	   System.out.println(badMinton1.material);
	   
	   
	   
	}
}