//Write Java Program to reverse a string
import java.util.Scanner;
public class Ques32{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String s= sc.nextLine();
        System.out.println("String before reversing: " + s);
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev+= s.charAt(i);  //used the charAt() method to get character at index i
        }
        System.out.println("String after reversing: " + rev);
    }
}