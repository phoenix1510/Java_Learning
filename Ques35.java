//Write an application that uses String method compareTo to compare two strings defined by the user.
import java.util.Scanner;
public class Ques35{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first string: ");
        String str1= sc.nextLine();
        System.out.println("Enter second string: ");
        String str2= sc.nextLine();
        int result= str1.compareTo(str2);
        if(result==0){
            System.out.println("Both strings are equal.");
        }
        else if(result<0){
            System.out.println("First string is less than second string.");
        }
        else{
            System.out.println("First string is greater than second string.");
        }
        //compareTo() returns 0 if both strings are lexicographically equal, a negative integer if the first string is lexicographically less than the second string, and a positive integer if the first string is lexicographically greater than the second string.
    }
}