import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner yeet = new Scanner(System.in);

        int interstateNumber;
        int oddOrEven;
        String direction;
        String type;
        int primary;

        System.out.print("Interstate Number: ");
        interstateNumber = yeet.nextInt();
        oddOrEven = interstateNumber % 2;

        direction = (oddOrEven == 0) ? "east/west" : "north/south";

        type = ((interstateNumber >= 1) && (interstateNumber <= 99))
                ? "primary" : "auxiliary";

        primary = (interstateNumber >= 100) ? interstateNumber % 100 :
                0;

        if (((interstateNumber >= 100) && (primary == 0)) ||
                (interstateNumber == 0)) {
            System.out.println(interstateNumber + " is not a valid"
                    + " interstate highway number");
        }
        else if (interstateNumber >= 100) {
            System.out.println("I-" + interstateNumber + " is " +
                    type + ", serving I-" + primary + ", going " + direction
                    + ".");
        }
        else {
            System.out.println("I-" + interstateNumber + " is " +
                    type + ", going " + direction + ".");
        }

    }
}