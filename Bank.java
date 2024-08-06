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
    
	public void displayDetails(){
			
			System.out.println("The Bank Id is " + this.bankId);
			System.out.println("The Bank Name is " + this.bankName);
			System.out.println("The Branch Name is " + this.branchName);
			System.out.println("The IFSC Code is " + this.ifscCode);
			System.out.println("The Swift Code is " + this.swiftCode);
			System.out.println("The Number of worker in the bank is " + this.noOfWorker);
			System.out.println("The Branch Manager Name is " + this.branchManagerName);
			
			
		}
}