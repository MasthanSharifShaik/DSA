
/*
Program to print the volume of a cone from its radius and height
*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the raduis of the cone: ");
        double radius = input.nextDouble();
        System.out.println("Enter the height of the cone: ");
        double height = input.nextDouble();
        System.out.printf("Volume of the cone is: %.2f", findConeVolume(radius, height));
        input.close();
    }
    
    public static double findConeVolume(double radius, double height){
        return Math.PI*radius*radius*height/3; 
    }
}
