class Candles{

    public static void main(String light[]){
    System.out.println("main started");
    getFeatures();

    System.out.println("main ended");

}

    public static  void getFeatures(){
    System.out.println("get features method started");
	 
	 String brandName = "Welburn";
	 String color = "White";
	 int weightInGrams = 8;
	 int noOfItems = 100;
	 int price = 379;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the candles is:" + color);
	 System.out.println("The weight of candles in grams is:" + weightInGrams);
	 System.out.println("The number of items in the candle is:" + noOfItems);
	 System.out.println("The price of the candle is:" + price);
     System.out.println("get features method ended");


}

}