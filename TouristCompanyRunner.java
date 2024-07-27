class TouristCompanyRunner{

    public static void main(String[] places){
	
	    boolean touristPlaceAdded = TouristCompany.addTouristPlaceName("Wayanad");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Hampi");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Goa");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Darjeeling");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Charminar");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Manipur");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Visakhapatnam");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Tripura");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Meghalaya");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Shimla");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		touristPlaceAdded = TouristCompany.addTouristPlaceName("Tirupati");
		System.out.println("Tourist places added " + touristPlaceAdded);
		
		TouristCompany.readTouristPlacesDetails();
		
		 boolean touristPlaceNameUpdated = TouristCompany .updateTouristPlaces("Kashmir", "Manipur");
		System.out.println("Tourist Place Names added" + touristPlaceNameUpdated);
		
		TouristCompany.readTouristPlacesDetails();
		
		boolean touristPlaceNameDeleted = TouristCompany.deleteTouristPlaces("Tripura");
		System.out.println("touristPlaceNameDeleted " + touristPlaceNameDeleted);
		
		TouristCompany.readTouristPlacesDetails();
		
		
	
	}

}