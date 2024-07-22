class Netflix{

	static String eml;
	static String pwd;
	static String fName;
	static String lName;
	static long cnumber;
	static String eDate;
	static int CVV;

	//Create Operation
	public static boolean createAccount(String email , String password , String firstName , String lastName , long cardnumber , String expiryDate , int cvv){
		System.out.println("Creating account...");
		
		boolean isAccountCreated = false;
		
		eml = email;
		pwd = password;
		fName = firstName;
		lName = lastName;
		cnumber = cardnumber;
		eDate = expiryDate;
		CVV = cvv;
		
		System.out.println("Account created successfully..");
		
		return isAccountCreated;
	}
	
	public static void readUserDetails(){
	
		System.out.println("fetching User details...");
		
		System.out.println("The User email is:" + eml);
		
		System.out.println("The User password:"+ pwd);
		
		System.out.println("The User first name:" + fName);
		
		System.out.println("The User lastname:" + lName);
		
		System.out.println("The User card number:" + cnumber);
		
		System.out.println("The User expiry date:" + eDate);
		
		System.out.println("The User cvv:" + CVV);
		
	}
}