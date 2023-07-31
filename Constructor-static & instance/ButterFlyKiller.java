class ButterFlyKiller{
	public static void main(String[] args){
		System.out.println("Running main in ButterFlyKiller");
		
		ButterFly butterFly=new ButterFly("Red spotted Purple","Blue");
		ButterFly.staticButterFly();
		butterFly.instanceButterFly();
		
		System.out.println("##################################");
		
		ButterFly butterFly1=new ButterFly("Clouded sulphor","yellow");
		ButterFly.staticButterFly();
		butterFly1.instanceButterFly();
		
	}
}