import java.util.Scanner;

public class Main {

    public static void sortArray(int[] myArr, int arrSize) {
        int[] sortedArray = new int[myArr.length];
        int largest = myArr[0];
        int smallest = myArr[0];
        int next;
        int lastVariable;

        for (int i = 0; i < myArr.length; ++i) {
            if (myArr[i] > largest) {
                largest = myArr[i];
            }
            if (myArr[i] < smallest) {
                smallest = myArr[i];
            }
        }

        lastVariable = largest;

        for (int k = 0; k < sortedArray.length; ++k) {
            next = smallest;

            for (int i = 0; i < myArr.length; ++i) {
                if ((myArr[i] > next) && (myArr[i] < lastVariable)) {
                    next = myArr[i];
                }
            }
            if ((next < lastVariable) && (k != 0) && (k != sortedArray.length - 1)) {
                sortedArray[k] = next;
                lastVariable = next;
            }
        }

        sortedArray[0] = largest;
        sortedArray[myArr.length - 1] = smallest;

        for (int i = 0; i < sortedArray.length; ++i) {
            System.out.print(sortedArray[i] + ",");
            myArr[i] = sortedArray[i];
        }

        System.out.println();

    }

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);

        System.out.print("Array Size: ");
        final int MAX_STORAGE = scnr.nextInt();
        int[] mainArray = new int[MAX_STORAGE];

        for (int i = 0; i < mainArray.length; ++i) {
            System.out.print("Element " + (i + 1) + ": ");
            mainArray[i] = scnr.nextInt();
        }

        sortArray(mainArray, mainArray.length);

    }
}