//Write Java Program to print alphabet triangle pattern
public class Ques61{
    public static void main(String arg[]){
        char alpha='A';
        for(int i=0;i<=5;i++){
            for(int j=i;j>0;j--){
                System.out.print(alpha+" ");
                alpha++;
            }
            System.out.println();
        }
    }
}