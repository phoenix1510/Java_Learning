//Write Java Program to find sum and average of array elements.
import java.util.Scanner;
public class Ques24{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements in array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();   
        }
        int sum=0;
        double avg=0;
        for(int i=0;i<size; i++){
            sum=sum+arr[i];
        }
        avg=sum/(double) size;
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average of array elements: " + avg); 
    }
}