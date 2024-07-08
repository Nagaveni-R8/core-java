class Mixer{

     public static void main(String grinding[]){
     System.out.println("main started");
     getFeatures();

     System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	 String brandName = "Activa";
	 String color = "Black";
	 String capacity = "2.3 litres";
	 String material = "stainless steel";
	 int price = 1249;
	
	
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the mixer is:" + color);
	 System.out.println("The capacity of mixer in litres is:" + capacity);
	 System.out.println("The material in the mixer is:" + material);
	 System.out.println("The price of the mixer is:" + price);
     System.out.println("get features method ended");


}

}