
/*
Program to calculate the Average of Marks
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the number of subjects: ");
        int n = in.nextInt();
        System.out.println("Enter the marks in each subject: ");
        for(int i=0; i<n; i++)
        sum+=in.nextInt();
        System.out.println("Your marks average is: "+ findAverage(n, sum));
        in.close();
        
    }
    
    static double findAverage(int n, int sum){
        return (double)(sum/n);
    }
}
