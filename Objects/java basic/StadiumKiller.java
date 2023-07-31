class StadiumKiller
{
	public static void main(String[] args)
	{
	   System.out.println("Running main in StadiumKiller..");
	   
	   Stadium stadium=new Stadium();
	   Stadium stadium1=new Stadium();
	   
	   System.out.println(stadium.stadiumName);
	   System.out.println(stadium.location);
	   System.out.println(stadium.ticketCost);
	   System.out.println(stadium.capacity);
	   System.out.println(stadium.diameter);
	   System.out.println("********************************************");
	   System.out.println(stadium1.stadiumName);
	   System.out.println(stadium1.location);
	   System.out.println(stadium1.ticketCost);
	   System.out.println(stadium1.capacity);
	   System.out.println(stadium1.diameter);
	   
	   
	   stadium.stadiumName="M.ChinnaSwamy Stadium";
	   stadium.location="Bangalore";
	   stadium.ticketCost=2500;
	   stadium.capacity=32000;
	   stadium.diameter=65;
	   
	  System.out.println("********************************************");

	   
	   System.out.println(stadium.stadiumName);
	   System.out.println(stadium.location);
	   System.out.println(stadium.ticketCost);
	   System.out.println(stadium.capacity);
	   System.out.println(stadium.diameter);
	   
	   System.out.println("********************************************");
 
	   stadium1.stadiumName="Dr. B R Ambedkar Stadium";
	   stadium1.location="Bangalore";
	   stadium1.ticketCost=500;
	   stadium1.capacity=3000;
	   stadium1.diameter=30;
	   
	   System.out.println(stadium1.stadiumName);
	   System.out.println(stadium1.location);
	   System.out.println(stadium1.ticketCost);
	   System.out.println(stadium1.capacity);
	   System.out.println(stadium1.diameter);
	   
	   
	   
	}
}