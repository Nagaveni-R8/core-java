class MRPStore{

    static String alcoholNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start ;
	
	public static boolean addAlcoholName(String alcoholName){
	
	    boolean isAlcoholNameAdded = false ;
		
		isAlcoholNameAdded = validatingAlcoholDetails(alcoholName);
		
		return isAlcoholNameAdded ;
	}
	
	public static boolean validatingAlcoholDetails(String alcoholName){
	
	    boolean isAllFieldValidated = false ;
		if(start<alcoholNames.length){
		if(alcoholName!=null){
		    alcoholNames[start] = alcoholName ;
			start++ ;
			isAllFieldValidated = true;
		}
		else
		    System.out.println("Alcohol Name is Invalid");
		}else
		    System.out.println("Sorry.. That Alcohol is not available");
			
		return isAllFieldValidated ;
		
		}
		
		public static void readAlcoholDetails(){
		    System.out.println("The Alcohols are available :");
			for(String alcoholName : alcoholNames){
			    System.out.println(alcoholName);
			}
		}




}