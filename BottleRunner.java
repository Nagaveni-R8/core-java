class BottleRunner{

    public static void main(String tupperWare[]){
	    
		//object creation
	    //default constructor
		/*Bottle ref = new Bottle();
		ref.brandName = "Bisleri";
		ref.price = 100.00;
		System.out.println("The Bottle Brand Name is " + ref.brandName);
		System.out.println("The Bottle Price is " + ref.price);
		
		Bottle ref1 = new Bottle();
		ref1.brandName = "Milton";
		ref1.price = 120.89;
		System.out.println("The Bottle Brand Name is " + ref1.brandName);
		System.out.println("The Bottle Price is " + ref1.price);
		
		Bottle ref2 = new Bottle();
		ref2.brandName = "Tupper Ware";
		ref2.price = 200.00;
		System.out.println("The Bottle Brand Name is " + ref2.brandName);
		System.out.println("The Bottle Price is " + ref2.price);
		
		Bottle ref3 = new Bottle();
		ref3.brandName = "Cello";
		ref3.price =50.00;
		System.out.println("The Bottle Brand Name is " + ref3.brandName);
		System.out.println("The Bottle Price is " + ref3.price);
		
		Bottle ref4 = new Bottle();
		ref4.brandName = "Himalayas";
		ref4.price = 199.00;
		System.out.println("The Bottle Brand Name is " + ref4.brandName);
		System.out.println("The Bottle Price is " + ref4.price);*/
		
		//OR (we can use both the methods)
		//parameterized constructor
		Bottle ref = new Bottle("Bisleri", 100.00);
		System.out.println("The Bottle Brand Name is " + ref.brandName);
		System.out.println("The Bottle Price is " + ref.price);
		
		Bottle ref1 = new Bottle("Milton", 120.89);
		System.out.println("The Bottle Brand Name is " + ref1.brandName);
		System.out.println("The Bottle Price is " + ref1.price);
		
		Bottle ref2 = new Bottle("Tupper Ware", 200.00);
		System.out.println("The Bottle Brand Name is " + ref2.brandName);
		System.out.println("The Bottle Price is " + ref2.price);
		
		Bottle ref3 = new  Bottle("Cello", 50.00);
		System.out.println("The Bottle Brand Name is " + ref3.brandName);
		System.out.println("The Bottle Price is " + ref3.price);
		
		Bottle ref4 = new Bottle("Himalayas", 199.00);
		System.out.println("The Bottle Brand Name is " + ref4.brandName);
		System.out.println("The Bottle Price is " + ref4.price);
		
		
	}

}