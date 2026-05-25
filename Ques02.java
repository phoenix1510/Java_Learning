//Write Java Program to display student details
import java.util.Scanner;
public class Ques02{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name= sc.nextLine();
        System.out.println("Enter Student Branch:");
        String branch= sc.nextLine();
        System.out.println("Enter Student Batch:");
        String batch= sc.nextLine();
        System.out.println("Student Details:");
        System.out.println("Name: "+name);
        System.out.println("Branch: "+branch);
        System.out.println("Batch: "+batch);
    }
}