//Write Java Program to check whether a number is Armstrong
import java.util.Scanner;
public class Ques18{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number to check Armstrong:");
        int num= sc.nextInt();
        int temp= num;
        int sum=0;
        int rem=0;
        while(temp>0){
            rem= temp%10;
            sum= sum+ rem*rem*rem;
            temp= temp/10;
        }
        if(num==sum){
            System.out.println(num+" is an Armstrong number.");
        }
        else{
            System.out.println(num+" is not an Armstrong number.");
        }  
    //this only considers 3 digit numbers as Armstrong number. For more than 3 digit numbers, we need to calculate the power according to the number of digits in the number.
    } 
}