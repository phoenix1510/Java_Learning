//Write Java Program to count vowels and consonants in a string
import java.util.Scanner;
public class Ques34{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String str= sc.nextLine();
        int vowelCount=0;
        int consonantCount=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' || str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U'){
                vowelCount++;
            }
            else if((((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z'))) && (((str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u' ||str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')))){
                consonantCount++;
            }
        }
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}