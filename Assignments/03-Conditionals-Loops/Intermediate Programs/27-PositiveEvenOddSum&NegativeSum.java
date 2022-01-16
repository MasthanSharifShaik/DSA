
/*
program to print the sum of negative numbers, sum of positive even numbers and
the sum of positive odd numbers from a list of numbers (N)
entered by the user. The list terminates when the user enters a zero.
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        int pesum=0, posum =0, nsum=0;
        Scanner input = new Scanner(System.in);
        while(true){
        System.out.println("Enter any positive or negative integer(0 to exit)");
        int n = input.nextInt();
        if(n==0) break;
        if(n>0 && n%2==0) pesum+=n;
        else if(n>0 && n%2==1) posum+=n;
        else nsum+=n;
    }
    System.out.println("Sum of positive even integers is: "+ pesum );
    System.out.println("Sum of positive odd integers is: "+ posum);
    System.out.println("The sum of negative integers is: "+nsum);
    }
}
