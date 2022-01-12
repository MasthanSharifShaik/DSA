/* Program to calcualte discount */

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the price of the product: ");
        double price = in.nextDouble(), discount = 0;
        
        if(price<=500){
            discount = price*0.1;
        }
        else if(price<=1000){
            discount = price*0.2;
        }
        else 
            discount = price*0.3;
        System.out.println("Discount on the product is: "+ discount);
        System.out.println("Total price of the product is: "+ (price-discount));
        
    }
}