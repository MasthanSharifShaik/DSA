//Program to return the area of an Equilateral triangle
import java.util.Scanner;
public class EquiTriangleArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of the side of an Equilateral triangle: ");
        double side = input.nextDouble();
        System.out.println("Area of Rhombus is: "+ findEquiTriangleArea(side));
        input.close();
    }
    
    public static double findEquiTriangleArea(double side){
        return (Math.sqrt(3)/4)*side*side;
    }
}