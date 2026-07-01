//Write Java Program to print pyramid star pattern
public class Ques66{
    public static void main(String arg[]){
        for(int i=0;i<=5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=i;k>0;k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}