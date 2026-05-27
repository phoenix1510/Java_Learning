//Write Java Program to count frequency of elements in an array
import java.util.Scanner;
public class Ques26{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter elements in array: ");
        for(int i=0; i<size; i++){
            arr[i]= sc.nextInt();   
        }
        //Will use another array to store frequency of elements
        int freq[] = new int[size];
        for(int i=0; i<size; i++){
            freq[i]=1; 
        }
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                if(arr[i]==arr[j]){
                    freq[i]++;
                    freq[j]=0; 
                }
            }
        }
        System.out.println("Element\tFrequency");
        for(int i=0; i<size; i++){
            if(freq[i]>0){
                System.out.println(arr[i] + "\t" + freq[i]);
            }
        }
    }
}