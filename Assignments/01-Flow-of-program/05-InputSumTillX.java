
import java.util.Scanner;
public class InputSumTillX{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int num = 0;
        int sum=0;
        char ch = 'y';
        while(ch!='x' && ch!='X'){
            System.out.println("Enter a number:");
            num = input.nextInt();
            sum+=num;
            System.out.println("Press 'x' to stop entering or Press any other key to continue entering");
            ch = (char)input.next().trim().charAt(0);
        }
        
        System.out.println("Sum of entered numbers is: "+sum);
    }
}