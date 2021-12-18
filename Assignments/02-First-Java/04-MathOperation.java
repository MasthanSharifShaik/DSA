
//Program to perform basic math operations on given 2 numbers
import java.util.Scanner;
public class MathOperation {
    public static void main(String args[]) {
     Scanner input = new Scanner(System.in);
     System.out.println("Enter first number: ");
     double num1 = input.nextDouble();
     System.out.println("Enter second number: ");
     double num2 = input.nextDouble();
     System.out.println("Enter the operator (+,-,*,/) : ");
     char op = input.next().trim().charAt(0);
     double result = 0;
     if(op=='+'){
         result = num1+num2;
     }
     else if(op=='-'){
          result = num1-num2;
     }
     else if(op=='*'){
           result = num1*num2;
     }
     else if(op=='/'){
          result = num1/num2;
     }
     else{
          System.out.println("You entered an invalid character");
          return;
     }
     System.out.println("The result is: "+result);
     
    }
}