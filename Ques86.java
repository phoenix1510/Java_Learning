//Exception Handling program for storing values in array of int or String that results into buffer overflow
import java.util.Scanner;
public class Ques86{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        try{
            System.out.println("Enter "+size+" elements in the array: ");
            for(int i=0;i<=size;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Array elements are: ");
            for(int i=0;i<size;i++){
                System.out.println(arr[i]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bounds!");
        }
        catch(Exception e){
            System.out.println("Invalid input!");
        }
    }
}