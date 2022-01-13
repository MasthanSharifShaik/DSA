
/*
Program to calculate the Addition Of Two Numbers
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        Long first = in.nextLong();
        System.out.println("Enter the second number: ");
        Long second = in.nextLong();
        System.out.println("Sum of "+first+ " and " + second+ " is: "+ findSum(first, second));
        in.close();
        
    }
    
    static Long findSum(Long first, Long second){
        return first + second;
    }
}
