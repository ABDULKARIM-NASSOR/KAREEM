
import java.util.*;
public class Question9{
    public static void main(String[]args){
        Scanner Scanner= new Scanner(System.in);
        System.out.println("Enter Quiz Score");
        int score = Scanner.nextInt();
        if (score == 5){
            System.out.println("Grade: A");
        }else if (score == 4){
            System.out.println("Grade: B");
        }else if (score == 3){
                System.out.println("Grade: C");
        }else if (score == 2){
                    System.out.println("Grade: D");
        }else
        {
         System.out.println("Grade: F");
         
        }
    }
}