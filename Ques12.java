//Write Java Program to calculate area of a circle
import java.util.Scanner;
import java.lang.Math;
public class Ques12{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius of the circle:");
        double r=sc.nextDouble();
        System.out.println("Area of the circle is: "+(Math.PI*r*r));
        //used static variable PI from Math class.
    }
}