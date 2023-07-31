class GraphicsCardRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running GraphicsCardRunner in main method");
		
		GraphicsCard graphicsCard=new GraphicsCard();
		System.out.println("****************************************");
		System.out.println("Graphics card brand in main method:"+graphicsCard.brand);
		System.out.println("Graphics card price in main method:"+graphicsCard.price);
		System.out.println("Graphics card memory in main method:"+graphicsCard.memory);
		System.out.println("****************************************");
		GraphicsCard graphicsCard1=new GraphicsCard("MSI",4000,8);
		System.out.println("Graphics card brand in main method:"+graphicsCard1.brand);
		System.out.println("Graphics card price in main method:"+graphicsCard1.price);
		System.out.println("Graphics card memory in main method:"+graphicsCard1.memory);
}
}