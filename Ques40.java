//Write an application that uses String method charAt to reverse the string.
import java.util.Scanner;
public class Ques40{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string to get reverse :");
        String str= sc.nextLine();
        System.out.println("String after reversing: ");
        for(int i=str.length()-1;i>=0;i--){
            System.out.print(str.charAt(i));
        }
    }
}