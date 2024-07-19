class WahFoods{

 static int foodPrice;
 
public static int priceOfFood(String foodName){
	
System.out.println("priceOfFood method started");
if(foodName == "Smashed Potato Puchka")	return foodPrice =79;
	
if(foodName == "Foozy Orange Krush") return foodPrice =36;
	
if(foodName == "Dahi Vada")	return foodPrice =38;
	
if(foodName == "Spice Currant Puchka")	return foodPrice =31;
	
if(foodName == "Roasted litti kolkata flavour") return foodPrice =31;
	
if(foodName == "Dahi Papdi Chaat")	return foodPrice =196;
	
if(foodName == "Kolkata Jhuri Puchka")	return foodPrice =84;

if(foodName == "Roasted litti and dahi vada")	return foodPrice =34;

if(foodName == "Chocolate Puchka")return foodPrice =132;
	
if(foodName == "Roasted litti") return foodPrice =42;
	
if(foodName == "Blue Bae Krush")	return foodPrice =84;
	
if(foodName == "Roasted litti with chola matar")	return foodPrice =121;
	
if(foodName == "Wah Special Aloo Kaabli")	return foodPrice =153;
	
if(foodName == "Kolkata Jhuri Puchka")	return foodPrice =173;
	
if(foodName == "Butter Cheese Corn Puchka") return foodPrice =46;
	
if(foodName == "Roasted garlic litti")	return foodPrice =93;

if(foodName == "Mohe Mint Krush")   return foodPrice =91;
	
if(foodName == "Roasted litti with potato chokha")	return foodPrice =67;
	
if(foodName ==  "Roasted litti with mohe mint krusher")	return foodPrice =121;
	
if(foodName == "Spicy Churmur Chaat") return foodPrice =75;
	
if(foodName == "Roasted onion litti")	return foodPrice =176;	

else {
	System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return foodPrice;


}
public static int priceOfFood(String foodName, int quantity){
	
System.out.println("priceOfFood method started");

if(foodName == "WFC Chaap")	return foodPrice = 33 *quantity;
	
if(foodName == "Paneer Bhujia") return foodPrice = 36 *quantity;
	
if(foodName == "WJW SPL Biriyani")	return foodPrice = 38 *quantity;
	
if(foodName == "Bundi")	return foodPrice =31 *quantity;
	
if(foodName == "Soya Nuggets") return foodPrice =31 *quantity;
	
if(foodName == "Aloo Vadia")	return foodPrice =196 *quantity;
	
if(foodName == "Boti Kabab")	return foodPrice =84 *quantity;

if(foodName == "Rajma Chawal")	return foodPrice =34 *quantity;

if(foodName == "Missi Roti")return foodPrice =32 *quantity;
	
if(foodName == "Rogan Josh") return foodPrice =42 *quantity;
	
if(foodName == "Dal Fry")	return foodPrice =84 *quantity;
	
if(foodName == "Penne")	return foodPrice =121 *quantity;
	
if(foodName == "Gol Gappe")	return foodPrice =153 *quantity;
	
if(foodName == "Pariyaram")	return foodPrice =173 *quantity;
	
if(foodName == "Cholle") return foodPrice =46 *quantity;
	
if(foodName == "Chicken Shawarma")	return foodPrice =93 *quantity;

if(foodName == "Pappad")	return foodPrice =21 *quantity;
	
if(foodName == "Rabri")	return foodPrice =67 *quantity;
	
if(foodName ==  "Lady Lychee")	return foodPrice =121 *quantity;
	
if(foodName == "Malaki Tikka") return foodPrice =73 *quantity;
	
if(foodName == "Fussile")	return foodPrice =175 *quantity;	

else {
	System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return foodPrice;


}



}