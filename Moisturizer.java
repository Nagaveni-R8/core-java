class Moisturizer{

     public static void main(String lakme[]){
     System.out.println("main started");
     getFeatures();

     System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	 String brandName = "Lakme";
	 String color = "White";
	 String itemform = "cream";
	 String scent = "peach";
	 int price = 999;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the moisturizer is:" + color);
	 System.out.println("The itemform of moisturizer is:" + itemform);
	 System.out.println("The scent in the moisturizer is:" + scent);
	 System.out.println("The price of the moisturizer is:" + price);
     System.out.println("get features method ended");

}

}