//Write an application that finds the substring from any given string using substring method and startsWith & endsWith methods.
import java.util.Scanner;
public class Ques41{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string:");
        String str= sc.nextLine();
        System.out.println("Enter the starting index of substring:");
        int startIndex= sc.nextInt();
        System.out.println("Enter the ending index of substring:");
        int endIndex= sc.nextInt();
        String substring= str.substring(startIndex,endIndex);
        System.out.println("Substring is: "+substring);
        sc.nextLine();
        System.out.println("Enter a prefix to check if the string starts with it:");
        String prefix= sc.nextLine();
        if(str.startsWith(prefix)){
            System.out.println("The string starts with the prefix: "+prefix);
        }
        else{
            System.out.println("The string does not start with the prefix: "+prefix);
        }
        System.out.println("Enter a suffix to check if the string ends with it:");
        String suffix= sc.nextLine();
        if(str.endsWith(suffix)){
            System.out.println("The string ends with the suffix: "+suffix);
        }
        else{
            System.out.println("The string does not end with the suffix: "+suffix);
        }
    }
}