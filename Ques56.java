//Write Java Program to print sandglass star pattern
public class Ques56{
    public static void main(String arg[]){
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print("  ");
            }
            for(int k=i;k<=5;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=1;i<=4;i++){
            for(int j=3;j>=i;j--){
                System.out.print("  ");
            }
            for(int k=1;k<=i+1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}