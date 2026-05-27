//Write Java Program to perform Binary Search
import java.util.Scanner;
public class Ques29{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size =sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements in array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();   
        }
        System.out.println("Enter element to search: ");
        int key = sc.nextInt();
        int high= size-1;
        int low =0;
        while(low<=high){
            int mid= high+low/2;
            if(arr[mid]==key){
                System.out.println("Element found at index: " + mid);
                return;
            }
            else if(arr[mid]<key){
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        System.out.println("Element not found");
    }
}