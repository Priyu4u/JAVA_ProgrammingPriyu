package if_else_Statement;
import java.util.Scanner;
public class sidesOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take 3 numbers input and tell if they can be the sides of a triangle
        System.out.print("Enter sides of Triangle : ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if(a+b>c && b+c>a && a+c>b) System.out.println("Yes, they can be the sides of a triangle");
        else System.out.println("They cannot be the sides of a triangle");
    }
}
