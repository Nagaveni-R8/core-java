class MedicalStoreRunner{

    public static void main(String[] medicines){
	
	    boolean medicinesAdded = MedicalStore.addMedicineName("Vincristine");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Methotrexate");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Albuterol");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Etoposide");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Morphine");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Warfarine");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Digoxin");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Citalopram");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Lidocaine");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Omeprazol");
		System.out.println("Medicines added " + medicinesAdded);
		
		medicinesAdded = MedicalStore.addMedicineName("Docetaxel");
		System.out.println("Medicines added " + medicinesAdded);
		
		
		
		MedicalStore.readMedicineDetails();
		
		boolean medicineNameUpdated = MedicalStore.updateMedicineName("Paclitaxel","Citalopram");
		System.out.println("medicineNameUpdated" + medicineNameUpdated);
		
		MedicalStore.readMedicineDetails();
		
		boolean medicineNameDeleted = MedicalStore.deleteMedicineName("Omeprazol");
		System.out.println("medicineNameDeleted" + medicineNameDeleted);
		
		
		MedicalStore.readMedicineDetails();
		
		
	
	}

}