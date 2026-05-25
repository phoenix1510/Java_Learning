//Write Java Program to calculate Simple Interest
import java.util.Scanner;
public class Ques10{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Principal Amount:");
        double p= sc.nextDouble();
        System.out.println("Enter the Rate of Interest:");
        double r= sc.nextDouble();
        System.out.println("Enter the Time in years:");
        double t= sc.nextDouble();
        double si= (p*r*t)/100;
        System.out.println("The Simple Interest is: "+si);
        System.out.println("Amount after adding Simple Interest: "+(p+si));
    }
}