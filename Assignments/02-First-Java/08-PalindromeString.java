
import java.util.Scanner;
public class MyClass{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = input.next().trim();
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                System.out.println(str+ " is not a palindrome");
                return;
            }
        }
        System.out.println(str+ " is a palindrome");
    }
} 