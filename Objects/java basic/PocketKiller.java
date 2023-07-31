class PocketKiller
{
	public static void main(String[] args){
		System.out.println("Running main in PocketKiller");
		
		Pocket pocket=new Pocket();
		Pocket pocket1=new Pocket();
		
		System.out.println("Pocket Name is:"+pocket.pocketName);
		System.out.println("Pocket Type is:"+pocket.pocketType);
		System.out.println("Pocket Fabric is:"+pocket.pocketFabric);
		System.out.println("Pocket size:"+pocket.sizeInInch);
		System.out.println("Pocket price is:"+pocket.priceOfPocket);
		
		System.out.println("***************************************************");

	
		pocket1.pocketName="Accordion Pocket";
		pocket1.pocketType="Patch Pocket";
		pocket1.pocketFabric="Lightweight woven cotton";
		pocket1.sizeInInch=5;
		pocket1.priceOfPocket=890;
		
		System.out.println("Pocket Name is:"+pocket1.pocketName);
		System.out.println("Pocket Type is:"+pocket1.pocketType);
		System.out.println("Pocket Fabric is:"+pocket1.pocketFabric);
		System.out.println("Pocket size:"+pocket1.sizeInInch);
		System.out.println("Pocket price is:"+pocket1.priceOfPocket);
		
		
	}
}