/* write application that take a series of integers in pair(e.g. (a,b)) and find the following
i) Is first one is greater ii) Is both are even iii) They are relatively prime or not  */
import java.util.Scanner;
public class Ques22{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        while(true){
            System.out.print("Enter first integer (or 0 to exit): ");
            int a = sc.nextInt();
            if (a == 0) {
                break;
            }
            System.out.print("Enter second integer: ");
            int b = sc.nextInt();
            
            if (a > b) {
                System.out.println(a + " is greater than " + b);
            } else if (a < b) {
                System.out.println(b + " is greater than " + a);
            } else {
                System.out.println("Both integers are equal.");
            }
            
            if (a % 2 == 0 && b % 2 == 0) {
                System.out.println("Both integers are even.");
            } else {
                System.out.println("Both integers are not even.");
            }
            int gcd=1;
            if(a==0 || b==0){
                System.out.println("Both integers are not relatively prime.");
            } 
            else {
                for(int i=1; i<=Math.min(a,b); i++){
                    if(a%i==0 && b%i==0){
                        gcd=i;
                    }
                }
                if(gcd==1){
                    System.out.println("Both integers are relatively prime.");
                } else {
                    System.out.println("Both integers are not relatively prime.");
                }
            }
        }
    }
}