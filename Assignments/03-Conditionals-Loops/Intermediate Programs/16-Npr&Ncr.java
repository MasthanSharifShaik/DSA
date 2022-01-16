
/*
Find Ncr & Npr
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n =input.nextInt();
        System.out.println("Enter the value of r: ");
        int r =input.nextInt();
        if(n>=r){
        System.out.println("Npr of is: "+ findNpr(n,r));
        System.out.println("Ncr of is: "+ findNcr(n,r));
        }
    }
    
    
    static float findNpr(int n, int r){
        return fact(n)/fact(n-r);
    }
    
    static float findNcr(int n, int r){
        return fact(n)/(fact(n-r)*fact(r));
    }
    
    // static int fact(int n){
    //     if(n<=1){
    //         return 1;
    //     }
        
    //     return n*fact(n-1);
    // }
    
    static int fact(int n){
        if(n<=1){
            return 1;
        }
       int ans=1;
       for(int i=1; i<=n; i++){
           ans*=i;
       }
       return ans;
    }
    
    
}
