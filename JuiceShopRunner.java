import java.util.*;

class JuiceShopRunner{

    public static void main(String[] juiceShop){
	
	    System.out.println("main started");
		
		boolean juiceAdded = JuiceShop.addJuiceName("Sugarcane Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Papaya Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Grape Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Mango Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Kiwifruit Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Cherry Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Lemon Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		juiceAdded = JuiceShop.addJuiceName("Blueberry Juice");
		System.out.println("Juice Name added " + juiceAdded);
		
		JuiceShop.showJuiceDetails();
		
		boolean juiceNameUpdated = JuiceShop.updateJuiceName("Spinach Juice" , "Grape Juice");
		System.out.println("Juice Name Updated " + juiceNameUpdated);
		
		JuiceShop.showJuiceDetails();
		
		boolean juiceNameDeleted = JuiceShop.deleteJuiceName("Sugarcane Juice");
		System.out.println("Juice Name Deleted " + juiceNameDeleted);
		
		JuiceShop.showJuiceDetails();
		
		System.out.println("main ended");
	
	}

}