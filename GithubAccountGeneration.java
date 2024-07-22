class GithubAccountGeneration{
        
		static String eml ;
		static String pwd ;
		static String givenName ;
		static boolean pdt ;
		static int code ;
		
    public static boolean createUserAccount(String emailId, String password, String userName, boolean productUpdates, int launchCode){
	
	     boolean isGithubAccountGenerated = false ;
		 
		 eml = emailId ;
		 pwd = password ;
		 givenName = userName ;
		 pdt = productUpdates ;
		 code = launchCode ;
		 
		 isGithubAccountGenerated = true ;
		 
		 return isGithubAccountGenerated ;
	
	}
    
	public static void readUserAccountDetails(){
	
	    System.out.println("fetching... User Details...");
		
		System.out.println("The User email address is :" + eml);
		
		System.out.println("The User Password is :" + pwd);
		
		System.out.println("The User Name is :" + givenName);
		
		System.out.println("The User Product Update is :" + pdt);
		
		System.out.println("The User email sent the launch code is :" + code);
	
	}
}