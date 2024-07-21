package Loops;
import java.util.Scanner;
public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // find the sum of digits in a given number n
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int last_digit , sum = 0;
        while(n != 0){
            last_digit = n % 10;
            sum = sum + last_digit;
            n = n / 10;
        }
        System.out.print("Sum of digits = "+sum);
    }
}
