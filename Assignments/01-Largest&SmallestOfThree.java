
/*
Define two methods to print the maximum and
the minimum number respectively among three numbers entered by the user.*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = input.nextInt();
        System.out.println("Enter the second number: ");
        int second = input.nextInt();
        System.out.println("Enter the third number: ");
        int third = input.nextInt();
        System.out.println("Largest among "+first+", "+second+" and "+third+ " is: "+largestOfThree(first, second, third));
        System.out.println("Smallest among "+first+", "+second+" and "+third+ " is: "+smallestOfThree(first, second, third));
        input.close();
    }
    
    static int largestOfThree(int first, int second, int third){
        int max = first;
        if(second>max){
            max= second;
        }
        if(third>max){
            max = third;
        }
        
        return max;
    }
    static int smallestOfThree(int first, int second, int third){
        int min = first;
        if(second<min){
            min= second;
        }
        if(third<min){
            min = third;
        }
        
        return min;
    }
    
}
