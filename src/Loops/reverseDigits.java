package Loops;
import java.util.Scanner;
public class reverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // WAP to reverse the digits of a number
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int reverse = 0 , lastDigit ;
        while (n != 0){
            lastDigit = n % 10;
            reverse = reverse * 10 + lastDigit;
            n = n / 10;
        }
        System.out.print("Reverse = "+reverse);
    }
}
