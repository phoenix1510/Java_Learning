//program for right angled triangle star pattern (hypotenuse on the right)
public class Ques57{
    public static void main(String[] arg){
        for(int i=1;i<=5;i++){
            for(int j=5;j>i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}