class GrubhubRunner{

public static void main(String[] food){
System.out.println("main started");
String name = "California Benedict";
int noOfQuantity = 2;

double price = Grubhub.searchPriceByFoodNames(name , noOfQuantity);
System.out.println("The price of" +name +" is:" +price);
System.out.println("main ended");

}

}