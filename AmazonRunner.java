class AmazonRunner{

    public static void main(String[] products){
	
	    boolean productAdded = Amazon.createProductName("Refrigerator");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Wallets");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Clothes");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Grocery");
		System.out.println("Product Name added " + productAdded);
		
	    productAdded = Amazon.createProductName("MicroOven");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Jewelry");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Cookware Sets");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Mobile Phones");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Kitchen Appliances");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Iron Box");
		System.out.println("Product Name added " + productAdded);
		
		productAdded = Amazon.createProductName("Furniture");
		System.out.println("Product Name added " + productAdded);
		
		Amazon.readProductDetails();
		
		
	
	}

}