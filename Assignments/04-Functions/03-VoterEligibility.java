
/*
A person is eligible to vote if his/her age is greater than or equal to 18. 
Define a method to find out if he/she is eligible to vote.*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Age in years: ");
        int age = input.nextInt();
        System.out.println(isEligible(age)?"You are eligible to Vote!": "You are not eligible to Vote");
        input.close();
    }
 static boolean isEligible(int age){
        return age>=18;
 }
 
}
