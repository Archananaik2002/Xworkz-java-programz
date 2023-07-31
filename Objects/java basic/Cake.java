class Cake
{
	static void tasty(String name, String type, String bakeryName, double price, int noOfPiece, String ocassion)
	{
		System.out.println("Invoking tasty() in Cake");
		
		if(name!=null)
		{
			System.out.println("Name is  valid:"+name);
		}
		else
		{
              System.err.println("Name is not valid:"+name);
              return;			  
		}
		if(type!=null)
		{
			System.out.println("Type is  valid:"+type);
		}
		else
		{
              System.err.println("Type is not valid:"+type);
              return;			  
		}
		if(bakeryName!=null)
		{
			System.out.println("Bakery Name is  valid:"+bakeryName);
		}
		else
		{
              System.err.println("Bakery Name is not valid:"+bakeryName);
              return;			  
		}
		if(price>=50)
		{
			System.out.println("Price is  valid:"+price);
		}
		else
		{
              System.err.println("Price is not valid:"+price);
              return;			  
		}
		if(noOfPiece>=1)
		{
			System.out.println("No of piece is  valid:"+noOfPiece);
		}
		else
		{
              System.err.println("No of piece is not  valid:"+noOfPiece);
		}
        if(ocassion!=null)
		{
			System.out.println("Ocassion Name is  valid:"+ocassion);
		}
		else
		{
              System.err.println("Ocassion Name is not valid:"+ocassion);
              return;			  
		}
		System.out.println("Take your cake to your home...");
}
}