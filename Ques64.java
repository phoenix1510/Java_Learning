//Write Java Program to print right triangle star pattern
public class Ques64{
    public static void main(String arg[]){
        for(int i=0;i<=5;i++){
            for(int j=i;j>0;j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}