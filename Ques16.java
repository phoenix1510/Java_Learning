//Write Java Program to check whether a number is prime
import java.util.Scanner;
public class Ques16{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check prime:");
        int num= sc.nextInt();
        for(int i=2;i<=num/2; i++){//iteration only till half of the number since a number cannot be divided by more than its half
            if(num%i==0){
                System.out.println(num+" is not a prime number.");
                return;
            }
        }
        System.out.println(num+" is a prime number.");
    }
}
