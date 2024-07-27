import java.util.*;
class Amazon{
	static String  produtNames[] = {null,null,null,null,null,null,null,null,null,null};
	static int start;
		public static boolean addProdutNames(String produtName){
			boolean isProdutNameAdded = false;
			if(start < produtNames.length){
				if(produtName!=null){
					produtNames[start] = produtName;
					start++;
				isProdutNameAdded = true;
				}
				else
				System.out.println("Product Name is invalid");
			}else
				System.out.println("Sorry product name is full");
		return isProdutNameAdded;
		}
		public static void readProdutName(){
			System.out.println("Product Name available are");
			for(String produtName : produtNames){
				System.out.println(produtName);
			}
		}
		public static boolean updateProdutName(String newProdutName , String oldProdutName){
			System.out.println("Update method is Started");
			boolean isUpdateProdutName = false;
			for(int ref=0; ref<produtNames.length;ref++){
				if(produtNames[ref] == oldProdutName){
					produtNames[ref] = newProdutName;
					isUpdateProdutName = true;
				}
			}
			if(isUpdateProdutName==false)
				System.out.println(oldProdutName + "not found");
			System.out.println("Update method is Ended");
		return isUpdateProdutName;
		}
		public static boolean deleteProdutName(String produtName){
			boolean isDeleteProdutName = false;
			int ref , newRef;
			for(ref=0 , newRef=0; ref<produtNames.length; ref++){
				if(produtNames[ref] != produtName){
					produtNames[newRef] = produtNames[ref];
					newRef++;
				}
				else
					isDeleteProdutName = true;
			}
			int newlength = newRef;
			produtNames = Arrays.copyOf(produtNames , newlength);
			
			if(isDeleteProdutName == false){
				System.out.println(produtNames + "not found");
			}
		return isDeleteProdutName;
		}
}

/*import java.util.*; //import java.util.Arrays;
class Amazon{

    static String productNames[] = {null, null, null, null, null, null, null, null, null, null};
	static int start ;
	
	public static boolean createProductName(String productName){
	
	    boolean isProductNameAdded = false ;
		
		isProductNameAdded = validatingProductNameDetails(productName);
		
		return isProductNameAdded ;
	}
	
	public static boolean validatingProductNameDetails(String productName){
	
	    boolean isAllFieldValidated = false ;
		if(start<productNames.length){
		if(productName!=null){
		    productNames[start] = productName ;
			start++ ;
			isAllFieldValidated = true;
		}
		else
		    System.out.println("Product Name is Invalid");
		}else
		    System.out.println("Sorry.. Product Name is not available");
			
		return isAllFieldValidated ;
		
		
		
		}
		
		public static void readProductDetails(){
		    System.out.println("The Product Name is :");
			for(String productName : productNames){
			    System.out.println(productName);
			}
		}
public static boolean updateProdutName(String newProdutName , String oldProdutName){
			System.out.println("Update method is Started");
			boolean isUpdateProdutName = false;
			for(int ref=0; ref<produtNames.length;ref++){
				if(produtNames[ref] == oldProdutName){
					produtNames[ref] = newProdutName;
					isUpdateProdutName = true;
				}
			}
			if(isUpdateProdutName==false)
				System.out.println(oldProdutName + "not found");
			System.out.println("Update method is Ended");
		return isUpdateProdutName;
		}
		public static boolean deleteProdutName(String produtName){
			boolean isDeleteProdutName = false;
			int ref , newRef;
			for(ref=0 , newRef=0; ref<produtNames.length; ref++){
				if(produtNames[ref] != produtName){
					produtNames[newRef] = produtNames[ref];
					newRef++;
				}
				else
					isDeleteProdutName = true;
			}
			int newlength = newRef;
			produtNames = Arrays.copyOf(produtNames , newlength);
            if(isDeleteProdutName == false){
				System.out.println(produtNames + "not found");
			}
		return isDeleteProdutName;
		}


}*/