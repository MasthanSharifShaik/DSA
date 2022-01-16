
/*
Reverse A String In Java
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str =input.nextLine();
        System.out.println("Reverse of string \'"+str+ "\' is: ");
       int len = str.length()-1;
       while(len>-1){
           System.out.print(str.charAt(len));
           len--;
       }
    }
    
   
    
    
}
