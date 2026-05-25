//Write Java Program to convert Celsius to Fahrenheit
import java.util.Scanner;
public class Ques14{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");
        double celcius= sc.nextDouble();
        double fahrenheit= ((celcius)*1.8)+32;
        System.out.println("Temperature in Fahrenheit is: "+fahrenheit);
    }
}