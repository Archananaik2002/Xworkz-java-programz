class CakeCutter
{
	public static void main(String[] args)
	{
		System.out.println("Running cakecutter in main method....");
		String cakeName="Chocolate Cake";
		String cakeType="Egg cake";
		String bakeryName="Sai bakery";
		double price=100;
		int noOfPiece=10;
		String ocassion="Birthday";
		
		Cake.tasty(cakeName,cakeType, bakeryName,price,noOfPiece,ocassion);
	    System.out.println("");
	}
}