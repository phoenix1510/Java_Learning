//Write Java Program to find largest and smallest element in an array
import java.util.Scanner;
public class Ques23{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements in array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();   
        }
        int largest = arr[0];
        int smallest = arr[0];
        for(int i=1;i<size; i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
            if(arr[i]<smallest){
                smallest = arr[i];
            }
        }
        System.out.println("Largest element in array: " + largest);
        System.out.println("Smallest element in array: " + smallest);
    }
}