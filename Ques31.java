//Write Java Program to transpose a matrix
import java.util.Scanner;
public class Ques31{
    public ststic void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        int mat1[][]= new mat[3][3];
        System.out.println("Enter elements in matrix: ");
        for(int i=0;i<3;i++){
            for(int j=0; j<3; j++){
                mat1[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix before transposing: ");
        for(int i=0;i<3;i++){
            for(int j=0; j<3; j++){
                System.out.print(mat1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Matrix after transposing: ");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(mat1[j][i] + " ");
            }
            System.out.println();
        }
    }
}