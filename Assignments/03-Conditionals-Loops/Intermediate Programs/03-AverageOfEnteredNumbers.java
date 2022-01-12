/* Program to print Average of the Entered numbers */
/* sum of first n natural numbers is n*(n+1)/2
   Average of first n natural numbers is (n*(n+1)/2)/n==(n+1)/2
   */
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n = in.nextInt(), sum=0;
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
           sum+= in.nextInt();
        }
        double avg = (double)sum/n;
        System.out.println("Average of the elements is: "+ avg);
        
    }
}