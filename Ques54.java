//Write Java Program to print diamond star pattern
public class Ques54{
    public static void main(String arg[]){
        for(int i=0;i<5;i++){
            for(int j=5;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=5;k>i;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}