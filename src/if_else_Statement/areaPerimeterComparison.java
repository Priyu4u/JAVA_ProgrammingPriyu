package if_else_Statement;
import java.util.Scanner;
public class areaPerimeterComparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // given the length and breadth of a rectangle, WAP to find whether the area of the rectangle is greater than its perimeter
        System.out.print("Enter length : ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth : ");
        double breadth = sc.nextDouble();
        double per = 2*(length+breadth);
        double area = length * breadth;
        if(per > area) System.out.println("Perimeter is greater than area");
        else if(per < area) System.out.println("Area is greater than perimeter");
        else System.out.println("Perimeter and area, both are equal");
    }
}
