import java.util.Scanner;

public class FibonacciSequence {

    public static void fiboBoi(int steps, int fibo_1, int fibo_2) {

        if (steps != 0) {
            System.out.println(fibo_1 + " + " + fibo_2 + " = " + (fibo_1 + fibo_2));
            fiboBoi(--steps, fibo_2, (fibo_1 + fibo_2));
        }
    }

    public static void main (String[] args) {

        Scanner scnr = new Scanner(System.in);
        int numSteps;

        System.out.println("This program outputs the Fibonacci sequence step-by-step, starting after the first" +
        " 0 and 1.\n");
        System.out.print("How many steps would you like? ");
        numSteps = scnr.nextInt();

        System.out.println("0\n1");
        fiboBoi(numSteps, 0, 1);

    }
}
