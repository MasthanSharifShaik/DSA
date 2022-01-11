
/*
Program to Input a number and print all the factors of that number
*/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = input.nextInt(), i=1;
        System.out.printf("The factors of %d are: \n", n);
        while(i<=n){
            if(n%i==0){
                System.out.println(i);
            } 
            i++;
        }
    }
}