class KitchenStool{

    public static void main(String sitting[]){
    System.out.println("main started");
    getFeatures();

    System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	 String brandName = "Astride";
	 String color = "Brown";
	 String height = "24 inches";
	 String material = "metal";
	 int price = 3199;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the kitchenstool is:" + color);
	 System.out.println("The height of kitchenstool in inches is:" + height);
	 System.out.println("The material in the kitchenstool is:" + material);
	 System.out.println("The price of the kitchenstool is:" + price);
     System.out.println("get features method ended");

	 
}

}