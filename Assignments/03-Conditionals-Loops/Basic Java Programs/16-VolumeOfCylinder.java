
/*
Program to print the volume of a cyclinder from its radius and height

*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        double radius = input.nextDouble();
        System.out.println("Enter the height of the cylinder: ");
        double height = input.nextDouble();
        System.out.printf("Volume of the cylinder is: %.2f", findCylinderVolume(radius, height));
        input.close();
    }
    
    public static double findCylinderVolume(double radius, double height){
        return Math.PI*radius*radius*height; 
    }
}
