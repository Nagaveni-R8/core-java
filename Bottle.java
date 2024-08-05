class Bottle{
 
        String brandName;
		double price;
	
    //Default Constructors	
	
    public Bottle(){
	 
	    System.out.println("Bottle Object is Created");
	
	}
    
	//Parameterized Constructor
	
	public Bottle(String brandName, double price){
		this.brandName = brandName;
		this.price = price;
		
	}
}