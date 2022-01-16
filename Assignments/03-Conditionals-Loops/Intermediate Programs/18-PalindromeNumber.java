
/*
Find if a number is palindrome or not
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        long num =input.nextLong();
        System.out.print(num+" is ");
        long temp = num, res=0;
        while(temp>0){
            res= res*10+(temp%10);
            temp/=10;
        }
        System.out.print(res==num?"a Palindrom":"Not a Palindrome");
      
    }
    
   
    
    
}
