class CandleRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running main in CandleRunner");
		
		Candle candle= new Candle(500, "Birthday PArty");
		Candle.staticCandle();
		candle.instanceCandle();
		System.out.println("***********************");
		Candle candle1= new Candle(800, "Wedding Anniversary PArty");
		Candle.staticCandle();
		candle1.instanceCandle();
		
	}
}