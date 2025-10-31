// Display every character between Unicode 65 and 122
// Start new line after 20 characters

import java.util.Scanner;

public class DebugSix2
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        char letter;
        int a;
        final int min;
        final int MAX = 122;
        final int NUMBERLINE = 20;
        
        // FIX 1: The line counter should start at 0.
        // It's tracking the number of characters printed on the *current* line.
        int lines = 0; 
        
        System.out.println("Enter a Unicode value to start.");
        System.out.print("For example, A is 65 >> ");
        
        min = keyboard.nextInt();
        
        for(a = min; a <= MAX; a++)
        {
            letter = (char)a;
            System.out.print(" " + letter);
            
            // FIX 2: Increment the counter *after* printing a character.
            lines++;
            
            // FIX 3: Use '==' for comparison.
            // A single '=' is an *assignment*, not a comparison.
            if(lines == NUMBERLINE)
            {
                lines = 0; // Reset the counter for the next line
                
                // FIX 4: Added a missing semicolon ';'.
                System.out.println(); 
            }
        }
        System.out.println("\nEnd of application");
    }
}