
/*
HCF Of Two Numbers Program
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int  a = input.nextInt();
        System.out.println("Enter the second number:");
        int b = input.nextInt();
        System.out.print("HCF of entered numbers is: " + hcf(a,b));
    }
    
    static int hcf(int x, int y){
        int hcf =1;
        for(int i=1; i<=x || i<=y; i++){
        if(x%i==0 && y%i==0){
            hcf = i;
        }
        }
        return hcf;
    }
}
