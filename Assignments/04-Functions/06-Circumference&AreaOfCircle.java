
/*
Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle: ");
        double radius = input.nextDouble();
        System.out.println("Circumference of the circle is: "+circumferenceOfCircle(radius));
        System.out.println("Area of the circle is: "+areaOfCircle(radius));
        input.close();
    }
 static double circumferenceOfCircle(double radius) {
     return 2*Math.PI*radius;
 }
 
 static double areaOfCircle(double radius) {
     return Math.PI*radius*radius;
 }
 
}
