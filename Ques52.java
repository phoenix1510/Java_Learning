//Write Java Program to print pyramid star pattern
public class Ques52{
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
    }
}