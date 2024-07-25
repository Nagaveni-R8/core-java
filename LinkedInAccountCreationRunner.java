class LinkedInAccountCreationRunner{

	public static void main(String[] args){
		System.out.println("Main Started");
			boolean LinkedInAccountCreated = LinkedInAccountCreation.createLinkedInAccount("Nisha" , "K R" , "Mysore" , "Bangalore" , 9246805423L , "nisha@gmail.com" , "15-march-2002" , "BE" , "VTU" , "Playing Badminton" , "nisha@2002" , "nisha@2002");
			
			if(LinkedInAccountCreated ==true)
			LinkedInAccountCreation.readUserLinkedInAccountDetails();
		System.out.println("Main Ended");
		
	}
	
}