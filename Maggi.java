class Maggi {

   static  String noodlesName = "Maggi";
   static int price = 10;
      static  String quantity = "70g";
	   static String countryoforigin = "India";
	   static String shelflife = "8 months";
	   static String ingredients[] = {"Refined wheat flour" , "Starch" , "Dehydrated vegetables" , "Carrot bits" , "Green french beans" , "Dehydrated onion"};
  


      public static void main(String[] tasty){

        System.out.println("The name of the noodles" +noodlesName);
		System.out.println("The price of the noodles" +price);
		System.out.println("The quantity of the noodles" +quantity);
		System.out.println("The countryoforigin of the noodles" +countryoforigin);
		System.out.println("The shelflife of the noodles" +shelflife);
		for (String ingredient: ingredients ){
		System.out.println(ingredient);




}



}


}