import java.util.Scanner;

public class DebugFive4 {
    public static void main(String args[]) {
        int one, two, three, four;
        int highest = 0; 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer >> ");
        one = input.nextInt();

        System.out.print("Enter another integer >> ");
        two = input.nextInt();

        System.out.print("Enter a third integer >> ");
        three = input.nextInt();

        System.out.print("Enter a fourth integer >> ");
        four = input.nextInt();

        if (one >= two && one >= three && one >= four) {
            highest = one;
        } else if (two >= one && two >= three && two >= four) {
            highest = two;
        } else if (three >= one && three >= two && three >= four) {
            highest = three;
        } else {
            highest = four;
        }

        System.out.println("The highest number is " + highest);
    }
}