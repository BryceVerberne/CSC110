# Parse Strings

A Java program that reads and processes user input strings, identifying and separating words based on the presence of a comma delimiter.

## Description

The Parse Strings program takes a user-input string containing two words separated by a comma and whitespace. If the input string does not contain a comma, the program will display an error message. The program continues to accept input strings until the user enters "q" to quit.

## Usage

1. Compile the Java program (e.g., `javac ParseStrings.java`).
2. Run the compiled Java program (e.g., `java ParseStrings`).
3. Enter a string containing two words separated by a comma and whitespace (e.g., "word1, word2").
4. The program will display the parsed words or an error message if there's no comma in the string.
5. Repeat step 3 until you want to exit, then enter "q" to quit.

## Example

```plaintext
> java ParseStrings
Enter input string:
Apple, Orange
First word: Apple
Second word: Orange

Enter input string:
Banana Grape
Error: No comma in string.

Enter input string:
Tomato, Cucumber
First word: Tomato
Second word: Cucumber

Enter input string:
q
```
In this example, the user enters a string "Apple, Orange" with two words separated by a comma, and the program correctly displays the parsed words. The user then enters a string without a comma ("Banana Grape"), and the program displays an error message. The user continues with another valid input string, "Tomato, Cucumber", and the program again displays the parsed words. The user then enters "q" to quit the program.
