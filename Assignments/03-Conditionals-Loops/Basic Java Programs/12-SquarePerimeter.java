
/* Program to return perimeter of a Square from its side*/

import java.util.Scanner;
public class SquarePerimeter
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side of Square: ");
        double side = input.nextDouble();
        
        System.out.printf("Perimeter of the Square is: %.2f",squarePerimeter(side));
        input.close();
    }
    
    public static double squarePerimeter(double side){
        return 4*side;
    }
}
