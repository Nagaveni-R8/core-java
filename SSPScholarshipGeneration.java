class SSPScholarshipGeneration{
        
	    static long adNo ;
		static String givenName ;
		static String surName ;
		static long iD ;
		static String pwd ;
		static String confirmPwd ;
		static long phNumber ;
		static String rel ;
		static String cat ;
		static String DOB ;
		static String emlId ;
		static String tlk ;
		static String dist ;                         
		static String confirmCpt ;
		
		
	//Create Operation
    public static boolean createStudentScholarship(long aadhaarNumber, String firstName, String lastName, long userID, String password, String confirmPassword, long mobileNumber, String religion, String category, String dateOfBirth, String email, String taluk, String district, String captcha){
	
	    boolean isScholarshipGenerated = false ;
		
		    adNo = aadhaarNumber ;
			givenName = firstName ;
			surName = lastName;
			iD = userID ;
			pwd = password ;
			confirmPwd = confirmPassword ;
			phNumber = mobileNumber ;
			rel = religion ;
			cat = category ;
			DOB = dateOfBirth ;
			emlId = email ;
			tlk = taluk ;
			dist = district ;
		    confirmCpt = captcha ;
			
			isScholarshipGenerated = true ;
		
		
		
		
		
		return isScholarshipGenerated;
	}
    
	public static void readStudentScholarshipDetails(){
		
		 
		System.out.println("fetching... Student Details...");
		
		System.out.println("The Student Aadhaar Number is :" + adNo);
		
		System.out.println("The Student First Name is :" + givenName);
		
        System.out.println("The Student Last Name is :" + surName);
		
        System.out.println("The Student User Id is :" + iD);
		
        System.out.println("The Student User Password is :" + pwd);
		
		System.out.println("The Student User Confirm Password is :" + confirmPwd);
		
		System.out.println("The Student Phone Number is :" + phNumber);
		
		System.out.println("The Student Religion is :" + rel);
		
		System.out.println("The Student Category is:" + cat);
		
		System.out.println("The Student Date of Birth is :" + DOB);
		
		System.out.println("The Student email Id is :" + emlId);
		
		System.out.println("The Student Taluk is :" + tlk);
		
		System.out.println("The Student District is :" + dist);
		
		System.out.println("The Student Scholarship Captcha is :" + confirmCpt);
		
		
	}
}