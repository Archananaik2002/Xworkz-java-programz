class WoodRunner
{
	public static void main(String[] args)
	{
		System.out.println("Invoking main method");
		Wood wood=new Wood("Oak",35);
		System.out.println("**********************************");
		Wood wood1=new Wood("Oak",35,8000.0);
		System.out.println("**********************************");
		Wood wood2=new Wood("Oak",35,1300.0,"Gum","Circle");
	}
}