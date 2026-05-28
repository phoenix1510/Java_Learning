//Write Java Program to check palindrome string
import java.util.Scanner;
public class Ques33{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String str= sc.nextLine();
        String rev="";
        for(int i=str.length()-1; i>=0; i--){
            rev+= str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println(str + " is a palindrome string.");
        }
        else{
            System.out.println(str + " is not a palindrome string.");
        }
    }
}