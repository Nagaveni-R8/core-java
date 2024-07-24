class KarnatakaBankAccountCreation{
        
	    static String givenName ;
		static String midName ;
		static long AadNo ;
		static String nation ;
		static long phNumber ;
		static String addrs ;
		
    public static boolean createBankAccount(String firstName, String middleName, long AadhaarNumber, String nationality, long mobileNumber, String permanentAddress){
	
	     boolean isBankAccountCreated = false ;
		 boolean isFirstNameValid = false ;
		 boolean isMiddleNameValid = false ;
		 boolean isAadhaarNumberValid = false ;
		 boolean isNationalityValid = false ;
		 boolean isMobileNumberValid = false ;
		 boolean isPermanentAddressValid = true ;
		 
		 if(firstName != null){
			givenName = firstName ;
			isFirstNameValid = true ;
		 }
		 else
			 System.out.println("First Name is Invalid");
		 
		 if(middleName != null){
			  midName = middleName ;
			  isMiddleNameValid = true ;
		 }
		 else
			System.out.println("Middle Name Invalid");
		
		if(AadhaarNumber != 0){
		 AadNo = AadhaarNumber ;
		 isAadhaarNumberValid = true ;
		}
		else
			System.out.println("Aadhaar Number Invalid");
		
		if(nationality != null){
           nation = nationality ;
		   isNationalityValid = true ;
		}
		else
			System.out.println("Nationality is Invalid");
		 
        if(mobileNumber != 0.0){
		 phNumber = mobileNumber ;
		 isMobileNumberValid = true ;
		}
		else
			System.out.println("Mobile Number Invalid");
		
		if(permanentAddress != null){
		 addrs = permanentAddress ;
         isPermanentAddressValid = true ;		 
		}
		else
			System.out.println("Permanent Address Invalid");
		
		 isBankAccountCreated = true ;
		 
		 return isBankAccountCreated ;
	
	}
    
	public static void readBankAccountDetails(){
	
	    System.out.println("fetching... Student Details...");
		
		System.out.println("The Customer First Name is :" + givenName);
		
		System.out.println("The Customer Middle Name is :" + midName);
		
		System.out.println("The Customer Aadhaar Number is :" + AadNo);
		
		System.out.println("The Customer Nationality is :" +nation);
		
		System.out.println("The Customer Mobile Number is :" + phNumber);
		
		System.out.println("The Customer Permanent Address is :" + addrs);
		
		
	
	}
}