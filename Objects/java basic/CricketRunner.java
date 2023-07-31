class CricketRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running CricketRunner in main method");
		Cricket cricket=new Cricket();
		System.out.println("****************************************");
		System.out.println("CricketRunner price in main method:"+cricket.price);
		System.out.println("CricketRunner color in main method:"+cricket.color);
		System.out.println("CricketRunner material in main method:"+cricket.material);
		System.out.println("****************************************");
		Cricket cricket1=new Cricket(600, "Blue", "Wood");
		System.out.println("CricketRunner price in main method:"+cricket1.price);
		System.out.println("CricketRunner color in main method:"+cricket1.color);
		System.out.println("CricketRunner material in main method:"+cricket1.material);
		System.out.println("****************************************");
	}
}