package Basics.TakingInput;
import java.util.Scanner;
public class remainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take two integers input, a and b: a > b, and find the remainder when a is divided by b
        System.out.print("Enter dividend : ");
        int a = sc.nextInt();
        System.out.print("Enter divisor : ");
        int b = sc.nextInt();
        // using division algorithm
        // dividend = divisor * quotient + remainder
        // remainder = dividend / (divisor * quotient)
        int quotient = a / b;
        int remainder = a - (b*quotient) ;
        System.out.println("Remainder when "+a+" is divided by "+b+" is "+remainder);

    }
}
