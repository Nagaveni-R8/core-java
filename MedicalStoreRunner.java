class MedicalStoreRunner{

    public static void main(String[] medicines){
	
	    boolean medicinesAdded = MedicalStore.addMedicineName("Wellbutrin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Phytonadione");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Clindamycin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Bacitracin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Enzalutamide");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Nicardipine");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Levofloxacin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Silodosin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Omeprazol");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Raloxifene");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Glycerin");
		System.out.println("Medicines added " + medicinesAdded);
		
		
		
		MedicalStore.readMedicineDetails();
		
		
	
	}

}