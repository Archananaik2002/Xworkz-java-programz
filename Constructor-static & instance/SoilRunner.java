class SoilRunner{
	public static void main(String[] args){
		System.out.println("Running main in SoilRunner");
		
		Soil soil=new Soil("Clay","Orange");
		Soil.staticSoil();
		soil.instanceSoil();
		
		System.out.println("##################################");
		Soil soil1=new Soil("Silt","Gray");
		Soil.staticSoil();
		soil1.instanceSoil();
		
	}
}