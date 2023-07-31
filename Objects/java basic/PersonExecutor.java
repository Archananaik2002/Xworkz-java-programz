class Person
{
	static void dance()
	{
		System.out.println("1. Person dances...");
	}
	static void eat()
	{
		System.out.println("2.Person eats...");
	}
	static void run()
	{
		System.out.println("3.Person runs...");
	}
	static void walk()
	{
		System.out.println("4.Person walks...");
	}
	static void sing()
	{
		System.out.println("5.Person sings...");
	}
	static void sleep()
	{
		System.out.println("6.Person sleeps...");
	}
	static void talk()
	{
		System.out.println("7.Person talks...");
	}
	static void drink()
	{
		System.out.println("8.Person drinks...");
	}
	static void bath()
	{
		System.out.println("9.Person baths...");
	}
	static void drive()
	{
		System.out.println("10.Person drives...");
	}
	static void work()
	{
		System.out.println("11.Person works...");
	}
	static void cook()
	{
		System.out.println("12.Person cooks...");
	}
	static void read()
	{
		System.out.println("13.Person reads...");
	}
	static void write()
	{
		System.out.println("14.Person writes...");
	}
	static void play()
	{
		System.out.println("15.Person plays...");
	}
	static void wash()
	{
		System.out.println("16.Person washes...");
	}
	static void call()
	{
		System.out.println("17.Person calls...");
	}
	static void clean()
	{
		System.out.println("18.Person cleans...");
	}
	static void paints()
	{
		System.out.println("19.Person paints...");
	}
	static void travel()
	{
		System.out.println("21.Person travels...");
	}
	static void listen()
	{
		System.out.println("20.Person listens...");
	}
	
}

class PersonExecutor{
	public static void main(String[] args)
	{
		System.out.println("PersonExecutor running in main method..");
		
		//method invoking in main method
		
		Person.dance();
		Person.eat();
		Person.run();
		Person.walk();
		Person.sing();
		Person.sleep();
		Person.talk();
		Person.drink();
		Person.bath();
		Person.drive();
		Person.work();
		Person.cook();
		Person.read();
		Person.write();
		Person.play();
		Person.wash();
		Person.call();
		Person.clean();
		Person.paints();
		Person.listen();
		Person.travel();
		
	}
}