/*program to print a number raised to the given number*/

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = in.nextInt();
        System.out.println("Enter the power: ");
        int power = in.nextInt();
        int ans=1, pow2=power;
        while(power>0){
            ans*=n;
            power--;
        }
        
        System.out.println(n + " raised to the power of "+ pow2 + " is: "+ans);
        in.close();
    }
   
}