class Binocular{

      public static void main(String optics[]){
      System.out.println("main started");
      getFeatures();

      System.out.println("main ended");

}

       public static  void getFeatures(){
       System.out.println("get features method started");
	 
	   String brandName = "Pie Matrix";
	   String color = "Black";
	   String modelname = "Phoenix";
	   String length = "700 millimeters";
	   int price = 9599;
	 
	   System.out.println("The brand name is:" + brandName);
	   System.out.println("The color of the binocular is:" + color);
	   System.out.println("The modelname of binocular is:" + modelname);
	   System.out.println("The length in the binocular in millimeters is:" + length);
	   System.out.println("The price of the binocular is:" + price);
       System.out.println("get features method ended");

}

}