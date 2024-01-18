
/**
 * Write a description of class Question11 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 import java.util.*;
public class Question11
{
   

    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the speed of the vehicle in mph: ");
        double speed = input.nextDouble();
        System.out.print("Enter the number of hours of hours traveled: ");
        int hours = input.nextInt();
        System.out.println("Hours\tDistance traveled");
        for(int hour = 1; hour <= hours; hour++){
            double distance = speed * hour;
            System.out.println(hour + "\t" + distance);
        }
    }
}

