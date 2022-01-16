
/*
Write a program to print the sum of two numbers entered by user by defining your own method.
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
        System.out.println("Sum of "+ first +" and "+ second + " is: "+sumOfTwo(first, second));
        input.close();
    }
 static long sumOfTwo(long first, long second){
     return first + second;
 }
 
}
