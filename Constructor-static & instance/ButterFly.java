class ButterFly{
	static int noOfAntenna;
	static int legs;
	String nameOfButterfly;
	String color;
	
	ButterFly(String nameOfButterfly,String color){
		System.out.println("Invoking String,String constructor in ButterFly");
		this.nameOfButterfly=nameOfButterfly;
		this.color=color;
	}
	
	static{
		noOfAntenna=2;
		legs=6;	
	}
	
	static void staticButterFly(){
		System.out.println("static variables in ButterFly");
		System.out.println("ButterFly eye type is:"+noOfAntenna);
		System.out.println("ButterFly Legs is:"+legs);

	}
	void instanceButterFly(){
		System.out.println("instance variables in ButterFly");
	    System.out.println("nameOfButterfly is:"+nameOfButterfly);
		System.out.println("Life Span In Weeks is:"+color);


	}
}