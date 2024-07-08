class AppamMaker{

    public static void main(String cooking[]){
    System.out.println("main started");
    getFeatures();

    System.out.println("main ended");

}

    public static  void getFeatures(){
    System.out.println("get features method started");
	
	 
	 String brandName = "Cello";
	 String color = "Grey";
	 String capacity = "1 litre";
	 String material = "stainless steel";
	 int price = 549;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the appammaker is:" + color);
	 System.out.println("The capacity of appammaker in litres is:" + capacity);
	 System.out.println("The material in the appammaker is:" + material);
	 System.out.println("The price of the appammaker is:" + price);
     System.out.println("get features method ended");

	 
}

}