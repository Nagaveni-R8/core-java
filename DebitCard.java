class DebitCard{

    int cardId;
	String cardHolderName;
	long cardNo;
	String expDate;
	int cvv;
	
	//Parameterized Constructor
	
	public DebitCard(int cardId, String cardHolderName, long cardNo, String expDate, int cvv){
		
		this.cardId = cardId;
		this.cardHolderName = cardHolderName;
		this.cardNo = cardNo;
		this.expDate = expDate;
		this.cvv = cvv;
		
	}
	
	public void displayDetails(){
			
			System.out.println("The Card Id is " + this.cardId);
			System.out.println("The Card Holder Name is " + this.cardHolderName);
			System.out.println("The Card Number is " + this.cardNo);
			System.out.println("The Card Expiry Date is " + this.expDate);
			System.out.println("The Card CVV is " + this.cvv);
			
		}

}