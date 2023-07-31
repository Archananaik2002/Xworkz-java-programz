class ResumeExecuter
{
	public static void main(String[] args)
	{
		System.out.println("Running main in ResumeExecuter");
		Resume.format();
		Resume.format("Functional Resume");
		Resume.format("Skill Based Resume",3);
		Resume.clear();
		Resume.delete();
		
	}
}