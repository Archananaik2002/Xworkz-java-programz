class GymRunner
{
	public static void main(String[] args){
		System.out.println("Running main in MetroRunner");
		
		Gym gym=new Gym();
		System.out.println("Gym Name:"+gym.gymName);
		System.out.println("Gym Type is:"+gym.gymType);
		System.out.println("Gym Training Cost:"+gym.trainingCost);
		System.out.println("Gym Location :"+gym.location);
		System.out.println("Gym timings In Minutes:"+gym.timingsInMinutes);
		
		System.out.println("****************************************");

		Gym gym1=new Gym();
		
		gym1.gymName="Crunch Fitness";
		gym1.gymType="CrossFit Gyms";
		gym1.trainingCost=5000;
		gym1.location="Udupi";
		gym1.timingsInMinutes=240;
		
		System.out.println("Gym Name:"+gym1.gymName);
		System.out.println("Gym Type is:"+gym1.gymType);
		System.out.println("Gym Training Cost:"+gym1.trainingCost);
		System.out.println("Gym Location :"+gym1.location);
		System.out.println("Gym timings In Minutes:"+gym1.timingsInMinutes);
		
		
	}
}