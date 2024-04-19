package Loops;
import java.util.Scanner;
public class countingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // count the number of digits for a given number n
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0){
            n = n/10;
            count++;

        }
        System.out.println("Number of digits = "+count);
    }
}
