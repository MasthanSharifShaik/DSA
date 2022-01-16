
/*
Sum Of N Numbers
 */
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int num = in.nextInt(), sum=0;
        System.out.println("Enter the elements: ");
        for(int i=0; i<num; i++){
            sum+=in.nextInt();
        }
        System.out.println("The sum of the enetered elements is: "+ sum);
        
    }
}
