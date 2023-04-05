import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {

        Scanner scnr = new Scanner(System.in);

        int totalCost;
        int normalTicket = 300;
        int carryOnCost = 50;
        int personAge;
        int checkedBags;
        int carryOn;
        int bagsCost;

        System.out.print("Age: ");
        personAge = scnr.nextInt();

        System.out.print("Bags: ");
        checkedBags = scnr.nextInt();

        System.out.print("Carry Ons: ");
        carryOn = scnr.nextInt();

        bagsCost = checkedBags * 10;

        if (personAge <= 2) {
            normalTicket = 0;
        }
        else if (personAge >= 60) {
            normalTicket = 290;
        }

        if ((carryOn == 0) || (carryOn == 1))  {
            carryOnCost = 0;
        }
        else if (carryOn >= 2) {
            carryOn -= 1;
            carryOnCost = (carryOn * carryOnCost) - 25;
        }

        totalCost = bagsCost + carryOnCost + normalTicket;

        System.out.println("Your total cost is: $" + totalCost);

    }
}