
/*
Program to print the volume of a pyramid from its length, width and height

*/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the pyramid: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the pyramid: ");
        double width = input.nextDouble();
        System.out.println("Enter the height of the pyramid: ");
        double height = input.nextDouble();
        System.out.printf("\nVolume of the pyramid is: %.2f", findPyramidVolume(length, width, height));
        input.close();
    }
    
    public static double findPyramidVolume(double length, double width, double height){
        return length*width*height/3; 
    }
}
