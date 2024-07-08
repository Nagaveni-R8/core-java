class Swiggy{
	
	
	public static void main(String args[]){
	
	System.out.println("Main Started");
	
	 String nonVegStarters[] = {"Chicken kabab","Chicken Tikka","Mutton Seekh kabab","Tandoori Chicken","Fish Fry","Prawn kabab","Chilly Chicken","Chicken 65","Chicken lollipop","Mutton chops"};
	 String vegStarters[] = {"veg Crispy","veg chilly", "veg garlic","veg lalipop","Gobi manuchiran"," mushroom chilly","mushroom manuchiran","panner65","mix crispy","panner chilly"};
	 String nonVegMainCourses[] = {"Chicken Biryani" , "Chicken Chow Mushroom" , "Szechwan Sauce" , "Chicken Fried Rice" , "Butter Chicken" , "Egg Fried Rice" , "Mutton Curry" , "Chicken Curry" , "Chicken Shezwan" , "Chicken Masala"};
	 String vegMainCourses[] = {"Veg Biryani","Mushroom Biryani","Jeera Rice","Ghee Rice","Noodles","Schezwan Friedrice","Parota","Veg Friedrice","Thai Basil Rice","Ginger Friedrice"};
	System.out.println("The menu is as follows");
		
			for(String nonVegStarter : nonVegStarters){
				System.out.println(nonVegStarter);
			}
				for(String vegStarter : vegStarters){
				System.out.println(vegStarter);
			}
				for(String nonVegMainCourse : nonVegMainCourses){
					System.out.println(nonVegMainCourse);
				}
					for(String vegMainCourse : vegMainCourses){
						System.out.println(vegMainCourse);
					}
				
		System.out.println("Main Ended");
	}
}