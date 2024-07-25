class LoanApplicationCreationRunner{

    public static void main(String[] loan){
	
	    System.out.println("Main Started");
		boolean loanApplicationCreated = LoanApplicationCreation.createLoanApplication(750, "Personal Loan", "Devika", "Karnataka Bank", 20, 2);
	    
		    if(loanApplicationCreated == true)
		     LoanApplicationCreation.readLoanApplicantsDetails();
		 
		System.out.println("Main Ended");
		
	
	}




}