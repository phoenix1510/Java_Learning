//Write an application that uses String method indexOf to determine the total number of occurrences of any given alphabet in a defined text.
import java.util.Scanner;
public class Ques37{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a String:");
        String  s= sc.nextLine();
        System.out.println("Enter Alphabet to find occurrences of:");
        char alphabet= sc.nextLine().charAt(0);
        int count=0;
        int index= s.indexOf(alphabet);
        while(index!=-1){
            count++;
            index= s.indexOf(alphabet, index+1);
        }
        System.out.println("Number of occurences of "+alphabet+ "in string is: "+count);
    }
    //uppercase and lowercase are treated differently so S may have 3 occurence and s may have 0.
}