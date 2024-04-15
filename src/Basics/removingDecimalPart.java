package Basics;
import java.util.Scanner;
public class removingDecimalPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take a double input and print its integer part
        System.out.print("Enter a decimal value : ");
        double x = sc.nextDouble();
        int y = (int)x;
        System.out.println("Integer part is "+y);
    }
}
