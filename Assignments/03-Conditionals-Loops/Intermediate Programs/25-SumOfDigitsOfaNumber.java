
/*
Check Leap Year Or Not
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        System.out.print("Sum of digits of "+ n+ " is "+ sumOfDigits(n));
        
    }
    
   static int sumOfDigits(int n){
       int sum=0, temp=n;
       while(temp>0){
           sum+= temp%10;
           temp/=10;
       }
       return sum;
   }
}
