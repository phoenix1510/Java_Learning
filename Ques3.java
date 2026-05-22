//Write Java Program to add two numbers
import java.util.Scanner;
public class Ques3{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1= sc.nextInt();
        System.out.println("Enter Second number:");
        int num2= sc.nextInt();
        int sum = num1 + num2;
        System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
    }
}