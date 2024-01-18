
/**
 * Write a description of class Question1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.*;
public class Question1
{
  public static void main(String[] args) {
        
        Scanner inpot= new Scanner(System.in);

        System.out.print("Enter a two-digit integer ");
        
       
        String input= inpot.nextLine();

        
        if (input.length() != 2) {
            System.out.println("Invalid input. Please enter a two-digit integer.");
            return;
        }

        int x = Integer.parseInt(input);

        int rightDigit = x % 10;
        int leftDigit = x / 10;

   
        int y = rightDigit * 10 + leftDigit;

        System.out.println("Original number (x): " + x);
        System.out.println("Reversed number (y): " + y);
        System.out.println("Sum (x + y): " + (x + y));

    }
}

