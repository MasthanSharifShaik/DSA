/* Program to calcualte distance between two points */

import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the coordinates of first point(x1,y1): ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();
        System.out.println("Enter the coordinates of second point(x2,y2): ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        
        double distance = Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("Distance between the two points is: "+ distance);
        in.close();
    }
}