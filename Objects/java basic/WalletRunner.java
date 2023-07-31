class WalletRunner
{
	public static void main(String[] args)
	{
		System.out.println("Running WalletRunner in main method");
		Wallet wallet=new Wallet();
		System.out.println("****************************************");
	    System.out.println("WalletRunner price in main method:"+wallet.price);
		System.out.println("WalletRunner brand in main method:"+wallet.brand);
		System.out.println("WalletRunner pattern in main method:"+wallet.pattern);
		System.out.println("****************************************");
		Wallet wallet1=new Wallet();
		System.out.println("WalletRunner price in main method:"+wallet1.price);
		System.out.println("WalletRunner brand in main method:"+wallet1.brand);
		System.out.println("WalletRunner pattern in main method:"+wallet1.pattern);
	}
}