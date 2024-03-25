package Basics.TakingInput;
import java.util.Scanner;
public class moduloOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        // Take two integers input, a and b: a > b, and find the remainder when a is divided by b using modulo operator
        System.out.print("Enter dividend : ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor : ");
        int divisor = sc.nextInt();
        System.out.println("Remainder when "+dividend+" is divided by "+divisor+" is "+dividend % divisor);

        // % -> used for calculating remainders
    }
}
