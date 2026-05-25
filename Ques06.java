//Write Java Program to check whether a number is even or odd
import java.util.Scanner;
public class Ques06{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println(num+ " is an Even number.");
        }
        else{
            System.out.println(num+ " is an Odd number.");
        }
    }
}