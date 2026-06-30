//Write Java Program to print Pascal’s triangle***
public class Ques60{
    public static void main(String args[]){
        int n=5;
        for(int i=0;i<n;i++){
            int number=1;
            System.out.format("%"+(n-i)*2+"s",""); //System.out.format is used to format the output.
            for(int j=0;j<=i;j++){
                System.out.format("%4d",number);
                number=number*(i-j)/(j+1);
            }
            System.out.println();
        }
    }
}