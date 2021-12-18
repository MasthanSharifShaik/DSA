
//Program to print armstrong numbers between two given numbers
import java.util.Scanner;
public class Armstrong{
    public static void main(String[] args){
        
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the first number");
        long first = obj.nextInt();
        System.out.println("Enter the second number");
        long second = obj.nextInt();
        if(first==0 || second==0){
            return;
        }
        for(long i=first; i<=second; i++){
            if(isArmstrong(i)){
                System.out.println(i+ " is an Armstrong number");
            }
        }
        
    }
    
    public static boolean isArmstrong(long num){
        long temp = num, sum=0;
        
        while(temp>0){
            long rem = temp%10;
            sum+=Math.pow(rem,3);
            temp/=10;
        }
        return sum==num;
    }
}