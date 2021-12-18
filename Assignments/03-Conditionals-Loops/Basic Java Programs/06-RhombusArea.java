//Program to return the area of a rhombus from length of its diagonals
import java.util.Scanner;
public class RhombusArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of one diagonal of the rhombus: ");
        double diag1 = input.nextDouble();
        
        System.out.println("Enter the length of other diagonal of the rhombus: ");
        double diag2 = input.nextDouble();
        System.out.println("Area of Rhombus is: "+ findRhombusArea(diag1, diag2));
        input.close();
    }
    
    public static double findRhombusArea(double d1, double d2){
        return (d1*d2)/2;
    }
}