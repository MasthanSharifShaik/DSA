//Program to Sum the given two numbers

import java.util.Scanner;


public class SumOfTwoNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number");
        int first = input.nextInt();
        System.out.println("Enter second number");
        int second = input.nextInt();
        System.out.println("The Sum of " + first + " and " + second + " is " + (first + second));
        
    }
    
}