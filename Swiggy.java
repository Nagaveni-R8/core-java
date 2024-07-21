class Swiggy{

static double cost = 0.0;
public static double searchPriceByFoodNames(String foodName){

System.out.println("searchPriceByFoodNames method started");


if(foodName == "Chicken Popcorn") return cost= 195;

if(foodName == "Barbeque Chicken Wings")	return cost= 315;

if(foodName== "Honey Garlic Chicken") return cost= 515;

if(foodName == "Mutton sukha") return cost= 485;

if(foodName== "Chicken Lollipop") return cost = 330;

if(foodName == "Tangy Lemon Chicken")	return cost = 430;

if(foodName == "Hot Garlic Chicken") return cost = 325;

if(foodName == "Chicken Fried Sticks") return cost = 270;

if(foodName == "Butter Naan") return cost= 190;;

if(foodName == "Chicken Singapore") return cost= 405;

if(foodName == "Golden Babycorn & mushroom") return cost= 315;

if(foodName== "Plain Tandoori Roti") return cost= 285;

if(foodName == "Chicken Afghani Tikka") return cost = 350;

if(foodName == "Chicken Dragon")  return cost= 590;

if(foodName == "Schezwan Paneer") return cost = 445;

if(foodName == "Chicken Roast") return cost= 150;

if(foodName == "Veg Spring Roll")	return cost = 350;

if(foodName == "Plain Tandoori Garlic Roti")	return cost= 230;

if(foodName == "Chicken Texmo")	return cost= 530;

if(foodName== "Makhmali Malai Chicken Tikka")	return cost= 430;

if(foodName == "Chilli Paneer")	return cost = 345;

else{
	 System.out.println("Food Name doesnot match");
}


System.out.println("searchPriceByFoodNames method ended");
return cost;
}




}