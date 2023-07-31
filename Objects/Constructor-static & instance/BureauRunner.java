class BureauRunner{
	public static void main(String[] args){
		System.out.println("Running main in BureauRunner");
		
		Bureau bureau=new Bureau(70000,true);
		Bureau.staticBureau();
		bureau.instanceBureau();
		
		System.out.println("_________________________________________________");
		
		Bureau bureau1=new Bureau(85000,false);
		Bureau.staticBureau();
		bureau1.instanceBureau();
		
	}
}