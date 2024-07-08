class Refrigerator{

     public static void main(String cooling[]){
     System.out.println("main started");
     getFeatures();

     System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	
	
	 String brandName = "Haier";
	 String color = "Brushline Silver";
	 String capacity = "325 litres";
	 String energystar = "3 star";
	 int price = 34990;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the refrigerator is:" + color);
	 System.out.println("The capacity of refrigerator in litres is:" + capacity);
	 System.out.println("The energystar in the refrigerator is:" + energystar);
	 System.out.println("The price of the refrigerator is:" + price);
     System.out.println("get features method ended");


}

}