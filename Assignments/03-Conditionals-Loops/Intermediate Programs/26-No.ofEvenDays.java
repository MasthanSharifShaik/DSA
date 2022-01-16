
/*
Program to count the number of even days in the month of August.
*/

public class Main
{
    public static void main(String[] args) {
        int count =0;
        for(int i=1; i<=31; i++){
            if(i%2==0) count++;
        }
        System.out.print("Number of days: "+count);
        
    }
    
}
