//State the order of evaluation of the operations in each of the following Java statements and implement them to show the value of x after each
//statement. x = 7 + 3 * 6 / 2 – 1; x = 2 % 2 + 2 * 2 – 2 / 2; x = ( 3 * 9 * ( 3 + ( 9 * 3 / (3) ) ) );
import java.util.Scanner;
public class Ques19{
    public static void main(String arg[]){
        int x;
        x = 7 + 3 * 6 / 2 - 1; // Multiplication and Division are evaluated first, then Addition and Subtraction from left to right
        System.out.println("Value of x after first statement: " + x); // x = 7 + 9 - 1 = 15

        x = 2 % 2 + 2 * 2 - 2 / 2; // Modulus, Multiplication, and Division are evaluated first, then Addition and Subtraction from left to right
        System.out.println("Value of x after second statement: " + x); // x = 0 + 4 - 1 = 3

        x = (3 * 9 * (3 + (9 * 3 / (3)))); // Parentheses are evaluated first, then Multiplication and Division from left to right
        System.out.println("Value of x after third statement: " + x); // x = (3 * 9 * (3 + (27 / 3))) = (3 * 9 * (3 + 9)) = (3 * 9 * 12) = 324
    }
}