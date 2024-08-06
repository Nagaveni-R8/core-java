class CountryRunner{

    public static void main(String countries[]){ 
	
	    System.out.println("Main Started");
		
	    /*Default constructor
		
		Country ref = new Country();
		
		ref.countryId = 61;
		ref.noOfStates = 6;
		ref.primeMinister = "Anthony Albanese";
		ref.population = "26 million";
		
		System.out.println("Country's generated");
		System.out.println("Country Id of Australia is " + ref.countryId);
		System.out.println("Number of States in Australia is " + ref.noOfStates);
		System.out.println("Prime Minister in Australia is " + ref.primeMinister);
		System.out.println("Population in Australia is " + ref.population);
		
		Country ref1 = new Country();
		
		ref1.countryId = 91;
		ref1.noOfStates = 28;
		ref1.primeMinister = "Narendra Modi";
		ref1.population = "1.45 billion";
		
		System.out.println("Country's generated");
		System.out.println("Country Id of India is " + ref1.countryId);
		System.out.println("Number of States in India is " + ref1.noOfStates);
		System.out.println("Prime Minister in India is " + ref1.primeMinister);
		System.out.println("Population in India is " + ref1.population);
		
		Country ref2 = new Country();
		
		ref2.countryId = 41;
		ref2.noOfStates = 26;
		ref2.primeMinister = "Viola Amherd";
		ref2.population = "8 million";
		
		System.out.println("Country's generated");
		System.out.println("Country Id of SwitzerLand is " + ref2.countryId);
		System.out.println("Number of States in SwitzerLand is " + ref2.noOfStates);
		System.out.println("Prime Minister in SwitzerLand is " + ref2.primeMinister);
		System.out.println("Population in SwitzerLand is " + ref2.population);
		
		Country ref3 = new Country();
		
		ref3.countryId = 86;
		ref3.noOfStates = 23;
		ref3.primeMinister = "Li Qiang";
		ref3.population = "14 million";
		
		System.out.println("Country's generated");
		System.out.println("Country Id of China is " + ref3.countryId);
		System.out.println("Number of States in China is " + ref3.noOfStates);
		System.out.println("Prime Minister in China is " + ref3.primeMinister);
		System.out.println("Population in China is " + ref3.population);
		
		Country ref4 = new Country();
		
		ref4.countryId = 49;
		ref4.noOfStates = 16;
		ref4.primeMinister = "Olaf Scholz";
		ref4.population = "83 million";
		
		System.out.println("Country's generated");
		System.out.println("Country Id of Germany is " + ref4.countryId);
		System.out.println("Number of States in Germany is " + ref4.noOfStates);
		System.out.println("Prime Minister in Germany is " + ref4.primeMinister);
		System.out.println("Population in Germany is " + ref4.population);
		
		Country ref5 = new Country();
		
		ref5.countryId = 94;
		ref5.noOfStates = 25;
		ref5.primeMinister = "Dinesh Gunawardena";
		ref5.population = "21 million";
		
		System.out.println("Country's generated");
		System.out.println("Country Id of Srilanka is " + ref5.countryId);
		System.out.println("Number of States in Srilanka is " + ref5.noOfStates);
		System.out.println("Prime Minister in Srilanka is " + ref5.primeMinister);
		System.out.println("Population in Srilanka is " + ref5.population);
		
		Country ref6 = new Country();
		
		ref6.countryId = 93;
		ref6.noOfStates = 34;
		ref6.primeMinister = "Hasan Akhund";
		ref6.population = "43 million";
		
		System.out.println("Country's generated");
		System.out.println("Country Id of Afghanistan is " + ref6.countryId);
		System.out.println("Number of States in Afghanistan " + ref6.noOfStates);
		System.out.println("Prime Minister in Afghanistan is " + ref6.primeMinister);
		System.out.println("Population in Afghanistan is " + ref6.population);
		
		Country ref7 = new Country();
		
		ref7.countryId = 880;
		ref7.noOfStates = 8;
		ref7.primeMinister = "Sheikh Hasina";
		ref7.population = "169 million";
		
		System.out.println("Country's generated");
		System.out.println("Country Id of Bangladesh is " + ref7.countryId);
		System.out.println("Number of States in Bangladesh is " + ref7.noOfStates);
		System.out.println("Prime Minister in Bangladesh is " + ref7.primeMinister);
		System.out.println("Population in Bangladesh is " + ref7.population);
		
		Country ref8 = new Country();
		
		ref8.countryId = 92;
		ref8.noOfStates = 4;
		ref8.primeMinister = "Shehbaz Sharif";
		ref8.population = "245 million";
		
		System.out.println("Country's generated");
		System.out.println("Country Id of Pakistan is " + ref8.countryId);
		System.out.println("Number of States in Pakistan is " + ref8.noOfStates);
		System.out.println("Prime Minister in Pakistan is " + ref8.primeMinister);
		System.out.println("Population in Pakistan is " + ref8.population);*/
		
		//Parameterized Constructor
		
		/*Country ref = new Country(61, 6, "Anthony Albanese", "26 million");
		
		System.out.println("Country Id of Australia is " + ref.countryId);
		System.out.println("Number of States in Australia is " + ref.noOfStates);
		System.out.println("Prime Minister in Australia is " + ref.primeMinister);
		System.out.println("Population in Australia is " + ref.population);
		
		Country ref1 = new Country(91, 28, "Narendra Modi", "1.45 billion");
		
		System.out.println("Country Id of India is " + ref1.countryId);
		System.out.println("Number of States in India is " + ref1.noOfStates);
		System.out.println("Prime Minister in India is " + ref1.primeMinister);
		System.out.println("Population in India is " + ref1.population);
		
		Country ref2 = new Country(41, 26, "Viola Amherd", "8 million");
		
		System.out.println("Country Id of SwitzerLand is " + ref2.countryId);
		System.out.println("Number of States in SwitzerLand is " + ref2.noOfStates);
		System.out.println("Prime Minister in SwitzerLand is " + ref2.primeMinister);
		System.out.println("Population in SwitzerLand is " + ref2.population);
		
		Country ref3 = new Country(86, 23, "Li Qiang", "14 million");
		
		System.out.println("Country Id of China is " + ref3.countryId);
		System.out.println("Number of States in China is " + ref3.noOfStates);
		System.out.println("Prime Minister in China is " + ref3.primeMinister);
		System.out.println("Population in China is " + ref3.population);
		
		Country ref4 = new Country(49, 16, "Olaf Scholz", "83 million");
		
		System.out.println("Country Id of Germany is " + ref4.countryId);
		System.out.println("Number of States in Germany is " + ref4.noOfStates);
		System.out.println("Prime Minister in Germany is " + ref4.primeMinister);
		System.out.println("Population in Germany is " + ref4.population);
		
		Country ref5 = new Country(94, 25, "Dinesh Gunawardena", "21 million");
		
		System.out.println("Country Id of Srilanka is " + ref5.countryId);
		System.out.println("Number of States in Srilanka is " + ref5.noOfStates);
		System.out.println("Prime Minister in Srilanka is " + ref5.primeMinister);
		System.out.println("Population in Srilanka is " + ref5.population);
		
		Country ref6 = new Country(93, 34, "Hassan Akhund", "43.3 million");
		
		System.out.println("Country Id of Afghanisthan is " + ref6.countryId);
		System.out.println("Number of States in Afghanisthan is " + ref6.noOfStates);
		System.out.println("Prime Minister in Afghanisthan is " + ref6.primeMinister);
		System.out.println("Population in Afghanisthan is " + ref6.population);
		
		Country ref7 = new Country(880, 8, "Sheikh Hasina", "169 million");
		
		System.out.println("Country Id of Afghanisthan is " + ref7.countryId);
		System.out.println("Number of States in Afghanisthan is " + ref7.noOfStates);
		System.out.println("Prime Minister in Afghanisthan is " + ref7.primeMinister);
		System.out.println("Population in Afghanisthan is " + ref7.population);
		
		Country ref8 = new Country(92, 4, "Shehbaz Sharif", "245 million");
	
		System.out.println("Country Id of Afghanisthan is " + ref8.countryId);
		System.out.println("Number of States in Afghanisthan is " + ref8.noOfStates);
		System.out.println("Prime Minister in Afghanisthan is " + ref8.primeMinister);
		System.out.println("Population in Afghanisthan is " + ref8.population);*/
		
		Country ref = new Country(61, 6, "Anthony Albanese", "26 million");
		ref.getDetails();
		Country ref1 = new Country(91, 28, "Narendra Modi", "1.45 billion");
	    ref1.getDetails();
	    Country ref2 = new Country(41, 26, "Viola Amherd", "8 million");
		ref2.getDetails();
		Country ref3 = new Country(86, 23, "Li Qiang", "14 million");
		ref3.getDetails();
		Country ref4 = new Country(49, 16, "Olaf Scholz", "83 million");
		ref4.getDetails();
		Country ref5 = new Country(94, 25, "Dinesh Gunawardena", "21 million");
		ref5.getDetails();
		Country ref6 = new Country(93, 34, "Hassan Akhund", "43.3 million");
		ref6.getDetails();
		Country ref7 = new Country(880, 8, "Sheikh Hasina", "169 million");
		ref7.getDetails();
		Country ref8 = new Country(92, 4, "Shehbaz Sharif", "245 million");
		ref8.getDetails();
		
		System.out.println("Main Ended");
	}		

}