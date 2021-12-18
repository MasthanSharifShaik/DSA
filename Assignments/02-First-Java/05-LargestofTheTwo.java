
import java.util.Scanner;
public class LargestofTheTwo{
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        long first = input.nextInt();
        System.out.println("Enter the second number");
        long second = input.nextInt();
        if(first==second){
        System.out.println("\nBoth are equal");
        }
        System.out.println("\nThe highest of the entered two numbers is: "+ findMax(first, second));
    }
    
    public static long findMax(long first, long second){
        return (first > second) ? first : second;
    }
}