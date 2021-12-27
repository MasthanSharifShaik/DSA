
/* Program to return perimeter of a circle from its radius*/
import java.util.Scanner;
public class ciclePerimeter
{
    public static void main(String[] args) {
        System.out.println("Enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        System.out.printf("Perimeter of the circle is: %.3f",circlePerimeter(radius));
        input.close();
    }
    
    public static double circlePerimeter(double radius){
        return 2*Math.PI*radius;
    }
}
