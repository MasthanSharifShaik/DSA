
/*
Define a program to find out whether a given number is even or odd.*/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        if(num==0) System.out.println(num+" is neither Even nor Odd");
        else{
        System.out.print(num+ " is an ");
        System.out.println(isEven(num)?"Even Integer": "Odd Integer");
        }
        input.close();
    }
  
  //Method-1  
//   static boolean isEven(int num){
//       return num%2==0;
//   }


 //Method-2
//   static boolean isEven(int num){
//       return (num&1)==0;
//   }
   
   
   //Method-3
 //Bitwise OR operation of the even number by 1 increment the value of the number by 
 // 1 otherwise it remains unchanged.
 static boolean isEven(int num){
     return (num|1)==num+1; /// (num|1) >n
 }
}
