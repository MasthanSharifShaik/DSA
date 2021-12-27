
/* Program to return perimeter of an Equilateral Triangle from its side*/
import java.util.Scanner;
public class EquiTrianglePerimeter
{
    public static void main(String[] args) {
        System.out.println("Enter the side of Equilateral Tringle: ");
        Scanner input = new Scanner(System.in);
        double side = input.nextDouble();
        System.out.printf("Perimeter of the Equilateral Triangle is: %.3f",equiTrianglePerimeter(side));
        input.close();
    }
    
    public static double equiTrianglePerimeter(double side){
        return 3*side;
    }
}
