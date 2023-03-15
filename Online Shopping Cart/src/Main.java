import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scnr = new Scanner(System.in);
        CartEditor cart_1 = new CartEditor();
        CartEditor cart_2 = new CartEditor();
        int cart1Total = 0;
        int cart2Total = 0;

        System.out.println("Item 1\nEnter the item name:");
        cart_1.setName(scnr.nextLine());

        System.out.println("Enter the item price:");
        cart_1.setPrice(scnr.nextInt());

        System.out.println("Enter the item quantity:");
        cart_1.setQuantity(scnr.nextInt());

        scnr.nextLine();

        System.out.println("\nItem 2\nEnter the item name:");
        cart_2.setName(scnr.nextLine());

        System.out.println("Enter the item price:");
        cart_2.setPrice(scnr.nextInt());

        System.out.println("Enter the item quantity:");
        cart_2.setQuantity(scnr.nextInt());

        cart1Total = cart_1.getQuantity() * cart_1.getPrice();
        cart2Total = cart_2.getPrice() * cart_2.getQuantity();

        System.out.println("TOTAL COST\n" + cart_1.getName() + " " + cart_1.getQuantity() + " @ $"
                + cart_1.getPrice() + " = $" + cart1Total + "\n" +
                cart_2.getName() + " " + cart_2.getQuantity() + " @ $" + cart_2.getPrice() + " = $" +
                cart2Total + "\n\nTotal: $" + (cart1Total + cart2Total));

    }
}