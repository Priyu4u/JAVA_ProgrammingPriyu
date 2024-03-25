package Basics.TakingInput;
import java.util.Scanner;
public class sumOf2NumInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        // WAP to add two numbers. Taking the numbers as input from user
        int a, b;
        System.out.print("Enter 1st number : ");
        a = sc.nextInt();                       // to take input from user
        System.out.print("Enter 2nd number : ");
        b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum = "+sum);

    }
}
