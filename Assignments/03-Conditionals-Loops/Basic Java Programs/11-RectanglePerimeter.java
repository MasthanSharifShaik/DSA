
/* Program to return perimeter of a Rectangle from its length and width*/

import java.util.Scanner;
public class RectanglePerimeter
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of Rectangle: ");
        double width = input.nextDouble();
        
        System.out.printf("Perimeter of the Rectangle is: %.2f",rectanglePerimeter(length, width));
        input.close();
    }
    
    public static double rectanglePerimeter(double length, double width){
        return 2*(length+width);
    }
}
