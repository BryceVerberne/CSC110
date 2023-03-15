import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scnr = new Scanner(System.in);

        int ogChange;
        int change;
        int dollars;
        int quarters;
        int dimes;
        int nickels;
        int pennies;
        String pluralDD;
        String pluralQ;
        String pluralD;
        String pluralN;
        String pluralP;

        System.out.print("Give me a random number & I'll convert it to change: ");
        ogChange = scnr.nextInt();
        change = ogChange;

        dollars = change / 100;
        change -= dollars * 100;

        quarters = change / 25;
        change -= quarters * 25;

        dimes = change / 10;
        change -= dimes * 10;

        nickels = change / 5;
        change -= nickels * 5;

        pennies = change;

        pluralDD = (dollars >= 2) ? " Dollars" : " Dollar";
        pluralQ = (quarters >= 2) ? " Quarters" : " Quarter";
        pluralD = (dimes >= 2) ? " Dimes" : " Dime";
        pluralN = (nickels >= 2) ? " Nickels" : " Nickel";
        pluralP = (pennies >= 2) ? " Pennies" : " Penny";

        if (ogChange == 0) {
            System.out.println("No change");
        }

        if ((ogChange != 0) && (dollars != 0)) {
            System.out.println(dollars + pluralDD);
        }

        if ((ogChange != 0) && (quarters != 0)) {
            System.out.println(quarters + pluralQ);
        }
        if ((ogChange != 0)&& (dimes != 0)) {
            System.out.println(dimes + pluralD);
        }
        if ((ogChange != 0) && (nickels != 0)) {
            System.out.println(nickels + pluralN);
        }
        if ((ogChange != 0) && (pennies
                != 0)) {
            System.out.println(pennies + pluralP);
        }

    }
}