//Write Java Program to check whether a number is palindrome
import java.util.Scanner;
public class Ques17{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        int original= num;
        int reverse= 0;
        int rem=0;
        while(num>0){
            rem= num%10;
            reverse= reverse*10 + rem;
            num= num/10;
        }
        if(original==reverse){
            System.out.println(original+" is a palindrome.");
        }
        else{
            System.out.println(original+" is not a palindrome.");
        }
    }
}