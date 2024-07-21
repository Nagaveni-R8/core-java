class FlightInfo{

public static double getFlightPriceByDestinationName(String destinationName){
	System.out.println("getFlightPriceByDestinationName method started");
	double  getPrice = 0.0;
	
if(destinationName == "Shimla")  return getPrice = 2095.00;  

if(destinationName == "Ooty")  return getPrice = 1260.00;  

if(destinationName == "Manali")  return getPrice = 3034.00;  

if(destinationName == "Dandeli")  return getPrice = 1543.00; 
 
if(destinationName == "Thailand")  return getPrice = 2174.00;  

if(destinationName == "Kuwait")  return getPrice = 2249;  

if(destinationName == "Malaysia")  return getPrice = 2300;  

if(destinationName == "Dharmasthala")  return getPrice = 1384.00; 
 
if(destinationName == "Maldives")  return getPrice = 2647.00;  

if(destinationName == "Scotland")  return getPrice = 2799.00;  

if(destinationName == "Ayodhya")  return getPrice = 28109.00; 
 
if(destinationName == "Canada")  return getPrice = 45549.00;  

if(destinationName == "Tirupati")  return getPrice = 2941.00; 
 
if(destinationName == "Mantralayam")  return getPrice =3229.00;  

if(destinationName == "Annavaram")  return getPrice =3013.00;  

if(destinationName == "Guntur")  return getPrice = 3643.00;  

if(destinationName == "Anantapur")  return getPrice = 3644.00;  

if(destinationName == "Chittoor")  return getPrice = 3853.00;  

if(destinationName == "Lepakshi")  return getPrice =3749.00;  
	
if(destinationName == "Srisailam")  return getPrice = 3899.00;  

if(destinationName == "Rajahmundry")  return getPrice = 3999.00;  
	
	else{
	System.out.println("Destination not found");
	}
	System.out.println("getFlightPriceByDestinationName method ended");
	return getPrice;
}


}