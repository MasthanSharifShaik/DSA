
//Program to print first n fibonacci numbers
import java.util.Scanner;
public class MyClass{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = input.nextInt();
        
        int num1 = 0;
        int num2 = 1;
        if(n==1){
            System.out.println(num1);
            return;
        }
        if(n==2){
            System.out.println(num1 +"\n"+ num2);
            return;
        }
        System.out.println(num1 +"\n"+ num2);//printing 0 and 1
        for(int i=3; i<=n;i++){
            int temp = num2;
            num2 = num1+ num2;
            num1 = temp;
            System.out.println(num2);
        }
        
    }
}
