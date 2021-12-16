
import java.util.Scanner;

public class HcfLcm{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int first = input.nextInt();
        System.out.println("Enter the second number: ");
        int second = input.nextInt();
        
        int hcf = findHCF(first, second);
        
        
        
        // int temp1 = first;
        // int temp2 = second;
        
        // while(temp2!=0){
        //     int temp = temp2;
        //     temp2 = temp1%temp2;
        //     temp1 = temp;
        // }
        // int hcf = temp1;
        int lcm = (int)((first*second)/hcf);
        
        System.out.println("HCF is : "+ hcf +" and LCM is : "+lcm);
       
        
    }
    
    //Recursive function to find HCF
    public static int findGCD(int a, int b){
        if(a==0) return b;
        if(b==0) return a;
        if(a==b) return a;
        if(a>b) return findGCD(a-b,b);
        return findGCD(a, b-a);
    } 
    
    
    public static int findHCF(int a, int b){
        if(b==0) return a;
        return findHCF(b, a%b);
    }
}