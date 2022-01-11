
/*
Program to print the Total Surface Area Of Cube from length of the side of each edge of the cube

*/

import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of the cube: ");
        double side = input.nextDouble();
        System.out.printf("\nTotal Surface Area Of the Cube is: %.2f", findCubeTSA(side));
        input.close();
    }
    
    public static double findCubeTSA(double side){
        return 6*Math.pow(side,2); 
    }
}
