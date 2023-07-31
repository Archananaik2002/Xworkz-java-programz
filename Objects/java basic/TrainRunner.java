class TrainRunner
{
	public static void main(String[] args)
	{
		System.out.println("Invoking TrainRunner in main method");
		String ref1=Train.getTrainName(11013);
		System.out.println("Ref1 is:"+ref1);
		String ref2=Train.getTrainName(11014);
		System.out.println("Ref1 is:"+ref2);
		String ref3=Train.getTrainName(12134);
		System.out.println("Ref1 is:"+ref3);
		String ref4=Train.getTrainName(22691);
		System.out.println("Ref1 is:"+ref4);
	
	}
}