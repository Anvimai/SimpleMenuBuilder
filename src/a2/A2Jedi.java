package a2;

import java.util.Scanner;

public class A2Jedi {

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
		double ounces = 0.0;
		int index =0;
		
		
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
		String[] RecipeName = new String[NumRecipes];
		String[][] IngName = new String[NumRecipes][];
		Double[][] OuncesEach = new Double[NumRecipes][];
		Double[] ingredientOunces = new Double[NumIngredients];
		for(int i = 0; i<NumIngredients; i++) {ingredientOunces[i]=0.0;}
		
		for (int i = 0; i < NumRecipes; i++) {
			price=0;
			cals=0;
			YesVegetarian = true;
			RecipeName[i] = scan.next();
			num_Ingredients_Each = scan.nextInt();
			IngName[i] = new String[num_Ingredients_Each];
			OuncesEach[i] = new Double[num_Ingredients_Each];
			for(int j = 0; j < num_Ingredients_Each; j++) {
				
				
				IngName[i][j] = scan.next();
				OuncesEach[i][j] = scan.nextDouble();
				

				
			}
			
			
		}
		//begin order input
		
		
		while(scan.hasNext()) {
			
			
			String order = scan.next();
			
			
			
			if(order.compareTo("EndOrder")==0){break;}
			for(int i = 0; i<NumRecipes; i++) {
			if(order.compareTo(RecipeName[i])==0) {
				
				index = i;
				}
			
				
			
			}
		
			for(int in = 0; in < IngName[index].length; in++ ) {
				for(int jo = 0; jo< NumIngredients; jo++) {
					if(IngName[index][in].compareTo(Ingredient_Name[jo])==0) {
						ingredientOunces[jo]+=OuncesEach[index][in];
						
						
					}
					
					
				}
				
				
			}
		
			
			}
		
	System.out.println("The order will require: ");
	for(int i = 0; i < NumIngredients; i++) {
		
		System.out.printf("%.2f", ingredientOunces[i] );
		System.out.println( " ounces of "  + Ingredient_Name[i]);
		
	}
	
}
	
	}