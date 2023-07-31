class WondersOfWorld
{
	public static void main(String[] args)
	{
		System.out.println("WondersOfWorld running in main....");
		
		String first  ="Great Pyramid og Giza";
		String second ="Hanging Gardens of Babylon";
		String third  ="The Colosseum Rome,Italy";
		String fourth ="The Great Wall of China";
		String fifth  ="Christ the Redeemer, Brazil";
		String sixth  ="Machu Picchu, Peru";
		String seventh="Petra, Jordan";
	
		String[] wonders={first,second,third,fourth,fifth,sixth,seventh};
		
		System.out.println("Items are in  Forword direction....");
		
		for(int i=0;i<wonders.length;i++)
		{
			System.out.println("The item stored in index no "+i+ " is : "+wonders[i]);
		}
		System.out.println("\n");
		
		wonders[0]="Statue of Zeus";
		
		System.out.println("Items are in  reverse direction....");
		
		for(int i=wonders.length-1;i>=0;i--)
		{
			System.out.println("The item stored in index no "+i+ " is : "+wonders[i]);
		}
	}
}