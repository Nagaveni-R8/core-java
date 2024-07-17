class PvrRunner{

public static void main(String[] movies){

System.out.println("main method started");
String name = "ARYA 2";
double price = Pvr.getMoviePriceByName(name);
System.out.println("The price of the " +name +" is:" +price);

System.out.println("main method started");

}


}