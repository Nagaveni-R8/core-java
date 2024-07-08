class Tap{

     public static void main(String plumbing[]){
     System.out.println("main started");
     getFeatures();

     System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	 String brandName = "Alton";
	 String color = "Silver";
	 String handletype = "lever";
	 String finishtype = "chrome";
	 int price = 1498;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the tap is:" + color);
	 System.out.println("The handletype of tap is:" + handletype);
	 System.out.println("The finishtype in the tap is:" + finishtype);
	 System.out.println("The price of the tap is:" + price);
     System.out.println("get features method ended");


}

}