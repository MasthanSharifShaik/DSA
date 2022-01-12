/*Program to print factorial of a number */

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a number: ");
      int num = input.nextInt();
      System.out.printf("Factorial of %d is: %d", num, factorial(num));
    }
    
    public static int factorial(int n){
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact *=i;
        }
        
        return fact;
    }
    
    // public static int factorial(int n){
    //     if(n<=0) return 1;
    //     return n*factorial(n-1);
    // }
    
}