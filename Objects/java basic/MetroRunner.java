class MetroRunner
{
	public static void main(String[] args){
		System.out.println("Running main in MetroRunner");
		
		Metro metro=new Metro();
		System.out.println("Metro Name:"+metro.metroName);
		System.out.println("Metro Type is:"+metro.metroType);
		System.out.println("Metro capacity:"+metro.capacity);
		System.out.println("Metro Speed :"+metro.speed);
		System.out.println("Number Of Stations:"+metro.noOfStation);
		
		System.out.println("****************************************");

		Metro metro1=new Metro();
		
		metro1.metroName="Namma Metro";
		metro1.metroType="Metro Lite";
		metro1.capacity=250;
		metro1.speed="Medium";
		metro1.noOfStation=65;
		
		System.out.println("Metro Name:"+metro1.metroName);
		System.out.println("Metro Type is:"+metro1.metroType);
		System.out.println("Metro capacity:"+metro1.capacity);
		System.out.println("Metro Speed :"+metro1.speed);
		System.out.println("Number Of Stations:"+metro1.noOfStation);
		
		
	}
}