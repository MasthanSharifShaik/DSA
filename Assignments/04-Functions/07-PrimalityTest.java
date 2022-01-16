
/*
Define a method to find out if a number is prime or not.*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num = input.nextLong();
        if(num<2){
            System.out.println(num+" is neither prime nor composite");
            System.exit(0);
        }
        
      
        if(isPrime(num)){
        System.out.println(num+  " is a Prime number");
        }
        else{
            System.out.println(num+  " is a composite number");
        }
        input.close();
    }
    
    static boolean isPrime(long num){
        for(int i=2; i*i<=num; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
 
}
