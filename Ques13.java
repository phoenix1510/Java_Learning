//Write Java Program to calculate perimeter of a rectangle
import java.util.Scanner;
public class Ques13{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter length of the rectangle:");
        double length= sc.nextDouble();
        System.out.println("Enter breadth of the rectangle:");
        double breadth= sc.nextDouble();
        double perimeter= 2*(length+breadth);
        System.out.println("The Perimeter of the rectangle is: "+perimeter);
    }
}