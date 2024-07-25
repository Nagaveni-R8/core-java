class SpotifyAccountCreationRunner{

    public static void main(String[] spotify){
	
	    System.out.println("Main Started");
		boolean SpotifyAccountCreated = SpotifyAccountCreation.createSpotifyAccount("Hamsini", "hamsi@7532", "hamsi@gmail.com", "hamsi@gmail.com", "08/05/2002", "Female");
	    
		    if(SpotifyAccountCreated == true)
		     SpotifyAccountCreation.readSpotifyAccountDetails();
		 
		System.out.println("Main Ended");
		
	
	}

}	