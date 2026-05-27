//Write Java Program to sort array using Selection Sort
import java.util.Scanner;
public class Ques28{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size =sc.nextInt();
        int arr[]= new int[size];
        System.out.println("Enter elements in array:");
        for(int i=0; i<size;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Array before Sorting:");
        for(int i=0;i <size; i++){
            System.out.print(arr[i]+ " ");
        }
        for(int i=0; i<size-1; i++){
            int temp =i;
            for(int j=i+1;j<size;j++){
                if(arr[j]<arr[temp]){
                    temp = j;
                }
            }
            int t = arr[temp];
            arr[temp] = arr[i];
            arr[i] = t;
        }
    }
}