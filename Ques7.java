//Write Java Program to check whether a number is positive, negative or zero
import java.util.Scanner;
public class Ques7{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        if(num>0){
            System.out.println(num+" is a Positive number.");
        }
        else if(num<0){
            System.out.println(num+" is a Negative number.");
        }
        else{
            System.out.println("The number is Zero.");
        }
    }
}