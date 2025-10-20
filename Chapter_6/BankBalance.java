import java.util.Scanner;
import java.text.DecimalFormat;

public class BankBalance {

    private static final double INTEREST_RATE = 0.03;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double balance = 0.0;
        int choice = 1;
        int year = 0;

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Enter initial bank balance > 100000");

        while (true) {
            try {
                System.out.print("Enter balance: ");
                balance = scanner.nextDouble();
                if (balance > 100000) {
                    break;
                } else {
                    System.out.println("Error: Balance must be greater than 100000. Please try again.");
                }
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numerical value.");
                scanner.next();
            }
        }

        while (choice == 1) {
            if (year == 0) {
                System.out.println("\nDo you want to see next year's balance?");
            } else {
                System.out.println("\nDo you want to see the balance at the end of another year?");
            }

            System.out.print("Enter 1 for yes or any other number for no >> ");

            try {
                choice = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Invalid input. Assuming 'no' (0) to stop operation.");
                choice = 0;
                scanner.next();
            }


            if (choice == 1) {
                year++;

                double interest = balance * INTEREST_RATE;

                balance += interest;

                System.out.println("After year " + year + " at " + df.format(INTEREST_RATE) + " interest rate, balance is " + df.format(balance));
            }
        }

        System.out.println("\n---jGRASP: Operation complete.");

        scanner.close();
    }
}
