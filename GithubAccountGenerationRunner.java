class GithubAccountGenerationRunner{

    public static void main(String[] githubaccount){
	
	    System.out.println("Main Started");
		
		GithubAccountGeneration.createUserAccount("Abhi@gmail.com","abhi@8753","Abhishek", true, 230845);
		
		GithubAccountGeneration.readUserAccountDetails();
		
		System.out.println("Main Ended");
	
	}
}