
//Program to output Simple Interest from Principal, Time and Rate of Interest 
import java.util.Scanner;
public class SimpleInterest{
    public static void main(String[] args){
        System.out.println("Program to Output Simple Interest from Principal, Time and Rate of Interest\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the principal amount");
        double principal = input.nextDouble();
        System.out.println("Enter the time in years");
        double time = input.nextLong();
        System.out.println("Enter the Rate of Interest (in percent)");
        double rate = input.nextInt();
        
        double interest = (principal*time*rate)/100;
        System.out.println("The Simple Interest is: %.2f"+ interest);
        
    }
}