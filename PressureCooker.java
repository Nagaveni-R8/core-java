class PressureCooker{

    public static void main(String cooking[]){
    System.out.println("main started");
    getFeatures();

    System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	 String brandName = "Hawkins";
	 String color = "Silver";
	 String wattage = "1000 watts";
	 String capacity = "3 litres";
	 int price = 2723;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the pressurecooker is:" + color);
	 System.out.println("The wattage of pressurecooker in watts is:" + wattage);
	 System.out.println("The capacity in the pressurecooker is:" + capacity);
	 System.out.println("The price of the pressurecooker is:" + price);
     System.out.println("get features method ended");

}

}