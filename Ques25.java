//Write Java Program to reverse an array.
import java.util.Scanner;
public class Ques25{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size =sc.nextInt();
        in arr[] = new int[size];
        System.out.println("Enter elements in array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();   
        }
        System.out.println("Reversed array: ");
        for(int i=size-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}