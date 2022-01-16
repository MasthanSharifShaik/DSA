// Write a function that returns the sum of first n natural numbers.

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = input.nextInt();
        System.out.println("The Sum of first "+n+" natural numbers is: " + sumOfFirstN(n));
        input.close();
    }
    
    // static float sumOfFirstN(int n){
    //     int sum= 0;
    //      for(int i=1; i<=n; i++)
    //      sum+=i;
    //      return sum;
    //  }
     
    //  static float sumOfFirstN(int n){
    //      return n*(n+1)/2;
    //  }
     
      //avoids overflow if result is going to be within integer limits.
     static float sumOfFirstN(int n){
         if(n%2==0)
         return (n/2)*(n+1);
         else
         return ((n+1)/2)*n;  // If n is odd, (n+1) must be even
     }
}