
/* Program to return perimeter of a Parallelogram from its base and side*/
// Refer https://www.google.com/search?q=perimeter+of+parallelogram&rlz=1C1GCEB_enIN966IN966&oq=perimeter+of+para&aqs=chrome.0.0i433i512j0i512j69i57j0i512l7.5071j0j7&sourceid=chrome&ie=UTF-8
import java.util.Scanner;
public class ParallelogramPerimeter
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the base of Parallelogram: ");
        double base = input.nextDouble();
        System.out.println("Enter the side of Parallelogram: ");
        double side = input.nextDouble();
        
        System.out.printf("Perimeter of the Parallelogram is: %.2f",parallelogramPerimeter(base, side));
        input.close();
    }
    
    public static double parallelogramPerimeter(double base, double side){
        return 2*(base+side);
    }
}
