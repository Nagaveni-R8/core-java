class SpotifyAccountCreation{
        
	    static String givenName ;
		static String password ;
		static String emailId ;
		static String confirmEmailId ;
		static String dateOfBirth ;
		static String gender ;
		
    public static boolean createSpotifyAccount(String userName, String pwd, String email, String confirmEmail, String dob, String sex){
	
	    boolean isSpotifyAccountCreated = false ;
		boolean isUserNameValid = false ;
		boolean isPwdValid = false ;
		boolean isEmailValid = false ;
		boolean isConfirmEmailValid = false ;
		boolean isDobValid = false ;
		boolean isSexValid = false ;
		
		//validation  //  null check 
		    if(userName != null){
			    givenName = userName ;
				isUserNameValid = true ;
			}
			else
			    System.out.println("User Name Invalid");
				
			if(pwd != null){
			    password = pwd ;
				isPwdValid = true ;
			}
			else 
			    System.out.println("Password Invalid");
				
			if(email != null){
			    emailId = email ;
				isEmailValid = true ;
			}
			else 
			    System.out.println("Email Id Invalid");
				
			if(confirmEmail != null){
			    confirmEmailId = confirmEmail ;
				isConfirmEmailValid = true ;
			}
			else
			    System.out.println("Confirm Email Id Invalid");
				
			if(dob != null){
			    dateOfBirth = dob ;
				isDobValid = true ;
			}
			else
			    System.out.println("Date of Birth is Invalid");
			
			if(sex != null){
			    gender = sex ;
				isSexValid = true ;
			}
			else
			    System.out.println("Sex Invalid");
		    
			
			if(isUserNameValid == true && isPwdValid == true && isEmailValid == true && isConfirmEmailValid == true && isDobValid == true && isSexValid == true)
			isSpotifyAccountCreated = true ;
		
		
		return isSpotifyAccountCreated;
	}
    
	public static void readSpotifyAccountDetails(){
		
		 
		System.out.println("fetching... User Details...");
		
		System.out.println("The Spotify userName is :" + givenName);
		
		System.out.println("The Spotify User Password is :" + password);
		
		System.out.println("The Spotify User Email is :" + emailId);
		
		System.out.println("The Spotify User Confirm Email  is :" + confirmEmailId);
		
		System.out.println("The Spotify User Date of Birth is :" + dateOfBirth);
	
	    System.out.println("The Spotify User gender is :" + gender);
		
		
	}
}