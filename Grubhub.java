class Grubhub{

static double cost = 0.0;

public static double searchPriceByFoodNames(String foodName){

System.out.println("searchPriceByFoodNames method started");


if(foodName == "Coke Zero") return cost= 295;

if(foodName == "Strawberry Crush Can")	return cost= 415;

if(foodName== "Mac N Cheese") return cost= 315;

if(foodName == "Lipton Iced Tea") return cost= 485;

if(foodName== "Potato Chips") return cost = 330;

if(foodName == "Dr. Pepper Zero")	return cost = 330;

if(foodName == "Small Handfrosted Cookie") return cost = 225;

if(foodName == "Peach Cobbler") return cost = 270;

if(foodName == "Mt. Dew") return cost= 290;;

if(foodName == "Peach Crush Can") return cost= 305;

if(foodName == "Banana Pudding") return cost= 315;

if(foodName== "Flower Cookie") return cost= 385;

if(foodName == "Seasoned Fried Okra") return cost = 200;

if(foodName == "Homemade Coleslaw")  return cost= 390;

if(foodName == "Sweet Potato Fries") return cost = 245;

if(foodName == "Homemade Mississippi Succotash (Vegan)") return cost= 160;

if(foodName == "Whole Deviled Egg" )	return cost = 250;

if(foodName == "16oz Homemade Cocktail Sauce")	return cost= 330;

if(foodName == "16oz Brown Suga Baby Sweet Barbecue Sauce")	return cost= 330;

if(foodName== "Homemade Potato Salad")	return cost= 330;

if(foodName == "Fresh Cut Fries")	return cost = 305;

else{
	 System.out.println("Food Name doesnot match");
}


System.out.println("searchPriceByFoodNames method ended");
return cost;
}


public static double searchPriceByFoodNames(String foodName ,int quantity){

System.out.println("searchPriceByFoodNames method started");


if(foodName == "The Cluck'N Mess") return cost= 295 *quantity;

if(foodName == "Catfish Bowl")	return cost= 415 *quantity;

if(foodName== "The Nite Nite") return cost= 315 *quantity;

if(foodName == "The J-Dubb Clubb Sandwich") return cost= 485 *quantity;

if(foodName== "Bones By The Slab") return cost = 330 *quantity;

if(foodName == "Chopped Pork By The Pound")	return cost = 330 *quantity;

if(foodName == "8pce Dark Meat Bird") return cost = 225 *quantity;

if(foodName == "Chicken & Waffles") return cost = 270 *quantity;

if(foodName == "California Benedict")  return cost= 305 *quantity;

if(foodName == "Catfish Dinner") return cost= 315 *quantity;

if(foodName== "Shut the Hell up Brisket Stack Sandwich") return cost= 38 *quantity;

if(foodName == "Hotdog or Chili Dawgs") return cost = 200 *quantity;

if(foodName == "Brisket By The Pound")  return cost= 390 *quantity;

if(foodName == "Chicken Salad BLT Sandwich Only") return cost = 245 *quantity;

if(foodName == "Pasta Salad") return cost= 160 *quantity;

if(foodName == "Bread Slices")	return cost = 250 *quantity;

if(foodName == "Dill Diva Chicken Salad")	return cost= 330 *quantity;

if(foodName == "Flaming Shut the Hell up Brisket Stack Sandwich")	return cost= 330 *quantity;

if(foodName== "8pce Dark Meat Bird")	return cost= 330 *quantity;

if(foodName == "Link Sausage By The Pound")	return cost = 305 *quantity;

else{
	 System.out.println("Food Name doesnot match");
}


System.out.println("searchPriceByFoodNames method ended");
return cost;
}



}