class MRPStoreRunner{

    public static void main(String[] alcohols){
	
	    boolean alcoholsAdded = MRPStore.addAlcoholName("Bailey");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Cider");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Gin");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Whiskey");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Beer");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Vodka");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Tequila");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Sambuca");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Kingfisher");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Cocktail");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Liqueurs");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		
		MRPStore.readAlcoholDetails();
		
		
	
	}

}