//Write Java Program to print inverted right triangle star pattern
public class Ques51{
    public static void main(String arg[]){
        for(int i=0;i<5;i++){  //horizontal
            for(int j=5;j>i;j--){ //vertical
                System.out.print("* ");
            }
            System.out.println();
        }
        //we basically decrease the numnber of starts by 1 in each line, so we can use the same loop but with different condition
    }
}