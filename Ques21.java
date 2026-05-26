/* A mail-order house sells five products whose retail prices are as follows : Product 1 : Rs. 99.90 , Product 2 : Rs. 20.20 , Product 3 : Rs. 6.87
Product 4 : Rs. 45.50 and Product 5 : Rs. 40.49 . Write an application that reads a series of pairs of numbers as follows :
a) product number b) quantity sold
your program use a switch statement to determine the retail price for each product. It should calculate and display the total retail value of all
products sold. */
import java.util.Scanner;
public class Ques21{
    public static void main(String arg[]){
        Scanner sc= new Scanner(System.in);
        double totalRetailValue=0;
        System.out.println("Retail store:");
        System.out.println("Product 1 : Rs. 99.90");
        System.out.println("Product 2 : Rs. 20.20");
        System.out.println("Product 3 : Rs. 6.87");
        System.out.println("Product 4 : Rs. 45.50");
        System.out.println("Product 5 : Rs. 40.49");
        while(true){
            System.out.print("Enter product number (1-5) or 0 to exit: ");
            int productNumber = sc.nextInt();
            if (productNumber == 0) {
                break; 
            }
            System.out.print("Enter quantity sold: ");
            int quantitySold = sc.nextInt();
            double retailPrice = 0;
            switch (productNumber) {
                case 1:
                    retailPrice = 99.90;
                    break;
                case 2:
                    retailPrice = 20.20;
                    break;
                case 3:
                    retailPrice = 6.87;
                    break;
                case 4:
                    retailPrice = 45.50;
                    break;
                case 5:
                    retailPrice = 40.49;
                    break;
                default:
                    System.out.println("Invalid product number. Please enter a number between 1 and 5.");
                    continue;
            }
            totalRetailValue += retailPrice * quantitySold; 
        System.out.println("Final total retail value: Rs. " + (int) totalRetailValue); 
    }
}