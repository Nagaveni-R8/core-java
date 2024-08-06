class DebitCardRunner{

    public static void main(String debit[]){
	
	    System.out.println("Main Started");
		
		/*Default Constructor
		
		DebitCard card = new DebitCard();
		card.cardId = 680909;
		card.cardHolderName = "Ashika";
		card.cardNo = 5677890932145678L;
		card.expDate = "12/08/2025";
		card.cvv = 567 ;
		
		System.out.println("Debit Card is Generated");
		System.out.println("Debit Card Id is " + card.cardId);
		System.out.println("Debit Card Holder Name is " + card.cardHolderName);
		System.out.println("Debit Card Number is " + card.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card.expDate);
		System.out.println("Debit Card Verification Value is " + card.cvv);
		
		DebitCard card1 = new DebitCard();
		card1.cardId = 798066;
		card1.cardHolderName = "Chinmay";
		card1.cardNo = 6578709433211345L;
		card1.expDate = "25/06/2025";
		card1.cvv = 123 ;
		
		System.out.println("Debit Card is Generated");
		System.out.println("Debit Card Id is " + card1.cardId);
		System.out.println("Debit Card Holder Name is " + card1.cardHolderName);
		System.out.println("Debit Card Number is " + card1.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card1.expDate);
		System.out.println("Debit Card Verification Value is " + card1.cvv);
		
		DebitCard card2 = new DebitCard();
		card2.cardId = 62458;
		card2.cardHolderName = "Preetam";
		card2.cardNo = 4567234509876548L;
		card2.expDate = "28/12/2025";
		card2.cvv = 908 ;
		
		System.out.println("Debit Card is Generated");
		System.out.println("Debit Card Id is " + card2.cardId);
		System.out.println("Debit Card Holder Name is " + card2.cardHolderName);
		System.out.println("Debit Card Number is " + card2.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card2.expDate);
		System.out.println("Debit Card Verification Value is " + card2.cvv);
		
		DebitCard card3 = new DebitCard();
		card3.cardId = 5687;
		card3.cardHolderName = "Avani";
		card3.cardNo = 6362707518636096L;
		card3.expDate = "08/05/2025";
		card3.cvv = 781 ;
		
		System.out.println("Debit Card is Generated");
		System.out.println("Debit Card Id is " + card3.cardId);
		System.out.println("Debit Card Holder Name is " + card3.cardHolderName);
		System.out.println("Debit Card Number is " + card3.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card3.expDate);
		System.out.println("Debit Card Verification Value is " + card3.cvv);
		
		DebitCard card4 = new DebitCard();
		card4.cardId = 634271;
		card4.cardHolderName = "Chandan";
		card4.cardNo = 6360961244996428L;
		card4.expDate = "22/06/2026";
		card4.cvv = 398 ;
		
		System.out.println("Debit Card is Generated");
		System.out.println("Debit Card Id is " + card4.cardId);
		System.out.println("Debit Card Holder Name is " + card4.cardHolderName);
		System.out.println("Debit Card Number is " + card4.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card4.expDate);
		System.out.println("Debit Card Verification Value is " + card4.cvv);
		
		DebitCard card5 = new DebitCard();
		card5.cardId = 76785;
		card5.cardHolderName = "Pavithra";
		card5.cardNo = 9964285658546289L;
		card5.expDate = "12/10/2026";
		card5.cvv = 458 ;
		
		System.out.println("Debit Card is Generated");
		System.out.println("Debit Card Id is " + card5.cardId);
		System.out.println("Debit Card Holder Name is " + card5.cardHolderName);
		System.out.println("Debit Card Number is " + card5.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card5.expDate);
		System.out.println("Debit Card Verification Value is " + card5.cvv);
		
		DebitCard card6 = new DebitCard();
		card6.cardId = 45579;
		card6.cardHolderName = "Arya";
		card6.cardNo = 4567321890765434L;
		card6.expDate = "01/09/2026";
		card6.cvv = 324 ;
		
		System.out.println("Debit Card is Generated");
		System.out.println("Debit Card Id is " + card6.cardId);
		System.out.println("Debit Card Holder Name is " + card6.cardHolderName);
		System.out.println("Debit Card Number is " + card6.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card6.expDate);
		System.out.println("Debit Card Verification Value is " + card6.cvv);
		
		DebitCard card7 = new DebitCard();
		card7.cardId = 68980;
		card7.cardHolderName = "Bindu";
		card7.cardNo = 4678876521225439L;
		card7.expDate = "05/02/2026";
		card7.cvv = 743 ;
		
		System.out.println("Debit Card is Generated");
		System.out.println("Debit Card Id is " + card7.cardId);
		System.out.println("Debit Card Holder Name is " + card7.cardHolderName);
		System.out.println("Debit Card Number is " + card7.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card7.expDate);
		System.out.println("Debit Card Verification Value is " + card7.cvv);
		
		DebitCard card8 = new DebitCard();
		card8.cardId = 47658;
		card8.cardHolderName = "Kiran";
		card8.cardNo = 6543332178907654L;
		card8.expDate = "02/03/2027";
		card8.cvv = 884 ;
		
		System.out.println("Debit Card is Generated");
		System.out.println("Debit Card Id is " + card8.cardId);
		System.out.println("Debit Card Holder Name is " + card8.cardHolderName);
		System.out.println("Debit Card Number is " + card8.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card8.expDate);
		System.out.println("Debit Card Verification Value is " + card8.cvv);*/
		
		//Parameterized Constructor
		
		/*DebitCard card = new DebitCard(680909, "Ashika", 5137261764656893L, "12/04/2024", 567);
		
		System.out.println("Debit Card Id is " + card.cardId);
		System.out.println("Debit Card Holder Name is " + card.cardHolderName);
		System.out.println("Debit Card Number is " + card.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card.expDate);
		System.out.println("Debit Card Verification Value is " + card.cvv);
		
		DebitCard card1 = new DebitCard(523741, "Chinmay", 4567231234567898L, "04/05/2022", 123);
		
		System.out.println("Debit Card Id is " + card1.cardId);
		System.out.println("Debit Card Holder Name is " + card1.cardHolderName);
		System.out.println("Debit Card Number is " + card1.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card1.expDate);
		System.out.println("Debit Card Verification Value is " + card1.cvv);
		
		DebitCard card2 = new DebitCard(472361, "Preetam", 5655433456678876L, "09/10/2025", 632);
		
		System.out.println("Debit Card Id is " + card2.cardId);
		System.out.println("Debit Card Holder Name is " + card2.cardHolderName);
		System.out.println("Debit Card Number is " + card2.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card2.expDate);
		System.out.println("Debit Card Verification Value is " + card2.cvv);
		
		DebitCard card3 = new DebitCard(1574787, "Avani", 5566779988112234L, "22/11/2026", 988);
		
		System.out.println("Debit Card Id is " + card3.cardId);
		System.out.println("Debit Card Holder Name is " + card3.cardHolderName);
		System.out.println("Debit Card Number is " + card3.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card3.expDate);
		System.out.println("Debit Card Verification Value is " + card3.cvv);
		
		DebitCard card4 = new DebitCard(571672, "Chandan", 6673829893098712L, "25/12/2023", 675);
		
		System.out.println("Debit Card Id is " + card4.cardId);
		System.out.println("Debit Card Holder Name is " + card4.cardHolderName);
		System.out.println("Debit Card Number is " + card4.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card4.expDate);
		System.out.println("Debit Card Verification Value is " + card4.cvv);
		
		DebitCard card5 = new DebitCard(34762, "Pavithra", 7745321123454889L, "29/06/2024", 156);
		
		System.out.println("Debit Card Id is " + card5.cardId);
		System.out.println("Debit Card Holder Name is " + card5.cardHolderName);
		System.out.println("Debit Card Number is " + card5.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card5.expDate);
		System.out.println("Debit Card Verification Value is " + card5.cvv);
		
		DebitCard card6 = new DebitCard(4678896, "Arya", 8856743234568912L, "31/08/2028", 999);
		
		System.out.println("Debit Card Id is " + card6.cardId);
		System.out.println("Debit Card Holder Name is " + card6.cardHolderName);
		System.out.println("Debit Card Number is " + card6.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card6.expDate);
		System.out.println("Debit Card Verification Value is " + card6.cvv);
		
		DebitCard card7 = new DebitCard(76532, "Bindu", 7843643093214532L, "27/02/2029", 776);
		
		System.out.println("Debit Card Id is " + card7.cardId);
		System.out.println("Debit Card Holder Name is " + card7.cardHolderName);
		System.out.println("Debit Card Number is " + card7.cardNo);
		System.out.println("Expiry Date of Debit Card is " + card7.expDate);
		System.out.println("Debit Card Verification Value is " + card7.cvv);*/
		
		DebitCard card = new DebitCard(680909, "Ashika", 5137261764656893L, "12/04/2024", 567);
		card.displayDetails();
		DebitCard card1 = new DebitCard(523741, "Chinmay", 4567231234567898L, "04/05/2022", 123);
		card1.displayDetails();
		DebitCard card2 = new DebitCard(472361, "Preetam", 5655433456678876L, "09/10/2025", 632);
		card2.displayDetails();
		DebitCard card3 = new DebitCard(1574787, "Avani", 5566779988112234L, "22/11/2026", 988);
		card3.displayDetails();
	    DebitCard card4 = new DebitCard(571672, "Chandan", 6673829893098712L, "25/12/2023", 675);
		card4.displayDetails();
		DebitCard card5 = new DebitCard(34762, "Pavithra", 7745321123454889L, "29/06/2024", 156);
		card5.displayDetails();
		DebitCard card6 = new DebitCard(4678896, "Arya", 8856743234568912L, "31/08/2028", 999);
		card6.displayDetails();
		DebitCard card7 = new DebitCard(76532, "Bindu", 7843643093214532L, "27/02/2029", 776);
		card7.displayDetails();
		
		System.out.println("Main Ended");
		
		
	}

}