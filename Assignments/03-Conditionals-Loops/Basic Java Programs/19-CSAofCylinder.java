
/*
Program to print the Curved Surface Area of a Cylinder from its radius and height

*/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        System.out.printf("\nCurved Surface Area of the Cylinder is: %.2f", findCylinderCSA(radius, height));
        input.close();
    }
    
    public static double findCylinderCSA(double radius, double height){
        return 2*Math.PI*radius*height; 
    }
}
