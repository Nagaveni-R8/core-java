class NandiniParlour{

public static double getProductPriceByName(String milkProductName){

System.out.println("getProductPriceByName method started");
double getPrice = 0.0 ;

if(milkProductName == "Quark"){
	getPrice = 40.00;
	return getPrice;
}
if(milkProductName == "Swiss Cheese 1kg"){
	getPrice = 400.00;
	return getPrice;
}
if(milkProductName == "Curd 1kg"){
	getPrice = 20.00;
	return getPrice;
}
if(milkProductName == "Condensed Milk"){
	getPrice = 75.00;
	return getPrice;
}
if(milkProductName == "Ghee"){
	getPrice = 40.00;
	return getPrice;
}
if(milkProductName == "Butter"){
	getPrice = 450.00;
	return getPrice;
}
if(milkProductName == "Yogurt"){
	getPrice = 30.00;
	return getPrice;
}
if(milkProductName == "Gelato"){
	getPrice = 40.00;
	return getPrice;
}
if(milkProductName == "Kefir"){
	getPrice = 20.00;
	return getPrice;
}
if(milkProductName == "Paneer"){
	getPrice = 450.00;
	return getPrice;
}

else{
	System.out.println("Milk Product Name doesn't found");
}


System.out.println("getProductPriceByName method ended");
return getPrice;

}


}