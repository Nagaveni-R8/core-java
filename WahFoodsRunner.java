class WahFoodsRunner{

    public static void main(String[] food){
	System.out.println("main method started");
    String itemNames = "WJW SPL Biriyani";
    int noOfQuantity = 2;
 
    int foodPrice = WahFoods.priceOfFood(itemNames,noOfQuantity);
    System.out.println("The price of " +itemNames +" is:" +foodPrice);
	
	System.out.println("main method ended");
	
	
}

}