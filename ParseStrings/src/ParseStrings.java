import java.util.Scanner;

public class ParseStrings {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        String name;
        String word = "";
        char checker;

        System.out.println("Enter input string:");
        name = scnr.nextLine();

        while (!name.equals("q")) {
            if (name.contains(",")) {
                for (int i = 0; i < name.length(); ++i) {
                    checker = name.charAt(i);

                    if (!Character.isWhitespace(checker) && checker != ',') {
                        word += checker;
                    }

                    if (checker == ',') {
                        System.out.println("First word: " + word);
                        word = "";
                    }

                    if (i == name.length() - 1) {
                        System.out.println("Second word: " + word);
                        word = "";
                    }
                }
            }
            else {
                System.out.println("Error: No comma in string.");
            }

            System.out.println("\nEnter input string:");
            name = scnr.nextLine();
        }

    }
}