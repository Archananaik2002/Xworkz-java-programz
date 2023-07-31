class GroceryItems
{
	public static void main(String[] args)
	{
		System.out.println("Grocery Items running in main....");
		
		String fruits="Fruits";
		String vegetables="Vegetables";
		String dairy="Dairy Items";
		String protienFoods="Protien Foods";
		String breakfastItem="Breakfast Items";
		String grains="Grains";
		String chocolates="Chocolates";
		
		String[] groceries={fruits,vegetables,dairy,protienFoods,breakfastItem,grains,chocolates};
		
		System.out.println("Items are in  Forword direction....");
		
		for(int i=0;i<groceries.length;i++)
		{
			System.out.println("The item stored in index no "+i+ " is : "+groceries[i]);
		}
		System.out.println("\n");
		
		groceries[0]="Dry Fruits";
		
		System.out.println("Items are in  reverse direction....");
		
		for(int i=groceries.length-1;i>=0;i--)
		{
			System.out.println("The item stored in index no "+i+ " is : "+groceries[i]);
		}
	}
}