import java.util.*;
public class Q1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a 2-digit integer: ");
        int x = input.nextInt();
        int y = (x % 10) * 10 + (x / 10);
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("X + y: " + (x + y));
    }
}