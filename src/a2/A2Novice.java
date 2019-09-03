package a2;

import java.util.Scanner;

public class A2Novice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// Your code here.
		
		int NumIngredients = 0;
		
		String Is_Vegetarian = ""; 
		int NumVeg = 0;
		
		
		
		
		NumIngredients = scan.nextInt();
		
		String[] Ingredient_Name = new String[NumIngredients];
		Double[] Price_Per_Ounce = new Double[NumIngredients];
		Double[] Calories_Per_Ounce = new Double[NumIngredients];
		
		for(int i = 0; i < NumIngredients; i++) {
			
			Ingredient_Name[i] = scan.next();
			Price_Per_Ounce[i] = scan.nextDouble();
			Is_Vegetarian = scan.next();
			Calories_Per_Ounce[i] = scan.nextDouble();
			
			if(Is_Vegetarian.compareTo("true")==0) {
				
				NumVeg++;
				
			}
			
			
			
		}
		
		System.out.println("Number of vegetarian ingredients:" + NumVeg);
		System.out.println("Highest cals/$: " + Ingredient_Name[GetHighest(Calories_Per_Ounce,Price_Per_Ounce,NumIngredients)]);
		System.out.println("Lowest cals/$: " + Ingredient_Name[GetLowest(Calories_Per_Ounce,Price_Per_Ounce,NumIngredients)]);
		
		
	}
	
	// You can define helper methods here if needed.
	
	public static int GetHighest(Double[] a, Double[] b, int c) {
		
		int index = 0;
		
		Double[] Ratios = new Double[c];
		
		for(int i = 0; i < c; i++) {
			
			Ratios[i] = a[i]/b[i];
			
		}
		
		double highest = Ratios[0];
		
		for(int i = 0; i < c; i++) {
			
			if(highest<Ratios[i]) {
				
				highest = Ratios[i];
				index = i;
			}
			
			
			
		}
		
		return index; 
	}
	
	
public static int GetLowest(Double[] a, Double[] b, int c) {
		
		int index = 0;
		
		Double[] Ratios = new Double[c];
		
		for(int i = 0; i < c; i++) {
			
			Ratios[i] = a[i]/b[i];
			
		}
		
		double lowest = Ratios[0];
		
		for(int i = 0; i < c; i++) {
			
			if(lowest>Ratios[i]) {
				
				lowest = Ratios[i];
				
				index = i;
				
			}
			
		}
		
		return index; 
	}
}
