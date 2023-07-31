class VegetablePrice
{
	public static void main(String[] args)
	{
		System.out.println("VegetablePrice running in main....");
		
		float tomato=100f;
		float onion=50f;
		float chilly=35f;
		float carrot=50.75f;
		float brinjal=40f;
		float bitterGourd=110.87f;
		float beetRoot=89.87f;
	
		float[] vegetables={tomato,onion,carrot,chilly,beetRoot,bitterGourd,brinjal};
		
		System.out.println("Items are in  Forword direction....");
		
		for(int i=0;i<vegetables.length;i++)
		{
			System.out.println("The item stored in index no "+i+ " is : "+vegetables[i]);
		}
		System.out.println("\n");
		
		vegetables[0]=200f;
		
		System.out.println("Items are in  reverse direction....");
		
		for(int i=vegetables.length-1;i>=0;i--)
		{
			System.out.println("The item stored in index no "+i+ " is : "+vegetables[i]);
		}
	}
}