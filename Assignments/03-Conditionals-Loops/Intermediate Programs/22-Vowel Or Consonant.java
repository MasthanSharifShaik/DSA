
/*
Java Program Vowel Or Consonant
*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character:");
        char  chr = input.next().charAt(0);
        System.out.print("Entered character is ");
        System.out.print(isVowel(chr)?"an Vowel": "a Consonanat");
        
    }
    
   static boolean isVowel(char ch){
       if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
           return true;
       }
       return false;
   }
}
