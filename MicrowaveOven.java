class MicrowaveOven{

    public static void main(String heating[]){
    System.out.println("main started");
    getFeatures();

    System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	
	 String brandName = "Panasonic";
	 String color = "Black Mirror";
	 String capacity = "23 litres";
	 String wattage = "800 watts";
	 int price = 10290;
	
	
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the microwaveoven is:" + color);
	 System.out.println("The capacity of microwaveoven in litres is:" + capacity);
	 System.out.println("The wattage in the microwaveoven in watts is:" + wattage);
	 System.out.println("The price of the microwaveoven is:" + price);
     System.out.println("get features method ended");

}

}