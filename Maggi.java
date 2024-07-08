class Maggi {

       public static void main(String[] tasty){
		  
	   System.out.println("main started");
		  
       String noodlesName = "Maggi";
       int price = 10;
       String quantity = "70g";
	   String countryoforigin = "India";
       String shelflife = "8 months";
	   String ingredients[] = {"Refined wheat flour" , "Starch" , "Dehydrated vegetables" , "Carrot bits" , "Green french beans" , "Dehydrated onion"};
  


      

        System.out.println("The name of the noodles brand is" + noodlesName);
		System.out.println("The price of the noodles is" + price);
		System.out.println("The quantity of the noodles is" + quantity);
		System.out.println("The countryoforigin of the noodles is" + countryoforigin);
		System.out.println("The shelflife of the noodles is" + shelflife);
		System.out.println("The ingredients of the noodles are" + ingredients);
		
		
        System.out.println("The available ingredients are:");
        for(String ingredient:ingredients){
        System.out.println(ingredient);




}

         System.out.println("main ended");

}


}