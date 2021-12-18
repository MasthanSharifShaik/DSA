
//Program to convert amount from rupees to dollars
import java.util.Scanner;
public class MyClass{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the amount in INR: ");
        double rup = obj.nextDouble();
        System.out.println("The entered amount in USD is: "+ toDollar(rup) +" USD");
        
    }
    
    public static double toDollar(double amount){
        return amount/(76.31); //1 USD = 76.31 Rupees as on Dec-2021
    }
}