class XworkzRegistrationRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
	    boolean xWorkzRegistered = XworkzRegistration.createXworkzRegistration("Pavithra", 9764268958L, "pavi123@gmail.com", "1SG20IS056", 2024, "Sapthagiri College Of Engineering", "Information Science and Engineering", "BE");
		
		if(xWorkzRegistered  == true)
		XworkzRegistration.readXworkzRegistrationDetails();
		System.out.println("Main Ended");
	
	}
	
}