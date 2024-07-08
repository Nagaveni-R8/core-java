class Bed{

    public static void main(String sleeping[]){
    System.out.println("main started");
    getFeatures();

    System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 String brandName = "Wakefit";
	 String color = "Brown";
	 String weight = "92 kilograms";
	 String finishtype = "matte";
	 int price = 11698;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the bed is:" + color);
	 System.out.println("The weight of bed in kilograms is:" + weight);
	 System.out.println("The finishtype in the bed is:" + finishtype);
	 System.out.println("The price of the bed is:" + price);
     System.out.println("get features method ended");

}

}