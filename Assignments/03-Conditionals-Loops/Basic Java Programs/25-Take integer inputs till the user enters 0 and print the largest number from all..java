
/*
Program to Take integer inputs till the user enters 0 and print the largest number from all.
*/
import java.util.Scanner;
import java.lang.Math;
public class Main{
    public static void main(String[] args){
        int sum=0, max=Integer.MIN_VALUE;
        Scanner input = new Scanner(System.in);
        System.out.println("Keep entering numbers & Enter 0 to quit: ");
        while(true){
        int n = input.nextInt();
        if((int)n==0) break;
        max = Math.max(n, max);
        }
        System.out.println("Largest of the entered numbers is: "+ max);
}

}