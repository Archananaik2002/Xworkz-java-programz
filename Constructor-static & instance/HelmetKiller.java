class HelmetKiller{
	public static void main(String[] args){
		System.out.println("Running main in HelmetKiller");
		
		Helmet helmet=new Helmet("Blue",3400);
		Helmet.staticHelmet();
		helmet.instanceHelmet();
		
		System.out.println("##################################");
		
		Helmet helmet1=new Helmet("Red",7006);
		Helmet.staticHelmet();
		helmet1.instanceHelmet();
		
	}
}