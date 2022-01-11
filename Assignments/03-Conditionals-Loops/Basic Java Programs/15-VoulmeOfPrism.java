
/*
Program to print the volume of a prism from its Base Area and height
V=B*h = l*w*h;
*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the prism: ");
        double length = input.nextDouble();
        System.out.println("Enter the width of the prism: ");
        double width = input.nextDouble();
        System.out.println("Enter the height of the prism: ");
        double height = input.nextDouble();
        System.out.printf("Volume of the prism is: %.2f", findPrismVolume(length, width, height));
        input.close();
    }
    
    public static double findPrismVolume(double length, double width, double height){
        return length*width*height; 
    }
}
