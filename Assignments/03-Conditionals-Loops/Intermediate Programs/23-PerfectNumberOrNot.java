
/*
Perfect Number In Java
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = input.nextInt();
        System.out.print(n+ " is ");
        System.out.print(isPerfect(n)?"a perfect number": "not a perfect number");
        
    }
    
   static boolean isPerfect(int n){
       int sum=0;
       for(int i=1; i<n; i++){
           if(n%i==0)
           sum+=i;
       }
       return n==sum;
   }
}
