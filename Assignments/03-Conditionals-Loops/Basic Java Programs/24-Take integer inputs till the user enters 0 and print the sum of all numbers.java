
/*
Program to Take integer inputs till the user enters 0 and print the sum of all numbers
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        int sum=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Keep entering numbers to sum & Enter 0 to quit: ");
        while(true){
        int n = input.nextInt();
        if((int)n==0) break;
        sum+=n;
        }
        System.out.println("Sum of the entered numbers is: "+ sum);
}

}