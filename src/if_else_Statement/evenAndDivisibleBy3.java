package if_else_Statement;
import java.util.Scanner;
public class evenAndDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // WAP to print the value if it is even and divisible by 3
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        if(num%2==0 && num%3==0) System.out.println(num+" is even and divisible by 3");
        else System.out.println("It does not satisfy the given condition");
    }
}
