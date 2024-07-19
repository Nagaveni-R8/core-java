class YummyHouseRunner{

public static void main(String[] food){
System.out.println("main started");
String name = "Szechuan Shrimp";
int noOfQuantity = 4;
double foodCost = YummyHouse.getPrice(name, noOfQuantity);
System.out.println("The price of " +name +" is:" +foodCost);
System.out.println("main ended");
}

}