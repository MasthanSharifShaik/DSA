//Program to return the area of an Isosceles triangle from its length of same sided and length of base
import java.util.*;
public class FindIsoscelesTriangleArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length same sided: ");
        double side = input.nextDouble();
        System.out.println("Enter the length of base: ");
        double base = input.nextDouble();
        System.out.println("Area of Isosceles triangle is: "+ findIsoscelesTriangleArea(side, base));
        input.close();
    }
    
    public static double findIsoscelesTriangleArea(double side, double base){
        return ((base/4)*Math.sqrt(4*side*side-base*base));
    }
}