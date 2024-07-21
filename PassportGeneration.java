class PassportGeneration{


  static String cpvLoc;
  static String dcdrLoc;
  static String givNam;
  static String surNam;
  static String DB;
  static String eml;
  static boolean logeml;
  static String logId;
  static String	pwd;
  static String	confirmPwd;
  static String hQue;
  static String	hAns;
  static String cpt;
  
  
  //Create Operation
  public static boolean createUserPassport(String cpvLocation , String dcdrLocation , String givenName , String surName , String DOB , String email , boolean islogInEmail , String  logInId , String password , String confirmPassword , String hintQues , String hintAns , String captcha){
  
         boolean isPassportCreated = false;
  
          cpvLoc = cpvLocation;
          dcdrLoc = dcdrLocation;
		  givNam = givenName;
		  surNam = surName;
		  DB = DOB;
		  eml = email;
		  logeml = islogInEmail;
		  logId = logInId;
		  pwd = password;
		  confirmPwd = confirmPassword;
		  hQue = hintQues;
		  hAns = hintAns;
          cpt = captcha;
		  
        
         return isPassportCreated;
  
  
  }
   

   
   public static void readUserPassportDetails(){
   System.out.println("fetching user details...");
   
   System.out.println("The User cpvLocation is" + cpvLoc);
   
  
   System.out.println("The User dcdrLocation is" + dcdrLoc);
   
   
   System.out.println("The User givenName is" + givNam);
   
   
   System.out.println("The User surName is" + surNam);
   
   
   System.out.println("The User DOB is" + DB);
   
   
   System.out.println("The User email is" + eml);
   
   
   System.out.println("The User logInEmail is" + logeml);
   
  
   System.out.println("The User loginId is" + logId);
   
   
   System.out.println("The User password is" + pwd);
   
   
   System.out.println("The User confirmPassword is" + confirmPwd);
   
   
   System.out.println("The User hintQue is" + hQue);
   
   
   System.out.println("The User hintAns is" + hAns);
   
   
   System.out.println("The User captcha is" + cpt);
   
  
   }
  
}

