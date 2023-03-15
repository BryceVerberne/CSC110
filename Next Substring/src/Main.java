import java.util.Scanner;

public class Main {

    public static int FindNextSubstr(String input, int index,String find) {
        int relatedSyllables = 0;
        int returnIndex = -1;
        boolean stillChecking = true;

        for (int i = 0; i < input.length(); ++i) {
            char inputChecker = input.charAt(i);
            char findChecker = find.charAt(relatedSyllables);
            if ((inputChecker == findChecker) && (i >= index)) {
                ++relatedSyllables;
            }
            else {
                relatedSyllables = 0;
            }
            if ((relatedSyllables == 0) && (stillChecking)) {
                returnIndex = -1;
            }
            if ((relatedSyllables == 1) && (stillChecking)) {
                returnIndex = i;
            }
            if ((relatedSyllables == find.length())) {
                stillChecking = false;
                relatedSyllables = 0;
            }
        }

        return returnIndex;
    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        String inputString;
        int startIndex;
        String searchStr;

        System.out.print("Word: ");
        inputString = scnr.next();

        System.out.print("Index: ");
        startIndex = scnr.nextInt();

        System.out.print("Search Word: ");
        searchStr = scnr.next();

        System.out.println(FindNextSubstr(inputString, startIndex, searchStr));
    }
}