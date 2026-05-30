//Write an application that changes any given string with uppercase letters, displays it , changes it back to lowercase letters and displays it.
import java.util.Scanner;
public class Ques42{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        String upper= str.toUpperCase();    
        System.out.println("String in uppercase: "+upper);
        String lower = upper.toLowerCase();
        System.out.println("String in lowercase: "+lower);
    }
}