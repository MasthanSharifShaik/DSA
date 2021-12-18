
import java.util.*;
public class CircleArea{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        float radius = input.nextFloat();
        System.out.println("The area of the circle is: "+ findCircleArea(radius));
        input.close();
    }
    
    public static double findCircleArea(float radius){
        return 3.14*radius*radius;
    }
}