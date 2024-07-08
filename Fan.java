class Fan{

      public static void main(String air[]){
      System.out.println("main started");
      getFeatures();

      System.out.println("main ended");

}

      public static  void getFeatures(){
      System.out.println("get features method started");
	 
	 String brandName = "Atomberg";
	 String color = "Snow White";
	 String wattage = "35 watts";
	 String design = "ceiling fan";
	 int price = 4654;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the fan is:" + color);
	 System.out.println("The wattage of fan in watts is:" + wattage);
	 System.out.println("The design in the fan is:" + design);
	 System.out.println("The price of the fan is:" + price);
     System.out.println("get features method ended");

	 
}

}