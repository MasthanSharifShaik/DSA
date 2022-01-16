
/*
Check Leap Year Or Not
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a year:");
        int n = input.nextInt();
        System.out.print(n+ " is ");
        System.out.print(isLeap(n)?"a leap year": "not a leap year");
        
    }
    
   static boolean isLeap(int n){
       return (n%400==0 || (n%4==0 && n%100!=0));
   }
}
