
/*
Find if a number is palindrome or not
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount:");
        double p = input.nextInt();
        System.out.println("Enter the time in years:");
        double t = input.nextInt();
        System.out.println("Enter the rate of interest:");
        double r = input.nextInt();
        double fiv = p*Math.pow((1+r/100),t);
        System.out.print("Future Investment Value is: " + fiv);
    }
}
