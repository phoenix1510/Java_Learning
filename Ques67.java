//Write Java Program to print inverted pyramid star pattern
public class Ques67{
    public static void main(String arg[]){
        for(int i=0;i<=5;i++){
            for(int j=i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=5-i;k>0;k--){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}