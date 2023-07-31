public class Contractor{
	
	static void contract(String name)
	{
		System.out.println("Invoking contrator() in Contractor");
		System.out.println("Name of the contractor: " + name);
	}
	
	static void contract(String name, float salary)
	{
		System.out.println("Name of the contractor: " + name);
		System.out.println("Salary: " + salary);
	}
	
	static void contract(String name, int experience)
	{
		System.out.println("Name of the contractor: " + name);
		System.out.println("experience: " + experience);
	}
	static void location(String locationName)
	{
		System.out.println("invoking location in contractor");
		System.out.println("Location Name:"+locationName);
	}
	static void location(int distance)
	{
		System.out.println("invoking location in contractor");
		System.out.println("Distance:"+ distance);
	}
	static void workers(int numberOfWorkers)
	{
		System.out.println("invoking workers in contractor");
		System.out.println("Workers:"+numberOfWorkers);
	}


    static void contractorWork(String workName)
	{
		System.out.println("Construction name:"+workName);
	}
	
	static void contractorSupervise()
	{
		System.out.println("Contractor will guide the labours to complete the work");
	}
	
	static void payAmount(int salary)
	{
		System.out.println("Paying salary to workers: " + salary);
		bid(2000);
	}
	
	static void bid(int amount)
	{
		System.out.println("bid money to get contract"+amount);
	}
}
	