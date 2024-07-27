import java.util.*;

class MedicalStore{

    static String medicineNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start ;
	
	public static boolean addMedicineName(String medicineName){
	
	    boolean isMedicineNameAdded = false ;
		
		isMedicineNameAdded = validatingMedicineDetails(medicineName);
		
		return isMedicineNameAdded ;
	}
	
	public static boolean validatingMedicineDetails(String medicineName){
	
	    boolean isAllFieldValidated = false ;
		if(start<medicineNames.length){
		if(medicineName!=null){
		    medicineNames[start] = medicineName ;
			start++ ;
			isAllFieldValidated = true;
		}
		else
		    System.out.println("Medicine Name is Invalid");
		}else
		    System.out.println("Sorry.. Medicines are not available");
			
		return isAllFieldValidated ;
		
		}
		
		public static void readMedicineDetails(){
		    System.out.println("The Required Medicines are :");
			for(String medicineName : medicineNames){
			    System.out.println(medicineName);
			}
		}

        public static boolean updateMedicineName(String newMedicineName, String oldMedicineName){
			boolean isMedicineNameUpdated = false;
			for(int position = 0; position<medicineNames.length; position++){
				if(medicineNames[position] == oldMedicineName){
					medicineNames[position] = newMedicineName;
					isMedicineNameUpdated = true;
				}
			}
			if(isMedicineNameUpdated == false){
				System.out.println(oldMedicineName + " not found");
			}
			return isMedicineNameUpdated;
				
		}
		public static boolean deleteMedicineName(String medicineName){
			boolean isMedicineNameDeleted = false;
			int position, newPosition;
			for(position=0, newPosition=0; position<medicineNames.length; position++){
				if(medicineNames[position] != medicineName){
					medicineNames[position] = medicineNames[position];
					newPosition++;
				}
				else
					isMedicineNameDeleted = true;
			}
			int newLength = newPosition;
			medicineNames = Arrays.copyOf(medicineNames, newLength);
			
			if(isMedicineNameDeleted == false){
				System.out.println(medicineName + " not found");
			}
			return isMedicineNameDeleted;
		}


}