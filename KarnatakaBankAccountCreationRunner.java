class KarnatakaBankAccountCreationRunner{

    public static void main(String[] args){
	
	    System.out.println("Main Started");
	    boolean karnatakaBankAccountCreated = KarnatakaBankAccountCreation.createBankAccount("Pranitha", "Shetty", 942145326578L, "Indian", 7963706209L, "Mysore");
		
		if(karnatakaBankAccountCreated == true)
		KarnatakaBankAccountCreation.readBankAccountDetails();
		System.out.println("Main Ended");
	
	}
}