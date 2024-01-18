
/**
 * Write a description of class Question2 here.
 *
 * @author (ABDULKARIM KHAMIS)
 * @version (a version number or a date)
 */
import java.util.*;
public class Question2
{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        
        String name;
         String city;
        String college;
        String profesional;
        String animal;
        String pentName;
        int age;

        System.out.println("Enter your names :");
        name=input.nextLine();

        System.out.println("Enter your city :");
        city=input.nextLine();

        
        System.out.println("Enter your collage :");
        college=input.nextLine();

        
        System.out.println("Enter your profesional :");
        profesional=input.nextLine();

        
        System.out.println("Enter your animal :");
        animal=input.nextLine();

        
        System.out.println("Enter your petname :");
        pentName=input.nextLine();

        System.out.println("Enter your age :");
        age=input.nextInt();


        System.out.print("There once was a person named "+ name +" who lived in " + city + ". at the age of " +age+ " , " +name+ " when to collage at " + college+ "." +name+ " graduated and went to wwork as " + profesional+ ". Then ," + name+ " adapted an  " + animal+ "named " +pentName+ " . they both lived happily ever after!");  

        


    }

}
