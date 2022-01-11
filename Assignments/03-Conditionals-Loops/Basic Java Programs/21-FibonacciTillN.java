
/*
Program to print fibonacci series till number n

*/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        int a=0, b=1;
        if(n==1) {
        System.out.println(a);
        return;
        }
        if(n==2){
        System.out.println(a + "\n" + b);
        return;
        }
        System.out.println(a + "\n" + b);
        while(a+b<=n){
           int temp = b;
           b = a+b;
           a= temp;
           System.out.println(b);
        }
        input.close();
    }
    
    
}
