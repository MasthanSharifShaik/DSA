//Program to return the area of a rectangle from its length and breadth
import java.util.*;
public class FindRectangleArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter length of the triangle: ");
        double length = input.nextDouble();
        System.out.println("Enter width of the triangle: ");
        double width = input.nextDouble();
        System.out.println("Area of rectangle is: "+ findRectangleArea(length, width));
        input.close();
    }
    
    public static double findRectangleArea(double length, double width){
        return length*width;
    }
}