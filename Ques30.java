//Write Java Program to add two matrices
import java.util.Scanner;
public class Ques30{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int mat1[][] = new int[3][3];
        int mat2[][] = new int[3][3];
        System.out.println("Enter elements of first matrix: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                mat1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter elements of second matrix: ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                mat2[i][j] = sc.nextInt();
            }
        }
        System.out.println("Sum of two matrices: ");
        for(int i=0;i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print((mat1[i][j]+mat2[i][j])+ " ");
            }
            System.out.println();
        }
    }
}