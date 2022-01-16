
/*
Define a method that returns the product of two numbers entered by user.
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        long first = input.nextLong();
        System.out.println("Enter the second number: ");
        long second = input.nextLong();
        System.out.println("Product of "+ first +" and "+ second + " is: "+productOfTwo(first, second));
        input.close();
    }
 static long productOfTwo(long first, long second){
     return first * second;
 }
 
}
