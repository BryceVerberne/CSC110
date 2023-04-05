import java.util.Scanner;

public class Main {

    public static char printMenu(Scanner scnr) {
        char userOption;
        System.out.println("\nMENU\nc - Number of non-whitespace characters\nw - Number of words" +
                "\nf - Find text\nr - Replace all !'s\ns - Shorten spaces\nq - Quit\n\nChoose an option:");
        userOption = scnr.next().charAt(0);

        return userOption;
    }

    public static int getNumOfNonWSCharacters(String sampleText) {
        int numNonWS = 0;
        char checker;

        for (int i = 0; i < sampleText.length(); ++i) {
            checker = sampleText.charAt(i);
            if (!(Character.isWhitespace(checker))) {
                ++numNonWS;
            }
        }

        return numNonWS;
    }

    public static int getNumOfWords(String sampleText) {
        int numWords = 0;
        char checker;
        int tracker = 0;

        for (int i = 0; i < sampleText.length(); ++i) {
            checker = sampleText.charAt(i);
            if (!(Character.isWhitespace(checker)) && (tracker == 0)) {
                ++numWords;
                ++tracker;
            }
            else if (Character.isWhitespace(checker)) {
                tracker = 0;
            }
        }

        return numWords;
    }

    public static int findText(String text, String sampleText) {
        int numInstances = 0;
        int relatedSyllables = 0;

        for (int i = 0; i < sampleText.length(); ++i) {
            char textChecker = sampleText.charAt(i);
            char findChecker = text.charAt(relatedSyllables);
            if (textChecker == findChecker) {
                ++relatedSyllables;
            }
            else {
                relatedSyllables = 0;
            }
            if (relatedSyllables == text.length()) {
                ++numInstances;
                relatedSyllables = 0;
            }
        }

        return numInstances;
    }

    public static String replaceExclamation(String sampleText) {
        String updatedString = "";
        char checker;

        for (int i = 0; i < sampleText.length(); ++i) {
            checker = sampleText.charAt(i);
            if (checker == '!') {
                updatedString += ".";
            }
            else {
                updatedString += checker;
            }
        }

        return updatedString;
    }

    public static String shortenSpace(String sampleText) {
        String updatedString = "";
        char checker;
        int WS = 0;

        for (int i = 0; i < sampleText.length(); ++i) {
            checker = sampleText.charAt(i);
            if (Character.isWhitespace(checker)) {
                ++WS;
            }
            if ((Character.isLetter(checker)) && (WS > 0)) {
                WS = 0;
            }
            if (WS < 2) {
                updatedString += checker;
            }
        }

        return updatedString;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.println("Enter a sample text:");

        String sampleText = scnr.nextLine();
        char option;
        String phrase;

        System.out.println("\nYou entered: " + sampleText);

        option = printMenu(scnr);

        while (option != 'q') {
            if (option == 'c') {
                System.out.println("Number of non-whitespace characters: " +
                        getNumOfNonWSCharacters(sampleText));
            }

            else if (option == 'w') {
                System.out.println("Number of words: " + getNumOfWords(sampleText));
            }

            else if (option == 'f') {
                System.out.println("Enter a word or phrase to be found:");
                scnr.nextLine();
                phrase = scnr.nextLine();
                System.out.println("\"" + phrase + "\"" + " instances: " +
                        findText(phrase, sampleText));
            }

            else if (option == 'r') {
                System.out.println("Edited text: " + replaceExclamation(sampleText));
            }

            else if (option == 's') {
                System.out.println("Edited text: " + shortenSpace(sampleText));
            }

            option = printMenu(scnr);
        }

    }
}