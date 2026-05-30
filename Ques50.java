//Write Java Program to print right triangle star pattern
public class Ques50{
    public static void main(String arg[]){
        for(int i=1;i<=5;i++){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}