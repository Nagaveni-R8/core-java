class Bill{
	
   //Instance Methods/Variables
   
    int billReferenceId;
	int billSequenceNo;
	String billIssueDate;
	String billDueDate;
	boolean isBillPaid;
	boolean isLatestBill;
	boolean isFinalBill;
	double billAmount;
	boolean taxInclusiveBill;
	
	public Bill(){
		
		System.out.println("Bill Object is Created");
		
	}    	//parameters
                    //arguments
					
    public Bill(int billReferenceId, int billSequenceNo, String billIssueDate, String billDueDate, boolean isBillPaid, boolean isLatestBill, boolean isFinalBill, double billAmount, boolean taxInclusiveBill){
		
		this.billReferenceId = billReferenceId;
		this.billSequenceNo = billSequenceNo;
		this.billIssueDate = billIssueDate;
		this.billDueDate = billDueDate;
		this.isBillPaid = isBillPaid;
		this.isLatestBill = isLatestBill;
		this.isFinalBill = isFinalBill;
		this.billAmount = billAmount;
		this.taxInclusiveBill = taxInclusiveBill;
	}	
}