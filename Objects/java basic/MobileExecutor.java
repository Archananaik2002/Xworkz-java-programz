class Mobile
{
	static void storeData()
	{
		System.out.println("1.Mobile stores data...");
	}
	static void sendMessage()
	{
		System.out.println("2.Mobile send Messages...");
	}
	static void answerCalls()
	{
		System.out.println("3.Mobile answers calls");
	}
	static void recieveMsgs()
	{
		System.out.println("4.Mobile recieve messages");
	}
	static void update()
	{
		System.out.println("5.Mobile updates...");
	}
	static void playMusic()
	{
		System.out.println("6.Mobile play musics...");
	}
	static void playMovies()
	{
		System.out.println("7.Mobile play Movies...");
	}
	static void clickPhotos()
	{
		System.out.println("8.Mobile click photos...");
	}
	static void delete()
	{
		System.out.println("9.Mobile deletes...");
	}
	static void dialNumbers()
	{
		System.out.println("10.Mobile dial numbers...");
	}
	static void charge()
	{
		System.out.println("11.Mobile charges");
	}
	static void readMsgs()
	{
		System.out.println("12.Mobile read messages...");
	}
	static void playGames()
	{
		System.out.println("13.Mobile play games...");
	}
	static void makePayment()
	{
		System.out.println("14.Mobile make payment");
	}
	static void watchReels()
	{
		System.out.println("15.Mobile watch reels");
	}
	static void deleteMsgs()
	{
		System.out.println("16.Mobile delete messages");
	}
	static void reboot()
	{
		System.out.println("17.Mobile reboots");
	}
	static void restart()
	{
		System.out.println("18.Mobile restarts");
	}
	static void changePassword()
	{
		System.out.println("19.Mobile change passwords");
	}
	static void calculate()
	{
		System.out.println("20.Mobile calculates");
	}
	static void shop()
	{
		System.out.println("21.Mobile shops...");
	}
	
}

class MobileExecutor{
	public static void main(String[] args)
	{
		System.out.println("MobileExecutor running in main method..");
		
		//method invoking in main method
		
		Mobile.storeData();
		Mobile.sendMessage();
		Mobile.answerCalls();
		Mobile.recieveMsgs();
		Mobile.update();
		Mobile.playMusic();
		Mobile.playMovies();
		Mobile.clickPhotos();
		Mobile.delete();
		Mobile.dialNumbers();
		Mobile.charge();
		Mobile.readMsgs();
		Mobile.playGames();
		Mobile.makePayment();
		Mobile.watchReels();
		Mobile.deleteMsgs();
		Mobile.reboot();
		Mobile.restart();
		Mobile.changePassword();
		Mobile.calculate();
		Mobile.shop();
		
	}
}