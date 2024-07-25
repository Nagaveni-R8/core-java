class AmazonAccountCreationRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
		boolean amazonAccountCreated = AmazonAccountCreation.createUserAccount("Advika", "Shetty", 9742695867L, "advika@gmail.com", "advi@8354", "advi@8354");
		
		if(amazonAccountCreated == true)
		AmazonAccountCreation.readUserAccountDetails();
		System.out.println("Main Ended");
	
	}
}