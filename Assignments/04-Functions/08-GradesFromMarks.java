
/*
Write a program that will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:

 
Marks        Grade 
91-100         AA 
81-90          AB 
71-80          BB 
61-70          BC 
51-60          CD 
41-50          DD 
<=40          Fail 
*/
import java.util.Scanner;
import java.lang.Math;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        int num = input.nextInt();
        float sum=0;
        System.out.println("Enter the marks in " + num + " subjects: ");
        for(int i=0; i<num; i++){
            sum+=input.nextFloat();
        }
        float percentage = (sum/(num*100))*100;
        
        if(percentage>=91 && percentage<=100){
            System.out.println("Grade: AA");
        }
        else if(percentage>=81 && percentage<=90){
            System.out.println("Grade: AB");
        }
        else if(percentage>=71 && percentage<=80){
            System.out.println("Grade: BB");
        }
        else if(percentage>=61 && percentage<=70){
            System.out.println("Grade: BC");
        }
        else if(percentage>=51 && percentage<=60){
            System.out.println("Grade: CD");
        }
        else if(percentage>=41 && percentage<=50){
            System.out.println("Grade: DD");
        }
        else{
            System.out.println("Fail");
        }
        
        
    }
 
}
