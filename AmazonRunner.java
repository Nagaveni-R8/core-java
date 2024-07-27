class AmazonRunner{

	public static void main(String[] args){
	
		System.out.println("Main Started");
		
		boolean produtAdded = Amazon.addProdutNames("Electronics");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Cameras");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Airpods");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Tablets");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Routers");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Kichen Appliances");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Power Banks");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Furnitures");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Groceries");
		System.out.println("Product names added " +produtAdded);
		
		produtAdded = Amazon.addProdutNames("Handbags");
		System.out.println("Product names added " +produtAdded);
		
		Amazon.readProdutName();
		
		boolean produtUpdate = Amazon.updateProdutName("Cameras" , "Printers");
		System.out.println("Product Name is updated" + produtUpdate);
		
		Amazon.readProdutName();
		
		boolean produtDelete = Amazon.deleteProdutName("Furnitures");
		System.out.println("Product Name is Deleted" +produtDelete);
		
		Amazon.readProdutName();
		
		
		System.out.println("Main Ended");
	}
}
