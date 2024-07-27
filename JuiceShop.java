import java.util.*;

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
	
	public static boolean updateJuiceName(String newJuiceName, String oldJuiceName){
		System.out.println("Update Operation Started");
		boolean isJuiceNameUpdated = false;
		for(int position=0; position<juiceNames.length; position++){
			if(juiceNames[position] == oldJuiceName){
				juiceNames[position] = newJuiceName;
				isJuiceNameUpdated = true;
			}
			if(isJuiceNameUpdated == false){
				System.out.println(oldJuiceName + " not found");
			}
		}
			System.out.println("Update Operations Ended");
			return isJuiceNameUpdated;
		
	}
	
	public static boolean deleteJuiceName(String juiceName){
			boolean isDeleteJuiceName = false;
			int ref , newRef;
			for(ref=0 , newRef=0; ref<juiceNames.length; ref++){
				if(juiceNames[ref] != juiceName){
					juiceNames[newRef] = juiceNames[ref];
					newRef++;
				}
				else
					isDeleteJuiceName = true;
			}
			int newlength = newRef;
			juiceNames = Arrays.copyOf(juiceNames,newlength);
		
			if(isDeleteJuiceName == false){
				System.out.println(juiceNames + "not found");
			}
		return isDeleteJuiceName;
		}


}