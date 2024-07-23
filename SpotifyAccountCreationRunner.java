class SpotifyAccountCreationRunner{

    public static void main(String[] spotify){
	
	    System.out.println("Main Started");
		boolean spotifyAccountCreated = SpotifyAccountCreation.createSpotifyAccount("Hamsini", "hamsi@7532", "hamsi@gmail.com", "hamsi@gmail.com", "08/05/2002");
	    
		    if(spotifyAccountCreated == true)
		     SpotifyAccountCreation.readSpotifyAccountDetails();
		 
		System.out.println("Main Ended");
		
	
	}

}