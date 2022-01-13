
/*
Program to calculate the batting average
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of runs: ");
        long runs = in.nextInt();
        
        System.out.println("Enter the number of matches: ");
        long matches = in.nextInt();
        System.out.println("Enter the number of not-out matches: ");
        long not_out = in.nextInt();
        long out_matches = matches - not_out;
        double avg = runs/(out_matches);
        System.out.println("The batting average is: "+ avg);
        
    }
}
