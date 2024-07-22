class SpotifyAccountGeneration{
	
	static String eml;
	static String setPwd;
	static String nam;
	static String DOB;
	static String gnd;

	public static boolean createAccount(String email , String setPassword , String name , String dateOfBirth , String gender){
		System.out.println("Creating account...");
		
		boolean isAccountCreated = false;
		
		eml = email;
		setPwd = setPassword;
		nam = name;
		DOB = dateOfBirth;
		gnd = gender;
		
		System.out.println("Account created successfully..");
		
		return isAccountCreated = true;
		
	}
	
	public static void readData(){
		
		System.out.println("fetching details...");
		
		System.out.println("The User email is: "+eml);
		
		System.out.println("The User password is: "+setPwd);
		
		System.out.println("The User name is: "+nam);
		
		System.out.println("The User date of birth is: "+ DOB);
		
		System.out.println("The User gender is: "+ gnd);
		
	}
}