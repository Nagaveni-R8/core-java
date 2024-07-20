class MenulogRunner{

public static void main(String[] food){
	System.out.println("main method started");
 String itemNames = "Cast Iron Turkey Burger";
 int noOfQuantity = 2;
 
 int foodPrice = Menulog.priceOfFood(itemNames,noOfQuantity);
 System.out.println("The price of " +itemNames +" is:" +foodPrice);
	
	System.out.println("main method ended");
	
	
}

}