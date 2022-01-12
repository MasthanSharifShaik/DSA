/*Electricity Bill Program  */

import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the amount of power usage in Kwh: ");
      double kwh = input.nextDouble();
      System.out.println("Enter power cost of Kwh: ");
      double cost = input.nextDouble();
      System.out.println("Enter the number of days power used: ");
      int days = input.nextInt();
      if(days>0 && cost>0 && kwh>0){
      System.out.printf("Your electricity bill is: "+ calcBill(kwh, cost, days));
      }
      else{
          System.out.println("Invalid Input");
      }
     
    }
    
    public static double calcBill(double kwh, double cost, double days){
       return kwh*cost/days;
    }
    
   
    
}