class BrickRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in BrickRunner");
		
		Brick brick=new Brick(500,"Red");
		Brick.staticBrick();
		brick.instanceBrick();
		
		System.out.println("***********************");
		
		Brick brick1=new Brick(700,"White");
		Brick.staticBrick();
		brick1.instanceBrick();
	}
}