/*Write an application that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in a table format, a shown
below.
Number Square Cube
0 0 0
1 1 1
2 4 8 and so on. */
public class Ques20{
    public static void main(String arg[]){
        System.out.println("Number\tSquare\tCube");
        for(int i=0; i<=10; i++){
            System.out.println(i+"\t"+(i*i)+"\t"+(i*i*i));
        }
    }
}