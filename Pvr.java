class Pvr{
static  double getPrice = 0.0;

public static double getMoviePriceByName(String movieName){
System.out.println("getMoviePriceByName method started");
if(movieName == "MOGGINA MANASU"){
	getPrice = 350.00;  
	return getPrice;
}
if(movieName == "SARRAINODU"){
	getPrice = 375.00;  
	return getPrice;
}
if(movieName == "RACE GURRAM"){
	getPrice =  300.00; 
	return getPrice;
}
if(movieName == "DESAMUDURU"){
	getPrice = 250.00;  
	return getPrice;
}
if(movieName == "BUNNY"){
	getPrice = 300.00;  
	return getPrice;
}
if(movieName == "GANGOTRI"){
	getPrice = 280.00; 
	return getPrice;
}
if(movieName == "ISHQ"){
	getPrice = 345.00;  
	return getPrice;
}
if(movieName == "BADRINATH"){
	getPrice =   300;
	return getPrice;
}
if(movieName == "KGF 2"){
	getPrice =   250;
	return getPrice;
}
if(movieName == "RAJAHULI"){
	getPrice =   400;
	return getPrice;
}
if(movieName == "HAPPY DAYS"){
	getPrice =   450;
	return getPrice;
}
if(movieName == "VARSHAM"){
	getPrice =   390;
	return getPrice;
}
if(movieName == "DARLING"){
	getPrice = 300;  
	return getPrice;
}
if(movieName == "BAHUBALI 1"){
	getPrice =   380;
	return getPrice;
}
if(movieName == "GOOGLY"){
	getPrice =   350;
	return getPrice;
}
if(movieName == "HI NANNA"){
	getPrice = 280;  
	return getPrice;
}
if(movieName == "ARYA 2"){
	getPrice =  200; 
	return getPrice;
}
if(movieName == "GAALIPATA"){
	getPrice = 250;  
	return getPrice;
}
if(movieName == "MIRCHI"){
	getPrice = 350;  
	return getPrice;
}
if(movieName == "GEETHA GOVINDAM"){
	getPrice = 270;  
	return getPrice;
}
else{
	System.out.println("Movie not found");
}
System.out.println("getMoviePriceByName method ended");

return getPrice;
}


}