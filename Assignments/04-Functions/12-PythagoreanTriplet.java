// Write a function to check if a given triplet is a Pythagorean triplet or not. 
(A Pythagorean triplet is when the sum of the square of two numbers is equal to the square of the third number).
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int first = input.nextInt();
        System.out.print("Enter the second number: ");
        int second = input.nextInt();
        System.out.print("Enter the third number: ");
        int third = input.nextInt();
        System.out.println(isTriplet(first, second, third)? "Given triplet is a Pythagorean Triplet":"Given triplet is not a Pythagorean Triplet");
        input.close();
    }
     static boolean isTriplet(int first,int second,int third){
         int a = first * first, b= second*second, c= third*third;
         return (a==b+c || b==a+c || c==a+b);
     }
}