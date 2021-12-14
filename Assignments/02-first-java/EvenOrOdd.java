
//Program to print whether a given number is Even Or Odd

import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String args[]) {
     System.out.println("Enter a number");
     Scanner input = new Scanner(System.in);
     int num = input.nextInt();
     
     if(isEven(num)){
         System.out.println("You Entered an Even number: "+ num + " !");
     }
     else{
         System.out.println("You Entered an Odd number: "+ num + " !");
     }
     
    }
    
    public static boolean isEven(int n){
        return n%2==0;
    }
}