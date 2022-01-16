// function that returns all prime numbers between two given numbers.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        int count = 0;
        System.out.println("The primes between "+ first + " and "+ second+ " are: ");
        for(int i=first; i<=second ;i++){
            if(isPrime(i)){
            System.out.print(i+" ");
            count++;
            }
        }
        if(count==0) System.out.println("None");
        input.close();
    }
     static boolean isPrime(int n){
         if(n<2) return false;
         for(int i=2; i*i<=n; i++){
             if(n%i==0)  return false;
         }
         return true;
     }
}