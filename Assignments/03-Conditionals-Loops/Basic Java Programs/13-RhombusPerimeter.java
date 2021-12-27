
/* Program to return perimeter of a Rhombus from its side*/

import java.util.Scanner;
public class RhombusPerimeter
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of Rhombus: ");
        double side = input.nextDouble();
        
        System.out.printf("Perimeter of the Rhombus is: %.2f",rhombusPerimeter(side));
        input.close();
    }
    
    public static double rhombusPerimeter(double side){
        return 4*side;
    }
}
