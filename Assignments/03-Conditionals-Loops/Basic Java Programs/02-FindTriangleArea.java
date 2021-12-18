//Program to return the area of a traingle form its base and height
import java.util.*;
public class FindTriangleArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base and height of triangle: ");
        double base = input.nextDouble();
        double height = input.nextDouble();
        System.out.println("The area of the triangle is: "+ findTriangleArea(base, height));
        input.close();
    }
    
    public static double findTriangleArea(double base, double height){
        return 0.5*base*height;
    }
}