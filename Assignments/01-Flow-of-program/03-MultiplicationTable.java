// Program to Take a number as input and print the multiplication table for it.

import java.util.Scanner;
public class MultiTable{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        
        System.out.println("Enter the no.of multiples needed in the table");
        int mulCount = input.nextInt();
        
        for(int i=1; i<=mulCount ; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}