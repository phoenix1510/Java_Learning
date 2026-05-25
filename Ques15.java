//Write Java Program to check whether a year is a leap year
import java.util.Scanner;
public class Ques15{
    public static void main(String arg[]){ //main method which takes command line arguments as an array of strings.
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a year in yyyy format:");
        int year= sc.nextInt();
        if((year%4==0 && year%100!=0) || (year%400==0)){ 
            //remainder of 4 but not of 100 takes years within a century and remainder of 400 takes century years. all remainder of 100 are not leap years but remainder of 400 are leap years.
            System.out.println(year+ " is a Leap year.");
        }
        else{
            System.out.println(year+ " is not a Leap year.");
        }
    }
}
