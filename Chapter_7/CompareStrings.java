import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String predefinedString = "Carmen";

        System.out.print("Enter your name > ");
        String userInput = scanner.nextLine();

        if (predefinedString.equals(userInput)) {
            System.out.println(predefinedString + " equals " + userInput);
        } else {
            System.out.println(predefinedString + " does not equal " + userInput);
        }

        scanner.close();
    }
}