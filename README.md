
## A2Novice

This program reads in a list of ingredients used by a restaurant and prints out information derived from the list.

Ingredient_Name is a single word token naming the ingredient. Price_Per_Ounce will be a real value indicating the cost of the ingredient in dollars per ounce. Is_Vegetarian will be the token "true" or "false" indicating whether the ingredient is vegetarian. Calories_Per_Ounce will be an integer indicating the caloric content of the ingredient per ounce.

The program should count the number of vegetarian ingredients and report which ingredients provide the highest and lowest ratios of calories per dollar.

For example, the following input:

```
6
Rice 0.12 true 37
Seaweed 2.95 true 113
Avocado 0.22 true 45
Salmon 1.77 false 48
Yellowtail 0.53 false 41
Eel 2.18 false 84
```

Should produce the following output:

```
Number of vegetarian ingredients: 3
Highest cals/$: Rice
Lowest cals/$: Salmon
```

## A2Adept

This program first reads in a list of ingredients as specified for A2Novice and then a list of menu item recipes and prints out information about the menu items.

The input to this program starts with the ingredient list in the same form as for A2Novice. Following this will be an integer indicating the number of menu item recipes followed by that many recipes.

Each menu item recipe will start with a single word token name for the menu item. Following the name will be an integer indicating how many ingredients are in the recipe. Then there will be a line for each ingredient with the ingredient name followed by the number of ounces of this ingredient required for the menu item.

For each menu item, the program should produce output describing the number of calories in the menu item, the total cost of the ingredients used, and an indication whether that menu item is "Vegetarian" or "Non-Vegetarian". A menu item is vegetarian if all of its component ingredients are vegetarian.

For example, the following input:

```
6
Rice 0.12 true 37
Seaweed 2.95 true 113
Avocado 0.22 true 45
Salmon 1.77 false 48
Yellowtail 0.53 false 41
Eel 2.18 false 84

4
Avocado_Roll
3
Rice 0.5
Avocado 0.5
Seaweed 0.1

Unagi_Nigiri
2
Rice 0.75
Eel 0.75

KMP_Roll
4
Eel 0.6
Rice 0.4
Seaweed 0.2
Avocado 0.3

Salmon_Sashimi
1
Salmon 0.8
```

Should produce the following output:
 
```
Avocado_Roll:
  52 calories
  $0.47
  Vegetarian
Unagi_Nigiri:
  91 calories
  $1.73
  Non-Vegetarian
KMP_Roll:
  101 calories
  $2.01
  Non-Vegetarian
Salmon_Sashimi:
  38 calories
  $1.42
  Non-Vegetarian
```

## A2Jedi

This program reads in a list of ingredients and menu item recipes as specified for A2Adept and then a list of menu items that are part of an order. It should produce an account of how much of each ingredient will be needed to fulfill the whole order.

The first part of the input is the same as A2 Adept. This is followed by a sequence of menu item names that are part of the order. An item can appear more than once or not at all. There will be at least one item. The end of the order will be signalled by the word "EndOrder"

The program should produce an accounting for the total amount of each ingredient required for the order. 

For example the following input:

```
6
Rice 0.12 true 37
Seaweed 2.95 true 113
Avocado 0.22 true 45
Salmon 1.77 false 48
Yellowtail 0.53 false 41
Eel 2.18 false 84

4

Avocado_Roll
3
Rice 0.5
Avocado 0.5
Seaweed 0.1

Unagi_Nigiri
2
Rice 0.75
Eel 0.75

KMP_Roll
4
Eel 0.6
Rice 0.4
Seaweed 0.2
Avocado 0.3

Salmon_Sashimi
1
Salmon 0.8

Avocado_Roll
Unagi_Nigiri
Unagi_Nigiri
Unagi_Nigiri
KMP_Roll
Salmon_Sashimi
Avocado_Roll
KMP_Roll
EndOrder
```

should produce the following output:

```
The order will require: 
4.05 ounces of Rice
0.60 ounces of Seaweed
1.60 ounces of Avocado
0.80 ounces of Salmon
0.00 ounces of Yellowtail
3.45 ounces of Eel
```

