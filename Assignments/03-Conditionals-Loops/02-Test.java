// Take name as input and print a greeting message for that name.

import java.util.Scanner;

public class Greetings{
    public static void main(String[] args){
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        System.out.println();
        System.out.println("Hello, "+ name + ", Greetings from command line!");
    }
}
