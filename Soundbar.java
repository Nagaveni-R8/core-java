class Soundbar{

    public static void main(String sound[]){
    System.out.println("main started");
    getFeatures();

    System.out.println("main ended");

}

     public static  void getFeatures(){
     System.out.println("get features method started");
	 
	 
	 String brandName = "Govo";
	 String color = "Platinum Black";
	 String outputpower = "16 watts";
	 String mountingtype = "Tabletop";
	 int price = 1000;
	 
	 
	 System.out.println("The brand name is:" + brandName);
	 System.out.println("The color of the soundbar is:" + color);
	 System.out.println("The outputpower of soundbar in watts is:" + outputpower);
	 System.out.println("The mountingtype in the soundbar is:" + mountingtype);
	 System.out.println("The price of the soundbar is:" + price);
     System.out.println("get features method ended");


}

}