
/*
Program to print the volume of a sphere from its radius

*/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        double radius = input.nextDouble();
        System.out.printf("Volume of the sphere is: %.2f", findSphereVolume(radius));
        input.close();
    }
    
    public static double findSphereVolume(double radius){
        return 4*Math.PI*Math.pow(radius,3)/3; 
    }
}
