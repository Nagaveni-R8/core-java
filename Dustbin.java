class Dustbin{

     public static void main(String garbage[]){
     System.out.println("main started");
     getFeatures();

     System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	 String brandName = "Mofna";
	 String color = "Silver";
	 String capacity = "7 litres";
	 String material = "Stainless Steel";
	 int price = 860;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the dustbin is:" + color);
	 System.out.println("The capacity of dustbin in litres is:" + capacity);
	 System.out.println("The material in the dustbin is:" + material);
	 System.out.println("The price of the dustbin is:" + price);
     System.out.println("get features method ended");
	 
	 
}

}