import java.util.*;
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
        
		public static boolean updatealcoholNames(String newAlcohoName , String oldAlcoholName){
			System.out.println("Update method is Started");
			boolean isUpdateAlcoholNames = false;
			for(int ref=0; ref<alcoholNames.length;ref++){
				if(alcoholNames[ref] == oldAlcoholName){
					alcoholNames[ref] = newAlcohoName;
					isUpdateAlcoholNames = true;
				}
			}
			if(isUpdateAlcoholNames==false)
				System.out.println(oldAlcoholName + "not found");
			System.out.println("Update method is Ended");
		return isUpdateAlcoholNames;
		}
		public static boolean deletealcoholNames(String alcoholName){
			boolean isDeleteAlcoholName = false;
			int ref , newRef;
			for(ref=0 , newRef=0; ref<alcoholNames.length; ref++){
				if(alcoholNames[ref] != alcoholName){
					alcoholNames[newRef] = alcoholNames[ref];
					newRef++;
				}
				else
					isDeleteAlcoholName = true;
			}
			int newlength = newRef;
			alcoholNames = Arrays.copyOf(alcoholNames , newlength);
			
			if(isDeleteAlcoholName == false){
				System.out.println(alcoholNames + "not found");
			}
		return isDeleteAlcoholName;
		}
		/*public static boolean updateAlcoholName(String newAlcoholName, String oldAlcoholName){
			boolean isAlcoholNameUpdated = false;
			for(int position = 0 ; position<alcoholNames.length; position++){
				if(alcoholNames[position] == oldAlcoholName){
					alcoholNames[position] = newAlcoholName;
					isAlcoholNameUpdated = true;
				}
			}
			if(isAlcoholNameUpdated == false){
				System.out.println(alcoholNames + " not found");
			}
			return isAlcoholNameUpdated ;
		}
		
		public static boolean deleteAlcoholName(String alcoholName){
			boolean isAlcoholNameDeleted = false;
			int position, newPosition;
			for(position=0, newPosition=0; position<alcoholNames.length; position++){
				if(alcoholNames[position] != alcoholName){
					alcoholNames[position] = alcoholNames[position];
					newPosition++;
				}
				else
					isAlcoholNameDeleted = true;
			}
			int newLength = newPosition;
			alcoholNames = Arrays.copyOf(alcoholNames, newLength);
			
			if(isAlcoholNameDeleted == false){
				System.out.println(alcoholName + " not found");
			}
			return isAlcoholNameDeleted;
		}

		public static boolean deleteAlcoholName(String alcoholName){
			boolean isAlcoholNameDeleted = false;
			int position, newPosition;
			for(position=0, newPosition=0; position<alcoholNames.length; position++){
				if(alcoholNames[position]!=null){
					alcoholNames[position] = alcoholNames[position];
					newPosition++;
				}
				else
					isAlcoholNameDeleted = true;
				
			}
			int newLength = newPosition;
			alcoholNames = Arrays.copyOf(alcoholNames, newLength);
			
			if(isAlcoholNameDeleted = true){
				System.out.println(alcoholName + " not found");
			}
			return isAlcoholNameDeleted;
		}*/

	
}