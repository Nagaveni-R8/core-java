class Guitar{

    public static void main(String string[]){
    System.out.println("main started");
    getFeatures();

    System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	 String brandName = "Kadence";
	 String color = "Black";
	 String size = "40 inch";
	 String materialtype = "Rosewood";
	 int price = 5399;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the guitar is:" + color);
	 System.out.println("The size of guitar in inches is:" + size);
	 System.out.println("The materialtype in the guitar is:" + materialtype);
	 System.out.println("The price of the guitar is:" + price);
     System.out.println("get features method ended");

}

}