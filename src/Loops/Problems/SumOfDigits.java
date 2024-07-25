package Loops.Problems;
import java.util.Scanner ;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // find the sum of digits in a given number n
        System.out.print("Enter a number : ");
        int n = sc.nextInt() ;
        int temp = n ;
        int rem, sum = 0 ;

        while(temp > 0){
            rem = temp % 10 ;
            temp = temp / 10 ;
            sum += rem ;
        }
        System.out.println("Sum of digits = "+sum);

    }
}
