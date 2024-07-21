class Zomato{

 static int foodPrice;
 
public static int priceOfFood(String foodName){

System.out.println("priceOfFood method started");

if(foodName == "Chicken Singapore Noodles")	return foodPrice =75;
	
if(foodName == "Butter Paneer Paratha") return foodPrice =85;
	
if(foodName == "Chicken Schezwan Noodles")	return foodPrice =325;
	
if(foodName == "Garlic Rice")	return foodPrice =350;
	
if(foodName == "Mushroom Chicken Soup") return foodPrice =310;
	
if(foodName == "Crispy Chicken Fried Rice")	return foodPrice =296;
	
if(foodName == "Butter Chole Kulcha")	return foodPrice =184;

if(foodName == "Golden Babycorn & mushroom")	return foodPrice =350;

if(foodName == "Singapore Chicken Fried Rice")return foodPrice =250;
	
if(foodName == "Chicken Clear Soup") return foodPrice =150;
	
if(foodName == "Plain Paneer Paratha")	return foodPrice =215;
	
if(foodName == "Paneer Parada Kebab")	return foodPrice =225;
	
if(foodName == "Chicken Manchurian Fried Rice")	return foodPrice =153;
	
if(foodName == "Mushroom Moti TIkka")	return foodPrice =173;
	
if(foodName == "Butter Gobhi Paratha") return foodPrice =246;
	
if(foodName == "Hara Bhara Kebab")	return foodPrice =213;

if(foodName == "Methi Corn TIkki")	return foodPrice =315;
	
if(foodName == "Paneer Banjara")	return foodPrice =515;
	
if(foodName ==  "Triple Chicken Schezwan Fried Rice")	return foodPrice =321;
	
if(foodName == "Veg Seekh Kebab") return foodPrice =413;
	
if(foodName == "Paneer Malai Tikka")	return foodPrice =176;	

else {
	System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return foodPrice;


}



}