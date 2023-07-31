class Resume
{
	static void format()
	{
		System.out.println("Running format() in Resume..");
		System.out.println("\n");
	}
	
	static void format(String type)
	{
		System.out.println("Running format(String) in Resume..");
		System.out.println("Type :"+type);
		System.out.println("\n");
	}
	static void format(String type, int pages)
	{
		System.out.println("Running format(String,pages) in Resume..");
		System.out.println("Type :"+type);
		System.out.println("Pages :"+pages);
		System.out.println("\n");
	}
	static void clear()
	{
		System.out.println("Running clear() in Resume..");
		delete();
		System.out.println("\n");
	}
	static void delete()
	{
		System.out.println("Running delete() in Resume..");
		boolean delete=true;
		System.out.println("Delete Resume:"+delete);
	}
}