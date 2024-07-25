class JuiceShopRunner{

    public static void main(String[] juiceShop){
	
	    System.out.println("main started");
		
		boolean juiceAdded = JuiceShop.addJuiceName("Garnet Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Plum Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Cherry Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Raspberry Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Kiwi Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Pear Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Strawberry Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Pinapple Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		JuiceShop.showJuiceDetails();
		
		System.out.println("main ended");
	
	}

}