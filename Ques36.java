//Write an application that uses String method equals and equalsIgnoreCase to tests any two string objects for equality.
import java.util.Scanner;
public class Ques36{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1= sc.nextLine();
        System.out.println("Enter String 2:");
        String s2=sc.nextLine();
        System.out.println("Comparison using equals(): ");
        if(s1.equals(s2)){
            System.out.println("Both Strings are completely equal.");
        }
        else{
            System.out.println("Both Strings are not equal.");
        }
        System.out.println("Comparison using equalsIgnoreCase(): ");
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("Both Strings are equal ignoring case.");
        }
        else{
            System.out.println("Both Strings are not equal even ignoring case.");
        }
    }
}