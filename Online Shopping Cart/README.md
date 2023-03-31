# Online Shopping Cart

A Java program that simulates a simple online shopping cart system, calculating the total cost of items in two carts.

## Description

The Online Shopping Cart program uses two classes: `Main` and `CartEditor`. The `Main` class is responsible for receiving user input for item names, prices, and quantities, while the `CartEditor` class is an object class representing an individual shopping cart. The `CartEditor` class contains methods to set and get the item name, price, and quantity. The `Main` class calculates the total cost of items in two separate carts and displays the results.

## Usage

1. Compile the Java program (e.g., `javac Main.java` and `javac CartEditor.java`).
2. Run the compiled Java program (e.g., `java Main`).
3. Follow the prompts to enter the item name, price, and quantity for each of the two items.
4. The program will output the total cost for each item, as well as the combined total cost.

## Example

```plaintext
> java Main
Item 1
Enter the item name:
Toothpaste
Enter the item price:
3
Enter the item quantity:
2

Item 2
Enter the item name:
Shampoo
Enter the item price:
6
Enter the item quantity:
1
TOTAL COST
Toothpaste 2 @ $3 = $6
Shampoo 1 @ $6 = $6

Total: $12
```
In this example, the user inputs "Toothpaste" for the first item, with a price of $3 and a quantity of 2. The user then inputs "Shampoo" for the second item, with a price of $6 and a quantity of 1. The program calculates the total cost for each item and the combined total, displaying $6 for Toothpaste, $6 for Shampoo, and a total of $12.
