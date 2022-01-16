// Write a function to find if a number is a palindrome or not. Take number as parameter.
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print(num +" is ");
        System.out.println(isPalin(num)? "a Palindrome":" not a Palindrome");
        input.close();
    }
     static boolean isPalin(int num){
         int temp = num, res=0;
         while(temp>0){
             res = res*10 + temp%10;
             temp/=10;
         }
         
         return (res==num);
     }
}