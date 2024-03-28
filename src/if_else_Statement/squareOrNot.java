package if_else_Statement;
import java.util.Scanner;
public class squareOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take two input length and breadth from user and tell whether is square or not
        System.out.print("Enter length : ");
        double length = sc.nextDouble();
        System.out.print("Enter breadth : ");
        double breadth = sc.nextDouble();
        if(length == breadth) System.out.println("It is a square");
        else System.out.println("It is not a square");
    }
}
