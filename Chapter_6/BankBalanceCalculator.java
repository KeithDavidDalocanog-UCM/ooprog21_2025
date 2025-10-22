import java.util.Scanner;

public class BankBalanceCalculator {

    public static void main(String[] args) {
        
        final double INTEREST_RATE = 0.03;
        double balance = 100.00;
        int year = 0;
        int userChoice;
        
        Scanner scanner = new Scanner(System.in);
        
        do {
            System.out.println("Do you want to see the balance at the end of another year?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            
            userChoice = scanner.nextInt();
            
            if (userChoice == 1) {
                year++;
                balance *= (1 + INTEREST_RATE); 
                
                System.out.println("After year " + year + " at " + INTEREST_RATE + 
                                   " interest rate, balance is $" + balance);
            }
            
        } while (userChoice == 1);
        
        System.out.println("---- Operation complete. ----");
        
        scanner.close();
    }
}