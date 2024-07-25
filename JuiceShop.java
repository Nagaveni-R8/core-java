class JuiceShop{

    static String juiceNames[] = {null, null, null, null, null, null};
	static int start ;
	
    public static boolean addJuiceName(String juiceName){
	
	    boolean isJuiceNameAdded = false;
	    
		isJuiceNameAdded = validatingJuiceDetails(juiceName);
		
	    return isJuiceNameAdded ;
		
	}
	
	public static boolean validatingJuiceDetails(String juiceName){
		
		boolean isAllFieldValidated = false;
	    
		if(start<juiceNames.length){
	    if(juiceName != null){
	        juiceNames[start] = juiceName ;
			start++ ;
			isAllFieldValidated = true ;
	    }
		else
		    System.out.println("Juice Name is Invalid");
		}else
			System.out.println("Sorry... Juice Name is full");
		
		
		return isAllFieldValidated ;
	}
	
	public static void showJuiceDetails(){
	
	    System.out.println("The Juice are available:");
		for(String juiceName : juiceNames){
		    System.out.println(juiceName);
		}
	}

}