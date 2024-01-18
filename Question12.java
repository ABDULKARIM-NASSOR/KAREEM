
/**
 * Write a description of class Question12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class Question12
{
    
public class Q11{
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.print("Enter the number of years: ");
        int numberrofyears = input.nextInt();
        int totalmonths = numberrofyears * 12;
        int totalRainfall = 0;
        for (int year = 1; year <= numberrofyears; year++){
            for (int month = 1; month <= 12; month++){
                System.out.print("Enter inches of rainfall for year " +year+",month" +month+ ":");
                
                totalRainfall += input.nextInt();

            }
        }
        double averageRainfall = totalRainfall / totalmonths;
        System.out.println("Total months: " +totalmonths);
        System.out.println("Total inches of Rainfall: " + totalRainfall);
        System.out.println("Average Rainfall per month: " + averageRainfall);
    }
}
    }
