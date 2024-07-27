class MRPStoreRunner{

    public static void main(String[] alcohols){
	
	    boolean alcoholsAdded = MRPStore.addAlcoholName("Cognac");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Absinthe");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Tequila");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Rum");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Vodka");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Safari");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Ricard");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Martini");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Kingfisher");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Scotch");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		alcoholsAdded = MRPStore.addAlcoholName("Cider");
		System.out.println("Alcohols added " + alcoholsAdded);
		
		
		MRPStore.readAlcoholDetails();
		
		boolean alcoholNamesUpdate = MRPStore.updatealcoholNames("Whiskey" , "Absinthe");
		System.out.println("Alcohol Name is updated" + alcoholNamesUpdate);
		
		MRPStore.readAlcoholDetails();
		
		boolean alcoholNamesDelete = MRPStore.deletealcoholNames("Martini");
		System.out.println("Alcohol Name is Deleted" +alcoholNamesDelete);
		
		MRPStore.readAlcoholDetails();
		
		/*boolean alcoholNameUpdated = MRPStore.updateAlcoholName("Beer" , "Safari");
		System.out.println("alcoholNameUpdated" + alcoholNameUpdated);
		
		MRPStore.readAlcoholDetails();
		
		boolean alcoholNameDeleted = MRPStore.deleteAlcoholName("Rum");
		System.out.println("alcoholNameDeleted" + alcoholNameDeleted);
		
		MRPStore.readAlcoholDetails();*/
		
		
		
		
	
	}

}