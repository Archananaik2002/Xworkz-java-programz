class Carrom
{
 int price;
 int noOfCoin;
 String brand;
 int size;
 int maxPlayers;
 
 Carrom()
 {
	 System.out.println("Invoking no args constructor of carrom");
	 System.out.println(this.price);
	 System.out.println(this.noOfCoin);
	 System.out.println(this.brand);
	 System.out.println(this.size);
	 System.out.println(this.maxPlayers);
 }
 
  Carrom(int price)
 {
	 System.out.println("Invoking int args constructor of carrom");
	 this.price=price;
	 this.noOfCoin=noOfCoin;
	 this.brand=brand;
	 this.size=size;
	 this.maxPlayers=maxPlayers;
 }
   Carrom(int price, int noOfCoin)
 {
	 System.out.println("Invoking int, int args constructor of carrom");
	 this.price=price;
	 this.noOfCoin=noOfCoin;
	 this.brand=brand;
	 this.size=size;
	 this.maxPlayers=maxPlayers;
 }
  Carrom(int price, int noOfCoin, String brand)
 {
	 System.out.println("Invoking int, int , String args constructor of carrom");
	 this.price=price;
	 this.noOfCoin=noOfCoin;
	 this.brand=brand;
	 this.size=size;
	 this.maxPlayers=maxPlayers;
 }
 Carrom(int price, int noOfCoin, String brand, int size)
 {
	 System.out.println("Invoking int, int, String, int args constructor of carrom");
	 this.price=price;
	 this.noOfCoin=noOfCoin;
	 this.brand=brand;
	 this.size=size;
	 this.maxPlayers=maxPlayers;
 }
}