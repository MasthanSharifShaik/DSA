
/*
Program to find whether the entered number is an Armstrong number or not 
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while(true){
            System.out.println("Enter a positive number(0 to exit):");
            int num = input.nextInt();
            if(num==0){
                System.exit(0);
            }
            if(isArmStrong(num)){
                System.out.println(num + " is an Armstrong number");
            }
            else{
                System.out.println(num + " is not an Armstrong number");
            }
        }
        
        
    }
    
    static boolean isArmStrong(int num){
        int ans=0, temp = num, power = Integer.toString(num).length();
        while(temp!=0){
            ans+=Math.pow(temp%10, power);
            temp/=10;
        }   
        if(ans==num){
            return true;
        }
        else{
            return false;
        }
        
    }
}
