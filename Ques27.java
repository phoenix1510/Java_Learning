//Write Java Program to sort array using Bubble Sort
import java.util.Scanner;
public class Ques27{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size =sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements in array: ");
        for(int i=0;i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array before sorting: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
        for(int i=0;i<size-1; i++){
            for(int j=0; j<size-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        System.out.println("\nArray after bubble sorting: ");
        for(int i=0; i<size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}       