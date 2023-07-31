class CarpenterExecuter
{
	public static void main(String[] args)
	{
		System.out.println("Running main in Job");
		Carpenter.buildStructure();
		Carpenter.buildStructure("Hammer","Rough Carpenter");
		Carpenter.make("V.N.Dev");
		Carpenter.make("V.N.Dev",80000);
		Carpenter.toolsUsed("Hammer",10);
		Carpenter.toolsUsed("Tape Measure");
		Carpenter.toolsUsed("Tape Measure","Akash",1200);
	     Carpenter.toolsUsed(899);
		Carpenter.workExp();
		Carpenter.workExp(6);
		
		
		
		
		
		
		
	}
}