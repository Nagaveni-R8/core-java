class  Bulb{


   public static void main(String args[]){
   System.out.println("main started");
   getFeatures();
   System.out.println("main ended");

   
}
   public static void getFeatures(){
   System.out.println("get features method started");
   
   String brandName = "Philips";
   int price = 300;
   String color = "White";
   int capacity = 200;
   String origin = "India";
   
   System.out.println("The brand name of the bulb is  " + brandName);
   System.out.println("The price of the bulb is " + price);
   System.out.println("The color of  the bulb is " + color);
   System.out.println("The capacity of the bulb is " + capacity );
   System.out.println("The origin of the product is " + origin);
   System.out.println("get features method ended");

   }


}