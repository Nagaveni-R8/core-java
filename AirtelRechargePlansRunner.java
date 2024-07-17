class AirtelRechargePlansRunner{
	
	public static void main(String[] airtel){
    System.out.println("main method started");

    String planName = "Unlimited Calling with 2GB/28 days Data for 336 Days";
    double planPrice = AirtelRechargePlans.getPriceByPlanName(planName);
    System.out.println(planPrice);
    System.out.println("main method ended");

}
}