//Write an application that uses String method concat to concatenate two defined strings.
import java.util.Scanner;
public class Ques38{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter String 1:");
        String s1= sc.nextLine();
        System.out.println("Enter String 2:");
        String s2= sc.nextLine();
        System.out.println("Concatenation of strings is the string: "+s1.concat(s2));
    }
}