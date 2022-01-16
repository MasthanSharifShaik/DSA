// Factorial of a Number
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n= input.nextInt();
        System.out.println("Factorial of "+n+" is: "+ fact(n));
        input.close();
    }
    
    // static int fact(int n){
    //     if(n<=1) return 1;
    //     return n*fact(n-1);
    // }
    
    static int fact(int n){
        int res = 1;
        for(int i=2; i<=n; i++)
        res *= i;
        return res;
    }
}