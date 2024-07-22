class FlipkartAccountGeneration{

static String uName;
static String eml;
static long uNumber;
static String pwd;
static String reEnterPwd;

public static boolean createUserAccount(String name , String email , long phoneNumber , String password , String reEnterPassword){

 boolean isAccountCreated = false;
 
 uName = name;
 eml = email;
 uNumber = phoneNumber;
 pwd = password;
 reEnterPwd = reEnterPassword;
 
 isAccountCreated = true;
 
 System.out.println("The user account is created : " + isAccountCreated);
 
 return isAccountCreated;

}

public static void readUserDetails(){

System.out.println("Fetching user details..");

System.out.println("The name of the User is : " + uName);

System.out.println("The User email id is : " + eml);

System.out.println("The User phone number is : " + uNumber);

System.out.println("The password entered by the User is : " + pwd);

System.out.println("The reentered password by the User is :" + reEnterPwd);



}


}