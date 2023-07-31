class JobExecuter
{
	public static void main(String[] args)
	{
		System.out.println("Running main in Job");
		Job.apply();
		Job.apply("Archana",10);
		Job.apply("Sai",2,"Archana Naik");
		Job.apply(7);
		Job.rejectOffer();
		
	}
}