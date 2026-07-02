//Exception Handling program for NullPointerException--thrown if the JVM attempts to perform an operation on an Object that points to no data,
//or null
public class Ques87{
    public static void main(String arg[]){
        String str=null;
        try{
            System.out.println("Length of the string is: "+str.length());
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception!");
        }
    }
}