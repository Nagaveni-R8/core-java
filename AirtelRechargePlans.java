class AirtelRechargePlans{

static double  getPrice = 0.0;

public static double  getPriceByPlanName(String planName){

System.out.println("return getPriceForPlans method started");
if (planName == "1GB/day")	 return getPrice= 299;
	
if (planName == "3GB/day") return getPrice = 1798;

if (planName == "100MB/day + 200MB")	 return getPrice= 91;
	
if (planName == "2GB Data 28 Days") return getPrice = 359;
	
if (planName == "6GB Data 84 Days") return getPrice = 459;
	
if (planName == "1GB/day Data 28 Days") 	return getPrice = 122;

if (planName == "1.5GB/Day Data 56 Days") return getPrice = 699;

if (planName == "0.5GB/day") 	return getPrice = 152;

if (planName == "Annual IR Pack 2GB") return getPrice = 2799 ;

if (planName == "1.5GB/Day Data for 28 Days Pack")	return getPrice = 239;

if (planName == "1.5GB/day Data for 56 Days Pack")	return getPrice = 479;

if (planName == "1GB/Day Data for 24 Days Pack") return getPrice = 179;
	
if (planName == "2GB/Day + 20GB Data for 90 Days Pack") return getPrice = 899;

if (planName == "Unlimited Calling with 2GB/28 days Data for 336 Days")	return getPrice = 895;

if (planName == "1.5GB/Day Data for 28 Days Pack")	return getPrice =  249;

else{
	System.out.println("Plan not found");
}
	


System.out.println("return getPriceForPlans method ended");
 return getPrice;

}


}