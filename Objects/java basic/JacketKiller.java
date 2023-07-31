class JacketKiller{
	public static void main(String[] args){
		System.out.println("Running main in JacketKiller");
		
		Jacket jacket=new Jacket();
		Jacket jacket1=new Jacket();
		
		System.out.println(jacket.name);
		System.out.println(jacket.size);
		System.out.println(jacket.brand);
		System.out.println(jacket.noOfPockets);
		System.out.println(jacket.jacketFor);
	
        System.out.println("********************************************"); 
		
		System.out.println(jacket1.name);
		System.out.println(jacket1.size);
		System.out.println(jacket1.brand);
		System.out.println(jacket1.noOfPockets);
		System.out.println(jacket1.jacketFor);
		
		System.out.println("********************************************"); 
		
		jacket.name="Leather Jacket";
		jacket.size=22;
		jacket.brand="Jockey";
		jacket.noOfPockets=6;
		jacket.jacketFor="men";
		
		System.out.println(jacket.name);
		System.out.println(jacket.size);
		System.out.println(jacket.brand);
		System.out.println(jacket.noOfPockets);
		System.out.println(jacket.jacketFor);
		
		
	}
}