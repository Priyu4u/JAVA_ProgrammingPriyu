package if_else_Statement.maths_Questions;
import java.util.Scanner;
public class threePointsOnLine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Given three points (x1,y1), (x2,y2) and (x3,y3), WAP to check if all the three points fall on one straight line
        System.out.print("Enter first co-ordinate : ");
        double x1 = sc.nextDouble(),y1 = sc.nextDouble();
        System.out.print("Enter second co-ordinate : ");
        double x2 = sc.nextDouble(),y2 = sc.nextDouble();
        System.out.print("Enter first co-ordinate : ");
        double x3 = sc.nextDouble(),y3 = sc.nextDouble();
        // using area
//        double area = (x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2 ;
//        if(area == 0) System.out.println("All the three points fall on one straight line");
//        else System.out.println("All the three points does not fall one straight line");

        // using slope
        if((y2-y1)/(x2-x1) == (y3-y2)/(x3-x2)) System.out.println("All the three points fall on one straight line");
        else System.out.println("All the three points does not fall one straight line");
    }
}
