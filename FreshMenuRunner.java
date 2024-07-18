class FreshMenuRunner{

public static void main(String[] appetizers){
System.out.println("main started");
String name = "Lemongrass Chicken Stirfry";
int noOfQuantity = 5;
int foodCost = FreshMenu.priceOfFood(name,noOfQuantity);
System.out.println("The price of " +name +" is:" +foodCost);
System.out.println("main ended");
}

}