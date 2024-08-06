class Country{

    int countryId;
	int noOfStates;
	String primeMinister;
	String population;
	
	//Parameterized Constructor
	
	public Country(int countryId, int noOfStates, String primeMinister, String population){
		
		this.countryId = countryId;
		this.noOfStates = noOfStates;
		this.primeMinister = primeMinister;
		this.population = population;
		
	}
    
	public void getDetails(){
			
			System.out.println("The Country Id is " + this.countryId);
			System.out.println("The Number of States is " + this.noOfStates);
			System.out.println("The Prime Minister is " + this.primeMinister);
			System.out.println("The Population is " + this.population);
			
	}
}