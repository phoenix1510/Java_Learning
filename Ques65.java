//Write Java Program to print inverted right triangle star pattern
public class Ques65{
    public static void main(String arg[]){
        for(int i=0;i<=5;i++){
            for(int j=5-i;j>0;j--){
                System.out.print("* ");
            }
        System.out.println();
        }
    }
}