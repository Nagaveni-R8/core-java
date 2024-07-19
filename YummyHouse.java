class YummyHouse{

static  double foodPrice ;
public static double getPrice(String foodName){

System.out.println("getPrice method started");
if(foodName == "Chicken Udon") return foodPrice = 11.95;

if(foodName == "Fried Chicken Wings") return foodPrice = 4.75;

if(foodName== "Roast Pork Egg Roll") return foodPrice = 11.65;
	
if(foodName == "Scallion Pancakes") return foodPrice = 14.30;
	
if(foodName == "Teriyaki Scallops") return foodPrice = 8.81;
	
if(foodName== "Fried Mantou")	return foodPrice = 15.90;
	
if(foodName== "Hibachi Vegetable")	return foodPrice = 14.30;
	
if(foodName== "Chicken Pad Thai")	return foodPrice = 13.65;
	
if(foodName== "Takoyaki")	return foodPrice = 7.75;
	
if(foodName == "Shrimp Fried Rice")	return foodPrice = 25.69;
	
if(foodName == "Moo Goo Gai Pan")	return foodPrice =  19.95;
	
if(foodName == "Beef w. Mix Vegetable")	return foodPrice = 12.58;
	
if(foodName == "Hunan Chicken")	return foodPrice = 50.65;
	
if(foodName == "Tofu")	return foodPrice = 16.65;
	
if(foodName == "Sauteed Mix Vegetable")	return foodPrice = 15.81;
	
if(foodName == "Sprit")  return foodPrice = 90.52;
	 
if(foodName == "Miso Ramen")	return foodPrice = 75.55;

if(foodName == "Pineapple Fried Rice")	return foodPrice = 79.10;
	
if(foodName == "Triple Crown")  return foodPrice = 19.08;
	
if(foodName == "Orange Tofu")	return foodPrice = 12.99;
	
if(foodName == "Dr Pepper")	return foodPrice = 25.90;
	
if(foodName == "Diet Coke")	return foodPrice = 75.35;
	
if(foodName == "Chicken w. Broccoli")	return foodPrice = 17.66;
	
else{
	System.out.println("The food not found!");
}

System.out.println("getPrice method ended");
return foodPrice;
}
public static double getPrice(String foodName, int quantity){

System.out.println("getPrice method started");
if(foodName == "Bottle Water") return foodPrice =8.40 *quantity;

if(foodName == "General Tso's Tofu") return foodPrice =8.40 *quantity;

if(foodName== "Chicken Cutlet") return foodPrice =11.65 *quantity;
	
if(foodName == "Sauteed Mix Vegetable") return foodPrice =14.30 *quantity;
	
if(foodName == "Shoyu Ramen") return foodPrice =8.81 *quantity;
	
if(foodName== "Edamame")	return foodPrice =15.90 *quantity;
	
if(foodName== "Seaweed Salad")	return foodPrice =14.30 *quantity;
	
if(foodName== "Karaage")	return foodPrice =13.65 *quantity;
	
if(foodName== "Chicken Sticks")	return foodPrice =11.10 *quantity;
	
if(foodName == "Egg Drop Soup")	return foodPrice =9 *quantity;
	
if(foodName == "Hibachi Fried Rice")	return foodPrice =9 *quantity;
	
if(foodName == "Szechuan Shrimp")	return foodPrice =10 *quantity;
	
if(foodName == "Gyoza Pork")	return foodPrice =10 *quantity;
	
if(foodName == "Oreo Milk Tea w. Boba")	return foodPrice =8 *quantity;
	
if(foodName == "Cucumber Salad")	return foodPrice =11 *quantity;
	
if(foodName == "Passionfruit & Strawberry Tea w. Lychee Jelly")return foodPrice =12 *quantity;
	 
if(foodName == "Mango Slush")	return foodPrice =7 *quantity;

if(foodName == "Hongkong Style Lemon Tea")	return foodPrice =7 *quantity;
	
if(foodName == "Taro Smoothie") return foodPrice =18 *quantity;
	
if(foodName == "Teriyaki Steak")	return foodPrice =19 *quantity;
	
if(foodName == "Fresh Lime Orange Green Tea")	return foodPrice =20 *quantity;
	
if(foodName == "Lychee Flavored Green Tea w. Lychee Jelly")	return foodPrice =7 *quantity;
	
if(foodName == "Mango Milk Tea w. Boba")	return foodPrice =16 *quantity;
	
else{
	System.out.println("The food not found!");
}

System.out.println("getPrice method ended");
return foodPrice;
}


}