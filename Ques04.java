//Write Java Program to swap two numbers
import java.util.Scanner;
public class Ques4{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter First number:");
        int num1= sc.nextInt();
        System.out.println("Enter Second number:");
        int num2= sc.nextInt();
        System.out.println("Before Swapping:");
        System.out.println("First number: "+num1+" Second number: "+num2);
        int temp= num1;
        num1=num2;
        num2=temp;
        System.out.println("After Swapping:");
        System.out.println("First number: "+num1+" Second number: "+num2);
    }
}