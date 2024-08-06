class SocialMedia{

    int socialMediaId;
	String socialMediaName;
	String profileName;
	String emailId;

    //Parameterized Constructor
	
    public SocialMedia(int socialMediaId, String socialMediaName, String profileName, String emailId){
		
		this.socialMediaId = socialMediaId;
		this.socialMediaName = socialMediaName;
		this.profileName = profileName;
		this.emailId = emailId;
		
	}
	
	public void readDetails(){
		
		System.out.println("The Social Media Id is " + this.socialMediaId);
		System.out.println("The social Media Name is " + this.socialMediaName);
		System.out.println("The Social Media Profile Name  is " + this.profileName);
		System.out.println("The Social Media Email Id is " + this.emailId);
		
		
		
		
	}
	
}