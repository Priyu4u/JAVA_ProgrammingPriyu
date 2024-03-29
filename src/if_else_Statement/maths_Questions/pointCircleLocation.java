package if_else_Statement.maths_Questions;
import java.util.Scanner;
public class pointCircleLocation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Given the coordinates(x,y) of a center of a circle and its radius, WAP which will determine whether a point lies inside the circle, on the circle or outside the circle
        System.out.print("Enter co-ordinates of the centre of circle : ");
        double x = sc.nextDouble() , y = sc.nextDouble();
        System.out.print("Enter radius of the circle : ");
        double rad = sc.nextDouble();
        System.out.print("Enter co-ordinates of the point to be checked : ");
        double x1 = sc.nextDouble(), y1 = sc.nextDouble();
        double dist = (x-x1)*(x-x1) + (y-y1)*(y-y1) ;
        rad = rad*rad ;
        if(rad == dist) System.out.println("Point lies on the circle");
        else if(rad < dist) System.out.println("Point lies outside the circle");
        else System.out.println("Point lies inside the circle");
//        System.out.println(dist);
//        System.out.println(rad);

    }
}
