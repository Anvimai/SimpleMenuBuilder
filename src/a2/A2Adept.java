package a2;

import java.util.Scanner;

public class A2Adept {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Your code here.
		
int NumIngredients = 0;
		
		String Is_Vegetarian = ""; 
		int NumVeg = 0;
		int NumRecipes = 0;
		String recipeName = "";
		int num_Ingredients_Each = 0;
		String ingName = "";
		double ouncesEach = 0.0;
		double cals = 0.0;
		double price = 0.0;
		double priceEach = 0.0;
		double calsEach = 0; 
		boolean YesVegetarian = true; 
		
		
		NumIngredients = scan.nextInt();
		
		String[] Ingredient_Name = new String[NumIngredients];
		Double[] Price_Per_Ounce = new Double[NumIngredients];
		Double[] Calories_Per_Ounce = new Double[NumIngredients];
		String[] Vegetarian = new String[NumIngredients];
		
		for(int i = 0; i < NumIngredients; i++) {
			
			Ingredient_Name[i] = scan.next();
			Price_Per_Ounce[i] = scan.nextDouble();
			Is_Vegetarian = scan.next();
			Calories_Per_Ounce[i] = scan.nextDouble();
			
			if(Is_Vegetarian.compareTo("true")==0) {
				
				NumVeg++;
				
				Vegetarian[i] = "true";
				
			}else {Vegetarian[i] = "false";}
			
			
			
		}
		
		NumRecipes = scan.nextInt();
		
		for (int i = 0; i < NumRecipes; i++) {
			price=0;
			cals=0;
			YesVegetarian = true;
			recipeName = scan.next();
			num_Ingredients_Each = scan.nextInt();
			
			for(int j = 0; j < num_Ingredients_Each; j++) {
				
				
				ingName = scan.next();
				ouncesEach = scan.nextDouble();
				
				for(int in = 0; in < Ingredient_Name.length; in++) {
					
					if (ingName.compareTo(Ingredient_Name[in])==0) {
						
						calsEach = ouncesEach*Calories_Per_Ounce[in];
						priceEach = ouncesEach*Price_Per_Ounce[in];
						
						if(Vegetarian[in].compareTo("true")!=0) {
							
							YesVegetarian = false; 
							
						} 
					}
					
					
					
					
				}
				
				price+=priceEach;
				cals+=calsEach;
				
			}
			
			
			
			//output
			System.out.println(recipeName + ": ");
			System.out.println("  " +  ((int) (cals + 0.5)) + " calories");
			System.out.printf("  $%.2f", price);
			System.out.println();
			if(YesVegetarian == true) {System.out.println("  Vegetarian");
			}else {System.out.println("  Non-Vegetarian");}
		}
		
		
		
		
	}
	
	// You can define helper methods here if needed.
	
}
