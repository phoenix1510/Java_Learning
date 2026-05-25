//Write Java Program to find the largest of three numbers
import java.util.Scanner;
public class Ques09{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1= sc.nextInt();
        System.out.println("Enter Second number:");
        int num2= sc.nextInt();
        System.out.println("Enter Third number:");
        int num3= sc.nextInt();
        if(num1>=num2 && num1>=num3){
            System.out.println(num1+" is the largest number.");
        }
        else if(num2>=num1 && num2>=num3){
            System.out.println(num2+" is the largest number.");
        }
        else{
            System.out.println(num3+" is the largest number.");
        }
    }
}