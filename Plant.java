class Plant{

    public static void main(String gardening[]){
    System.out.println("main started");
    getFeatures();

     System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	 String brandName = "PlantaZee";
	 String color = "White";
	 String weight = "500 grams";
	 String materialtype = "organic";
	 int price = 106;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the plant is:" + color);
	 System.out.println("The weight of plant in kilograms is:" + weight);
	 System.out.println("The materialtype in the plant is:" + materialtype);
	 System.out.println("The price of the plant is:" + price);
     System.out.println("get features method ended");

}

}