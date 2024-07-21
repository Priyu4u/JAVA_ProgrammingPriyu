package Basics;
import java.util.Scanner ;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take two integer input and print their sum
        int a, b;
        System.out.print("Enter first number : ");
        a = sc.nextInt();
        System.out.print("Enter second number : ");
        b = sc.nextInt() ;
        int sum = a + b;
        System.out.println("Sum = "+sum);
    }
}
