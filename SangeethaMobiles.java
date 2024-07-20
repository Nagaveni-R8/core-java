class SangeethaMobiles{

   static double price ;
   
    public static double getMobilePriceByBrand(String mobileName){
 
    
    System.out.println("getPrice method started");
	
    if(mobileName ==  "OnePlus Nord CE4 Lite 5G"){
    price = 1999900.00;
	return price;
 }
 
    if(mobileName ==  "Samsung Galaxy S24 Ultra 5G AI Smartphone"){
	 price = 159999.00;
	 return price;
 }
 
    if(mobileName ==  "Redmi 13C"){
	 price = 8499.00;
	 return price;
 }
    
    if(mobileName ==  "Realme NARZO N63"){
	 price = 8499.00;
	 return price;
 }
 
    if(mobileName ==  "POCO C65"){
	 price = 6999.00;
	 return price;
 }
 
    if(mobileName ==  "Nokia G42 5G"){
	 price = 9999.00;
	 return price;
 }
 
    if(mobileName ==  "Motorola Edge 50 Fusion 5G"){
	 price = 26069.00;
	 return price;
 }
 
    if(mobileName ==  "Redmi 12 5G Pastel Blue"){
	 price = 13999.00;
	 return price;
 }
 
    if(mobileName ==  "Lava Storm 5G"){
	 price = 11999.00;
	 return price;
 }
 
    if(mobileName ==  "Xiaomi 14"){
	 price = 69999.00;
	 return price;
 }
 
    if(mobileName ==  "Oppo A79 5G"){
	 price = 17499.00;
	 return price;
 }
 
    if(mobileName ==  "iQOO Z6 Lite 5G"){
	 price = 15499.00;
	 return price;
 }
 
    if(mobileName ==  "Tecno Phantom X2 5G Moonlight Silver"){
	 price = 23998.00;
	 return price;
 }
 
    if(mobileName ==  "Lava Blaze 5G"){
	 price = 9299.00;
	 return price;
 }
 
    if(mobileName ==  "HONOR X9b 5G"){
	 price = 21999.00;
	 return price;
 }
 
   else{
	System.out.println("The Mobile Name is Not found");
}

    System.out.println("getPrice method ended");
    return price;

}


}