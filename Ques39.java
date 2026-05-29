//Write an application that finds the length of a given string.
import java.util.Scanner;
public class Ques39{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        System.out.println("Length of the given String is: "+str.length());
    }
    //for string objects length() method is used, for arrays length is a static variable.
}