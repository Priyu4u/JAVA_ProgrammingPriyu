package if_else_Statement.maths_Questions;
import java.util.Scanner;
public class pointLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Given a point(x,y), write a program to find out if it lies on the x-axis, y-axis or at the origin.
        System.out.print("Enter the co-ordinates of the point : ");
        double x = sc.nextDouble(), y = sc.nextDouble();
        if(x==0 && y==0) System.out.println("Point lies at origin");
        else if(x==0) System.out.println("Point lies on y-axis");
        else if(y==0) System.out.println("Point lies on x-axis");
        else System.out.println("Point does not lies at origin,x-axis or y-axis");
    }
}
