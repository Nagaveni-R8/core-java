class Menulog{

 static int foodPrice;
public static int priceOfFood(String foodName){
System.out.println("priceOfFood method started");

if(foodName == "Chicken Noodle Soup")	return foodPrice =133;
	
if(foodName == "Miso Soup") return foodPrice =236;
	
if(foodName == "Avocado Toast")	return foodPrice =638;
	
if(foodName == "Coin Parotta")	return foodPrice =531;
	
if(foodName == "Dry Chapati") return foodPrice =231;
	
if(foodName == "Egg Scramble Plate")	return foodPrice =196;
	
if(foodName == "Monte Cristo Sandwich")	return foodPrice =84;

if(foodName == "Chimichanga")	return foodPrice =34;

if(foodName == "Malbar Parotta")return foodPrice =732;
	
if(foodName == "Truffle Parm Fries") return foodPrice =42;
	
if(foodName == "Steak and Eggs")	return foodPrice =684;
	
if(foodName == "Egg Fried Rice")	return foodPrice =121;
	
if(foodName == "Classic Caesar")	return foodPrice =153;
	
if(foodName == "Arugula & Parm")	return foodPrice =173;
	
if(foodName == "Kale") return foodPrice =46;
	
if(foodName == "Chicken Shawarma")	return foodPrice =93;

if(foodName == "Pappad")	return foodPrice =21;
	
if(foodName == "Raitha")	return foodPrice =67;
	
if(foodName ==  "Westville Cobb")	return foodPrice =121;
	
if(foodName == "Breakfast Burrito") return foodPrice =73;
	
if(foodName == "Southwestern Brunch Bowl")	return foodPrice =176;	

else {
	System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return foodPrice;


}
public static int priceOfFood(String foodName, int quantity){
	
System.out.println("priceOfFood method started");

if(foodName == "Egg Scramble Sandwich")	return foodPrice = 33 *quantity;
	
if(foodName == "Greek") return foodPrice = 36 *quantity;
	
if(foodName == "Beyond Burger")	return foodPrice = 38 *quantity;
	
if(foodName == "Side of Grilled Sirloin Steak")	return foodPrice =31 *quantity;
	
if(foodName == "Smoked Salmon") return foodPrice =31 *quantity;
	
if(foodName == "Carrot Cake")	return foodPrice =96 *quantity;
	
if(foodName == "Apple Pie")	return foodPrice =84 *quantity;

if(foodName == "Ghee Chapati")	return foodPrice =34 *quantity;

if(foodName == "Arnold Palmer") return foodPrice =32 *quantity;
	
if(foodName == "Hebrew National Hot Dog") return foodPrice =42 *quantity;
	
if(foodName == "Side of Grilled Marinated Chicken Breast")	return foodPrice =84 *quantity;
	
if(foodName == "Iced Chai Latte")	return foodPrice =121 *quantity;
	
if(foodName == "Seltzer")	return foodPrice =153 *quantity;
	
if(foodName == "Hamburger")	return foodPrice =173 *quantity;
	
if(foodName == "Sparkling Lurisia Water") return foodPrice =46 *quantity;
	
if(foodName == "Side of Breaded Chicken Cutlet")	return foodPrice =93 *quantity;

if(foodName == "Lemonade")	return foodPrice =21 *quantity;
	
if(foodName == "Side of Avocado")	return foodPrice =67 *quantity;
	
if(foodName == "Bacon")	return foodPrice =121 *quantity;
	
if(foodName == "Iced Mocha") return foodPrice =73 *quantity;
	
if(foodName == "Cast Iron Turkey Burger")	return foodPrice =176 *quantity;	

else {
	System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return foodPrice;


}


}