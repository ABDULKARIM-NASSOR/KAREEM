
/**
 * Write a description of class Question13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Question13
{

    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter positive numbers (Enter a negative number to end): ");
        int number;
        while ((number = input.nextInt()) >= 0){
            sum += number;

        }
        System.out.println("sum of positive number: " + sum);
    }
}


