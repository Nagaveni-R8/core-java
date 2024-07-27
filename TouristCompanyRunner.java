class TouristCompanyRunner{

    public static void main(String[] places){
	
	    boolean touristPlaceAdded = TouristCompany.addTouristPlaceName("Shimla");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Coorg");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Kashmir");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Shillong");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Darjeeling");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Ooty");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Rishikesh");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Kodaikanal");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Delhi");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Pondicherry");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Gokarna");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		
		
		TouristCompany.readTouristPlacesDetails();
		
		
	
	}

}