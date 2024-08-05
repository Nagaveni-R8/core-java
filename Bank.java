class Bank{

    int bankId;
    String bankName;
	String branchName;
	String ifscCode;
	String swiftCode;
	int noOfWorker;
	String branchManagerName;
	
	//Parameterized Constructor
	
	public Bank(int bankId, String bankName, String branchName, String ifscCode, String swiftCode, int noOfWorker, String branchManagerName){
		
		this.bankId = bankId;
		this.bankName = bankName;
		this.branchName = branchName;
		this.ifscCode = ifscCode;
		this.swiftCode = swiftCode;
		this.noOfWorker = noOfWorker;
		this.branchManagerName = branchManagerName;
		
	}

}