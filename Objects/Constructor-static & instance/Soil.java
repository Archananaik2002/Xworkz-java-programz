class Soil{
	static String consistancy;
	static int organicMater;
	String type;
	String color;
	
	Soil(String type,String color){
		System.out.println("Invoking String, String constructor in Soil");
		this.type=type;
		this.color=color;
	}
	
	static{
		consistancy="Stcky";
		organicMater=4;	
	}
	
	static void staticSoil(){
		System.out.println("static variables in Soil");
		System.out.println("consistancy is:"+consistancy);
		System.out.println("organicMater is:"+organicMater);

	}
	void instanceSoil(){
		System.out.println("instance variables in Soil");
	    System.out.println("Price is:"+type);
		System.out.println("color is:"+color);


	}
}