//Program to return the area of a parallelogram from its base and height
import java.util.Scanner;
public class ParallelogramArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the height: ");
        double height = input.nextDouble();
        
        System.out.println("Enter the base: ");
        double base = input.nextDouble();
        System.out.println("Area of Parallelogram is: "+ findParallelogramArea(height, base));
        input.close();
    }
    
    public static double findParallelogramArea(double height, double base){
        return height*base;
    }
}