class FreshMenu{
static int foodPrice;

public static int priceOfAppetizers(String foodName){
System.out.println("priceOfFood method started");

if(foodName == "Mini Chicken Popcorn") return foodPrice = 99;

if(foodName == "Sesame Chicken Bites" ) return foodPrice = 129;

if(foodName == "Chilli Paneer" ) return foodPrice = 169;

if(foodName == "Parmesan Chicken Sticks") return foodPrice = 139;

if(foodName == "Pio Pio Chicken") return foodPrice = 359;

if(foodName == "Thai Fried Strips" ) return foodPrice = 459;

if(foodName == "Crispy-Herb Corn N' nuts") return foodPrice = 259;

if(foodName == "Tokyo Tossed Veggie") return foodPrice =258;

if(foodName == "Lemongrass Chicken Stirfry" ) return foodPrice = 250;

if(foodName == "Mexican Potato Nachos") return foodPrice = 439;

if(foodName == "Indian Tadka Crouton Bites" ) return foodPrice = 279;

if(foodName == "Magic Masala Wedges") return foodPrice = 99;

if(foodName == "Cheesy Wedges" ) return foodPrice =199;

if(foodName == "Peri Peri Potato Wedges" ) return foodPrice = 239;

if(foodName == "Mixed Veg Hakka Noodles") return foodPrice = 289;

if(foodName == "Cheddar Onion Chicken Burger" ) return foodPrice = 445;

if(foodName == "Black Pepper Honey Chicken Noodles" ) return foodPrice = 546;

if(foodName == "Grilled Chicken n Cheese Subwich") return foodPrice = 479;

if(foodName ==  "Californian Double Chicken Burger") return foodPrice = 521;

if(foodName == "Ghee Roast Chicken Wrap") return foodPrice = 473;

if(foodName == "Chilli Garlic Chicken Noodles") return foodPrice = 289;

else {
System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return foodPrice;


}
public static int priceOfFood(String foodName , int quantity){
System.out.println("priceOfFood method started");

if(foodName == "Signature Roast Chicken Rice Bowl") return foodPrice = 199 *quantity;

if(foodName == "Chicken Maryland" ) return foodPrice = 349 *quantity;

if(foodName == "Chunky Chicken Schezwan Noodles" ) return foodPrice = 348 *quantity;

if(foodName == "Lemongrass Chicken Stirfry") return foodPrice = 349 *quantity;

if(foodName == "Grilled Chicken n Cheese Multigrain Sub") return foodPrice = 359 *quantity;

if(foodName == "Cheese Overload" ) return foodPrice = 459 *quantity;

if(foodName == "Grilled Chicken n Cheese Multigrain Sub") return foodPrice = 259 *quantity;

if(foodName == "Doujiang Korean Fried Chicken") return foodPrice =258 *quantity;

if(foodName == "Cheesy Chicken Club Sandwich" ) return foodPrice = 250 *quantity;

if(foodName == "Grilled BBQ Chicken Superbowl") return foodPrice =  380*quantity;

if(foodName == "BBQ Chicken Focaccia" ) return foodPrice = 279 *quantity;

if(foodName == "Chicken Tikka Masala Thali") return foodPrice = 579 *quantity;

if(foodName == "Doner Chicken Wrap" ) return foodPrice =289 *quantity;

if(foodName == "Chicken Caesar Salad" ) return foodPrice = 439 *quantity;

if(foodName == "Spiced Chicken and Arrabiata Mac") return foodPrice = 289 *quantity;

if(foodName == "Butter Chicken Thali" ) return foodPrice = 445 *quantity;

if(foodName == "Creamy Harissa Chicken Spaghetti" ) return foodPrice = 546 *quantity;

if(foodName == "Pasta Al Pesto Popcorn Chicken") return foodPrice = 479 *quantity;

if(foodName == "Cocktail Chicken Rice Bowl") return foodPrice = 521 *quantity;

if(foodName == "Mini BBQ-ed Chicken Salad") return foodPrice = 473 *quantity;

if(foodName == "Rooster Chicken Rice Bowl") return foodPrice = 289 *quantity;

else {
System.out.println("Food not found");
}


System.out.println("priceOfFood method ended");


return foodPrice;


}



}