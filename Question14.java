
/**
 * Write a description of class Question14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Question14
{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a series of integer (-99 to end): ");
        int number = input.nextInt();
        int largest = number;
        int smallest = number;
         while (number != - 99) {
            if (number > largest){
                largest = number;
            }
            if (number < smallest){
                smallest = number;
            } 
            number = input.nextInt();
            }
            System.out.println("largest number:" + largest);
            System.out.println("smallest number:" + smallest);
         }
    }


