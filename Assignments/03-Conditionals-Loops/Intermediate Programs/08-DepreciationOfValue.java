/* Calculate Depreciation of Value*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the amount: ");
        long amount = in.nextLong();
        System.out.println("Enter the depreciation percentage: ");
        long dep_perc = in.nextLong();
        System.out.println("Enter the number of years: ");
        long years = in.nextLong();
        long temp = amount;
        for(int i=0; i<years; i++){
            temp = (100-dep_perc)*(temp)/100;
        }
        
        System.out.println("The amount after depreciation is: "+temp);
    }
}