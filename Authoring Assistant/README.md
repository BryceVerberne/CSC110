# Authoring Assistant

A Java program that takes a user input text and provides various text analysis options such as counting non-whitespace characters, counting words, finding a specific text, replacing exclamation marks, and shortening spaces.

## Description

This program takes a sample text from the user and offers a menu with various text analysis options. The user can choose to count the number of non-whitespace characters, count the number of words, find a specific word or phrase, replace all exclamation marks with periods, or shorten spaces between words. The program continues to run until the user chooses to quit.

## Features

- Counts non-whitespace characters in the text.
- Counts the number of words in the text.
- Finds instances of a specific word or phrase in the text.
- Replaces all exclamation marks with periods.
- Shortens spaces between words in the text.
- Provides a menu for users to choose desired functionality.

## Usage

1. Compile the Java program (e.g., `javac Main.java`).
2. Run the compiled Java program (e.g., `java Main`).
3. Follow the prompts to enter a sample text.
4. Choose an option from the menu to perform the desired text analysis.
5. The program will output the result based on the chosen option.

## Example

```plaintext
> java Main
Enter a sample text:
Hello! How are you?

You entered: Hello! How are you?

MENU
c - Number of non-whitespace characters
w - Number of words
f - Find text
r - Replace all !'s
s - Shorten spaces
q - Quit

Choose an option:
c
Number of non-whitespace characters: 16

Choose an option:
w
Number of words: 4

Choose an option:
f
Enter a word or phrase to be found:
How
"How" instances: 1

Choose an option:
r
Edited text: Hello. How are you?

Choose an option:
s
Edited text: Hello! How are you?

Choose an option:
q
```
In this example, the user entered the sample text "Hello! How are you?". The program provided various text analysis options, and the user chose to count non-whitespace characters, count words, find the word "How", replace exclamation marks with periods, and shorten spaces.
