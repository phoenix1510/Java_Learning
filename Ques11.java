//Write Java Program to calculate Compound Interest
import java.util.Scanner;
public class Ques11{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Principal Amount:");
        double p= sc.nextDouble();
        System.out.println("Enter the Rate of Interest:");
        double r= sc.nextDouble();
        System.out.println("Enter the Time in years:");
        double t= sc.nextDouble();
        double ci= p * Math.pow(1 + (r / 100), t) - p;
        System.out.println("The Compound Interest is: "+ci);
        System.out.println("Amount after adding Compound Interest: "+(p+ci));
    }
}