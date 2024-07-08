class LedTv{

    public static void main(String display[]){
    System.out.println("main started");
    getFeatures();

    System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	 String brandName = "Acer";
	 String color = "Black";
	 String size = "32 inches";
	 String display = "Led";
	 int price = 13499;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the ledtv is:" + color);
	 System.out.println("The size of ledtv in inches is:" + size);
	 System.out.println("The display in the ledtv is:" + display);
	 System.out.println("The price of the ledtv is:" + price);
     System.out.println("get features method ended");


}

}