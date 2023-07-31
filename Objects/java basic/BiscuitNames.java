class BiscuitNames
{
	public static void main(String[] args)
	{
		System.out.println("Biscuit Names are running in main....");
		
		String hideandseek="Hide and Seek";
		String parleG="Parle-G";
		String goodDay="Good Day";
		String protienFoods="Protien Foods";
		String oreo="OREO";
		String darkFantasy="Dark Fantasy";
		String bourbon="Bourbon";
		
		String[] biscuits={hideandseek,parleG,goodDay,protienFoods,oreo,darkFantasy,bourbon};
		
		System.out.println("Items are in  Forword direction....");
		
		for(int i=0;i<biscuits.length;i++)
		{
			System.out.println("The item stored in index no "+i+ " is : "+biscuits[i]);
		}
		System.out.println("\n");
		
		biscuits[0]="Marie Gold";
		
		System.out.println("Items are in  reverse direction....");
		
		for(int i=biscuits.length-1;i>=0;i--)
		{
			System.out.println("The item stored in index no "+i+ " is : "+biscuits[i]);
		}
	}
}